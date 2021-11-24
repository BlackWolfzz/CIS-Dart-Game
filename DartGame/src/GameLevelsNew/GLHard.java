package GameLevelsNew;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import MainGame.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GLHard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GLHard frame = new GLHard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Timer timer;
	int second, minute;
	String ddSecond, ddMinute;
	DecimalFormat dFormat = new DecimalFormat("00");

	/**
	 * Create the frame.
	 */
	public GLHard() {

		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-target-60.png"));
		setTitle("The Dart Game - Hard");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 636);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

		JLabel lblNewLabel = new JLabel("Score");
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.PLAIN, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 88, 29);
		contentPane.add(lblNewLabel);

		JLabel lblPlayer = new JLabel("Player");
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setFont(new Font("Segoe UI Historic", Font.PLAIN, 23));
		lblPlayer.setBounds(10, 51, 88, 29);
		contentPane.add(lblPlayer);

		JLabel lblTime = new JLabel("Time");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Segoe UI Historic", Font.PLAIN, 23));
		lblTime.setBounds(10, 91, 88, 29);
		contentPane.add(lblTime);

		JLabel lblLives = new JLabel("Lives");
		lblLives.setHorizontalAlignment(SwingConstants.CENTER);
		lblLives.setFont(new Font("Segoe UI Historic", Font.PLAIN, 23));
		lblLives.setBounds(525, 91, 88, 29);
		contentPane.add(lblLives);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Darts\\Darts new\\Level Hard.png"));
		lblNewLabel_1.setBounds(58, 192, 820, 269);
		contentPane.add(lblNewLabel_1);

		JLabel lblTimer = new JLabel("");
		lblTimer.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimer.setFont(new Font("Segoe UI Historic", Font.PLAIN, 23));
		lblTimer.setBounds(108, 91, 114, 29);
		contentPane.add(lblTimer);
		lblTimer.setText("00:00");

		JButton btnNewButton = new JButton("5");
		btnNewButton.setFont(new Font("SF Pro Display", Font.PLAIN, 26));
		btnNewButton.setBounds(312, 472, 178, 41);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.setFont(new Font("SF Pro Display", Font.PLAIN, 26));
		btnNewButton_1.setBounds(596, 472, 178, 41);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setFont(new Font("SF Pro Display", Font.PLAIN, 26));
		btnNewButton_2.setBounds(312, 545, 178, 41);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("6");
		btnNewButton_3.setFont(new Font("SF Pro Display", Font.PLAIN, 26));
		btnNewButton_3.setBounds(596, 545, 178, 41);
		contentPane.add(btnNewButton_3);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setVisible(false);
				dispose();
				TheDartGame.main(null);
			}
		});
		lblNewLabel_1_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-home-50-nxt.png"));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(759, 11, 73, 69);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setVisible(false);
				dispose();
				Options.main(null);
			}
		});
		lblNewLabel_1_1_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-reset-50.png"));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(843, 11, 73, 69);
		contentPane.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-target-60.png"));
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setBounds(87, 490, 73, 69);
		contentPane.add(lblNewLabel_1_1_2);
		second = 0;
		minute = 0;
		normalTimer();
		timer.start();
	}

	public void normalTimer() {

		timer = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				second++;

				ddSecond = dFormat.format(second);
				ddMinute = dFormat.format(minute);
				lblTimer.setText(ddMinute + ":" + ddSecond);

				if (second == 60) {
					second = 0;
					minute++;

					ddSecond = dFormat.format(second);
					ddMinute = dFormat.format(minute);
					lblTimer.setText(ddMinute + ":" + ddSecond);
				}
			}
		});
	}
}
