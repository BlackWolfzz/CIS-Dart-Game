package Scoreboard;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import MainGame.TheDartGame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Scoreboard extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scoreboard frame = new Scoreboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Scoreboard() {
		getContentPane().setLayout(null);

		table = new JTable();
		table.setBounds(113, 163, 1, 1);
		getContentPane().add(table);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-target-60.png"));
		setTitle("The Dart Game - Scoreboard");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// To Centralize the window
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

		JLabel lblScoreBoard = new JLabel("Score Board - High Scores");
		lblScoreBoard.setHorizontalAlignment(SwingConstants.CENTER);
		lblScoreBoard.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 40));
		lblScoreBoard.setBounds(120, 11, 508, 66);
		contentPane.add(lblScoreBoard);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setVisible(false);
				dispose();
				TheDartGame.main(null);
			}
		});
		lblNewLabel_2.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-home-50-nxt.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(726, 11, 68, 66);
		contentPane.add(lblNewLabel_2);

		JLabel ChartDisplay = new JLabel("");
		ChartDisplay.setBounds(23, 88, 755, 515);
		contentPane.add(ChartDisplay);

		// Generating Scores
		JButton btnNewButton = new JButton("View Scores");
		btnNewButton.setBackground(new Color(153, 255, 204));
		btnNewButton.setFont(new Font("Segoe UI Historic", Font.PLAIN, 28));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					Image image = null;
					URL url = new URL(
							"https://quickchart.io/chart?c=%7B%0A%20%20type%3A%20%27bar%27%2C%0A%20%20data%3A%20%7B%0A%20%20%20%20labels%3A%20%5B%27Easy%27%2C%20%27Medium%27%2C%20%27Hard%27%5D%2C%0A%20%20%20%20datasets%3A%20%5B%7B%0A%20%20%20%20%20%20label%3A%20%27Level%27%2C%0A%20%20%20%20%20%20data%3A%20%5B20%2C%2014%2C%205%5D%0A%20%20%20%20%7D%5D%0A%20%20%7D%0A%7D%0A");
					image = ImageIO.read(url).getScaledInstance(ChartDisplay.getWidth(), ChartDisplay.getHeight(),
							image.SCALE_SMOOTH);
					ImageIcon icon = new ImageIcon(image);
					ChartDisplay.setIcon(icon);

				} catch (MalformedURLException | RemoteException ex) {
					Logger.getLogger(Scoreboard.class.getName()).log(Level.SEVERE, null, ex);
				} catch (IOException ex) {
					Logger.getLogger(Scoreboard.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
		btnNewButton.setBounds(290, 631, 211, 52);
		contentPane.add(btnNewButton);

		JTable table = new JTable();
		Object[] columns = { "Player Name", "Score" };
		DefaultTableModel model = new DefaultTableModel();

		model.setColumnIdentifiers(columns);
		table.setModel(model);

		table.setBackground(Color.white);
		table.setForeground(Color.black);
		table.setSelectionBackground(Color.red);
		table.setGridColor(Color.red);
		table.setSelectionForeground(Color.white);
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);

		JScrollPane pane = new JScrollPane(table);
		pane.setForeground(Color.RED);
		pane.setBackground(Color.WHITE);
		pane.setBounds(10, 10, 10, 10);

	}
}
