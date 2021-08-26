package login_registration;

//import required classes and packages 

import javax.swing.*; 

import java.awt.*;
import java.awt.event.*;
import java.awt.EventQueue;
import java.lang.Exception;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Loginn {
	private JFrame loginframe;
	private JTextField username;
	private JPasswordField password_txt;
	private JComboBox sector;
	private JComboBox menu;
	
	/**
	 * * Launch the application.
	 * */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

          try {

              Loginn window = new Loginn();

              window.loginframe.setVisible(true);

          } catch (Exception e) {

              e.printStackTrace();

          }

      }

  });

}


/**

* Create the application.

*/

public Loginn() {

  initialize();

}
/**

* Initialize the contents of the frame.

*/

private void initialize() {

  loginframe = new JFrame();

  loginframe.getContentPane().setForeground(Color.BLACK);

  loginframe.getContentPane().setFont(new Font("Arial", Font.BOLD, 16));

  loginframe.getContentPane().setBackground(new Color(0, 51, 51));

  loginframe.setBounds(100, 100, 572, 367);

  loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  loginframe.getContentPane().setLayout(null);

 

  JLabel textlogin = new JLabel("PLEASE LOGIN !");

  textlogin.setBounds(253, 2, 170, 41);

  textlogin.setForeground(new Color(255, 255, 255));

  textlogin.setBackground(Color.PINK);

  textlogin.setFont(new Font("Arial", Font.BOLD, 20));

  loginframe.getContentPane().add(textlogin);

 

  JPanel panel_2 = new JPanel();

  panel_2.setBounds(44, 90, 96, 26);

  loginframe.getContentPane().add(panel_2);

  panel_2.setLayout(null);

 

  JLabel lblpassword = new JLabel("PASSWORD");

  lblpassword.setBounds(0, 0, 96, 26);

  panel_2.add(lblpassword);

  lblpassword.setFont(new Font("Arial", Font.BOLD, 14));

  lblpassword.setHorizontalAlignment(SwingConstants.CENTER);

 

  username = new JTextField();

  username.setBounds(229, 53, 131, 29);

  loginframe.getContentPane().add(username);

  username.setColumns(10);

  

  password_txt = new JPasswordField();

  password_txt.setBounds(229, 92, 131, 26);

  loginframe.getContentPane().add(password_txt);

  password_txt.setColumns(10);

 

  JButton btnregister = new JButton("NEW REGISTER");

  btnregister.setBounds(118, 219, 134, 34);

  btnregister.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
      	 //dispose();
           UserRegistration ur = new UserRegistration();
           ur.setVisible(true);

         

      }

  });

  btnregister.setBackground(Color.WHITE);

  btnregister.setFont(new Font("Arial", Font.BOLD, 12));

  loginframe.getContentPane().add(btnregister);

 

  JButton btnlogin = new JButton("LOGIN");

  btnlogin.setBounds(136, 183, 104, 26);
	btnlogin.addActionListener(new ActionListener() {


		public void actionPerformed(ActionEvent e) {
           String userName = username.getText();
           String password = password_txt.getText();
			 String Sector = sector.getSelectedItem().toString();
           if (username.getText().equals("") && password_txt.getText().equals("") && Sector.equals("sector") ) {

               JOptionPane.showMessageDialog( btnlogin, "Please Enter Username and Password");

           }
           else {
           try {
               Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");

               PreparedStatement st = (PreparedStatement) connection
                   .prepareStatement("Select user_name, password from registration where user_name=? and password=? and Sector =?");

               st.setString(1, userName);
               st.setString(2, password);
               st.setString(3, String.valueOf(sector.getSelectedItem()));
               ResultSet rs = st.executeQuery();
               if (rs.next()) {
              	 String s1 = rs.getString("sector");
              	 String un = rs.getString("user_name");
              	 if (Sector.equalsIgnoreCase("Admin") && s1.equalsIgnoreCase("admin")) {
              		 Admin ad= new Admin(un);
              		 ad.setVisible(true);
              		 setVisible(false);
              	 }
              	 else if (Sector.equalsIgnoreCase("Teacher") && s1.equalsIgnoreCase("teacher")) {
              		 Teacher th= new Teacher(un);
              		 th.setVisible(true);
              		 setVisible(false);
              	 }
              	 

              	 else /*(Sector.equalsIgnoreCase("Student") && s1.equalsIgnoreCase("student"))*/ {
              		 Student sd= new Student(un);
              		 sd.setVisible(true);
              		 setVisible(false);
              	 }
                 // JOptionPane.showMessageDialog(btnlogin, "You have successfully logged in");
               } 
               else {
                   JOptionPane.showMessageDialog(btnlogin, "Wrong Username & Password");
               }
           } catch (SQLException sqlException) {
               sqlException.printStackTrace();
           }
       }
  	 }
   });

  btnlogin.setForeground(Color.BLACK);

  btnlogin.setBackground(Color.WHITE);

  btnlogin.setFont(new Font("Arial", Font.BOLD, 12));

  loginframe.getContentPane().add(btnlogin);

 

  JButton btnexit = new JButton("EXIT");

  btnexit.setBounds(415, 299, 65, 31);

  btnexit.setFont(new Font("Arial", Font.BOLD, 12));

  btnexit.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {

          

      }

  });

  loginframe.getContentPane().add(btnexit);

 

  JPanel panel_1 = new JPanel();

  panel_1.setBounds(44, 58, 92, 22);

  loginframe.getContentPane().add(panel_1);

  panel_1.setLayout(null);

 

  JLabel lblusername = new JLabel("USERNAME");

  lblusername.setBounds(0, 0, 92, 22);

  panel_1.add(lblusername);

  lblusername.setBackground(new Color(51, 0, 51));

  lblusername.setHorizontalAlignment(SwingConstants.CENTER);

  lblusername.setFont(new Font("Arial", Font.BOLD, 14));

 

  JLayeredPane layeredPane = new JLayeredPane();

  layeredPane.setBounds(32, 183, 172, -65);

  loginframe.getContentPane().add(layeredPane);

 

  JPanel panel_3 = new JPanel();

  panel_3.setBounds(54, 127, 86, 26);

  loginframe.getContentPane().add(panel_3);

  panel_3.setLayout(null);

 

  JLabel lblsector = new JLabel("SECTOR");
  lblsector.setForeground(new Color(0, 0, 0));
  lblsector.setBounds(10, 0, 76, 26);
  panel_3.add(lblsector);
  lblsector.setFont(new Font("Arial", Font.BOLD, 14));

  String sector[]={"Admin","Teacher","Student","Staff"};       	
  JComboBox menu=new JComboBox(sector);   
  menu.setFont(new Font("Arial", Font.BOLD, 14));
   menu.setBounds(229, 129,131,26);   
  loginframe.getContentPane().add(menu);       
  loginframe.getContentPane().setLayout(null);

  JPanel panel = new JPanel();
  panel.setBounds(58, 48, 554, -21);
  loginframe.getContentPane().add(panel);
 
  /*
  String sector[]={"Admin","Teacher","Student","Staff"};        
  final JComboBox cb=new JComboBox(sector);    
  cb.setBounds(229, 129,131,26);    
  loginframe.add(cb);loginframe.add(btnlogin); //loginframe.add(btnlogin);    
  loginframe.setLayout(null);    
  //loginframe.setSize(350,350);    
  loginframe.setVisible(true);       
  /*btnlogin.addActionListener(new ActionListener() {  
      public void actionPerformed(ActionEvent e) {       
String data = "Programming language Selected: "   
 + cb.getItemAt(cb.getSelectedIndex());  
label.setText(data);  
} */

     

      JLabel lblpicture = new JLabel("");

      lblpicture.setIcon(new ImageIcon("C:\\java_folder\\java_project\\src\\login_registration\\login.png"));

      lblpicture.setBounds(0, 2, 490, 338);

      loginframe.getContentPane().add(lblpicture);

      loginframe.setSize(504,377);   

      loginframe.setVisible(true);    
    

  }   







/**

          * Initialize the contents of the frame.

          */

          private void main() {

                       loginframe = new JFrame();

                       loginframe.setBounds(100, 100, 450, 300);

                       loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          }







			public void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}

}