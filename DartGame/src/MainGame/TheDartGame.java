package MainGame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import User.Login;
import Scoreboard.*;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TheDartGame {

	private JFrame frmTheDartGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TheDartGame window = new TheDartGame();
					window.frmTheDartGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TheDartGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTheDartGame = new JFrame();
		frmTheDartGame.setResizable(false);
		frmTheDartGame.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-target-60.png"));
		frmTheDartGame.setTitle("The Dart Game");
		frmTheDartGame.getContentPane().setBackground(SystemColor.info);
		frmTheDartGame.setBounds(100, 100, 868, 765);
		frmTheDartGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTheDartGame.getContentPane().setLayout(null);
		frmTheDartGame.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Darts\\Darts new\\The Dart Game 3.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Avenir LT Std 45 Book", Font.PLAIN, 80));
		lblNewLabel.setBounds(141, 11, 561, 79);
		frmTheDartGame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-dart-64.png"));
		lblNewLabel_1.setBounds(384, 86, 80, 79);
		frmTheDartGame.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Start Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTheDartGame.dispose();
				Player ui = new Player();
				ui.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(153, 255, 153));
		btnNewButton.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 38));
		btnNewButton.setBounds(301, 175, 267, 69);
		frmTheDartGame.getContentPane().add(btnNewButton);

		JButton btnHowToPlay = new JButton("How to Play");
		btnHowToPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTheDartGame.dispose();
				HowToPlay ui = new HowToPlay();
				ui.setVisible(true);
			}
		});
		btnHowToPlay.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 31));
		btnHowToPlay.setBackground(new Color(245, 255, 250));
		btnHowToPlay.setBounds(322, 287, 231, 63);
		frmTheDartGame.getContentPane().add(btnHowToPlay);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTheDartGame.dispose();
			}
		});
		btnExit.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 30));
		btnExit.setBackground(new Color(255, 102, 102));
		btnExit.setBounds(341, 614, 199, 63);
		frmTheDartGame.getContentPane().add(btnExit);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-target-60.png"));
		lblNewLabel_2.setBounds(52, 504, 93, 79);
		frmTheDartGame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-dartman-64.png"));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(694, 504, 93, 79);
		frmTheDartGame.getContentPane().add(lblNewLabel_2_1);

		JLabel lblNewLabel_3 = new JLabel("V 1.0");
		lblNewLabel_3.setFont(new Font("Source Code Pro", Font.PLAIN, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(401, 688, 80, 27);
		frmTheDartGame.getContentPane().add(lblNewLabel_3);

		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTheDartGame.dispose();
				About ui = new About();
				ui.setVisible(true);
			}
		});
		btnAbout.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 31));
		btnAbout.setBackground(new Color(230, 230, 250));
		btnAbout.setBounds(322, 517, 231, 63);
		frmTheDartGame.getContentPane().add(btnAbout);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmTheDartGame.dispose();
				Login ui = new Login();
				ui.setVisible(true);
			}
		});
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-exit-96.png"));
		lblNewLabel_4.setBounds(755, 11, 87, 94);
		frmTheDartGame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Log out");
		lblNewLabel_5.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(776, 99, 46, 15);
		frmTheDartGame.getContentPane().add(lblNewLabel_5);
		
		JButton btnScoreboard = new JButton("Scoreboard");
		btnScoreboard.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmTheDartGame.dispose();
				Scoreboard ui = new Scoreboard();
				ui.setVisible(true);
			}
		});
		btnScoreboard.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 31));
		btnScoreboard.setBackground(new Color(204, 255, 255));
		btnScoreboard.setBounds(322, 403, 231, 63);
		frmTheDartGame.getContentPane().add(btnScoreboard);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Darts\\Darts new\\bg3.png"));
		lblNewLabel_6.setBounds(0, 0, 852, 726);
		frmTheDartGame.getContentPane().add(lblNewLabel_6);
	}
}
