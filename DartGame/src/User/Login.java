package User;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import MainGame.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

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
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-target-60.png"));
		setResizable(false);
		setTitle("The Dart Game - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 678);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-dart-64.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 80, 94);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Avenir LT Std 55 Roman", Font.PLAIN, 45));
		lblNewLabel.setBounds(132, 28, 175, 65);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-dart-64.png"));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(347, 11, 80, 94);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblUsername.setBounds(66, 134, 114, 28);
		contentPane.add(lblUsername);

		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 19));
		txtUsername.setColumns(10);
		txtUsername.setBounds(66, 173, 313, 38);
		contentPane.add(txtUsername);

		JLabel lblPaassword = new JLabel("Password");
		lblPaassword.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblPaassword.setBounds(66, 239, 114, 28);
		contentPane.add(lblPaassword);

		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 19));
		txtPassword.setBounds(66, 278, 313, 38);
		contentPane.add(txtPassword);

		JButton btnlogin = new JButton("LOGIN");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{

					String password = txtPassword.getText();
					String username = txtUsername.getText();

					if (password.contains("123") && username.contains("admin")) {
						// txtPassword.setText(null);
						// txtPassword.setText(null);

						contentPane.setVisible(false);
						dispose();
						TheDartGame.main(null);
					} else {
						JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",
								JOptionPane.ERROR_MESSAGE);
						txtPassword.setText(null);
						txtUsername.setText(null);

						txtUsername.requestFocus();
					}

					/*
					 * contentPane.setVisible(false); dispose(); TheDartGame.main(null);
					 */
				}
			}
		});
		btnlogin.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 24));
		btnlogin.setBackground(new Color(204, 255, 204));
		btnlogin.setBounds(66, 347, 313, 46);
		contentPane.add(btnlogin);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Darts\\Darts new\\or.png"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(66, 492, 313, 28);
		contentPane.add(lblNewLabel_3);

		JButton btnsignup = new JButton("SIGN UP");
		btnsignup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setVisible(false);
				dispose();
				CreateProfile.main(null);
			}
		});
		btnsignup.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 24));
		btnsignup.setBackground(new Color(153, 204, 255));
		btnsignup.setBounds(66, 542, 313, 46);
		contentPane.add(btnsignup);

		JLabel lblNewLabel_1_2 = new JLabel("Developed by Nimesh Fernando - 2115050");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(85, 614, 280, 14);
		contentPane.add(lblNewLabel_1_2);

		JButton btnClear = new JButton("Clear");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUsername.setText("");
				txtPassword.setText("");

				txtUsername.requestFocus();
			}
		});
		btnClear.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 24));
		btnClear.setBackground(new Color(255, 153, 153));
		btnClear.setBounds(109, 416, 220, 46);
		contentPane.add(btnClear);
	}

}
