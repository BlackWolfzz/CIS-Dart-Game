package User;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MainGame.TheDartGame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;

public class CreateProfile extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateProfile frame = new CreateProfile();
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
	public CreateProfile() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-target-60.png"));
		setTitle("The Dart Game - Sign Up");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 652);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// To Centralize the window
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

		// Big Sign up Label
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Avenir LT Std 55 Roman", Font.PLAIN, 45));
		lblNewLabel.setBounds(132, 28, 175, 65);
		contentPane.add(lblNewLabel);

		// Dart icon
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-dart-64.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 80, 94);
		contentPane.add(lblNewLabel_1);

		// Dart icon
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-dart-64.png"));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(347, 11, 80, 94);
		contentPane.add(lblNewLabel_1_1);

		// New User name lbl
		JLabel lblUsername = new JLabel("New Username");
		lblUsername.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblUsername.setBounds(61, 145, 150, 28);
		contentPane.add(lblUsername);

		// New User name txt
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 19));
		txtUsername.setColumns(10);
		txtUsername.setBounds(61, 184, 313, 38);
		contentPane.add(txtUsername);

		// New Password lbl
		JLabel lblPaassword = new JLabel("New Password");
		lblPaassword.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblPaassword.setBounds(61, 250, 150, 28);
		contentPane.add(lblPaassword);

		// New Password txt
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 19));
		txtPassword.setBounds(61, 289, 313, 38);
		contentPane.add(txtPassword);

		// Sign up Button
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txtUsername.getText();
				String pword = txtPassword.getText();

				String msg = "" + user;
				msg += " \n";

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cisgame", "root", "");
					Statement stmt = con.createStatement();
					System.out.println("Registration Succefull " + user + " Welcome!");
					String sql = "INSERT INTO users values ('" + user + "','" + pword + "')";

					int x = stmt.executeUpdate(sql);
					if (x == 0) {
						JOptionPane.showMessageDialog(null, "Error", "Registraion Failed!", JOptionPane.ERROR_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Welcome", "Registration Successful!",
								JOptionPane.INFORMATION_MESSAGE);

						contentPane.setVisible(false);
						dispose();
						TheDartGame.main(null);

						// txtUsername.requestFocus();
					}
					con.close();

				} catch (Exception ex) {
				}

				/*
				 * contentPane.setVisible(false); dispose(); LoginNew.main(null);
				 */
			}
		});
		btnSignUp.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 24));
		btnSignUp.setBackground(new Color(204, 255, 204));
		btnSignUp.setBounds(61, 364, 313, 46);
		contentPane.add(btnSignUp);

		// OR
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Darts\\Darts new\\or.png"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(61, 450, 313, 28);
		contentPane.add(lblNewLabel_3);

		// Login Button
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				LoginNew.main(null);
			}
		});
		btnLogin.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 24));
		btnLogin.setBackground(new Color(153, 204, 255));
		btnLogin.setBounds(61, 513, 313, 46);
		contentPane.add(btnLogin);

		// Info label
		JLabel lblNewLabel_1_2 = new JLabel("Developed by Nimesh Fernando - 2115050");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(83, 588, 280, 14);
		contentPane.add(lblNewLabel_1_2);
	}

}
