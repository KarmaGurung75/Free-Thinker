package login_registration;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

 

public class Student_Pg {
    JFrame f;
    JPanel pnl_profile, pnl_module, pnl_result;
    JLabel lbl_title, lbl_fname, lbl_age, lbl_address, lbl_dob, lbl_studentID, lbl_enterID, lblpicture, lbl_yourresult;
    JTextField txt_fname, txt_age, txt_address, txt_dob, txt_studentID, txt_enterID;
    JButton btn_exit, btn_update, btn_viewresult;
    private JTextField txt_gender;
    private JTextField txt_Roll;
    private JTextField txt_email;
    private JTextField txt_contact;
    private JTable table;
    private JTextField txt_M_ID;
    private JTextField txt_Mname;
    private JTextField txt_resources;
    private JScrollPane scrollPane_2;
    private JTable M_table;
    private JTable result_table;
    private JTextField txt_lname;
    private JTextField txt_credit;
    private JLabel lbl_bg;
    private JLabel lbl_pro_bg;
    private JLabel lbl_mo_bg;
    private JLabel lbl_res_bg;
    private JButton btnNewButton;
    
    public Student_Pg() {
        f=new JFrame("Student"); 
        f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\bg img 11.jpg"));
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(6, 51, 967, 489);
        f.getContentPane().add(tabbedPane);
        
        pnl_profile = new JPanel();
        pnl_profile.setBackground(new Color(169, 169, 169));
        tabbedPane.addTab("Profile", null, pnl_profile, null);
        pnl_profile.setLayout(null);
        
        lbl_fname = new JLabel("First Name");
        lbl_fname.setForeground(Color.WHITE);
        lbl_fname.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbl_fname.setBounds(9, 66, 90, 25);
        pnl_profile.add(lbl_fname);
        txt_fname = new JTextField();
        txt_fname.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_fname.setBounds(169, 65, 211, 27);
        pnl_profile.add(txt_fname);
        txt_fname.setColumns(10);
        
        lbl_age = new JLabel("Age");
        lbl_age.setForeground(Color.WHITE);
        lbl_age.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbl_age.setBounds(9, 136, 60, 25);
        pnl_profile.add(lbl_age);
        txt_age = new JTextField();
        txt_age.setEditable(false);
        txt_age.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_age.setBounds(169, 138, 211, 27);
        pnl_profile.add(txt_age);
        txt_age.setColumns(10);
        
        lbl_address = new JLabel("Address");
        lbl_address.setForeground(Color.WHITE);
        lbl_address.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbl_address.setBounds(9, 249, 101, 25);
        pnl_profile.add(lbl_address);
        txt_address = new JTextField();
        txt_address.setEditable(false);
        txt_address.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_address.setBounds(169, 248, 211, 27);
        pnl_profile.add(txt_address);
        txt_address.setColumns(10);
        
        lbl_dob = new JLabel("Date of Birth");
        lbl_dob.setForeground(Color.WHITE);
        lbl_dob.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbl_dob.setBounds(9, 355, 121, 31);
        pnl_profile.add(lbl_dob);
        txt_dob = new JTextField();
        txt_dob.setEditable(false);
        txt_dob.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_dob.setBounds(169, 357, 211, 27);
        pnl_profile.add(txt_dob);
        txt_dob.setColumns(10);
        
        lbl_studentID = new JLabel("Student ID");
        lbl_studentID.setForeground(Color.WHITE);
        lbl_studentID.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbl_studentID.setBounds(9, 29, 101, 25);
        pnl_profile.add(lbl_studentID);
        txt_studentID = new JTextField();
        txt_studentID.setEditable(false);
        txt_studentID.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_studentID.setBounds(169, 29, 211, 27);
        pnl_profile.add(txt_studentID);
        txt_studentID.setColumns(10);
        
        btn_update = new JButton("UPDATE");
        btn_update.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\update.png"));
        btn_update.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String Student_ID = txt_studentID.getText();
				String First_name = txt_fname.getText();
				String Last_name = txt_lname.getText();
				String Age = txt_age.getText();
				String Gender = txt_gender.getText();
				String Roll_no = txt_Roll.getText();
				String Address = txt_address.getText();
				String Email_Id = txt_email.getText();
				String Contact = txt_contact.getText();
				String DOB = txt_dob.getText();
				
				try {
					//1. Get a connection to database
					Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");

					//2. Create a statement
					Statement myStmt = myConn.createStatement();

					//3. Execute SQL Query
					String sql = " Update tbl_student set first_name = '"+First_name+"', last_name = '"+ Last_name+"', age = '"+Age+"', gender= '"+Gender+"', roll_no= '"+Roll_no+"', address='"+Address+"', email='"+Email_Id+"', contact = '"+Contact+"', dob='"+DOB+"' where student_id = '"+Student_ID+"' ";
					myStmt.executeUpdate(sql);

					JOptionPane.showMessageDialog(btn_update,"Update Completed");
					((DefaultTableModel)table.getModel()).setNumRows(0); // delet all table row
					}
					catch(Exception ex) {
					ex.printStackTrace();
					}
				
        	}
        });
        btn_update.setFont(new Font("Tahoma", Font.BOLD, 16));
        btn_update.setBounds(169, 401, 146, 43);
        pnl_profile.add(btn_update);
        
        btn_exit = new JButton("EXIT");
        btn_exit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int opt=JOptionPane.showConfirmDialog(null,"Are you sure to Exit?","Exit",JOptionPane.YES_NO_OPTION);
				//YES_NO_CANCEL_OPTION;
				if (opt==0) {
					dispose_f();
				}
			}

			private void dispose_f() {
				// TODO Auto-generated method stub
				f.dispose();
        	}
        });
        btn_exit.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\exit1.png"));
        btn_exit.setFont(new Font("Tahoma", Font.BOLD, 16));
        btn_exit.setBounds(835, 401, 117, 43);
        pnl_profile.add(btn_exit);
        
        JLabel lbl_lname = new JLabel("Last Name");
        lbl_lname.setForeground(Color.WHITE);
        lbl_lname.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbl_lname.setBounds(8, 101, 91, 25);
        pnl_profile.add(lbl_lname);
        
        JLabel lbl_gender = new JLabel("Gender");
        lbl_gender.setForeground(Color.WHITE);
        lbl_gender.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbl_gender.setBounds(8, 175, 73, 25);
        pnl_profile.add(lbl_gender);
        
        txt_gender = new JTextField();
        txt_gender.setEditable(false);
        txt_gender.setBounds(169, 175, 211, 27);
        pnl_profile.add(txt_gender);
        txt_gender.setColumns(10);
        
        JLabel lbl_Rollno = new JLabel("Roll No.");
        lbl_Rollno.setForeground(Color.WHITE);
        lbl_Rollno.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbl_Rollno.setBounds(9, 214, 100, 25);
        pnl_profile.add(lbl_Rollno);
        
        txt_Roll = new JTextField();
        txt_Roll.setEditable(false);
        txt_Roll.setBounds(169, 211, 211, 27);
        pnl_profile.add(txt_Roll);
        txt_Roll.setColumns(10);
        
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setForeground(Color.WHITE);
        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblEmail.setBounds(9, 287, 91, 20);
        pnl_profile.add(lblEmail);
        
        txt_email = new JTextField();
        txt_email.setEditable(false);
        txt_email.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_email.setBounds(169, 284, 211, 27);
        pnl_profile.add(txt_email);
        txt_email.setColumns(10);
        
        JLabel lbl_cobntact = new JLabel("Contact");
        lbl_cobntact.setForeground(Color.WHITE);
        lbl_cobntact.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbl_cobntact.setBounds(9, 317, 100, 31);
        pnl_profile.add(lbl_cobntact);
        
        txt_contact = new JTextField();
        txt_contact.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txt_contact.setBounds(169, 319, 211, 27);
        pnl_profile.add(txt_contact);
        txt_contact.setColumns(10);
        
        JButton btnclear = new JButton("CLEAR");
        btnclear.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\clear1.png"));
        btnclear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		txt_studentID.setText("");
        		txt_fname.setText("");
        		txt_lname.setText("");
        		txt_age.setText("");
        		txt_gender.setText("");
        		txt_Roll.setText("");
        		txt_address.setText("");
        		txt_email.setText("");
        		txt_contact.setText("");
        		txt_dob.setText("");
        		((DefaultTableModel)table.getModel()).setNumRows(0); // delet all table row
        		
        		
        	}
        });
        btnclear.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnclear.setBounds(334, 401, 129, 43);
        pnl_profile.add(btnclear);
        
        JButton btnDisplay = new JButton("SHOW ALL");
        btnDisplay.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\display.png"));
        btnDisplay.addActionListener(new ActionListener() {
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
        btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnDisplay.setBounds(484, 401, 163, 43);
        pnl_profile.add(btnDisplay);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(398, 29, 554, 361);
        pnl_profile.add(scrollPane);
        
        table = new JTable();
        table.setFillsViewportHeight(true);
        table.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		DefaultTableModel RecordTable = (DefaultTableModel)table.getModel();
				int SelectedRows =table.getSelectedRow();
				txt_studentID.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
				txt_fname.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
				txt_lname.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
				txt_age.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
				txt_gender.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
				txt_Roll.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
				txt_address.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
				txt_email.setText(RecordTable.getValueAt(SelectedRows, 7).toString());
				txt_contact.setText(RecordTable.getValueAt(SelectedRows, 8).toString());
				txt_dob.setText(RecordTable.getValueAt(SelectedRows, 9).toString());
        	}
        });
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"ID", "First Name", "Last Name", "Age", "Gender", "Roll No", "Address", "Email", "Contact", "DOB"
        	}
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(55);
        table.getColumnModel().getColumn(3).setPreferredWidth(55);
        table.getColumnModel().getColumn(5).setPreferredWidth(55);
        scrollPane.setViewportView(table);
        
        txt_lname = new JTextField();
        txt_lname.setBounds(169, 102, 211, 27);
        pnl_profile.add(txt_lname);
        txt_lname.setColumns(10);
        
        lbl_pro_bg = new JLabel("New label");
        lbl_pro_bg.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\bg img 11.jpg"));
        lbl_pro_bg.setBounds(0, -3, 971, 462);
        pnl_profile.add(lbl_pro_bg);
        
        pnl_module = new JPanel();
        pnl_module.setBackground(new Color(169, 169, 169));
        tabbedPane.addTab("Module", null, pnl_module, null);
        pnl_module.setLayout(null);
        
        JLabel lblModule_ID = new JLabel("MODULE ID");
        lblModule_ID.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblModule_ID.setBounds(26, 10, 100, 38);
        pnl_module.add(lblModule_ID);
        
        JLabel lblModule_name = new JLabel("MODULE NAME");
        lblModule_name.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblModule_name.setBounds(26, 58, 129, 31);
        pnl_module.add(lblModule_name);
        
        JLabel lbl_Resources = new JLabel("RESOURCES");
        lbl_Resources.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbl_Resources.setBounds(26, 131, 113, 25);
        pnl_module.add(lbl_Resources);
        
        txt_Mname = new JTextField();
        txt_Mname.setEditable(false);
        txt_Mname.setText("");
        txt_Mname.setBounds(187, 63, 217, 25);
        pnl_module.add(txt_Mname);
        txt_Mname.setColumns(10);
        
        txt_M_ID = new JTextField();
        txt_M_ID.setEditable(false);
        txt_M_ID.setBounds(187, 19, 217, 25);
        pnl_module.add(txt_M_ID);
        txt_M_ID.setColumns(10);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(26, 155, 378, 297);
        pnl_module.add(scrollPane_1);
        
        txt_resources = new JTextField();
        txt_resources.setEditable(false);
        scrollPane_1.setViewportView(txt_resources);
        txt_resources.setColumns(10);
        
        scrollPane_2 = new JScrollPane();
        scrollPane_2.setBounds(470, 50, 482, 332);
        pnl_module.add(scrollPane_2);
        
        M_table = new JTable();
        M_table.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		DefaultTableModel RecordTable = (DefaultTableModel)M_table.getModel();
        		int SelectedRows =M_table.getSelectedRow();
        		txt_M_ID.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        		txt_Mname.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        		txt_credit.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        		txt_resources.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        	}
        });
        M_table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Module ID", "Module Name", "Credit ", "Resources"
        	}
        ));
        scrollPane_2.setViewportView(M_table);
        
        JButton btnShow = new JButton("SHOW ALL");
        btnShow.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\display.png"));
        btnShow.addActionListener(new ActionListener() {
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
        					DefaultTableModel tblModel = (DefaultTableModel)M_table.getModel();
        					
        					tblModel.addRow(tbData);
        				}
        			
        			myConn.close();
        				
        			}catch(Exception ex) {
        				System.out.println(ex.getMessage());
        			}			
        	}
        });
        btnShow.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnShow.setBounds(468, 407, 160, 45);
        pnl_module.add(btnShow);
        
        JButton btnClear = new JButton("CLEAR");
        btnClear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		txt_M_ID.setText("");
        		txt_Mname.setText("");
        		txt_credit.setText("");
        		txt_resources.setText("");
        		((DefaultTableModel)M_table.getModel()).setNumRows(0); // delet all table row
        		
        		
        	}
        });
        btnClear.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\clear1.png"));
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnClear.setBounds(646, 407, 129, 45);
        pnl_module.add(btnClear);
        
        JButton btnExit = new JButton("EXIT");
        btnExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int opt=JOptionPane.showConfirmDialog(null,"Are you sure to Exit?","Exit",JOptionPane.YES_NO_OPTION);
				//YES_NO_CANCEL_OPTION;
				if (opt==0) {
					dispose_f();
				}
			}

			private void dispose_f() {
				// TODO Auto-generated method stub
				f.dispose();
        	}
        });
        btnExit.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\exit1.png"));
        btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnExit.setBounds(839, 407, 113, 45);
        pnl_module.add(btnExit);
        
        JLabel lblCredit = new JLabel("CREDIT");
        lblCredit.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblCredit.setBounds(26, 102, 129, 19);
        pnl_module.add(lblCredit);
        
        txt_credit = new JTextField();
        txt_credit.setEditable(false);
        txt_credit.setBounds(187, 98, 219, 25);
        pnl_module.add(txt_credit);
        txt_credit.setColumns(10);
        
        lbl_mo_bg = new JLabel("");
        lbl_mo_bg.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\bg img 11.jpg"));
        lbl_mo_bg.setBounds(0, 0, 962, 462);
        pnl_module.add(lbl_mo_bg);
        
        pnl_result = new JPanel();
        pnl_result.setBackground(new Color(169, 169, 169));
        tabbedPane.addTab("Result", null, pnl_result, null);
        pnl_result.setLayout(null);
        
        lbl_enterID = new JLabel("Enter Your ID");
        lbl_enterID.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbl_enterID.setBounds(46, 21, 115, 33);
        pnl_result.add(lbl_enterID);
        txt_enterID = new JTextField();
        txt_enterID.setBounds(188, 25, 226, 29);
        pnl_result.add(txt_enterID);
        txt_enterID.setColumns(10);
        
        btn_viewresult = new JButton("View Result");
        btn_viewresult.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 String Student_ID = txt_enterID.getText();
        		try {
        			//	class.forName("com.mysql.jdbc.Driver");
        				Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
        				Statement st = myConn.createStatement();
        				String sql = "select * from student_result where student_id = '"+Student_ID+"'";
        				ResultSet rs = st.executeQuery(sql);
        				
        				
        				
        				while(rs.next()) {
        					String student_id = String.valueOf(rs.getInt("student_id"));
        					String student_name= rs.getString("Student_name");
        					String module_id = String.valueOf(rs.getInt("module_id"));
        					String module_name= rs.getString("module_name");
        					String result = rs.getString("Result");
        					String percentage = String.valueOf(rs.getInt("percentage"));
        									
        					String tbData [] = {student_id,student_name,module_id,module_name,result,percentage};
        					DefaultTableModel tblModel = (DefaultTableModel)result_table.getModel();
        					
        					tblModel.addRow(tbData);
        				}
        			
        			myConn.close();
        				
        			}catch(Exception ex) {
        				System.out.println(ex.getMessage());
        			}			
        		
        	}
        });
        btn_viewresult.setFont(new Font("Tahoma", Font.BOLD, 16));
        btn_viewresult.setBounds(439, 23, 155, 28);
        pnl_result.add(btn_viewresult);
        
        lbl_yourresult = new JLabel("Your Result");
        lbl_yourresult.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbl_yourresult.setBounds(46, 68, 97, 37);
        pnl_result.add(lbl_yourresult);
        
        JScrollPane scrollPane_3 = new JScrollPane();
        scrollPane_3.setBounds(45, 115, 794, 326);
        pnl_result.add(scrollPane_3);
        
        result_table = new JTable();
        result_table.setFont(new Font("Tahoma", Font.PLAIN, 14));
        result_table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Student ID", "Student Name", "Module ID", "Module Name", "Result", "Percentage"
        	}
        ));
        scrollPane_3.setViewportView(result_table);
        
        lbl_res_bg = new JLabel("");
        lbl_res_bg.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\bg img 11.jpg"));
        lbl_res_bg.setBounds(0, 0, 962, 462);
        pnl_result.add(lbl_res_bg);
        
        JLayeredPane layeredPane = new JLayeredPane();
          layeredPane.setBounds(32, 183, 172, -65);
          f.getContentPane().add(layeredPane);
        
        f.setSize(991, 577);
         f.getContentPane().setLayout(null);
         
          
         
                 lbl_title=new JLabel("STUDENT PAGE");
                 lbl_title.setBounds(267, 0, 383, 80);
                 f.getContentPane().add(lbl_title);
                 lbl_title.setFont(new Font("Times New Roman", Font.BOLD, 38));
                 lbl_title.setForeground(Color.BLACK);
                 
                 btnNewButton = new JButton("");
                 btnNewButton.setBounds(6, 0, 44, 43);
                 f.getContentPane().add(btnNewButton);
                 btnNewButton.addActionListener(new ActionListener() {
                 	public void actionPerformed(ActionEvent e) {
                 		sector st = new sector();
				st.SectorScreen();
				dipose_f();
			}

			private void dipose_f() {
				// TODO Auto-generated method stub
			    f.dispose();
			}
                 });
                 btnNewButton.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\home1.png"));
                 
                 lbl_bg = new JLabel("");
                 lbl_bg.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\icon\\bg img 11.jpg"));
                 lbl_bg.setBounds(6, -25, 967, 565);
                 f.getContentPane().add(lbl_bg);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setVisible(true);
    }
    
    public static void main(String [] args) {
        new Student_Pg();
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}