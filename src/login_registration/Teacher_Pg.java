package login_registration;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Teacher_Pg extends JFrame {


JPanel mainw_contentPane;
JTextField tf_lastname,tf_firstname,tf_username,tf_age,tf_experience,
tf_qualification,tf_teacherid,tf_gender,tf_email,tf_contact,tf_dob, M_id,m_name,
mtf_desc,s_id, s_name,sdm_id,sdm_name,result,
perc;
JTable sd_table,m_table;
private JTable table;
private JTextField tf_Marks;

public Teacher_Pg() {

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(0, 0, 1200, 730);

mainw_contentPane = new JPanel();
mainw_contentPane.setBackground(Color.WHITE);
mainw_contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(mainw_contentPane);
mainw_contentPane.setLayout(null);

JTabbedPane p_m_sd_tPane = new JTabbedPane(JTabbedPane.TOP);
p_m_sd_tPane.setBounds(29, 104, 1123, 561);
p_m_sd_tPane.setBorder(null);
p_m_sd_tPane.setBackground(Color.WHITE);
mainw_contentPane.add(p_m_sd_tPane);


//----------------------------------------------------Profile pane panel-------------------------------------------------------

JLayeredPane profile_pane = new JLayeredPane();
profile_pane.setBorder(null);
profile_pane.setForeground(Color.WHITE);
profile_pane.setBackground(Color.WHITE);
p_m_sd_tPane.addTab("Profile", null, profile_pane, null);
profile_pane.setLayout(null);

JPanel profile_panel = new JPanel();
profile_panel.setBounds(10, 11, 1097, 511);
profile_pane.add(profile_panel);
profile_panel.setLayout(null);

JLabel lblNewLabel = new JLabel("TEACHER PAGE");
lblNewLabel.setBounds(469, 32, 270, 61);
lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 26));
lblNewLabel.setBackground(new Color(0, 0, 0));
lblNewLabel.setForeground(new Color(255, 218, 185));
mainw_contentPane.add(lblNewLabel);


//------------------------------------------------------------Profile label --------------------------------------------------

JLabel lbl_teacherid = new JLabel("Teacher ID :");
lbl_teacherid.setFont(new Font("Tahoma", Font.BOLD, 15));
lbl_teacherid.setForeground(new Color(255, 255, 255));
lbl_teacherid.setBounds(16, 24, 95, 37);
profile_panel.add(lbl_teacherid);

JLabel lbl_fname = new JLabel("First Name:");
lbl_fname.setFont(new Font("Tahoma", Font.BOLD, 15));
lbl_fname.setForeground(new Color(255, 255, 255));
lbl_fname.setBounds(16, 64, 95, 37);
profile_panel.add(lbl_fname);

JLabel lbl_lname = new JLabel("Last Name:");
lbl_lname.setFont(new Font("Tahoma", Font.BOLD, 15));
lbl_lname.setForeground(new Color(255, 255, 255));
lbl_lname.setBounds(16, 104, 95, 37);
profile_panel.add(lbl_lname);

JLabel lbl_un = new JLabel("Username:");
lbl_un.setFont(new Font("Tahoma", Font.BOLD, 15));
lbl_un.setForeground(new Color(255, 255, 255));
lbl_un.setBounds(16, 144, 95, 37);
profile_panel.add(lbl_un);

JLabel lbl_age = new JLabel("Age:");
lbl_age.setFont(new Font("Tahoma", Font.BOLD, 15));
lbl_age.setForeground(new Color(255, 255, 255));
lbl_age.setBounds(16, 184, 95, 37);
profile_panel.add(lbl_age);

JLabel lbl_exp = new JLabel("Experience:");
lbl_exp.setFont(new Font("Tahoma", Font.BOLD, 15));
lbl_exp.setForeground(new Color(255, 255, 255));
lbl_exp.setBounds(16, 225, 118, 37);
profile_panel.add(lbl_exp);

JLabel lbl_qualification = new JLabel("Qualification:");
lbl_qualification.setFont(new Font("Tahoma", Font.BOLD, 15));
lbl_qualification.setForeground(new Color(255, 255, 255));
lbl_qualification.setBounds(16, 265, 118, 37);
profile_panel.add(lbl_qualification);

JLabel lbl_gender = new JLabel("Gender");
lbl_gender.setFont(new Font("Tahoma", Font.BOLD, 15));
lbl_gender.setForeground(new Color(255, 255, 255));
lbl_gender.setBounds(16, 305, 118, 37);
profile_panel.add(lbl_gender);

JLabel lbl_em = new JLabel("E-mail:");
lbl_em.setFont(new Font("Tahoma", Font.BOLD, 15));
lbl_em.setForeground(new Color(255, 255, 255));
lbl_em.setBounds(16, 345, 118, 37);
profile_panel.add(lbl_em);

JLabel lbl_contact = new JLabel("Contact:");
lbl_contact.setFont(new Font("Tahoma", Font.BOLD, 15));
lbl_contact.setForeground(new Color(255, 255, 255));
lbl_contact.setBounds(16, 381, 118, 37);
profile_panel.add(lbl_contact);

JLabel lbl_dob = new JLabel("D.O.B:");
lbl_dob.setFont(new Font("Tahoma", Font.BOLD, 15));
lbl_dob.setForeground(new Color(255, 255, 255));
lbl_dob.setBounds(16, 421, 118, 37);
profile_panel.add(lbl_dob);


//-------------------------------------------------------- ProfileTextField ------------------------------------------------

tf_teacherid = new JTextField();
tf_teacherid.setFont(new Font("Tahoma", Font.PLAIN, 14));
tf_teacherid.setBounds(131, 28, 241, 29);
tf_teacherid.setColumns(10);
profile_panel.add(tf_teacherid);
tf_teacherid.setEditable(false);

tf_firstname = new JTextField();
tf_firstname.setFont(new Font("Tahoma", Font.PLAIN, 14));
tf_firstname.setBounds(131, 68, 241, 29);
tf_firstname.setColumns(10);
profile_panel.add(tf_firstname);

tf_lastname = new JTextField();
tf_lastname.setFont(new Font("Tahoma", Font.PLAIN, 14));
tf_lastname.setBounds(131, 108, 241, 29);
profile_panel.add(tf_lastname);
tf_lastname.setColumns(10);

tf_username = new JTextField();
tf_username.setEditable(false);
tf_username.setFont(new Font("Tahoma", Font.PLAIN, 14));
tf_username.setBounds(131, 148, 241, 29);
tf_username.setColumns(10);
profile_panel.add(tf_username);

tf_age = new JTextField();
tf_age.setFont(new Font("Tahoma", Font.PLAIN, 14));
tf_age.setBounds(131, 188, 241, 29);
tf_age.setColumns(10);
profile_panel.add(tf_age);

tf_experience = new JTextField();
tf_experience.setEditable(false);
tf_experience.setFont(new Font("Tahoma", Font.PLAIN, 14));
tf_experience.setBounds(131, 229, 241, 29);
tf_experience.setColumns(10);
profile_panel.add(tf_experience);

tf_qualification = new JTextField();
tf_qualification.setEditable(false);
tf_qualification.setFont(new Font("Tahoma", Font.PLAIN, 14));
tf_qualification.setBounds(131, 269, 241, 29);
tf_qualification.setColumns(10);
profile_panel.add(tf_qualification);

tf_gender = new JTextField();
tf_gender.setEditable(false);
tf_gender.setFont(new Font("Tahoma", Font.PLAIN, 14));
tf_gender.setBounds(131, 309, 241, 29);
tf_gender.setColumns(10);
profile_panel.add(tf_gender);

tf_email = new JTextField();
tf_email.setFont(new Font("Tahoma", Font.PLAIN, 14));
tf_email.setBounds(131, 349, 241, 29);
tf_email.setColumns(10);
profile_panel.add(tf_email);

tf_contact = new JTextField();
tf_contact.setFont(new Font("Tahoma", Font.PLAIN, 14));
tf_contact.setBounds(131, 385, 241, 29);
tf_contact.setColumns(10);
profile_panel.add(tf_contact);

tf_dob = new JTextField();
tf_dob.setEditable(false);
tf_dob.setFont(new Font("Tahoma", Font.PLAIN, 14));
tf_dob.setBounds(131, 425, 241, 29);
tf_dob.setColumns(10);
profile_panel.add(tf_dob);

//------------------------------------------------Profile button--------------------------------------------------
JButton btnp_update = new JButton("Update");
btnp_update.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\update.png"));
btnp_update.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String Teacher_ID = tf_teacherid.getText();
		String First_name = tf_firstname.getText();
		String Last_name = tf_lastname.getText();
		String User_name = tf_username.getText();
		String Age = tf_age.getText();
		String Experience = tf_experience.getText();
		String Qualification = tf_qualification.getText();
		String Gender = tf_gender.getText();
		String Email_Id = tf_email.getText();
		String Contact = tf_contact.getText();
		String DOB = tf_dob.getText();
		
		
		
		try {
			//1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");

			//2. Create a statement
			Statement myStmt = myConn.createStatement();

			//3. Execute SQL Query
			String sql = "Update tbl_teacher set first_name = '"+First_name+"' , last_name = '"+Last_name+"', username= '"+User_name+"', age='"+Age+"',experience = '"+Experience+"', qualification = '"+Qualification+"', gender = '"+Gender+"' ,email = '"+Email_Id+"',contact= '"+Contact+"',dob = '"+DOB+"' where teacherid = '"+Teacher_ID+"' ";		
			
		

			myStmt.executeUpdate(sql);

			JOptionPane.showMessageDialog(btnp_update,"Update Completed");
			((DefaultTableModel)table.getModel()).setNumRows(0); // delet all table row
			}
			catch(Exception ex) {
			ex.printStackTrace();
			}
	
	}
});
btnp_update.setFont(new Font("Tahoma", Font.BOLD, 16));
btnp_update.setBounds(131, 464, 133, 37);
profile_panel.add(btnp_update);

JButton btnp_clear = new JButton("Clear");
btnp_clear.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		tf_teacherid.setText("");
		tf_firstname.setText("");
		tf_lastname.setText("");
		tf_username.setText("");
		tf_age.setText("");
		tf_experience.setText("");
		tf_qualification.setText("");
		tf_gender.setText("");
		tf_email.setText("");
		tf_contact.setText("");
		tf_dob.setText("");
		((DefaultTableModel)table.getModel()).setNumRows(0); // delet all table row
		
	}
});
btnp_clear.setIcon(new ImageIcon("C:\\java_folder\\OOP_project\\src\\billing_system\\clear1.png"));
btnp_clear.setFont(new Font("Tahoma", Font.BOLD, 16));
btnp_clear.setBounds(286, 464, 121, 37);
profile_panel.add(btnp_clear);


//--------------------------------------------------------Module label-------------------------------------------------

JLayeredPane Module_panel = new JLayeredPane();
Module_panel.setBackground(Color.LIGHT_GRAY);
p_m_sd_tPane.addTab("Module", null, Module_panel, null);
Module_panel.setLayout(null);

JLabel lblm_id = new JLabel("Module ID:");
lblm_id.setFont(new Font("Arial", Font.BOLD, 14));
lblm_id.setBounds(87, 21, 90, 44);
lblm_id.setForeground(Color.BLACK);
Module_panel.add(lblm_id);

JLabel lblm_name = new JLabel("Module Name:");
lblm_name.setFont(new Font("Arial", Font.BOLD, 14));
lblm_name.setBounds(87, 75, 105, 44);
lblm_name.setForeground(Color.BLACK);
Module_panel.add(lblm_name);

JLabel lblm_des= new JLabel("Description");
lblm_des.setFont(new Font("Arial", Font.BOLD, 14));
lblm_des.setBounds(87, 168, 90, 32);
Module_panel.add(lblm_des);


//----------------------------------------------------------Module Button--------------------------------------------------------------

JButton btnm_add = new JButton("ADD");
btnm_add.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\add.png"));
btnm_add.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String module_id = M_id.getText();
		String module_name = m_name.getText();
		String Total_marks = tf_Marks.getText();
		String Description = mtf_desc.getText();
		
		try {
			
			//1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");

			//2. Create a statement
			Statement myStmt = myConn.createStatement();

			//3. Execute SQL Query
			String sql = "insert into tbl_module"
					+"(module_id,module_name,marks,Description)"
					+"values ('"+module_id+"', '"+module_name+"', '"+Total_marks +"','"+Description+"')";

			myStmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(btnm_add, "The Data is inserted successfully");
			((DefaultTableModel)table.getModel()).setNumRows(0); // delet all table row
			}
			catch(Exception ex) {
			ex.printStackTrace();
			}


		
	}
});
btnm_add.setBounds(87, 457, 111, 37);
btnm_add.setFont(new Font("Tahoma", Font.BOLD, 16));
Module_panel.add(btnm_add);

JButton btnm_delete = new JButton("DELETE");
btnm_delete.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\delete.png"));
btnm_delete.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String Module_ID = M_id.getText();
		try {
			//1. Get a connection to database
			//Connection myConn = DriverManager.getConnection(url, user, password);
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute SQL Query
			String sql = "delete from tbl_module where module_id = '"+Module_ID+"'";
			
			int rowsAffected = myStmt.executeUpdate(sql);
			
			System.out.println("Rows affected: "+ rowsAffected);
			JOptionPane.showMessageDialog(btnm_delete,"Delete Successfully");
			((DefaultTableModel)m_table.getModel()).setNumRows(0); // delet all table row
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			}
		
	}
});
btnm_delete.setBounds(369, 457, 143, 37);
btnm_delete.setFont(new Font("Tahoma", Font.BOLD, 16));
Module_panel.add(btnm_delete);

JButton btnm_update = new JButton("UPDATE");
btnm_update.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\update.png"));
btnm_update.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String module_id = M_id.getText();
		String module_name = m_name.getText();
		String Total_marks = tf_Marks.getText();
		String Description = mtf_desc.getText();
		
		try {
			//1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");

			//2. Create a statement
			Statement myStmt = myConn.createStatement();

			//3. Execute SQL Query
			String sql = "Update tbl_module set module_name= '"+module_name+"',marks= '"+Total_marks+"', Description = '"+Description+"' where module_id = '"+module_id+"'  ";	
			
		

			myStmt.executeUpdate(sql);

			JOptionPane.showMessageDialog(btnm_update,"Update Completed");
			((DefaultTableModel)m_table.getModel()).setNumRows(0); // delet all table row
			}
			catch(Exception ex) {
			ex.printStackTrace();
			}
		
		
	}
});
btnm_update.setBounds(208, 457, 143, 37);
btnm_update.setFont(new Font("Tahoma", Font.BOLD, 16));
Module_panel.add(btnm_update);

JButton btnm_showadetail = new JButton("SHOW ALL");
btnm_showadetail.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\display.png"));
btnm_showadetail.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		try {
			
			//	class.forName("com.mysql.jdbc.Driver");
				Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
				Statement st = myConn.createStatement();
				String sql = "select * from tbl_module";
				ResultSet rs = st.executeQuery(sql);
				
				
				
				while(rs.next()) {
					String module_id = String.valueOf(rs.getInt("module_id"));
					String module_name= rs.getString("module_name");
					String marks = String.valueOf(rs.getInt("marks"));
					String Description = rs.getString("Description");					
					
					String tbData [] = {module_id,module_name, marks,Description};
					DefaultTableModel tblModel = (DefaultTableModel)m_table.getModel();
					
					tblModel.addRow(tbData);
				}
			
			myConn.close();
				
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}			
	}
});
btnm_showadetail.setBounds(688, 457, 176, 37);
btnm_showadetail.setFont(new Font("Tahoma", Font.BOLD, 16));
Module_panel.add(btnm_showadetail);


//-----------------------------------------------------------Module Text Field--------------------------------------------------------
M_id = new JTextField();
M_id.setBounds(202, 25, 241, 32);
M_id.setColumns(10);
Module_panel.add(M_id);



m_name = new JTextField();
m_name.setBounds(202, 83, 241, 32);
m_name.setColumns(10);
Module_panel.add(m_name);

mtf_desc= new JTextField();
mtf_desc.setHorizontalAlignment(SwingConstants.LEFT);
mtf_desc.setBounds(87, 194, 356, 232);
Module_panel.add(mtf_desc);
mtf_desc.setColumns(10);



JScrollPane m_scrollPane = new JScrollPane();
m_scrollPane.setBounds(464, 21, 575, 405);
Module_panel.add(m_scrollPane);

m_table = new JTable();
m_table.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		DefaultTableModel RecordTable = (DefaultTableModel)m_table.getModel();
		int SelectedRows =m_table.getSelectedRow();
		M_id.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
		m_name.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
		tf_Marks.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
		mtf_desc.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
	}
});
m_table.setModel(new DefaultTableModel(
	new Object[][] {
	},
	new String[] {
		"Module ID", "Module Name", "Course Marks", "Description"
	}
));
m_scrollPane.setViewportView(m_table);
JLabel lblMarks = new JLabel("Total Marks");
lblMarks.setFont(new Font("Arial", Font.BOLD, 14));
lblMarks.setHorizontalAlignment(SwingConstants.TRAILING);
lblMarks.setBounds(75, 129, 90, 29);
Module_panel.add(lblMarks);
tf_Marks = new JTextField();
tf_Marks.setBounds(202, 125, 241, 32);
Module_panel.add(tf_Marks);
tf_Marks.setColumns(10);
JButton btnClear = new JButton("CLEAR");
btnClear.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\clear1.png"));
btnClear.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		M_id.setText("");
		m_name.setText("");
		tf_Marks.setText("");
        mtf_desc.setText("");
		((DefaultTableModel)m_table.getModel()).setNumRows(0); // delet all table row
	}
});
btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
btnClear.setBounds(539, 457, 139, 37);
Module_panel.add(btnClear);
JButton btnMexit = new JButton("EXIT");
btnMexit.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);	
	}
});
btnMexit.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\exit1.png"));
btnMexit.setFont(new Font("Tahoma", Font.BOLD, 16));
btnMexit.setBounds(920, 457, 119, 37);
Module_panel.add(btnMexit);

JLabel lblNewLabel_2 = new JLabel("");
lblNewLabel_2.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\bg img 11.jpg"));
lblNewLabel_2.setBounds(10, 10, 1098, 514);
Module_panel.add(lblNewLabel_2);


//------------------------------------------------------ Show details window ----------------------------------------------------------

JLayeredPane SD_lpane = new JLayeredPane();
p_m_sd_tPane.addTab("Students Details", null, SD_lpane, null);
SD_lpane.setLayout(null);


//---------------------------------------------------------SD label--------------------------------------------------------------------

JLabel lblsd_id = new JLabel("Student ID:");
lblsd_id.setForeground(Color.WHITE);
lblsd_id.setFont(new Font("Arial", Font.BOLD, 16));
lblsd_id.setBounds(93, 43, 90, 44);
SD_lpane.add(lblsd_id);

JLabel lblsd_name = new JLabel("Student Name:");
lblsd_name.setForeground(Color.WHITE);
lblsd_name.setFont(new Font("Arial", Font.BOLD, 16));
lblsd_name.setBounds(93, 110, 120, 44);
SD_lpane.add(lblsd_name);

JLabel lblsd_mid = new JLabel("Module ID:");
lblsd_mid.setForeground(Color.WHITE);
lblsd_mid.setFont(new Font("Arial", Font.BOLD, 16));
lblsd_mid.setBounds(93, 179, 90, 44);
SD_lpane.add(lblsd_mid);

JLabel lblsd_mname = new JLabel("Module Name:");
lblsd_mname.setForeground(Color.WHITE);
lblsd_mname.setFont(new Font("Arial", Font.BOLD, 16));
lblsd_mname.setBounds(93, 250, 111, 44);
SD_lpane.add(lblsd_mname);

JLabel lblsd_result = new JLabel("Result:");
lblsd_result.setForeground(Color.WHITE);
lblsd_result.setFont(new Font("Arial", Font.BOLD, 16));
lblsd_result.setBounds(93, 316, 90, 44);
SD_lpane.add(lblsd_result);

//-----------------------------------------------------------------SD Text field---------------------------------------------------------------

s_id= new JTextField();
s_id.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String Student_id = s_id.getText();
	    try {
	    	Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
			Statement myStmt = myConn.createStatement();
	    	ResultSet rs = myStmt.executeQuery("select student_id, first_name from tbl_student where student_id like '"+Student_id+"%' ");
	    	if(rs.next()) {
	    		s_id.setText(rs.getString(1));
	    		s_name.setText(rs.getString(2));
	    		}
	    	else {
	    	    s_name.setText("");	
	    		
	    	}
	    }
	    catch(Exception e1){
	    	JOptionPane.showMessageDialog(null, e);
	    }
	}
});
s_id.setColumns(10);
s_id.setBounds(223, 43, 241, 40);
SD_lpane.add(s_id);

s_name = new JTextField();
s_name.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String Student_name = s_name.getText();
	    try {
	    	Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
			Statement myStmt = myConn.createStatement();
	    	ResultSet rs = myStmt.executeQuery("select student_id, first_name from tbl_student where first_name like '"+Student_name+"%' ");
	    	if(rs.next()) {
	    		s_id.setText(rs.getString(1));
	    		s_name.setText(rs.getString(2));
	    		}
	    	else {
	    		s_id.setText("");
	    		
	    	}
	    }
	    catch(Exception e1){
	    	JOptionPane.showMessageDialog(null, e);
	    }
		
	}
});
s_name.setColumns(10);
s_name.setBounds(223, 110, 241, 40);
SD_lpane.add(s_name);

sdm_id = new JTextField();
sdm_id.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String module_id = sdm_id.getText();
	    try {
	    	Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
			Statement myStmt = myConn.createStatement();
	    	ResultSet rs = myStmt.executeQuery("select module_id, module_name from tbl_module where module_id like '"+module_id+"%' ");
	    	if(rs.next()) {
	    		sdm_id.setText(rs.getString(1));
	    		sdm_name.setText(rs.getString(2));
	    		}
	    	else {
	    	    sdm_name.setText("");	
	    		
	    	}
	    }
	    catch(Exception e1){
	    	JOptionPane.showMessageDialog(null, e);
	    }
	}
});
sdm_id.setColumns(10);
sdm_id.setBounds(223, 179, 241, 40);
SD_lpane.add(sdm_id);

sdm_name = new JTextField();
sdm_name.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String module_name = sdm_name.getText();
	    try {
	    	Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
			Statement myStmt = myConn.createStatement();
	    	ResultSet rs = myStmt.executeQuery("select module_id, module_name from tbl_module where module_name like '"+module_name+"%' ");
	    	if(rs.next()) {
	    		sdm_id.setText(rs.getString(1));
	    		sdm_name.setText(rs.getString(2));
	    		}
	    	else {
	    	    sdm_id.setText("");	
	    		
	    	}
	    }
	    catch(Exception e1){
	    	JOptionPane.showMessageDialog(null, e);
	    }
	}
});
sdm_name.setColumns(10);
sdm_name.setBounds(223, 250, 241, 40);
SD_lpane.add(sdm_name);

result = new JTextField();
result.setColumns(10);
result.setBounds(223, 319, 241, 40);
SD_lpane.add(result);

perc = new JTextField();
perc.setColumns(10);
perc.setBounds(223, 387, 241, 40);
SD_lpane.add(perc);

//--------------------------------------------------SD button-----------------------------------------------------

JButton btnm_add_1 = new JButton("ADD");
btnm_add_1.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\add.png"));
btnm_add_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String Student_ID = s_id.getText();
		String Student_name =s_name.getText();
		String module_id = sdm_id.getText();
		String module_name = sdm_name.getText();
		String Result = result.getText();
		String Percentage = perc.getText();
		

		
		try {
			
			//1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");

			//2. Create a statement
			Statement myStmt = myConn.createStatement();

			//3. Execute SQL Query
			String sql = "insert into student_result"
					+"(student_id,student_name,module_id,module_name,Result,percentage)"
					+"values ('"+Student_ID+"', '"+Student_name+"', '"+module_id +"','"+module_name+"', '"+Result+"', '"+Percentage +"')";

			myStmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(btnm_add_1, "The Data is inserted successfully");
			((DefaultTableModel)table.getModel()).setNumRows(0); // delet all table row
			}
			catch(Exception ex) {
			ex.printStackTrace();
			}
		
	}
});
btnm_add_1.setFont(new Font("Tahoma", Font.BOLD, 16));
btnm_add_1.setBounds(78, 453, 111, 37);
SD_lpane.add(btnm_add_1);

JButton btnm_delete_1 = new JButton("DELETE");
btnm_delete_1.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\delete.png"));
btnm_delete_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String Student_ID = s_id.getText();
		try {
			//1. Get a connection to database
			//Connection myConn = DriverManager.getConnection(url, user, password);
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute SQL Query
			String sql = "delete from student_result where student_id = '"+Student_ID+"'";
			
			int rowsAffected = myStmt.executeUpdate(sql);
			
			System.out.println("Rows affected: "+ rowsAffected);
			JOptionPane.showMessageDialog(btnm_delete_1,"Delete Successfully");
			((DefaultTableModel)sd_table.getModel()).setNumRows(0); // delet all table row
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			}
		

	}
});
btnm_delete_1.setFont(new Font("Tahoma", Font.BOLD, 16));
btnm_delete_1.setBounds(379, 453, 137, 37);
SD_lpane.add(btnm_delete_1);

JButton btnm_update_1 = new JButton("UPDATE");
btnm_update_1.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\update.png"));
btnm_update_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String Student_ID = s_id.getText();
		String Student_name = s_name.getText();
		String module_id = sdm_id.getText();
		String module_name = sdm_name.getText();
		String Result= result.getText();
		String Percentage = perc.getText();		
		
		try {
			//1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");

			//2. Create a statement
			Statement myStmt = myConn.createStatement();

			//3. Execute SQL Query
			String sql = "Update student_result set student_name = '"+Student_name+"' , module_id = '"+module_id+"', module_name= '"+module_name+"', Result='"+Result+"',percentage = '"+Percentage+"' where student_id = '"+Student_ID+"' ";		
			
		

			myStmt.executeUpdate(sql);

			JOptionPane.showMessageDialog(btnm_update_1,"Update Completed");
			((DefaultTableModel)sd_table.getModel()).setNumRows(0); // delet all table row
			}
			catch(Exception ex) {
			ex.printStackTrace();
			}
	
	}
});
btnm_update_1.setFont(new Font("Tahoma", Font.BOLD, 16));
btnm_update_1.setBounds(210, 453, 137, 37);
SD_lpane.add(btnm_update_1);

JButton btnm_showadetail_1 = new JButton("SHOW ALL");
btnm_showadetail_1.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\display.png"));
btnm_showadetail_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		try {
			
			//	class.forName("com.mysql.jdbc.Driver");
				Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
				Statement st = myConn.createStatement();
				String sql = "select * from student_result";
				ResultSet rs = st.executeQuery(sql);
				
				
				
				while(rs.next()) {
					String student_id = String.valueOf(rs.getInt("student_id"));
					String student_name= rs.getString("Student_name");
					String module_id = String.valueOf(rs.getInt("module_id"));
					String module_name= rs.getString("module_name");
					String result = rs.getString("Result");
					String percentage = String.valueOf(rs.getInt("percentage"));
									
					
					String tbData [] = {student_id,student_name,module_id,module_name,result,percentage};
					DefaultTableModel tblModel = (DefaultTableModel)sd_table.getModel();
					
					tblModel.addRow(tbData);
				}
			
			myConn.close();
				
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}			
		
	}
});
btnm_showadetail_1.setFont(new Font("Tahoma", Font.BOLD, 16));
btnm_showadetail_1.setBounds(710, 453, 161, 37);
SD_lpane.add(btnm_showadetail_1);

JLabel lbl_teacherid_1_6_1 = new JLabel("Percentage:");
lbl_teacherid_1_6_1.setForeground(Color.WHITE);
lbl_teacherid_1_6_1.setFont(new Font("Arial", Font.BOLD, 16));
lbl_teacherid_1_6_1.setBounds(93, 384, 111, 44);
SD_lpane.add(lbl_teacherid_1_6_1);


//------------------------------------------------------ Background Images ---------------------------------------------------------------

   JLabel main_bgimage = new JLabel("");
   main_bgimage.setIcon(new ImageIcon("D:\\bg_img1.jpg"));
   main_bgimage.setBounds(0, 0, 1147, 661);
   mainw_contentPane.add(main_bgimage);
JScrollPane scrollPane = new JScrollPane();
scrollPane.setBounds(382, 29, 705, 424);
profile_panel.add(scrollPane);
table = new JTable();
table.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		DefaultTableModel RecordTable = (DefaultTableModel)table.getModel();
		int SelectedRows =table.getSelectedRow();
		tf_teacherid.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
		tf_firstname.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
		tf_lastname.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
		tf_username.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
		tf_age.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
		tf_experience.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
		tf_qualification.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
		tf_gender.setText(RecordTable.getValueAt(SelectedRows, 7).toString());
		tf_email.setText(RecordTable.getValueAt(SelectedRows, 8).toString());
		tf_contact.setText(RecordTable.getValueAt(SelectedRows, 9).toString());
		tf_dob.setText(RecordTable.getValueAt(SelectedRows, 10).toString());
	}
});
table.setFont(new Font("Tahoma", Font.BOLD, 12));
table.setModel(new DefaultTableModel(
	new Object[][] {
	},
	new String[] {
		"ID", "First Name", "Last Name", "Username", "Age", "Experience", "Qualification", "Gender", "Email", "Contact", "DOB"
	}
));
table.getColumnModel().getColumn(0).setPreferredWidth(65);
table.getColumnModel().getColumn(4).setPreferredWidth(60);
table.getColumnModel().getColumn(7).setPreferredWidth(65);
scrollPane.setViewportView(table);
JButton btnExit = new JButton("Exit");
btnExit.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);		
	}
	
});
btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
btnExit.setIcon(new ImageIcon("C:\\java_folder\\OOP_project\\src\\billing_system\\exit1.png"));
btnExit.setBounds(977, 463, 110, 37);
profile_panel.add(btnExit);
JButton btnShow = new JButton("Show All");
btnShow.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\display.png"));
btnShow.addActionListener(new ActionListener() {
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
btnShow.setFont(new Font("Tahoma", Font.BOLD, 16));
btnShow.setHorizontalAlignment(SwingConstants.LEFT);
btnShow.setBounds(434, 464, 149, 37);
profile_panel.add(btnShow);
JLabel lblbg = new JLabel("New label");
lblbg.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\bg img 11.jpg"));
lblbg.setBounds(0, 5, 1097, 506);
profile_panel.add(lblbg);

JLabel p_bgimage = new JLabel("");
p_bgimage.setForeground(new Color(255, 255, 255));
p_bgimage.setIcon(new ImageIcon("D:\\bg_img1.jpg"));
p_bgimage.setBounds(0, 0, 1097, 525);
profile_panel.add(p_bgimage);


JScrollPane sd_scrollpane = new JScrollPane();
sd_scrollpane.setBounds(553, 28, 531, 399);
SD_lpane.add(sd_scrollpane);

sd_table = new JTable();
sd_table.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		DefaultTableModel RecordTable = (DefaultTableModel)sd_table.getModel();
		int SelectedRows =sd_table.getSelectedRow();
		s_id.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
		s_name.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
		sdm_id.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
		sdm_name.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
		result.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
		perc.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
	}
});
sd_table.setModel(new DefaultTableModel(
new Object[][] {
},
new String[] {
"Student ID", "Student Name", "Module Id", "Module Name ", "Result", "Percentage"
}
));
sd_scrollpane.setViewportView(sd_table);
JButton btn_clear = new JButton("CLEAR");
btn_clear.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\clear1.png"));
btn_clear.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		s_id.setText("");
	    s_name.setText("");
		sdm_id.setText("");
		sdm_name.setText("");
		result.setText("");
		perc.setText("");
		((DefaultTableModel)sd_table.getModel()).setNumRows(0); // delet all table row
		
		
	}
});
btn_clear.setFont(new Font("Tahoma", Font.BOLD, 16));
btn_clear.setBounds(553, 453, 127, 37);
SD_lpane.add(btn_clear);
JButton btn_exit = new JButton("EXIT");
btn_exit.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);	
	}
});
btn_exit.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\exit1.png"));
btn_exit.setFont(new Font("Tahoma", Font.BOLD, 16));
btn_exit.setBounds(971, 453, 113, 37);
SD_lpane.add(btn_exit);

JLabel sd_bgimg = new JLabel("");
sd_bgimg.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\bg img 11.jpg"));
sd_bgimg.setBounds(10, 10, 1098, 514);
SD_lpane.add(sd_bgimg);

}



public static void TeacherScreen() {
Teacher_Pg frame = new Teacher_Pg();
frame.setVisible(true);
frame.setResizable(false);
}
}