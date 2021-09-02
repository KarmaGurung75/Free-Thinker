package login_registration;

//import required classes and packages 

import javax.swing.*; 

import java.awt.*;
import java.awt.EventQueue;
import java.lang.Exception;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Teacher_login {
	private JFrame loginframe;
	private JTextField username;
	private JPasswordField password_txt;
	
	/**
	 * * Launch the application.
	 * */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
          try {
        	  Teacher_login window = new Teacher_login();
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

public Teacher_login() {
  initialize();
}
/**
* Initialize the contents of the frame.
*/

private void initialize() {
  loginframe = new JFrame();
  loginframe.setForeground(Color.BLACK);
  loginframe.setFont(new Font("Arial", Font.BOLD, 16));
  loginframe.setBackground(new Color(0, 51, 51));
  loginframe.setBounds(200, 100,591,402);
  loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  loginframe.setLayout(null);

  JLabel textlogin = new JLabel("Please Login");
  textlogin.setBounds(30, 34, 170, 41);
  textlogin.setForeground(new Color(13, 13, 13));
  textlogin.setBackground(Color.PINK);
  textlogin.setFont(new Font("Arial", Font.BOLD, 20));
  loginframe.getContentPane().add(textlogin);
  
  
  //
  /*JPanel panel_1 = new JPanel();
  panel_1.setBounds(4,14, 92, 22);
  loginframe.getContentPane().add(panel_1);
  panel_1.setLayout(null);
*/
  
  JLabel lblusername = new JLabel("USERNAME");
  lblusername.setBounds(10,85, 92, 22);
  loginframe.add(lblusername);
  lblusername.setBackground(new Color(51, 0, 51));
  lblusername.setHorizontalAlignment(SwingConstants.CENTER);
  lblusername.setFont(new Font("Arial", Font.BOLD, 14));


  /*
  JPanel panel_2 = new JPanel();
  panel_2.setBounds(44, 90, 96, 26);
  loginframe.getContentPane().add(panel_2);
  panel_2.setLayout(null);
  */
  
  JLabel lblpassword = new JLabel("PASSWORD");
  lblpassword.setBounds(10, 130, 96, 26);
  loginframe.add(lblpassword);
  lblpassword.setFont(new Font("Arial", Font.BOLD, 14));
  lblpassword.setHorizontalAlignment(SwingConstants.CENTER);

  //
  username = new JTextField();
  username.setBounds(20,110, 131,20);
  loginframe.getContentPane().add(username);
  username.setColumns(10);

  //
  password_txt = new JPasswordField();
  password_txt.setBounds(20,155, 131, 20);
  loginframe.getContentPane().add(password_txt);
  password_txt.setColumns(10);

  //
  JLabel lblregister = new JLabel("New User? Click here to ");
  lblregister.setBounds(20,220,200,25);
  loginframe.add(lblregister);
  lblregister.setFont(new Font("Arial", Font.BOLD,12));
  JButton btnregister = new JButton("Sign Up");
  btnregister.setBounds(160,220,80,25);
  btnregister.setFont(new Font("Arial", Font.BOLD,12));
  btnregister.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
           UserRegistration ur = new UserRegistration();
           ur.setVisible(true);
           dispose_Teacher_login();
      }

	private void dispose_Teacher_login() {
		// TODO Auto-generated method stub
		setVisible(false);
		loginframe.dispose();
		
	}
  });

  btnregister.setBackground(Color.WHITE);
  btnregister.setFont(new Font("Arial", Font.BOLD, 12));
  loginframe.getContentPane().add(btnregister);

  
  JButton btnlogin = new JButton("Login");
  btnlogin.setBounds(40,190,80, 26);
	btnlogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
           String userName = username.getText();
           String password = password_txt.getText();
           if (username.getText().equals("") && password_txt.getText().equals("") ) {
               JOptionPane.showMessageDialog( btnlogin, "Please Enter Username and Password");
           }
           else {
           try {
               Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
               PreparedStatement st = (PreparedStatement) connection
                   .prepareStatement("Select user_name, password,Sector from registration where user_name=? and password=? and Sector='Teacher'");

               st.setString(1, userName);
               st.setString(2, password);
               ResultSet rs = st.executeQuery();
               if (rs.next()) {
            	   JOptionPane.showMessageDialog(btnlogin, "You have successfully logged in");
              		 Teacher TR= new Teacher();
              		 TR.setVisible(true);
              		 dispose_Teacher_login();     	        
               }
               else {
                   JOptionPane.showMessageDialog(btnlogin, "Wrong Username & Password");
               }
           } catch (SQLException sqlException) {
               sqlException.printStackTrace();
           }
       }
  	 }
		private void  dispose_Teacher_login() {
			// TODO Auto-generated method stub
			setVisible(false);
			loginframe.dispose();		
		}
   });

  btnlogin.setForeground(Color.BLACK);
  btnlogin.setBackground(Color.WHITE);
  btnlogin.setFont(new Font("Arial", Font.BOLD, 12));
  loginframe.getContentPane().add(btnlogin);

 

  JButton btnexit = new JButton("EXIT");
  btnexit.setBounds(350,310, 65, 31);
  btnexit.setFont(new Font("Arial", Font.BOLD, 12));
  btnexit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	  System.exit(0);        
      }
  });
  loginframe.getContentPane().add(btnexit);
 

  JLayeredPane layeredPane = new JLayeredPane();
  layeredPane.setBounds(32, 183, 172, -65);
  loginframe.getContentPane().add(layeredPane);

      JLabel lblpicture = new JLabel("");
      lblpicture.setIcon(new ImageIcon("C:\\\\java_folder\\\\Free_Thinker_project\\\\src\\\\login_registration\\\\login_cover2.png"));
      lblpicture.setBounds(0, 2,444,390);
      loginframe.getContentPane().add(lblpicture);
      loginframe.setSize(444,390);   
      loginframe.setVisible(true);    
  }   

/**
          * Initialize the contents of the frame.

          */

          private void main() {
                       loginframe = new JFrame();
                       loginframe.setSize(500,402);
                       loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          }

			public void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}

}