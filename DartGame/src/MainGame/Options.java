package MainGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.DimensionUIResource;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import GameLevelsNew.*;

/**
 * 
 * @author Nimesh //Level Options page //Panel to change difficulty level of the
 *         game
 *
 */

public class Options extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Options frame = new Options();
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
	public Options() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-target-60.png"));
		setTitle("The Dart Game - Options");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 578);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// To Centralize the window
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

		// Options label
		JLabel lblNewLabel = new JLabel("Options");
		lblNewLabel.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(256, 11, 176, 57);
		contentPane.add(lblNewLabel);

		// Easy level Button
		JButton btnEasy = new JButton("Easy");
		btnEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Directed to Easy level
				contentPane.setVisible(false);
				dispose();
				GameEasy.main(null);
			}
		});
		btnEasy.setBackground(new Color(204, 255, 204));
		btnEasy.setForeground(new Color(0, 0, 0));
		btnEasy.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 30));
		btnEasy.setBounds(93, 192, 176, 57);
		contentPane.add(btnEasy);

		// Medium level Button
		JButton btnMedium = new JButton("Medium");
		btnMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Directed to Medium Level
				contentPane.setVisible(false);
				dispose();
				GameMedium.main(null);
			}
		});
		btnMedium.setForeground(Color.BLACK);
		btnMedium.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 30));
		btnMedium.setBackground(new Color(255, 204, 153));
		btnMedium.setBounds(93, 307, 176, 57);
		contentPane.add(btnMedium);

		// Hard level Button
		JButton btnHard = new JButton("Hard");
		btnHard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Directed to Hard level
				contentPane.setVisible(false);
				dispose();
				GameHard.main(null);
			}
		});
		btnHard.setForeground(Color.BLACK);
		btnHard.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 30));
		btnHard.setBackground(new Color(255, 153, 153));
		btnHard.setBounds(93, 418, 176, 57);
		contentPane.add(btnHard);

		// Difficulty label
		JLabel lblDifficulty = new JLabel("Difficulty");
		lblDifficulty.setHorizontalAlignment(SwingConstants.LEFT);
		lblDifficulty.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 34));
		lblDifficulty.setBounds(93, 104, 176, 57);
		contentPane.add(lblDifficulty);

		// Easy level Description
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Darts\\Darts new\\15 kids.png"));
		lblNewLabel_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 27));
		lblNewLabel_1.setBounds(316, 178, 353, 86);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Directed to Main page
				contentPane.setVisible(false);
				dispose();
				TheDartGame.main(null);
			}
		});
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-home-50-nxt.png"));
		lblNewLabel_2.setBounds(621, 11, 68, 66);
		contentPane.add(lblNewLabel_2);

		// Medium level Description
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Darts\\Darts new\\15 kids 2.png"));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 27));
		lblNewLabel_1_3.setBounds(316, 293, 353, 86);
		contentPane.add(lblNewLabel_1_3);

		// Hard level Description
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(
				"D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Darts\\Darts new\\15 kids plus.png"));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 27));
		lblNewLabel_1_1.setBounds(316, 406, 353, 86);
		contentPane.add(lblNewLabel_1_1);
	}

}
