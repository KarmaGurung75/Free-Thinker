package login_registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class Student {

	private JFrame frmStudent;
	private JTextField name;
	private JTextField age;
	private JTextField gender;
	private JTextField email;
	private JTextField contact;
	private JTextField dob;
	private JTextField rollno;
	private JTextField address;

	/**
	 * Launch the application.
	 */
	public static void StudentScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student window = new Student();
					window.frmStudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudent = new JFrame();
		frmStudent.getContentPane().setBackground(new Color(255, 153, 255));
		frmStudent.setTitle("student");
		frmStudent.setBounds(100, 100, 973, 557);
		frmStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudent.getContentPane().setLayout(null);
			}

}
