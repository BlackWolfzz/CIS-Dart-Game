package GameLevelsNew;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MainGame.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.Timer;

import java.util.*;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.sql.*;

public class HQuize1 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblFinalVelocityObject_1;
	private JTextField txtAnswer;
	private JButton btnChkAns;
	private JTextPane textPane_m1k;
	private JTextPane textPane_m2k;

	JFrame window;
	JLabel counterLabel;
	Font font1 = new Font("Arial", Font.PLAIN, 70);
	Timer timer;
	int second, minute;
	String ddSecond, ddMinute;
	DecimalFormat dFormat = new DecimalFormat("00");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HQuize1 frame = new HQuize1();
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

	private JTextPane txtpn_score;
	private JLabel lbltimeLabel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	public HQuize1() {
		setResizable(false);
		setTitle("The Dart Game - Easy");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-target-60.png"));

		{
			window = new JFrame();
			window.setSize(0, 0);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.getContentPane().setLayout(null);

			counterLabel = new JLabel("");
			counterLabel.setBounds(300, 230, 200, 100);
			counterLabel.setHorizontalAlignment(JLabel.CENTER);
			counterLabel.setFont(font1);

			window.getContentPane().add(counterLabel);
			window.setVisible(false);

			counterLabel.setText("03:00");
			second = 10;
			minute = 00;
			countdownTimer();
			timer.start();

		}

		// Score
		int qanswer = 0;
		int marks = 0;

		// Random Number maker
		int min = 1;
		int max = 20;
		int score = 0;

		Random random = new Random();

		int no1 = random.nextInt(max + min) + min;
		int no2 = random.nextInt(max + min) + min;

		// Equation
		int Answer = no1 + no2;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Window center
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

		// Score
		JLabel lblScore = new JLabel("Score");
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setFont(new Font("Segoe UI Historic", Font.PLAIN, 21));
		lblScore.setBounds(10, 11, 79, 43);
		contentPane.add(lblScore);

		// Timer
		JLabel lblTime = new JLabel("Time");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Segoe UI Historic", Font.PLAIN, 21));
		lblTime.setBounds(414, 16, 74, 32);
		contentPane.add(lblTime);

		// Random Numbers
		textPane_m1k = new JTextPane();
		textPane_m1k.setEditable(false);
		textPane_m1k.setText("" + no1);
		textPane_m1k.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 23));
		textPane_m1k.setBounds(138, 153, 40, 34);
		contentPane.add(textPane_m1k);

		textPane_m2k = new JTextPane();
		textPane_m2k.setEditable(false);
		textPane_m2k.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 23));
		textPane_m2k.setText("" + no2);
		textPane_m2k.setBounds(214, 153, 40, 37);
		contentPane.add(textPane_m2k);

		// Answer
		txtAnswer = new JTextField();
		txtAnswer.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 25));
		txtAnswer.setColumns(10);
		txtAnswer.setBounds(445, 316, 159, 43);
		contentPane.add(txtAnswer);

		lblFinalVelocityObject_1 = new JLabel("Answer");
		lblFinalVelocityObject_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 22));
		lblFinalVelocityObject_1.setBounds(318, 315, 117, 44);
		contentPane.add(lblFinalVelocityObject_1);

		// Answer Check btn
		btnChkAns = new JButton("Check");
		btnChkAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String getValue = txtAnswer.getText();
				int i = Integer.parseInt(getValue);
				int score = 0;

				if (i == Answer) {
					JOptionPane.showMessageDialog(null, "Correct Answer", "CORRECT !", JOptionPane.INFORMATION_MESSAGE);

					int no1 = random.nextInt(max + min) + min;
					int no2 = random.nextInt(max + min) + min;
					textPane_m1k.setText("" + no1);
					textPane_m2k.setText("" + no2);

					score += 1;
					System.out.println("Correct!");
					txtpn_score.setText(" " + score);

					txtAnswer.setText(null);
					txtAnswer.requestFocus();

					/*
					 * contentPane.setVisible(false); dispose(); GameEasy.main(null);
					 */

				}

				/*
				 * for (int counter=1; counter<=10; counter++) { no1 = 1+random.nextInt(21); no2
				 * = 1+random.nextInt(21);
				 * 
				 * }
				 */

				else {
					JOptionPane.showMessageDialog(null, "Restart Level", "WRONG !", JOptionPane.ERROR_MESSAGE);
					contentPane.setVisible(false);
					dispose();
					HQuize1.main(null);
					System.out.println("Wrong!");
				}

			}
		});
		btnChkAns.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
		btnChkAns.setForeground(new Color(255, 0, 0));
		btnChkAns.setBackground(new Color(255, 255, 204));
		btnChkAns.setBounds(391, 393, 107, 37);
		contentPane.add(btnChkAns);

		txtpn_score = new JTextPane();
		txtpn_score.setEditable(false);
		txtpn_score.setText("" + score);
		txtpn_score.setFont(new Font("Segoe UI Historic", Font.BOLD, 22));
		txtpn_score.setBounds(99, 19, 79, 35);
		contentPane.add(txtpn_score);

		// Time label

		lbltimeLabel_1 = new JLabel("");
		lbltimeLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbltimeLabel_1.setFont(new Font("Segoe UI Historic", Font.BOLD, 25));
		lbltimeLabel_1.setBounds(490, 18, 107, 27);
		lbltimeLabel_1.setText("02:00");
		contentPane.add(lbltimeLabel_1);

		// Home
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setVisible(false);
				dispose();
				TheDartGame.main(null);
			}
		});
		lblNewLabel_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-home-50-nxt.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(666, 0, 73, 69);
		contentPane.add(lblNewLabel_1);

		// Change Level
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setVisible(false);
				dispose();
				Options.main(null);
			}
		});
		lblNewLabel_2.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-reset-50.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(749, 0, 73, 69);
		contentPane.add(lblNewLabel_2);

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Darts\\Darts new\\Level Easy.png"));
		lblNewLabel.setBounds(10, 73, 812, 201);
		contentPane.add(lblNewLabel);
	}

	public void countdownTimer() {

		timer = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				second--;
				ddSecond = dFormat.format(second);
				ddMinute = dFormat.format(minute);
				lbltimeLabel_1.setText(ddMinute + ":" + ddSecond);

				if (second == -1) {
					second = 59;
					minute--;
					ddSecond = dFormat.format(second);
					ddMinute = dFormat.format(minute);
					lbltimeLabel_1.setText(ddMinute + ":" + ddSecond);
				}
				if (minute == 0 && second == 0) {
					JOptionPane.showMessageDialog(null, "Time Over", "OOOPS!!", JOptionPane.ERROR_MESSAGE);
					contentPane.setVisible(false);

					String score = txtpn_score.getText();
					String time = lbltimeLabel_1.getText();

					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cisgame", "root", "");
						Statement stmt = con.createStatement();
						System.out.println("Registration Succefull!");
						String sql = "INSERT INTO scoreboard values ('" + score + "','" + time + "')";

						int x = stmt.executeUpdate(sql);
						if (x == 0) {
							JOptionPane.showMessageDialog(null, "Error", "Username Already in Use!",
									JOptionPane.ERROR_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "Finished", "Play Again!",
									JOptionPane.INFORMATION_MESSAGE);

							contentPane.setVisible(false);
							dispose();
							Options.main(null);

							// txtUsername.requestFocus();
						}
						con.close();

					} catch (Exception ex) {
					}
					/*
					 * dispose(); Options.main(null); timer.stop();
					 */
				}
			}
		});
	}
}
