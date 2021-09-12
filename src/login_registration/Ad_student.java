package login_registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ad_student {

	private JFrame frmStudent;
	private JTextField first_name;
	private JTextField age;
	private JTextField gender;
	private JTextField email;
	private JTextField contact;
	private JTextField dob;
	private JTextField rollno;
	private JTextField address;
	private JTextField Studentid;
	private JTable table;
	private JTextField last_name_txt;

	/**
	 * Launch the application.
	 */
	public static void Admin_StudentScreen() {
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
		frmStudent.setBounds(100, 100, 982, 593);
		frmStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudent.getContentPane().setLayout(null);
		
		JButton btnback = new JButton("");
		btnback.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\backbtn.png"));
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

		btnback.setBounds(0, 0, 48, 48);
		frmStudent.getContentPane().add(btnback);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\exit1.png"));
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opt=JOptionPane.showConfirmDialog(null,"Are you sure to Exit?","Exit",JOptionPane.YES_NO_OPTION);
				//YES_NO_CANCEL_OPTION;
				if (opt==0) {
					dispose_frmStudent();
				}
			}

			private void dispose_frmStudent() {
				// TODO Auto-generated method stub
				frmStudent.dispose();
				
			}
		});
		btnexit.setForeground(new Color(255, 255, 255));
		btnexit.setBackground(new Color(0, 0, 0));
		btnexit.setFont(new Font("Arial", Font.BOLD, 14));
		btnexit.setBounds(859, 512, 104, 35);
		frmStudent.getContentPane().add(btnexit);
		
		JLabel student_management = new JLabel("STUDENT MANAGEMENT");
		student_management.setForeground(Color.WHITE);
		student_management.setBounds(175, -3, 535, 58);
		frmStudent.getContentPane().add(student_management);
		student_management.setFont(new Font("Arial", Font.BOLD, 42));
		
		JLabel manage_information = new JLabel("MANAGE INFORMATION");
		manage_information.setForeground(Color.WHITE);
		manage_information.setBounds(10, 47, 331, 51);
		frmStudent.getContentPane().add(manage_information);
		manage_information.setFont(new Font("Arial", Font.BOLD, 28));
		
		JLabel teacher_detail = new JLabel("TEACHER'S DETAIL");
		teacher_detail.setForeground(Color.WHITE);
		teacher_detail.setBounds(413, 43, 313, 58);
		frmStudent.getContentPane().add(teacher_detail);
		teacher_detail.setFont(new Font("Arial", Font.BOLD, 28));
		
		first_name = new JTextField();
		first_name.setBounds(164, 142, 186, 29);
		frmStudent.getContentPane().add(first_name);
		first_name.setColumns(10);
		
		JLabel lblname = new JLabel("FiRST NAME");
		lblname.setForeground(Color.WHITE);
		lblname.setFont(new Font("Arial", Font.BOLD, 18));
		lblname.setBounds(10, 142, 129, 29);
		frmStudent.getContentPane().add(lblname);
		
		age = new JTextField();
		age.setBounds(164, 222, 186, 29);
		frmStudent.getContentPane().add(age);
		age.setColumns(10);
		
		JLabel lblage = new JLabel("AGE");
		lblage.setForeground(Color.WHITE);
		lblage.setFont(new Font("Arial", Font.BOLD, 18));
		lblage.setBounds(10, 220, 112, 29);
		frmStudent.getContentPane().add(lblage);
		
		JLabel lblgender = new JLabel("GENDER");
		lblgender.setForeground(Color.WHITE);
		lblgender.setFont(new Font("Arial", Font.BOLD, 18));
		lblgender.setBounds(10, 261, 112, 29);
		frmStudent.getContentPane().add(lblgender);
		
		JLabel lblemail = new JLabel("EMAIL");
		lblemail.setForeground(Color.WHITE);
		lblemail.setFont(new Font("Arial", Font.BOLD, 18));
		lblemail.setBounds(10, 383, 112, 29);
		frmStudent.getContentPane().add(lblemail);
		
		JLabel lblcontact = new JLabel("CONTACT");
		lblcontact.setForeground(Color.WHITE);
		lblcontact.setFont(new Font("Arial", Font.BOLD, 18));
		lblcontact.setBounds(10, 420, 112, 29);
		frmStudent.getContentPane().add(lblcontact);
		
		gender = new JTextField();
		gender.setBounds(164, 263, 186, 29);
		frmStudent.getContentPane().add(gender);
		gender.setColumns(10);
		
		email = new JTextField();
		email.setBounds(164, 383, 186, 29);
		frmStudent.getContentPane().add(email);
		email.setColumns(10);
		
		contact = new JTextField();
		contact.setBounds(164, 420, 186, 29);
		frmStudent.getContentPane().add(contact);
		contact.setColumns(10);
		
		JLabel lbldob = new JLabel("DOB");
		lbldob.setForeground(Color.WHITE);
		lbldob.setFont(new Font("Arial", Font.BOLD, 18));
		lbldob.setBounds(10, 459, 112, 29);
		frmStudent.getContentPane().add(lbldob);
		
		dob = new JTextField();
		dob.setBounds(164, 461, 186, 29);
		frmStudent.getContentPane().add(dob);
		dob.setColumns(10);
		
		JLabel lblrollno = new JLabel("ROLL NO.");
		lblrollno.setForeground(Color.WHITE);
		lblrollno.setFont(new Font("Arial", Font.BOLD, 18));
		lblrollno.setBounds(10, 300, 112, 29);
		frmStudent.getContentPane().add(lblrollno);
		
		rollno = new JTextField();
		rollno.setBounds(164, 302, 186, 29);
		frmStudent.getContentPane().add(rollno);
		rollno.setColumns(10);
		
		JLabel lbladdress = new JLabel("ADDRESS");
		lbladdress.setForeground(Color.WHITE);
		lbladdress.setFont(new Font("Arial", Font.BOLD, 18));
		lbladdress.setBounds(10, 349, 112, 29);
		frmStudent.getContentPane().add(lbladdress);
		
		address = new JTextField();
		address.setBounds(164, 344, 186, 29);
		frmStudent.getContentPane().add(address);
		address.setColumns(10);
		
		
		// Add Button
		JButton btnadd = new JButton("ADD");
		btnadd.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\add.png"));
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Student_ID = Studentid.getText();
				String First_name = first_name.getText();
				String Last_name = last_name_txt.getText();
				String Age = age.getText();
				String Gender = gender.getText();
				String Roll_no = rollno.getText();
				String Address = address.getText();
				String Email_Id = email.getText();
				String Contact = contact.getText();
				String DOB = dob.getText();
				
				try {
					
					//1. Get a connection to database
					Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");

					//2. Create a statement
					Statement myStmt = myConn.createStatement();

					//3. Execute SQL Query
					String sql = "insert into tbl_student"
							+"(Student_id,first_name,last_name,age,gender,roll_no,address, email, contact,dob)"
							+"values ('"+Student_ID+"', '"+First_name+"', '"+Last_name +"', '"+Age+"','"+Gender+"','"+Roll_no+"','"+Address+"', '"+Email_Id+"','"+Contact+"', '"+DOB+"')";

					myStmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(btnadd, "The Data is inserted successfully");
					((DefaultTableModel)table.getModel()).setNumRows(0); // delet all table row
					}
					catch(Exception ex) {
					ex.printStackTrace();
					}

			}
		});
		btnadd.setForeground(Color.WHITE);
		btnadd.setBackground(Color.BLACK);
		btnadd.setFont(new Font("Arial", Font.BOLD, 16));
		btnadd.setBounds(10, 511, 112, 35);
		frmStudent.getContentPane().add(btnadd);
		
		JButton btnupdate = new JButton("UPDATE");
		btnupdate.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\update.png"));
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Student_ID = Studentid.getText();
				String First_name = first_name.getText();
				String Last_name = last_name_txt.getText();
				String Age = age.getText();
				String Gender = gender.getText();
				String Roll_no = rollno.getText();
				String Address = address.getText();
				String Email_Id = email.getText();
				String Contact = contact.getText();
				String DOB = dob.getText();
				
				try {
					//1. Get a connection to database
					Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");

					//2. Create a statement
					Statement myStmt = myConn.createStatement();

					//3. Execute SQL Query
					String sql = " Update tbl_student set first_name = '"+First_name+"', last_name = '"+ Last_name+"', age = '"+Age+"', gender= '"+Gender+"', roll_no= '"+Roll_no+"', address='"+Address+"', email='"+Email_Id+"', contact = '"+Contact+"', dob='"+DOB+"' where student_id = '"+Student_ID+"' ";
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
		btnupdate.setFont(new Font("Arial", Font.BOLD, 16));
		btnupdate.setBounds(138, 511, 139, 35);
		frmStudent.getContentPane().add(btnupdate);
		
		JButton btndelete = new JButton("DELETE");
		btndelete.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\delete.png"));
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Student_ID = Studentid.getText();
				try {
					//1. Get a connection to database
					//Connection myConn = DriverManager.getConnection(url, user, password);
					Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
					//2. Create a statement
					Statement myStmt = myConn.createStatement();
					
					//3. Execute SQL Query
					String sql = "delete from tbl_student where student_id = '"+Student_ID+"'";
					
					int rowsAffected = myStmt.executeUpdate(sql);
					
					System.out.println("Rows affected: "+ rowsAffected);
					JOptionPane.showMessageDialog(btndelete,"Delete Successfully");
					((DefaultTableModel)table.getModel()).setNumRows(0); // delet all table row

					
				}
				catch(Exception ex) {
					ex.printStackTrace();
					}
				
			}
		});
		btndelete.setForeground(Color.WHITE);
		btndelete.setBackground(Color.BLACK);
		btndelete.setFont(new Font("Arial", Font.BOLD, 16));
		btndelete.setBounds(295, 511, 147, 35);
		frmStudent.getContentPane().add(btndelete);
		
		JButton btnshowall = new JButton("SHOW ALL");
		btnshowall.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\display.png"));
		btnshowall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					//	class.forName("com.mysql.jdbc.Driver");
						Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
						Statement st = myConn.createStatement();
						String sql = "select * from tbl_student";
						ResultSet rs = st.executeQuery(sql);
						
						
						
						while(rs.next()) {
							String Student_ID = String.valueOf(rs.getInt("student_id"));
							String First_name = rs.getString("first_name");
							String Last_name = rs.getString("last_name");
							String Age = String.valueOf(rs.getInt("age"));
							String Gender = rs.getString("gender");
							String Roll_no = String.valueOf(rs.getInt("roll_no"));
							String Address = rs.getString("address");
							String Email_ID = rs.getString("email");
							String Contact = String.valueOf(rs.getInt("contact"));
							String DOB = rs.getString("dob");
							
							
							String tbData [] = {Student_ID, First_name,Last_name, Age,
									            Gender,Roll_no,Address,Email_ID, Contact, DOB};
							DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
							
							tblModel.addRow(tbData);
						}
					
					myConn.close();
						
					}catch(Exception ex) {
						System.out.println(ex.getMessage());
					}			
				
				
			}
		});
		btnshowall.setForeground(new Color(255, 255, 255));
		btnshowall.setBackground(new Color(0, 0, 0));
		btnshowall.setFont(new Font("Arial", Font.BOLD, 18));
		btnshowall.setBounds(591, 511, 176, 35);
		frmStudent.getContentPane().add(btnshowall);
		
		Studentid = new JTextField();
		Studentid.setFont(new Font("Arial", Font.BOLD, 18));
		Studentid.setBounds(164, 103, 186, 29);
		frmStudent.getContentPane().add(Studentid);
		Studentid.setColumns(10);
		
		JLabel lblsID = new JLabel("Student ID");
		lblsID.setForeground(Color.WHITE);
		lblsID.setFont(new Font("Arial", Font.BOLD, 18));
		lblsID.setBounds(5, 97, 102, 35);
		frmStudent.getContentPane().add(lblsID);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\clear1.png"));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Studentid.setText("");
				first_name.setText("");
				last_name_txt.setText("");
				age.setText("");
				gender.setText("");
				rollno.setText("");
				address.setText("");
				email.setText("");
				contact.setText("");
				dob.setText("");
			}
		});
		btnClear.setBackground(Color.BLACK);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Arial", Font.BOLD, 16));
		btnClear.setBounds(462, 511, 119, 35);
		frmStudent.getContentPane().add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		//scrollPane.setBackground(Color.BLACK);
		//scrollPane.setForeground(Color.WHITE);
		scrollPane.setBounds(360, 98, 603, 403);
		frmStudent.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setForeground(Color.WHITE);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel RecordTable = (DefaultTableModel)table.getModel();
				int SelectedRows =table.getSelectedRow();
				Studentid.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
				first_name.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
				last_name_txt.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
				age.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
				gender.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
				rollno.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
				address.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
				email.setText(RecordTable.getValueAt(SelectedRows, 7).toString());
				contact.setText(RecordTable.getValueAt(SelectedRows, 8).toString());
				dob.setText(RecordTable.getValueAt(SelectedRows, 9).toString());
			}
		});
		table.setFillsViewportHeight(true);
		table.setFont(new Font("Arial", Font.BOLD, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				" ID", "First Name", "Last Name", "Roll No", "Age", "Gender", "Address", "Email", "Contact", "DOB"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(55);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.getColumnModel().getColumn(3).setPreferredWidth(55);
		table.getColumnModel().getColumn(4).setPreferredWidth(55);
		table.getColumnModel().getColumn(5).setPreferredWidth(70);
		table.getColumnModel().getColumn(6).setPreferredWidth(80);
		table.getColumnModel().getColumn(7).setPreferredWidth(80);
		table.getColumnModel().getColumn(8).setPreferredWidth(80);
		table.getColumnModel().getColumn(9).setPreferredWidth(70);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("LAST NAME");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 177, 112, 35);
		frmStudent.getContentPane().add(lblNewLabel);
		
		last_name_txt = new JTextField();
		last_name_txt.setBounds(163, 181, 187, 31);
		frmStudent.getContentPane().add(last_name_txt);
		last_name_txt.setColumns(10);
		
		JLabel page = new JLabel("");
		page.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\main_cover1.png"));
		page.setBounds(0, 0,982, 586);
		frmStudent.getContentPane().add(page);
	}
}
