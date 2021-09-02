package login_registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teacher {

	private JFrame frame;
	private JTextField username;
	private JTextField age;
	private JTextField experience;
	private JTextField qualification;
	private JTextField gender;
	private JTextField email;
	private JTextField contact;
	private JTextField dob;

	/**
	 * Launch the application.
	 */
	public static void TeacherScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher window = new Teacher();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Teacher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 100, 0));
		frame.setBounds(100, 100, 972, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
