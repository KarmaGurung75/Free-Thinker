package login_registration;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Student {
JFrame f;
JPanel pnl_profile, pnl_module, pnl_result, display_result;
JLabel lbl_title, lbl_name, lbl_class, lbl_address, lbl_dob, lbl_studentID, lbl_enterID, lblpicture, lbl_profileicon,
lbl_englishicon, lbl_scienceicon, lbl_socialicon, lbl_yourresult,lbl_module_bg_img,lbl_result_bgimg ;
    JTextField txt_name, txt_class, txt_address, txt_dob, txt_studentID, txt_enterID;
    JButton btn_exit, btn_update,btn_english, btn_science, btn_social, btn_viewresult;
   
   
    public void StudentScreen() {
    f=new JFrame("Student");
    f.getContentPane().setLayout(null);

    lbl_title=new JLabel("STUDENT PAGE");
    lbl_title.setBounds(502, 9, 630, 80);
    lbl_title.setFont(new Font("Arial", Font.BOLD, 25));
    lbl_title.setForeground(Color.ORANGE);
    f.getContentPane().add(lbl_title);
   
    JTabbedPane profiletPane = new JTabbedPane(JTabbedPane.TOP);
    profiletPane.setBounds(10, 100, 1164, 580);
f.getContentPane().add(profiletPane);

pnl_profile = new JPanel();
pnl_profile.setBackground(new Color(169, 169, 169));
profiletPane.addTab("Profile", null, pnl_profile, null);
pnl_profile.setLayout(null);

lbl_profileicon = new JLabel("");
lbl_profileicon.setBounds(521, 68, 605, 432);
lbl_profileicon.setIcon(new ImageIcon("D:\\bg_img 3.jpg"));
pnl_profile.add(lbl_profileicon);

lbl_name = new JLabel("Name:");
lbl_name.setForeground(Color.WHITE);
lbl_name.setBounds(96, 90, 74, 31);
lbl_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
pnl_profile.add(lbl_name);
txt_name = new JTextField();
txt_name.setBounds(203, 92, 200, 31);
pnl_profile.add(txt_name);
txt_name.setColumns(10);

lbl_class = new JLabel("Class:");
lbl_class.setForeground(Color.WHITE);
lbl_class.setBounds(96, 159, 60, 32);
lbl_class.setFont(new Font("Tahoma", Font.PLAIN, 14));
pnl_profile.add(lbl_class);
txt_class = new JTextField();
txt_class.setBounds(203, 161, 200, 32);
pnl_profile.add(txt_class);
txt_class.setColumns(10);

lbl_address = new JLabel("Address:");
lbl_address.setForeground(Color.WHITE);
lbl_address.setBounds(96, 224, 60, 31);
lbl_address.setFont(new Font("Tahoma", Font.PLAIN, 14));
pnl_profile.add(lbl_address);
txt_address = new JTextField();
txt_address.setBounds(203, 226, 200, 31);
pnl_profile.add(txt_address);
txt_address.setColumns(10);

lbl_dob = new JLabel("Date of Birth:");
lbl_dob.setForeground(Color.WHITE);
lbl_dob.setBounds(96, 290, 90, 31);
lbl_dob.setFont(new Font("Tahoma", Font.PLAIN, 14));
pnl_profile.add(lbl_dob);
txt_dob = new JTextField();
txt_dob.setBounds(203, 292, 200, 31);
pnl_profile.add(txt_dob);
txt_dob.setColumns(10);

lbl_studentID = new JLabel("Student ID:");
lbl_studentID.setForeground(Color.WHITE);
lbl_studentID.setBounds(96, 352, 90, 31);
lbl_studentID.setFont(new Font("Tahoma", Font.PLAIN, 14));
pnl_profile.add(lbl_studentID);
txt_studentID = new JTextField();
txt_studentID.setBounds(203, 354, 200, 31);
pnl_profile.add(txt_studentID);
txt_studentID.setColumns(10);

btn_update = new JButton("UPDATE");
btn_update.setFont(new Font("Tahoma", Font.BOLD, 14));
btn_update.setBounds(203, 429, 105, 42);
pnl_profile.add(btn_update);
       
btn_exit = new JButton("EXIT");
btn_exit.setBounds(1037, 512, 89, 29);
pnl_profile.add(btn_exit);
             
JLabel lblimage_1 = new JLabel("New label");
lblimage_1.setBounds(0, 0, 1159, 552);
lblimage_1.setIcon(new ImageIcon("D:\\bg_img1.jpg"));
pnl_profile.add(lblimage_1);

pnl_module = new JPanel();
pnl_module.setBackground(new Color(169, 169, 169));
profiletPane.addTab("Module", null, pnl_module, null);
pnl_module.setLayout(null);

lbl_englishicon = new JLabel("");
lbl_englishicon.setBackground(Color.WHITE);
lbl_englishicon.setBounds(194, 114, 160, 200);
lbl_englishicon.setIcon(new ImageIcon("D:\\bg img 11.jpg"));
pnl_module.add(lbl_englishicon);

btn_english = new JButton("English");
btn_english.setFont(new Font("Arial", Font.BOLD, 16));
btn_english.setBounds(203, 398, 151, 38);
pnl_module.add(btn_english);

lbl_scienceicon = new JLabel("");
lbl_scienceicon.setBounds(497, 114, 160, 200);
lbl_scienceicon.setIcon(new ImageIcon("D:\\bg img 11.jpg"));
pnl_module.add(lbl_scienceicon);

btn_science = new JButton("Science");
btn_science.setFont(new Font("Arial", Font.BOLD, 16));
btn_science.setBounds(497, 398, 160, 38);
pnl_module.add(btn_science);

lbl_socialicon = new JLabel("");
lbl_socialicon.setBounds(791, 114, 160, 180);
lbl_socialicon.setIcon(new ImageIcon("D:\\bg img 11.jpg"));
pnl_module.add(lbl_socialicon);

btn_social = new JButton("Social");
btn_social.setFont(new Font("Arial", Font.BOLD, 16));
btn_social.setBounds(791, 398, 173, 38);
pnl_module.add(btn_social);

lbl_module_bg_img = new JLabel("");
lbl_module_bg_img.setIcon(new ImageIcon("D:\\bg img 11.jpg"));
lbl_module_bg_img.setBounds(0, 0, 1159, 552);
pnl_module.add(lbl_module_bg_img);

pnl_result = new JPanel();
pnl_result.setBackground(new Color(169, 169, 169));
profiletPane.addTab("Result", null, pnl_result, null);
pnl_result.setLayout(null);

lbl_enterID = new JLabel("Enter Your ID :");
lbl_enterID.setBounds(296, 16, 125, 29);
lbl_enterID.setFont(new Font("Tahoma", Font.BOLD, 14));
pnl_result.add(lbl_enterID);
txt_enterID = new JTextField();
txt_enterID.setBounds(456, 19, 234, 26);
pnl_result.add(txt_enterID);
txt_enterID.setColumns(10);

btn_viewresult = new JButton("View Result");
btn_viewresult.setBounds(740, 16, 125, 28);
btn_viewresult.setFont(new Font("Tahoma", Font.BOLD, 14));
pnl_result.add(btn_viewresult);

lbl_yourresult = new JLabel("Your Result");
lbl_yourresult.setBounds(523, 56, 125, 29);
lbl_yourresult.setFont(new Font("Tahoma", Font.BOLD, 16));
pnl_result.add(lbl_yourresult);

display_result = new JPanel();
display_result.setBounds(35, 90, 1091, 425);
display_result.setBorder(new LineBorder(new Color(0, 0, 51), 3, true));
pnl_result.add(display_result);

lbl_result_bgimg = new JLabel("");
lbl_result_bgimg .setIcon(new ImageIcon("D:\\bg img 11.jpg"));
lbl_result_bgimg .setBounds(0, 0, 1159, 552);
pnl_result.add(lbl_result_bgimg );
   
    f.setSize(1200, 730);
     
     JLabel lblimage_2 = new JLabel("");
     lblimage_2.setIcon(new ImageIcon("D:\\bg_img1.jpg"));
     lblimage_2.setBounds(0, 0, 1184, 691);
     f.getContentPane().add(lblimage_2);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setVisible(true);
    }
   
    /**
     * @wbp.parser.entryPoint
     */
    public static void main(String[] args) {
    new Student();
    }
}