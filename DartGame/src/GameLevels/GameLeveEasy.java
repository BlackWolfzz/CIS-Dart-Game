package GameLevels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;

import EngineNServer.GEngine;
import EngineNServer.GServer;
import MainGame.TheDartGame;

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;

import ScoreNTime.*;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameLeveEasy extends JFrame implements ActionListener {

	private static final long serialVersionUID = -107785653906635L;

	/**
	 * Method that is called when a button has been pressed.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		int solution = Integer.parseInt(e.getActionCommand());
		boolean correct = myGame.checkSolution(currentGame, solution);
		int score = myGame.getScore();
		if (correct) {
			System.out.println("YEAH!");
			currentGame = myGame.nextGame();
			ImageIcon ii = new ImageIcon(currentGame);
			questArea.setIcon(ii);
			txtScore.setText(" " + score);
		} else {
			System.out.println("Not Correct");
			txtScore.setText(" " + score);
		}
	}

	JLabel questArea = null;
	GEngine myGame = null;
	URL currentGame = null;
	JTextArea infoArea = null;
	JLabel lblTimer;
	private JTextField txtScore;
	private JTextField txtLives;
	private JTextField textField;
	Timer timer;
	int second, minute;
	String ddSecond, ddMinute;
	DecimalFormat dFormat = new DecimalFormat("00");

	/**
	 * Initializes the game.
	 * 
	 * @param player
	 */
	private void initGame(String player) {
		setSize(914, 648);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("The Dart Game - Easy");
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 204));

		myGame = new GEngine(player);
		currentGame = myGame.nextGame();
		panel.setLayout(null);

		infoArea = new JTextArea(1, 40);

		infoArea.setEditable(false);
		infoArea.setText("What is the value of the Heart?   Score: 0");

		/*
		 * JScrollPane infoPane = new JScrollPane(infoArea); infoPane.setBounds(220, 5,
		 * 326, 41); panel.add(infoPane);
		 */

		ImageIcon ii = new ImageIcon(currentGame);

		JLabel lblNewLabel = new JLabel("Score");
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.PLAIN, 24));
		lblNewLabel.setBounds(6, 11, 64, 29);
		panel.add(lblNewLabel);

		txtScore = new JTextField();
		txtScore.setFont(new Font("Segoe UI Historic", Font.PLAIN, 23));
		txtScore.setEditable(false);
		txtScore.setBounds(72, 11, 86, 29);
		panel.add(txtScore);
		txtScore.setColumns(10);

		JLabel lblLives = new JLabel("Lives");
		lblLives.setFont(new Font("Segoe UI Historic", Font.PLAIN, 24));
		lblLives.setBounds(551, 91, 64, 29);
		panel.add(lblLives);

		txtLives = new JTextField();
		txtLives.setFont(new Font("Segoe UI Historic", Font.PLAIN, 23));
		txtLives.setEditable(false);
		txtLives.setColumns(10);
		txtLives.setBounds(625, 91, 36, 29);
		panel.add(txtLives);
		questArea = new JLabel(ii);
		questArea.setSize(330, 600);

		JScrollPane questPane = new JScrollPane(questArea);
		questPane.setBounds(10, 135, 882, 362);
		panel.add(questPane);

		for (int i = 0; i < 1; i++) {
			JButton btn = new JButton(String.valueOf(10));
			panel.add(btn);
			btn.addActionListener(this);
		}
		for (int i = 0; i < 1; i++) {
			JButton btn = new JButton(String.valueOf(120));
			panel.add(btn);
			btn.addActionListener(this);
		}
		for (int i = 0; i < 1; i++) {
			JButton btn = new JButton(String.valueOf(40));
			panel.add(btn);
			btn.addActionListener(this);
		}
		for (int i = 0; i < 1; i++) {
			JButton btn = new JButton(String.valueOf(50));
			panel.add(btn);
			btn.addActionListener(this);
		}

		getContentPane().add(panel);

		JLabel lblPlayer = new JLabel("Player");
		lblPlayer.setFont(new Font("Segoe UI Historic", Font.PLAIN, 24));
		lblPlayer.setBounds(6, 51, 64, 29);
		panel.add(lblPlayer);

		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Historic", Font.PLAIN, 23));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(82, 51, 122, 29);
		panel.add(textField);

		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Segoe UI Historic", Font.PLAIN, 24));
		lblTime.setBounds(6, 91, 64, 29);
		panel.add(lblTime);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-home-50-nxt.png"));
		lblNewLabel_1.setBounds(735, 11, 73, 69);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-reset-50.png"));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(819, 11, 73, 69);
		panel.add(lblNewLabel_1_1);

		JButton btnNewButton = new JButton("13");
		btnNewButton.setBounds(264, 526, 138, 49);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("13");
		btnNewButton_1.setBounds(713, 526, 138, 49);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("13");
		btnNewButton_2.setBounds(412, 526, 138, 49);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("13");
		btnNewButton_3.setBounds(560, 526, 138, 49);
		panel.add(btnNewButton_3);

		
		// Timer
		JLabel lblTimer = new JLabel("");
		lblTimer.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimer.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
		lblTimer.setBounds(72, 91, 132, 29);
		panel.add(lblTimer);
		panel.repaint();
		lblTimer.setText("00:00");
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

	/**
	 * Default player is null.
	 */
	public GameLeveEasy() {
		super();
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-target-60.png"));
		initGame(null);
	}

	/**
	 * Use this to start GUI, e.g., after login.
	 * 
	 * @param player
	 */
	public GameLeveEasy(String player) {
		super();
		initGame(player);
	}

	/**
	 * Main entry point into the equation game.
	 * 
	 * @param args not used.
	 */
	public static void main(String[] args) {
		GameLeveEasy myGUI = new GameLeveEasy();
		myGUI.setVisible(true);

	}
}