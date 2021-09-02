package login_registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin {

	private JFrame adminframe;
	private JButton btnhome;

	/**
	 * Launch the application.
	 */
	public static void AdminScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
					window.adminframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		adminframe = new JFrame();
		adminframe.setBounds(100, 100, 616, 446);
		adminframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminframe.getContentPane().setLayout(null);
		
		// Sector Page Button
		btnhome = new JButton("");
		btnhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sector st = new sector();
				st.SectorScreen();
				dipose_adminframe();
			}

			private void dipose_adminframe() {
				// TODO Auto-generated method stub
				adminframe.dispose();
			}
		});
		btnhome.setBounds(57, 10, 46, 48);
		adminframe.getContentPane().add(btnhome);
		btnhome.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\1.png"));
		
		JButton btnteacher = new JButton("TEACHER");
		btnteacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ad_teacher tc= new Ad_teacher();
				tc.Admin_TeacherScreen();
				dispose_adminframe();
			}

			private void dispose_adminframe() {
				// TODO Auto-generated method stub
				adminframe.dispose();
			}
		});
		btnteacher.setFont(new Font("Arial", Font.BOLD, 16));
		btnteacher.setBounds(57, 276, 111, 30);
		adminframe.getContentPane().add(btnteacher);
		
		
		JButton btnstudent = new JButton("STUDENT");
		btnstudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ad_student st = new Ad_student();
				st.Admin_StudentScreen();
				dispose_adminframe();
			}

			private void dispose_adminframe() {
				// TODO Auto-generated method stub
				adminframe.dispose();
			}
		});
		btnstudent.setFont(new Font("Arial", Font.BOLD, 16));
		btnstudent.setBounds(245, 276, 109, 30);
		adminframe.getContentPane().add(btnstudent);
		
		JButton btnstaff = new JButton("STAFF");
		btnstaff.setFont(new Font("Arial", Font.BOLD, 16));
		btnstaff.setBounds(426, 276, 109, 31);
		adminframe.getContentPane().add(btnstaff);
		
		JLabel page = new JLabel("");
		page.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\BG.png"));
		page.setBounds(0, 0, 602, 409);
		adminframe.getContentPane().add(page);
	}
	public JButton getBtnNewButton() {
		return btnhome;
	}
}
