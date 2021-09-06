package login_registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import java.awt.event.MouseAdapter;
import javax.swing.JScrollPane;

public class Teacher_test {

	//protected static final int SelectedRows = 0;
	private JFrame frame;
	private JTextField username;
	private JTextField age;
	private JTextField experience;
	private JTextField qualification;
	private JTextField gender;
	private JTextField email;
	private JTextField contact;
	private JTextField dob;
	private JTextField last_name_txt;
	private JTextField first_name_txt;
	private JTextField teacherid_txt;
	private JTable table_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String [] arg) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher_test window = new Teacher_test();
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
	public Teacher_test() {
		initialize();
	}
	
	///////////////////////////////////////////////////////////////////////////////


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 100, 0));
		frame.setBounds(100, 100, 1174, 680);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		
		JLabel teacher_management = new JLabel("TEACHER MANAGEMENT");
		teacher_management.setForeground(Color.WHITE);
		teacher_management.setBounds(252, 10, 607, 64);
		frame.getContentPane().add(teacher_management);
		teacher_management.setFont(new Font("Arial", Font.BOLD, 42));
		
		/*JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 76, 379, 52);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);*/
		
		JLabel manage_information = new JLabel("MANAGE INFORMATION");
		manage_information.setForeground(Color.WHITE);
		manage_information.setBounds(10, 84, 379, 52);
		frame.getContentPane().add(manage_information);
		manage_information.setFont(new Font("Arial", Font.BOLD, 32));
		
		JLabel teachersdetail = new JLabel("TEACHER'S DETAILS");
		teachersdetail.setForeground(Color.WHITE);
		teachersdetail.setBounds(417, 92, 326, 37);
		frame.getContentPane().add(teachersdetail);
		teachersdetail.setFont(new Font("Arial", Font.BOLD, 32));
		
		JLabel lblusername = new JLabel("USERNAME");
		lblusername.setForeground(Color.WHITE);
		lblusername.setFont(new Font("Arial", Font.BOLD, 18));
		lblusername.setBounds(10, 261, 143, 31);
		frame.getContentPane().add(lblusername);
		
		JLabel lblage = new JLabel("AGE");
		lblage.setForeground(Color.WHITE);
		lblage.setFont(new Font("Arial", Font.BOLD, 18));
		lblage.setBounds(10, 302, 143, 27);
		frame.getContentPane().add(lblage);
		
		JLabel lblexperience = new JLabel("EXPERIENCE");
		lblexperience.setForeground(Color.WHITE);
		lblexperience.setFont(new Font("Arial", Font.BOLD, 18));
		lblexperience.setBounds(10, 339, 143, 34);
		frame.getContentPane().add(lblexperience);
		
		JLabel lblqualification = new JLabel("QUALIFICATION");
		lblqualification.setForeground(Color.WHITE);
		lblqualification.setFont(new Font("Arial", Font.BOLD, 18));
		lblqualification.setBounds(10, 383, 143, 31);
		frame.getContentPane().add(lblqualification);
		
		username = new JTextField();
		username.setBounds(175, 265, 176, 27);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		age = new JTextField();
		age.setBounds(175, 302, 176, 31);
		frame.getContentPane().add(age);
		age.setColumns(10);
		
		experience = new JTextField();
		experience.setBounds(175, 343, 176, 31);
		frame.getContentPane().add(experience);
		experience.setColumns(10);
		
		qualification = new JTextField();
		qualification.setBounds(175, 385, 176, 31);
		frame.getContentPane().add(qualification);
		qualification.setColumns(10);
		
		gender = new JTextField();
		gender.setBounds(175, 426, 176, 31);
		frame.getContentPane().add(gender);
		gender.setColumns(10);
		
		JLabel lblgender = new JLabel("GENDER");
		lblgender.setForeground(Color.WHITE);
		lblgender.setFont(new Font("Arial", Font.BOLD, 18));
		lblgender.setBounds(10, 424, 143, 31);
		frame.getContentPane().add(lblgender);
		
		JButton btnadd = new JButton("ADD");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Teacher_ID = teacherid_txt.getText();
				String First_name = first_name_txt.getText();
				String Last_name = last_name_txt.getText();
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
							+"(teacherid,first_name,last_name,username,age, experience, qualification,gender, email, contact,dob)"
							+"values ('"+Teacher_ID+"', '"+First_name+"', '"+Last_name +"','"+User_name+"', '"+Age+"', '"+Experience +"', '"+Qualification+"','"+Gender+"', '"+Email_Id+"','"+Contact+"', '"+DOB+"')";

					myStmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(btnadd, "The Data is inserted successfully");
					}
					catch(Exception ex) {
					ex.printStackTrace();
					}

			}
		});
		btnadd.setForeground(Color.WHITE);
		btnadd.setBackground(Color.BLACK);
		btnadd.setFont(new Font("Arial", Font.BOLD, 18));
		btnadd.setBounds(10, 588, 95, 45);
		frame.getContentPane().add(btnadd);
		
		// Update
		JButton btnupdate = new JButton("UPDATE");
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Teacher_ID = teacherid_txt.getText();
				String First_name = first_name_txt.getText();
				String Last_name = last_name_txt.getText();
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
					String sql = "Update tbl_teacher set first_name = '"+First_name+"' , last_name = '"+Last_name+"', username= '"+User_name+"', age='"+Age+"',experience = '"+Experience+"', qualification = '"+Qualification+"', gender = '"+Gender+"' ,email = '"+Email_Id+"',contact= '"+Contact+"',dob = '"+DOB+"' where teacherid = '"+Teacher_ID+"' ";		
					
				

					myStmt.executeUpdate(sql);

					JOptionPane.showMessageDialog(btnupdate,"Update Completed");
					((DefaultTableModel)table.getModel()).setNumRows(0); // delet all table row
					}
					catch(Exception ex) {
					ex.printStackTrace();
					}
			}

		});
		btnupdate.setForeground(Color.WHITE);
		btnupdate.setBackground(Color.BLACK);
		btnupdate.setFont(new Font("Arial", Font.BOLD, 18));
		btnupdate.setBounds(115, 588, 142, 45);
		frame.getContentPane().add(btnupdate);
		
		JButton btndelete = new JButton("DELETE");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Teacher_ID = teacherid_txt.getText();
				try {
					//1. Get a connection to database
					//Connection myConn = DriverManager.getConnection(url, user, password);
					Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
					//2. Create a statement
					Statement myStmt = myConn.createStatement();
					
					//3. Execute SQL Query
					String sql = "delete from tbl_teacher where teacherid = '"+Teacher_ID+"'";
					
					int rowsAffected = myStmt.executeUpdate(sql);
					
					System.out.println("Rows affected: "+ rowsAffected);
					JOptionPane.showMessageDialog(btndelete,"Delete Successfully");
					
				}
				catch(Exception ex) {
					ex.printStackTrace();
					}
				
			}
		});
		btndelete.setForeground(Color.WHITE);
		btndelete.setBackground(Color.BLACK);
		btndelete.setFont(new Font("Arial", Font.BOLD, 18));
		btndelete.setBounds(267, 588, 122, 45);
		frame.getContentPane().add(btndelete);
		
		JLabel lblemail = new JLabel("EMAIL");
		lblemail.setForeground(Color.WHITE);
		lblemail.setFont(new Font("Arial", Font.BOLD, 18));
		lblemail.setBounds(10, 465, 143, 31);
		frame.getContentPane().add(lblemail);
		
		JLabel lblcontact = new JLabel("CONTACT");
		lblcontact.setForeground(Color.WHITE);
		lblcontact.setFont(new Font("Arial", Font.BOLD, 18));
		lblcontact.setBounds(10, 506, 143, 31);
		frame.getContentPane().add(lblcontact);
		
		email = new JTextField();
		email.setBounds(175, 467, 176, 31);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		contact = new JTextField();
		contact.setBounds(175, 509, 176, 30);
		frame.getContentPane().add(contact);
		contact.setColumns(10);
		
		JButton btnshowall = new JButton("SHOW ALL");
		btnshowall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				//	class.forName("com.mysql.jdbc.Driver");
					Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
					Statement st = myConn.createStatement();
					String sql = "select * from tbl_teacher";
					ResultSet rs = st.executeQuery(sql);
					
					
					
					while(rs.next()) {
						String Teacher_ID = String.valueOf(rs.getInt("teacherid"));
						String First_name = rs.getString("first_name");
						String Last_name = rs.getString("last_name");
						String User_name = rs.getString("username");
						String Age = String.valueOf(rs.getInt("age"));
						String Experience = rs.getString("experience");
						String Qualification = rs.getString("qualification");
						String Gender = rs.getString("gender");
						String Email_ID = rs.getString("email");
						String Contact = String.valueOf(rs.getInt("contact"));
						String DOB = rs.getString("dob");
						
						
						String tbData [] = {Teacher_ID, First_name,Last_name, User_name, Age,
								             Experience, Qualification, Gender, Email_ID, Contact, DOB};
						DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
						
						tblModel.addRow(tbData);
					}
				
				myConn.close();
					
				}catch(Exception ex) {
					System.out.println(ex.getMessage());
				}			
			}
		});
		btnshowall.setBackground(Color.BLACK);
		btnshowall.setForeground(Color.WHITE);
		btnshowall.setFont(new Font("Arial", Font.BOLD, 18));
		btnshowall.setBounds(607, 588, 136, 45);
		frame.getContentPane().add(btnshowall);
		
		JLabel lbldob = new JLabel("DOB");
		lbldob.setForeground(Color.WHITE);
		lbldob.setFont(new Font("Arial", Font.BOLD, 18));
		lbldob.setBounds(10, 547, 143, 31);
		frame.getContentPane().add(lbldob);
		
		dob = new JTextField();
		dob.setBounds(175, 549, 176, 32);
		frame.getContentPane().add(dob);
		dob.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sector ad = new sector();
				ad.SectorScreen();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\back.jpg"));
		btnNewButton.setBounds(0, 0, 53, 52);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("FIRST NAME");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 183, 143, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LAST NAME");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 224, 145, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		last_name_txt = new JTextField();
		last_name_txt.setBounds(175, 226, 176, 27);
		frame.getContentPane().add(last_name_txt);
		last_name_txt.setColumns(10);
		
		first_name_txt = new JTextField();
		first_name_txt.setBounds(175, 185, 176, 31);
		frame.getContentPane().add(first_name_txt);
		first_name_txt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("TEACHER ID");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(8, 142, 145, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		teacherid_txt = new JTextField();
		teacherid_txt.setBounds(175, 142, 177, 31);
		frame.getContentPane().add(teacherid_txt);
		teacherid_txt.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_1.setBounds(975, 588, 85, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnreset = new JButton("RESET");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherid_txt.setText("");
				first_name_txt.setText("");
				last_name_txt.setText("");
				username.setText("");
				age.setText("");
				experience.setText("");
				qualification.setText("");
				gender.setText("");
				email.setText("");
				contact.setText("");
				dob.setText("");
				
			
				
			}
		});
		btnreset.setBackground(Color.WHITE);
		btnreset.setFont(new Font("Arial", Font.BOLD, 17));
		btnreset.setBounds(409, 590, 136, 43);
		frame.getContentPane().add(btnreset);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(363, 144, 787, 434);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel RecordTable = (DefaultTableModel)table.getModel();
							int SelectedRows =table.getSelectedRow();
							teacherid_txt.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
							first_name_txt.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
							last_name_txt.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
							username.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
							age.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
							experience.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
							qualification.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
							gender.setText(RecordTable.getValueAt(SelectedRows, 7).toString());
							email.setText(RecordTable.getValueAt(SelectedRows, 8).toString());
							contact.setText(RecordTable.getValueAt(SelectedRows, 9).toString());
							dob.setText(RecordTable.getValueAt(SelectedRows, 10).toString());
			}
		});
		table.setFillsViewportHeight(true);
		table.setFont(new Font("Arial", Font.BOLD, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "First Name", "Last Name", "Username", "Age", "Experience", "Qualification", "Gender", "Email", "Contact", "DOB"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.getColumnModel().getColumn(6).setPreferredWidth(80);
		table.getColumnModel().getColumn(7).setPreferredWidth(60);
		table.getColumnModel().getColumn(8).setPreferredWidth(80);
		table.getColumnModel().getColumn(9).setPreferredWidth(80);
		table.getColumnModel().getColumn(10).setPreferredWidth(70);
		scrollPane.setViewportView(table);
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
