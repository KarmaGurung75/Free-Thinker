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

public class Ad_student {

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
	public static void main(String [] arg) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ad_student window = new Ad_student();
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
	public Ad_student() {
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
		
		JButton btnback = new JButton("");
		btnback.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\back.jpg"));
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin ad = new Admin();
				ad.AdminScreen();
				dispose_frmStudent();
			}

			private void dispose_frmStudent() {
				// TODO Auto-generated method stub
				frmStudent.dispose();
				
			}
		});

		btnback.setBounds(0, 0, 60, 51);
		frmStudent.getContentPane().add(btnback);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.setForeground(new Color(255, 255, 255));
		btnexit.setBackground(new Color(0, 0, 0));
		btnexit.setFont(new Font("Arial", Font.BOLD, 14));
		btnexit.setBounds(859, 476, 85, 35);
		frmStudent.getContentPane().add(btnexit);
		
		JLabel student_management = new JLabel("STUDENT MANAGEMENT");
		student_management.setForeground(Color.WHITE);
		student_management.setBounds(175, -3, 535, 58);
		frmStudent.getContentPane().add(student_management);
		student_management.setFont(new Font("Arial", Font.BOLD, 42));
		
		JLabel manage_information = new JLabel("MANAGE INFORMATION");
		manage_information.setForeground(Color.WHITE);
		manage_information.setBounds(10, 65, 331, 67);
		frmStudent.getContentPane().add(manage_information);
		manage_information.setFont(new Font("Arial", Font.BOLD, 28));
		
		JLabel teacher_detail = new JLabel("TEACHER'S DETAIL");
		teacher_detail.setForeground(Color.WHITE);
		teacher_detail.setBounds(378, 65, 313, 67);
		frmStudent.getContentPane().add(teacher_detail);
		teacher_detail.setFont(new Font("Arial", Font.BOLD, 28));
		
		JPanel showall = new JPanel();
		showall.setBounds(372, 141, 572, 325);
		frmStudent.getContentPane().add(showall);
		showall.setLayout(null);
		
		name = new JTextField();
		name.setBounds(164, 142, 186, 29);
		frmStudent.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblname = new JLabel("NAME");
		lblname.setForeground(Color.WHITE);
		lblname.setFont(new Font("Arial", Font.BOLD, 18));
		lblname.setBounds(10, 142, 129, 29);
		frmStudent.getContentPane().add(lblname);
		
		age = new JTextField();
		age.setBounds(164, 181, 186, 29);
		frmStudent.getContentPane().add(age);
		age.setColumns(10);
		
		JLabel lblage = new JLabel("AGE");
		lblage.setForeground(Color.WHITE);
		lblage.setFont(new Font("Arial", Font.BOLD, 18));
		lblage.setBounds(10, 179, 112, 29);
		frmStudent.getContentPane().add(lblage);
		
		JLabel lblgender = new JLabel("GENDER");
		lblgender.setForeground(Color.WHITE);
		lblgender.setFont(new Font("Arial", Font.BOLD, 18));
		lblgender.setBounds(10, 218, 112, 29);
		frmStudent.getContentPane().add(lblgender);
		
		JLabel lblemail = new JLabel("EMAIL");
		lblemail.setForeground(Color.WHITE);
		lblemail.setFont(new Font("Arial", Font.BOLD, 18));
		lblemail.setBounds(10, 257, 112, 29);
		frmStudent.getContentPane().add(lblemail);
		
		JLabel lblcontact = new JLabel("CONTACT");
		lblcontact.setForeground(Color.WHITE);
		lblcontact.setFont(new Font("Arial", Font.BOLD, 18));
		lblcontact.setBounds(10, 298, 112, 29);
		frmStudent.getContentPane().add(lblcontact);
		
		gender = new JTextField();
		gender.setBounds(164, 220, 186, 29);
		frmStudent.getContentPane().add(gender);
		gender.setColumns(10);
		
		email = new JTextField();
		email.setBounds(164, 259, 186, 29);
		frmStudent.getContentPane().add(email);
		email.setColumns(10);
		
		contact = new JTextField();
		contact.setBounds(164, 298, 186, 29);
		frmStudent.getContentPane().add(contact);
		contact.setColumns(10);
		
		JLabel lbldob = new JLabel("DOB");
		lbldob.setForeground(Color.WHITE);
		lbldob.setFont(new Font("Arial", Font.BOLD, 18));
		lbldob.setBounds(10, 339, 112, 29);
		frmStudent.getContentPane().add(lbldob);
		
		dob = new JTextField();
		dob.setBounds(164, 341, 186, 29);
		frmStudent.getContentPane().add(dob);
		dob.setColumns(10);
		
		JLabel lblrollno = new JLabel("ROLL NO.");
		lblrollno.setForeground(Color.WHITE);
		lblrollno.setFont(new Font("Arial", Font.BOLD, 18));
		lblrollno.setBounds(10, 378, 112, 29);
		frmStudent.getContentPane().add(lblrollno);
		
		rollno = new JTextField();
		rollno.setBounds(164, 380, 186, 29);
		frmStudent.getContentPane().add(rollno);
		rollno.setColumns(10);
		
		JLabel lbladdress = new JLabel("ADDRESS");
		lbladdress.setForeground(Color.WHITE);
		lbladdress.setFont(new Font("Arial", Font.BOLD, 18));
		lbladdress.setBounds(10, 417, 112, 29);
		frmStudent.getContentPane().add(lbladdress);
		
		address = new JTextField();
		address.setBounds(164, 419, 186, 29);
		frmStudent.getContentPane().add(address);
		address.setColumns(10);
		
		JButton btnadd = new JButton("ADD");
		btnadd.setForeground(Color.WHITE);
		btnadd.setBackground(Color.BLACK);
		btnadd.setFont(new Font("Arial", Font.BOLD, 16));
		btnadd.setBounds(10, 460, 97, 51);
		frmStudent.getContentPane().add(btnadd);
		
		JButton btnupdate = new JButton("UPDATE");
		btnupdate.setForeground(Color.WHITE);
		btnupdate.setBackground(Color.BLACK);
		btnupdate.setFont(new Font("Arial", Font.BOLD, 16));
		btnupdate.setBounds(117, 461, 124, 50);
		frmStudent.getContentPane().add(btnupdate);
		
		JButton btndelete = new JButton("DELETE");
		btndelete.setForeground(Color.WHITE);
		btndelete.setBackground(Color.BLACK);
		btndelete.setFont(new Font("Arial", Font.BOLD, 16));
		btndelete.setBounds(251, 460, 97, 51);
		frmStudent.getContentPane().add(btndelete);
		
		JButton btnshowall = new JButton("SHOW ALL");
		btnshowall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnshowall.setForeground(new Color(255, 255, 255));
		btnshowall.setBackground(new Color(0, 0, 0));
		btnshowall.setFont(new Font("Arial", Font.BOLD, 18));
		btnshowall.setBounds(800, 77, 144, 51);
		frmStudent.getContentPane().add(btnshowall);
		
		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\bak.png"));
		image.setBounds(0, -3, 959, 523);
		frmStudent.getContentPane().add(image);
	}

}
