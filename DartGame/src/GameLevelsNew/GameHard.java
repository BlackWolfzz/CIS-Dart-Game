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

public class GameHard extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblFinalVelocityObject_1;
	private JTextField textField_4;
	private JButton btnNewButton;
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
					GameHard frame = new GameHard();
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
//	Elastic_collision objectB;
//	Elastic_collision objectA;
//	Elastic_collision velocityA;
//	Elastic_collision velocityB;
//	Elastic_collision velocityC;
	private JTextPane txtpn_score;
	private JLabel lbltimeLabel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextPane textPane_m2k_1;
	private JTextPane textPane_m2k_2;
	private JTextPane textPane_m2k_3;
	private JTextPane textPane_m2k_4;
	private JTextPane textPane_m2k_5;
	private JTextPane textPane_m2k_6;

	public GameHard() {
		setTitle("The Dart Game - Hard");
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

			counterLabel.setText("03:30");
			second = 30;
			minute = 3;
			countdownTimer();
			timer.start();

		}

// Scorecal score =new Scorecal();
//			

		int min = 1;
		int max = 5;
		int Score = 0;

		Random random = new Random();

		int no1 = random.nextInt(max + min) + min;
		int no2 = random.nextInt(max + min) + min;
		int no3 = random.nextInt(max + min) + min;
		int no4 = random.nextInt(max + min) + min;
		int no5 = random.nextInt(max + min) + min;
		int no6 = random.nextInt(max + min) + min;
		int no7 = random.nextInt(max + min) + min;
		int no8 = random.nextInt(max + min) + min;

		int Answer = ((no1 + no2) * (no3 - no4) + (no5 / no6) - (no7 * no8));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// window center
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

		JLabel lblScore = new JLabel("Score");
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setFont(new Font("Segoe UI Historic", Font.PLAIN, 21));
		lblScore.setBounds(10, 11, 79, 43);
		contentPane.add(lblScore);

		JLabel lblTime = new JLabel("Time");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Segoe UI Historic", Font.PLAIN, 21));
		lblTime.setBounds(414, 16, 74, 32);
		contentPane.add(lblTime);

		textPane_m1k = new JTextPane();
		textPane_m1k.setText("" + no1);
		textPane_m1k.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 23));
		textPane_m1k.setBounds(150, 156, 33, 34);
		contentPane.add(textPane_m1k);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(445, 316, 159, 43);
		contentPane.add(textField_4);

		textPane_m2k = new JTextPane();
		textPane_m2k.setEditable(false);
		textPane_m2k.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 23));
		textPane_m2k.setText("" + no2);
		textPane_m2k.setBounds(202, 156, 33, 34);
		contentPane.add(textPane_m2k);

		textPane_m2k_1 = new JTextPane();
		textPane_m2k_1.setText("" + no3);
		textPane_m2k_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 23));
		textPane_m2k_1.setEditable(false);
		textPane_m2k_1.setBounds(299, 156, 33, 34);
		contentPane.add(textPane_m2k_1);

		textPane_m2k_2 = new JTextPane();
		textPane_m2k_2.setText("" + no4);
		textPane_m2k_2.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 23));
		textPane_m2k_2.setEditable(false);
		textPane_m2k_2.setBounds(353, 156, 33, 34);
		contentPane.add(textPane_m2k_2);

		textPane_m2k_3 = new JTextPane();
		textPane_m2k_3.setText("" + no5);
		textPane_m2k_3.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 23));
		textPane_m2k_3.setEditable(false);
		textPane_m2k_3.setBounds(455, 156, 33, 34);
		contentPane.add(textPane_m2k_3);

		textPane_m2k_4 = new JTextPane();
		textPane_m2k_4.setText("" + no6);
		textPane_m2k_4.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 23));
		textPane_m2k_4.setEditable(false);
		textPane_m2k_4.setBounds(509, 156, 33, 34);
		contentPane.add(textPane_m2k_4);

		textPane_m2k_5 = new JTextPane();
		textPane_m2k_5.setText("" + no7);
		textPane_m2k_5.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 23));
		textPane_m2k_5.setEditable(false);
		textPane_m2k_5.setBounds(609, 156, 33, 34);
		contentPane.add(textPane_m2k_5);

		textPane_m2k_6 = new JTextPane();
		textPane_m2k_6.setText("" + no8);
		textPane_m2k_6.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 23));
		textPane_m2k_6.setEditable(false);
		textPane_m2k_6.setBounds(661, 156, 33, 34);
		contentPane.add(textPane_m2k_6);

		lblFinalVelocityObject_1 = new JLabel("Answer");
		lblFinalVelocityObject_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 22));
		lblFinalVelocityObject_1.setBounds(318, 315, 117, 44);
		contentPane.add(lblFinalVelocityObject_1);

		btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String getValue = textField_4.getText();
				int i = Integer.parseInt(getValue);
				int score = 0;
				if (i == Answer) {
					JOptionPane.showMessageDialog(null, "Correct", "Game", JOptionPane.INFORMATION_MESSAGE);
					score += 5;
					System.out.println(score);
					contentPane.setVisible(false);
					dispose();
					GameHard.main(null);
				}

				else {
					JOptionPane.showMessageDialog(null, "Wrong", "Game", JOptionPane.ERROR_MESSAGE);
					contentPane.setVisible(false);
					dispose();
					GameHard.main(null);
				}

			}
		});
		btnNewButton.setFont(new Font("Segoe UI Historic", Font.PLAIN, 18));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setBounds(391, 393, 107, 37);
		contentPane.add(btnNewButton);

		txtpn_score = new JTextPane();
		txtpn_score.setEditable(false);
		txtpn_score.setText("" + Score);
		txtpn_score.setFont(new Font("Segoe UI Historic", Font.BOLD, 22));
		txtpn_score.setBounds(99, 19, 79, 35);
		contentPane.add(txtpn_score);

		// time label

		lbltimeLabel_1 = new JLabel("");
		lbltimeLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbltimeLabel_1.setFont(new Font("Segoe UI Historic", Font.BOLD, 25));
		lbltimeLabel_1.setBounds(490, 18, 107, 27);
		lbltimeLabel_1.setText("03:30");
		contentPane.add(lbltimeLabel_1);

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
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Darts\\Darts new\\Level Hard.png"));
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
					JOptionPane.showMessageDialog(null, "Time Over", "Game", JOptionPane.ERROR_MESSAGE);
					contentPane.setVisible(false);
					dispose();
					TheDartGame.main(null);
					timer.stop();
				}
			}
		});
	}
}