package login_registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.*;

public class Ad_teacher {

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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ad_teacher window = new Ad_teacher();
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
	public Ad_teacher() {
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
		
		JLabel teacher_management = new JLabel("TEACHER MANAGEMENT");
		teacher_management.setForeground(Color.WHITE);
		teacher_management.setBounds(197, 10, 521, 52);
		frame.getContentPane().add(teacher_management);
		teacher_management.setFont(new Font("Arial", Font.BOLD, 42));
		
		/*JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 76, 379, 52);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);*/
		
		JLabel manage_information = new JLabel("MANAGE INFORMATION");
		manage_information.setForeground(Color.WHITE);
		manage_information.setBounds(10, 72, 379, 52);
		frame.getContentPane().add(manage_information);
		manage_information.setFont(new Font("Arial", Font.BOLD, 32));
		
		JLabel teachersdetail = new JLabel("TEACHER'S DETAILS");
		teachersdetail.setForeground(Color.WHITE);
		teachersdetail.setBounds(417, 80, 326, 37);
		frame.getContentPane().add(teachersdetail);
		teachersdetail.setFont(new Font("Arial", Font.BOLD, 32));
		
		// Information Field
		JFrame information = new JFrame();
		information.setBounds(409, 138, 539, 395);
		frame.getContentPane().add(information);
		
		
		
		
		
		JLabel lblusername = new JLabel("USERNAME");
		lblusername.setForeground(Color.WHITE);
		lblusername.setFont(new Font("Arial", Font.BOLD, 18));
		lblusername.setBounds(10, 138, 143, 31);
		frame.getContentPane().add(lblusername);
		
		JLabel lblage = new JLabel("AGE");
		lblage.setForeground(Color.WHITE);
		lblage.setFont(new Font("Arial", Font.BOLD, 18));
		lblage.setBounds(10, 182, 143, 27);
		frame.getContentPane().add(lblage);
		
		JLabel lblexperience = new JLabel("EXPERIENCE");
		lblexperience.setForeground(Color.WHITE);
		lblexperience.setFont(new Font("Arial", Font.BOLD, 18));
		lblexperience.setBounds(10, 219, 143, 34);
		frame.getContentPane().add(lblexperience);
		
		JLabel lblqualification = new JLabel("QUALIFICATION");
		lblqualification.setForeground(Color.WHITE);
		lblqualification.setFont(new Font("Arial", Font.BOLD, 18));
		lblqualification.setBounds(10, 263, 143, 31);
		frame.getContentPane().add(lblqualification);
		
		username = new JTextField();
		username.setBounds(213, 138, 176, 31);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		age = new JTextField();
		age.setBounds(213, 178, 176, 31);
		frame.getContentPane().add(age);
		age.setColumns(10);
		
		experience = new JTextField();
		experience.setBounds(213, 219, 176, 34);
		frame.getContentPane().add(experience);
		experience.setColumns(10);
		
		qualification = new JTextField();
		qualification.setBounds(213, 263, 176, 31);
		frame.getContentPane().add(qualification);
		qualification.setColumns(10);
		
		gender = new JTextField();
		gender.setBounds(213, 304, 176, 31);
		frame.getContentPane().add(gender);
		gender.setColumns(10);
		
		JLabel lblgender = new JLabel("GENDER");
		lblgender.setForeground(Color.WHITE);
		lblgender.setFont(new Font("Arial", Font.BOLD, 18));
		lblgender.setBounds(10, 304, 143, 31);
		frame.getContentPane().add(lblgender);
		
		JButton btnadd = new JButton("ADD");
		btnadd.setForeground(Color.WHITE);
		btnadd.setBackground(Color.BLACK);
		btnadd.setFont(new Font("Arial", Font.BOLD, 18));
		btnadd.setBounds(10, 488, 95, 45);
		frame.getContentPane().add(btnadd);
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String User_name = username.getText();
				String Age = age.getText();
				String Experience = experience.getText();
				String Qualification = qualification.getText();
				String Gender = gender.getText();
				String Email_Id = email.getText();
				String Contact = contact.getText();
				String DOB = dob.getText();
				
				try {
					
					//1. Get a connection to database
					Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");

					//2. Create a statement
					Statement myStmt = myConn.createStatement();

					//3. Execute SQL Query
					String sql = "insert into tbl_teacher"
							+"(username,age, experience, qualification,gender, email, contact,dob)"
							+"values ('"+User_name+"', '"+Age+"', '"+Experience +"', '"+Qualification+"','"+Gender+"', '"+Email_Id+"','"+Contact+"', '"+DOB+"')";

					myStmt.executeUpdate(sql);

					System.out.println("Insert Completed");
					JOptionPane.showMessageDialog(btnadd, "The Data is inserted successfully");
					}
					catch(Exception ex) {
					ex.printStackTrace();
					}

			}
		});
		JButton btnNewButton = new JButton("");
				
		JButton btnupdate = new JButton("UPDATE");
		btnupdate.setForeground(Color.WHITE);
		btnupdate.setBackground(Color.BLACK);
		btnupdate.setFont(new Font("Arial", Font.BOLD, 18));
		btnupdate.setBounds(115, 488, 142, 45);
		frame.getContentPane().add(btnupdate);
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String User_name = username.getText();
				String Age = age.getText();
				String Experience = experience.getText();
				String Qualification = qualification.getText();
		
				String Email_Id = email.getText();
				String Contact = contact.getText();
				
				try {
					//1. Get a connection to database
					Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");

					//2. Create a statement
					Statement myStmt = myConn.createStatement();

					//3. Execute SQL Query
					String sql = "Update tbl_teacher"
							+ " set age='"+Age+"' "
							+ "set experience = '"+Experience+"'"
							+ "set qualification = '"+Qualification+"'"
							+ "set email = '"+Email_Id+"' "
							+ "set contact= '"+Contact+"' "
						    + " where username='"+User_name+"'";

					myStmt.executeUpdate(sql);

					System.out.println("Update Completed");
					}
					catch(Exception ex) {
					ex.printStackTrace();
					}

				
			}
		});
		
		
		
		JButton btndelete = new JButton("DELETE");
		btndelete.setForeground(Color.WHITE);
		btndelete.setBackground(Color.BLACK);
		btndelete.setFont(new Font("Arial", Font.BOLD, 18));
		btndelete.setBounds(267, 488, 122, 45);
		frame.getContentPane().add(btndelete);


		
		JLabel lblemail = new JLabel("EMAIL");
		lblemail.setForeground(Color.WHITE);
		lblemail.setFont(new Font("Arial", Font.BOLD, 18));
		lblemail.setBounds(10, 345, 143, 31);
		frame.getContentPane().add(lblemail);
		
		JLabel lblcontact = new JLabel("CONTACT");
		lblcontact.setForeground(Color.WHITE);
		lblcontact.setFont(new Font("Arial", Font.BOLD, 18));
		lblcontact.setBounds(10, 386, 143, 31);
		frame.getContentPane().add(lblcontact);
		
		email = new JTextField();
		email.setBounds(213, 345, 176, 31);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		contact = new JTextField();
		contact.setBounds(213, 386, 176, 30);
		frame.getContentPane().add(contact);
		contact.setColumns(10);
		
		JButton btnshowall = new JButton("SHOW ALL");
		btnshowall.setBackground(Color.BLACK);
		btnshowall.setForeground(Color.WHITE);
		btnshowall.setFont(new Font("Arial", Font.BOLD, 18));
		btnshowall.setBounds(794, 87, 154, 45);
		frame.getContentPane().add(btnshowall);
		btnshowall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		
		JLabel lbldob = new JLabel("DOB");
		lbldob.setForeground(Color.WHITE);
		lbldob.setFont(new Font("Arial", Font.BOLD, 18));
		lbldob.setBounds(10, 427, 143, 31);
		frame.getContentPane().add(lbldob);
		
		dob = new JTextField();
		dob.setBounds(213, 426, 176, 32);
		frame.getContentPane().add(dob);
		dob.setColumns(10);
		
		JButton btnhome = new JButton("");
		btnhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin ad = new Admin();
				ad.AdminScreen();
				dispose_frame();
			}

			private void dispose_frame() {
				// TODO Auto-generated method stub
				frame.dispose();
				
			}
		});
		btnhome.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\back.jpg"));
		btnhome.setBounds(0, 0, 53, 52);
		frame.getContentPane().add(btnhome);
		
		JLabel lblimage = new JLabel("");
		lblimage.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\bak.png"));
		lblimage.setBounds(0, 0, 958, 543);
		frame.getContentPane().add(lblimage);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
