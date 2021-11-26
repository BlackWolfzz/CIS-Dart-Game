package User;

import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import java.awt.event.ActionEvent;
import MainGame.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginNew extends JFrame {

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
					LoginNew frame = new LoginNew();
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
	public LoginNew() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-target-60.png"));
		setTitle("The Dart Game - Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 742);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Avenir LT Std 55 Roman", Font.PLAIN, 45));
		lblNewLabel.setBounds(132, 28, 175, 65);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-dart-64.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 80, 94);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-dart-64.png"));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(347, 11, 80, 94);
		contentPane.add(lblNewLabel_1_1);

		// User name
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblUsername.setBounds(61, 145, 114, 28);
		contentPane.add(lblUsername);

		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 19));
		txtUsername.setColumns(10);
		txtUsername.setBounds(61, 184, 313, 38);
		contentPane.add(txtUsername);

		// Password
		JLabel lblPaassword = new JLabel("Password");
		lblPaassword.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblPaassword.setBounds(61, 250, 114, 28);
		contentPane.add(lblPaassword);

		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 19));
		txtPassword.setBounds(61, 289, 313, 38);
		contentPane.add(txtPassword);

		// Login Button
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ex) {

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cisgame", "root", "");
					Statement stmt = con.createStatement();
					String sql = "Select * from users where uname='" + txtUsername.getText() + "' and password='"
							+ txtPassword.getText().toString() + "' ";
					ResultSet rs = stmt.executeQuery(sql);

					if (rs.next()) {
						contentPane.setVisible(false);
						dispose();
						TheDartGame.main(null);
					} else {
						JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",
								JOptionPane.ERROR_MESSAGE);

						txtUsername.requestFocus();

						con.close();
					}

				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
		btnLogin.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 24));
		btnLogin.setBackground(new Color(153, 204, 255));
		btnLogin.setBounds(61, 357, 313, 46);
		contentPane.add(btnLogin);

		// Clear Button
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText("");
				txtPassword.setText("");

				txtUsername.requestFocus();
			}
		});
		btnClear.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 24));
		btnClear.setBackground(new Color(255, 153, 153));
		btnClear.setBounds(105, 424, 220, 46);
		contentPane.add(btnClear);

		// OR
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Darts\\Darts new\\or.png"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(61, 492, 313, 28);
		contentPane.add(lblNewLabel_3);

		// Sign up Button
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				CreateProfile.main(null);
			}
		});
		btnSignUp.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 24));
		btnSignUp.setBackground(new Color(204, 255, 204));
		btnSignUp.setBounds(61, 542, 313, 46);
		contentPane.add(btnSignUp);

		// Guest Button
		JButton btnContinueAsGuest = new JButton("Continue as Guest");
		btnContinueAsGuest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				TheDartGame.main(null);
			}
		});
		btnContinueAsGuest.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 24));
		btnContinueAsGuest.setBackground(new Color(255, 255, 204));
		btnContinueAsGuest.setBounds(61, 608, 313, 46);
		contentPane.add(btnContinueAsGuest);

		JLabel lblNewLabel_1_2 = new JLabel("Developed by Nimesh Fernando - 2115050");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(81, 678, 280, 14);
		contentPane.add(lblNewLabel_1_2);
	}
}
