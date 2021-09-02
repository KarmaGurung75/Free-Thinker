package login_registration;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;

/**

* User Registration using Swing

* @author javaguides.net

*

*/

public class UserRegistration extends JFrame {

    private static final long serialVersionUID = 1L;
    private JFrame UR;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField mob;
    private JPasswordField password_txt;
    private JButton btnNewButton;
    private JTextField sector_txt;
    
    /*
     Launch the application.

     */

    public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
    public void run() {
    try {
    	UserRegistration frame = new UserRegistration();
    frame.setVisible(true);
    } catch (Exception e) {
    e.printStackTrace();
    }
    }
    });
    }
    /**

     * Create the frame.

     */
    public UserRegistration() {

        
        UR= new JFrame("User Registration");
        UR.setBackground(new Color(255, 255, 255));
        UR.setBounds(450, 190,500,400);
        UR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UR.getContentPane().setLayout(null);
        
        // Register Label
        JLabel lblNewUserRegister = new JLabel("New User Register");
        lblNewUserRegister.setForeground(new Color(0, 0, 0));
        lblNewUserRegister.setBackground(new Color(205, 92, 92));
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.BOLD,20));
        lblNewUserRegister.setBounds(20,20,200, 50);
        UR.add(lblNewUserRegister);
        
        // First name lablel
        JLabel lblName = new JLabel("First name");
        lblName.setForeground(new Color(0, 0, 0));
        lblName.setFont(new Font("Times New Roman", Font.PLAIN,16));
        
        lblName.setBounds(20,70,90,40);
        UR.add(lblName);

        // last name label
        JLabel lblNewLabel = new JLabel("Last name");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblNewLabel.setBounds(20,100, 90,40);
        UR.add(lblNewLabel);
        
        // Email Address Label
        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblEmailAddress.setBounds(20,130,90,40);
        UR.add(lblEmailAddress);
        
        // Username Label
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblUsername.setBounds(20, 160, 85, 40);
        UR.add(lblUsername);
        
        // password Label
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblPassword.setBounds(20,190,85, 40);
        UR.add(lblPassword);
        
        // Mobile Number label
        JLabel lblMobileNumber = new JLabel("Mobile No.");
        lblMobileNumber.setFont(new Font("Times New Roman", Font.PLAIN,16));
        lblMobileNumber.setBounds(20,220,85, 40);
        UR.add(lblMobileNumber);
        
        // Label for Sector
        JLabel lblsector = new JLabel("Sector");
        lblsector.setFont(new Font("Times New Roman", Font.PLAIN,16));
        lblsector.setForeground(new Color(0, 0, 0));
        lblsector.setBounds(20,250,85, 40);
        UR.add(lblsector);
  
        
        // Text field for First Name
        firstname = new JTextField();
        firstname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        firstname.setBounds(150,80,100,20);
        UR.add(firstname);
        firstname.setColumns(10);
        

        // Text Field for Last name
        lastname = new JTextField();
        lastname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lastname.setBounds(150,110,100,20);
        UR.add(lastname);
        lastname.setColumns(10);

        // Text Field for Email Address
        email = new JTextField();
        email.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        email.setBounds(150,140, 100,20);
        UR.add(email);
        email.setColumns(10);

        // Text Field for Username
        username = new JTextField();
        username.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        username.setBounds(150,170,100,20);
        UR.add(username);
        username.setColumns(10);
        
        // Text Field for Password
        password_txt = new JPasswordField();
        password_txt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        password_txt.setBounds(150,200, 100,20);
        UR.add(password_txt);
       
        // Text field for Mobile Number
        mob = new JTextField();
        mob.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        mob.setBounds(150,230, 100,20);
        UR.add(mob);
        mob.setColumns(10);
       
        // Text Field For Sector
        sector_txt = new JTextField();
        sector_txt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        sector_txt.setBounds(150,260, 100,20);
        UR.add(sector_txt);

        // Register button
        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	String firstName = firstname.getText();
                String lastName = lastname.getText();
                String emailId = email.getText();
                String userName = username.getText();
                String mobileNumber = mob.getText();
                int len = mobileNumber.length();
                String password = password_txt.getText();
                String Sector = sector_txt.getText();

                // message show with username
                String msg = "" + userName ;
                msg += " \n";
                
                // Mobile Number length
              /*  if (len != 10) {

                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");

                }*/
                if (username.getText().equals("") || password_txt.getText().equals("")  || sector_txt.getText().equals("")) {        	
                	JOptionPane.showMessageDialog(btnNewButton, "Please Enter The Full details");
                }
                else {
                	try {
                		// connecting to database
                		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
                		String query = "INSERT INTO registration values('" + firstName + "','" + lastName + "','" + userName + "','" +
                        password + "','" + emailId + "','" + mobileNumber + "','" + Sector + "')";
                    
                	
                	int rs = 0;
                    Statement sta = connection.createStatement();      
                    rs = sta.executeUpdate(query);
                    if (rs == 0) {
                       
                        JOptionPane.showMessageDialog(btnNewButton, "This is already exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,

                            "Welcome, " + msg + "Your account is sucessfully created");
                        if (Sector.equalsIgnoreCase("Admin")) {
                        	 Admin ad= new Admin();
                      		 ad.AdminScreen();
                      		 setVisible(false);
                      		 dispose_UserRegistration(); 
                        }
                        else if (Sector.equalsIgnoreCase("Teacher")) {
                        	Teacher TR= new Teacher();
                        	TR.TeacherScreen();
                        	dispose_UserRegistration(); 
                       }
                        else {
                        	Student ST= new Student();
                        	ST.StudentScreen();
                        	dispose_UserRegistration(); 

                        	
                        }

                    }
                    connection.close();

                } catch (Exception exception) {

                    exception.printStackTrace();
                }
            }
            }

			private void dispose_UserRegistration() {
				// TODO Auto-generated method stub
				setVisible(false);
				UR.dispose();		
			}
        });
        
       

        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton.setBounds(85,300,120,30);
        UR.add(btnNewButton);
        
       
        JLabel lblpicture = new JLabel("");
        lblpicture.setIcon(new ImageIcon("C:\\java_folder\\Free_Thinker_project\\src\\login_registration\\register_cover2.png"));
        lblpicture.setBounds(0, 2,470,428);
        UR.getContentPane().add(lblpicture);
        UR.setSize(470,428);   
        UR.setVisible(true);   
    }


    public void ActionPerformed() {
        // TODO Auto-generated method stub
    }

}