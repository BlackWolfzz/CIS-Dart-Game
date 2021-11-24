package MainGame;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

public class HowToPlay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HowToPlay frame = new HowToPlay();
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
	public HowToPlay() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-target-60.png"));
		setTitle("The Dart Gane - How to Play");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 481);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setVisible(false);
				dispose();
				TheDartGame.main(null);
			}
		});
		
				JLabel lblHowToPlay = new JLabel("How to Play");
				lblHowToPlay.setHorizontalAlignment(SwingConstants.CENTER);
				lblHowToPlay.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 40));
				lblHowToPlay.setBounds(243, 11, 261, 66);
				contentPane.add(lblHowToPlay);
		lblNewLabel_2.setIcon(
				new ImageIcon("D:\\SLIIT\\3rd Year\\1st Sem\\CIS\\Eclipse\\Project\\Images\\icons8-home-50-nxt.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(657, 11, 68, 66);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel = new JLabel("1. Start Game");
		lblNewLabel.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 21));
		lblNewLabel.setBounds(61, 128, 618, 56);
		contentPane.add(lblNewLabel);

		JLabel lblstartGame = new JLabel("2. Choose Difficulty mode from 'Options' according to your Age.");
		lblstartGame.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 21));
		lblstartGame.setBounds(61, 195, 618, 56);
		contentPane.add(lblstartGame);

		JLabel lblSolveThe = new JLabel("3. Solve the Equation and Choose the correct Answer.");
		lblSolveThe.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 21));
		lblSolveThe.setBounds(61, 262, 618, 56);
		contentPane.add(lblSolveThe);
		
		JLabel lblEnjoy = new JLabel("Enjoy");
		lblEnjoy.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnjoy.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 21));
		lblEnjoy.setBounds(61, 340, 618, 56);
		contentPane.add(lblEnjoy);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(46, 112, 644, 298);
		contentPane.add(panel);
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
	}
}
