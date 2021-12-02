package MainGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import User.*;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

/**
 * 
 * @author Nimesh //Loading Page
 *
 */

public class LoadingScreen extends JFrame {

	private JPanel contentPane;
	private static JProgressBar progressBar;
	private JLabel lblNewLabel_1;
	private static JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		// Progress bar
		int x;
		LoadingScreen frame = new LoadingScreen();
		frame.setVisible(true);
		try {
			for (x = 0; x <= 100; x++) {
				LoadingScreen.progressBar.setValue(x);
				Thread.sleep(50);
				LoadingScreen.lblNewLabel_2.setText(Integer.toString(x) + " %");
				if (x == 100) {
					frame.dispose();
					LoginNew.main(null);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public LoadingScreen() {
		setTitle("The Dart Game");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-target-60.png"));
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// To Centralize the window
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

		// Loading GIF
		JLabel lblNewLabel = new JLabel("");
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/loading 4.gif"));
		lblNewLabel.setIcon(icon);
		lblNewLabel.setBounds(58, 0, 850, 542);
		contentPane.add(lblNewLabel);

		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(102, 204, 255));
		progressBar.setBounds(58, 658, 839, 22);
		contentPane.add(progressBar);

		// Game Logo label
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(
				"D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Darts\\Darts new\\The Dart Game 4.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Avenir LT Std 65 Medium", Font.BOLD, 65));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(195, 570, 564, 77);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("SF Pro Display", Font.PLAIN, 19));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(449, 702, 58, 22);
		contentPane.add(lblNewLabel_2);
	}
}
