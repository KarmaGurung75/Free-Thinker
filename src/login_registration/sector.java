package login_registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sector {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void SectorScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sector window = new sector();
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
	public sector() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 637, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel sentence = new JLabel("select your field!!!");
		sentence.setForeground(new Color(255, 255, 255));
		sentence.setFont(new Font("Arial", Font.BOLD, 34));
		sentence.setBounds(153, 24, 321, 86);
		frame.getContentPane().add(sentence);
		
		JLabel admin = new JLabel("ADMIN");
		admin.setBackground(new Color(0, 0, 0));
		admin.setFont(new Font("Arial", Font.BOLD, 16));
		admin.setForeground(new Color(255, 255, 255));
		admin.setBounds(67, 373, 85, 22);
		frame.getContentPane().add(admin);
		
		JLabel student = new JLabel("STUDENT");
		student.setFont(new Font("Arial", Font.BOLD, 16));
		student.setForeground(new Color(255, 255, 255));
		student.setBackground(new Color(0, 0, 0));
		student.setBounds(389, 377, 85, 18);
		frame.getContentPane().add(student);
		
		JLabel teacher = new JLabel("TEACHER");
		teacher.setFont(new Font("Arial", Font.BOLD, 16));
		teacher.setForeground(new Color(255, 255, 255));
		teacher.setBackground(new Color(0, 0, 0));
		teacher.setBounds(235, 377, 85, 18);
		frame.getContentPane().add(teacher);
		
		JButton btnadmin = new JButton("");
		btnadmin.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\admin.png"));
		btnadmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Loginn Ln= new Loginn();
				Ln.setVisible(true);
				dispose_frame();
			}

			private void dispose_frame() {
				// TODO Auto-generated method stub
				frame.dispose();
				
			}
		});
		btnadmin.setFont(new Font("Arial", Font.BOLD, 20));
		btnadmin.setForeground(new Color(255, 255, 255));
		btnadmin.setBackground(new Color(0, 0, 0));
		btnadmin.setBounds(67, 281, 85, 86);
		frame.getContentPane().add(btnadmin);
		
		JButton btnteacher = new JButton("");
		btnteacher.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\teacher.png"));
		btnteacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Teacher_login TL = new Teacher_login();
				TL.TeacherLogScreen();
				dispose_frame();
			}

			private void dispose_frame() {
				// TODO Auto-generated method stub
				frame.dispose();
				
			}
		});
		btnteacher.setFont(new Font("Arial", Font.BOLD, 18));
		btnteacher.setForeground(new Color(255, 255, 255));
		btnteacher.setBackground(new Color(0, 0, 0));
		btnteacher.setBounds(235, 282, 85, 85);
		frame.getContentPane().add(btnteacher);
		
		JButton btnstudent = new JButton("");
		btnstudent.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\student.png"));
		btnstudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student_login St = new Student_login();
				St.setVisible(true);
				dispose_frame();
			}

			private void dispose_frame() {
				// TODO Auto-generated method stub
				frame.dispose();
				
			}
		});
		btnstudent.setFont(new Font("Arial", Font.BOLD, 18));
		btnstudent.setForeground(new Color(255, 255, 255));
		btnstudent.setBackground(new Color(0, 0, 0));
		btnstudent.setBounds(389, 282, 85, 85);
		frame.getContentPane().add(btnstudent);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opt=JOptionPane.showConfirmDialog(null,"Are you sure to Exit?","Exit",JOptionPane.YES_NO_OPTION);
				//YES_NO_CANCEL_OPTION;
				if (opt==0) {
					dispose_frame();
				}
			}

			private void dispose_frame() {
				// TODO Auto-generated method stub
				frame.dispose();
				
			}
		});
		btnexit.setForeground(new Color(255, 255, 255));
		btnexit.setBackground(new Color(0, 0, 0));
		btnexit.setFont(new Font("Arial", Font.BOLD, 16));
		btnexit.setBounds(528, 391, 85, 40);
		frame.getContentPane().add(btnexit);
		
		
		
		JLabel lblpage = new JLabel("");
		lblpage.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\cover1.png"));
		lblpage.setBounds(0, 0, 623, 441);
		frame.getContentPane().add(lblpage);
	}
}
