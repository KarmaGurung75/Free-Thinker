package login_registration;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Teacher extends JFrame {


JPanel mainw_contentPane;
JTextField tf_search,tf_lastname,tf_firstname,tf_username,tf_age,tf_experience,
tf_qualification,tf_teacherid,tf_gender,tf_email,tf_contact,tf_dob, M_id,m_name,
mtf_desc,s_id, s_name,sdm_id,sdm_name,result,
perc;
JTable sd_table,m_table;

public Teacher() {

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
lbl_teacherid.setForeground(new Color(255, 255, 255));
lbl_teacherid.setBounds(39, 24, 72, 37);
profile_panel.add(lbl_teacherid);

JLabel lbl_fname = new JLabel("First Name:");
lbl_fname.setForeground(new Color(255, 255, 255));
lbl_fname.setBounds(39, 64, 72, 37);
profile_panel.add(lbl_fname);

JLabel lbl_lname = new JLabel("Last Name:");
lbl_lname.setForeground(new Color(255, 255, 255));
lbl_lname.setBounds(39, 104, 72, 37);
profile_panel.add(lbl_lname);

JLabel lbl_un = new JLabel("Username:");
lbl_un.setForeground(new Color(255, 255, 255));
lbl_un.setBounds(39, 144, 72, 37);
profile_panel.add(lbl_un);

JLabel lbl_age = new JLabel("Age:");
lbl_age.setForeground(new Color(255, 255, 255));
lbl_age.setBounds(39, 184, 72, 37);
profile_panel.add(lbl_age);

JLabel lbl_exp = new JLabel("Experience:");
lbl_exp.setForeground(new Color(255, 255, 255));
lbl_exp.setBounds(39, 225, 95, 37);
profile_panel.add(lbl_exp);

JLabel lbl_qualification = new JLabel("Qualification:");
lbl_qualification.setForeground(new Color(255, 255, 255));
lbl_qualification.setBounds(39, 265, 95, 37);
profile_panel.add(lbl_qualification);

JLabel lbl_gender = new JLabel("Gender");
lbl_gender.setForeground(new Color(255, 255, 255));
lbl_gender.setBounds(39, 305, 95, 37);
profile_panel.add(lbl_gender);

JLabel lbl_em = new JLabel("E-mail:");
lbl_em.setForeground(new Color(255, 255, 255));
lbl_em.setBounds(39, 345, 95, 37);
profile_panel.add(lbl_em);

JLabel lbl_contact = new JLabel("Contact:");
lbl_contact.setForeground(new Color(255, 255, 255));
lbl_contact.setBounds(39, 381, 95, 37);
profile_panel.add(lbl_contact);

JLabel lbl_dob = new JLabel("D.O.B:");
lbl_dob.setForeground(new Color(255, 255, 255));
lbl_dob.setBounds(39, 421, 95, 37);
profile_panel.add(lbl_dob);


//-------------------------------------------------------- ProfileTextField ------------------------------------------------

tf_teacherid = new JTextField();
tf_teacherid.setBounds(144, 28, 241, 29);
tf_teacherid.setColumns(10);
profile_panel.add(tf_teacherid);

tf_firstname = new JTextField();
tf_firstname.setBounds(144, 68, 241, 29);
tf_firstname.setColumns(10);
profile_panel.add(tf_firstname);

tf_lastname = new JTextField();
tf_lastname.setBounds(144, 108, 241, 29);
profile_panel.add(tf_lastname);
tf_lastname.setColumns(10);

tf_username = new JTextField();
tf_username.setBounds(144, 148, 241, 29);
tf_username.setColumns(10);
profile_panel.add(tf_username);

tf_age = new JTextField();
tf_age.setBounds(144, 188, 241, 29);
tf_age.setColumns(10);
profile_panel.add(tf_age);

tf_experience = new JTextField();
tf_experience.setBounds(144, 229, 241, 29);
tf_experience.setColumns(10);
profile_panel.add(tf_experience);

tf_qualification = new JTextField();
tf_qualification.setBounds(144, 269, 241, 29);
tf_qualification.setColumns(10);
profile_panel.add(tf_qualification);

tf_gender = new JTextField();
tf_gender.setBounds(144, 309, 241, 29);
tf_gender.setColumns(10);
profile_panel.add(tf_gender);

tf_email = new JTextField();
tf_email.setBounds(144, 349, 241, 29);
tf_email.setColumns(10);
profile_panel.add(tf_email);

tf_contact = new JTextField();
tf_contact.setBounds(144, 385, 241, 29);
tf_contact.setColumns(10);
profile_panel.add(tf_contact);

tf_dob = new JTextField();
tf_dob.setBounds(144, 425, 241, 29);
tf_dob.setColumns(10);
profile_panel.add(tf_dob);

//------------------------------------------------Profile button--------------------------------------------------
JButton btnp_update = new JButton("Update");
btnp_update.setBounds(144, 463, 110, 37);
profile_panel.add(btnp_update);

JButton btnp_clear = new JButton("Clear");
btnp_clear.setBounds(275, 463, 110, 37);
profile_panel.add(btnp_clear);

//-----------------------------------------------Profile Search panel--------------------------------------------------------------
   JPanel searchw_panel = new JPanel();
searchw_panel.setBounds(465, 39, 593, 415);
searchw_panel.setBorder(new LineBorder(new Color(0, 0, 51), 3));
profile_panel.add(searchw_panel);
searchw_panel.setLayout(null);

tf_search = new JTextField();
tf_search.setBounds(90, 22, 263, 38);
searchw_panel.add(tf_search);
tf_search.setFont(new Font("Arial", Font.PLAIN, 16));
tf_search.setColumns(10);

JButton btnp_search = new JButton("Search");
btnp_search.setBounds(382, 23, 122, 35);
searchw_panel.add(btnp_search);
btnp_search.setFont(new Font("Arial", Font.PLAIN, 16));
btnp_search.setBackground(UIManager.getColor("MenuItem.selectionBackground"));
btnp_search.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {


}
});


//--------------------------------------------------------Module label-------------------------------------------------

JLayeredPane Module_panel = new JLayeredPane();
Module_panel.setBackground(Color.LIGHT_GRAY);
p_m_sd_tPane.addTab("Module", null, Module_panel, null);
Module_panel.setLayout(null);

JLabel lblm_id = new JLabel("Module ID:");
lblm_id.setFont(new Font("Arial", Font.PLAIN, 14));
lblm_id.setBounds(87, 43, 90, 44);
lblm_id.setForeground(Color.BLACK);
Module_panel.add(lblm_id);

JLabel lblm_name = new JLabel("Module Name:");
lblm_name.setFont(new Font("Arial", Font.PLAIN, 14));
lblm_name.setBounds(87, 112, 90, 44);
lblm_name.setForeground(Color.BLACK);
Module_panel.add(lblm_name);

JLabel lblm_des= new JLabel("Description");
lblm_des.setFont(new Font("Arial", Font.BOLD, 14));
lblm_des.setBounds(87, 168, 90, 32);
Module_panel.add(lblm_des);


//----------------------------------------------------------Module Button--------------------------------------------------------------

JButton btnm_add = new JButton("ADD");
btnm_add.setBounds(87, 457, 160, 37);
btnm_add.setFont(new Font("Tahoma", Font.PLAIN, 20));
Module_panel.add(btnm_add);

JButton btnm_delete = new JButton("DELETE");
btnm_delete.setBounds(318, 458, 160, 37);
btnm_delete.setFont(new Font("Tahoma", Font.PLAIN, 18));
Module_panel.add(btnm_delete);

JButton btnm_update = new JButton("UPDATE");
btnm_update.setBounds(552, 458, 160, 37);
btnm_update.setFont(new Font("Tahoma", Font.PLAIN, 18));
Module_panel.add(btnm_update);

JButton btnm_showadetail = new JButton("SHOW ALL DETAILS");
btnm_showadetail.setBounds(787, 458, 209, 37);
btnm_showadetail.setFont(new Font("Tahoma", Font.PLAIN, 18));
Module_panel.add(btnm_showadetail);


//-----------------------------------------------------------Module Text Field--------------------------------------------------------
M_id = new JTextField();
M_id.setBounds(202, 46, 241, 40);
M_id.setColumns(10);
Module_panel.add(M_id);



m_name = new JTextField();
m_name.setBounds(202, 115, 241, 40);
m_name.setColumns(10);
Module_panel.add(m_name);

mtf_desc= new JTextField();
mtf_desc.setBounds(87, 194, 356, 232);
Module_panel.add(mtf_desc);
mtf_desc.setColumns(10);



JScrollPane m_scrollPane = new JScrollPane();
m_scrollPane.setBounds(539, 43, 469, 389);
Module_panel.add(m_scrollPane);

m_table = new JTable();
m_table.setModel(new DefaultTableModel(
new Object[][] {
},
new String[] {
"Module ID", "Module Name"
}
));
m_scrollPane.setViewportView(m_table);

JLabel lblNewLabel_2 = new JLabel("");
lblNewLabel_2.setIcon(new ImageIcon("D:\\bg img 11.jpg"));
lblNewLabel_2.setBounds(0, 0, 1118, 533);
Module_panel.add(lblNewLabel_2);


//------------------------------------------------------ Show details window ----------------------------------------------------------

JLayeredPane SD_lpane = new JLayeredPane();
p_m_sd_tPane.addTab("Students Details", null, SD_lpane, null);
SD_lpane.setLayout(null);


//---------------------------------------------------------SD label--------------------------------------------------------------------

JLabel lblsd_id = new JLabel("Student ID:");
lblsd_id.setForeground(Color.WHITE);
lblsd_id.setFont(new Font("Arial", Font.PLAIN, 14));
lblsd_id.setBounds(93, 43, 90, 44);
SD_lpane.add(lblsd_id);

JLabel lblsd_name = new JLabel("Student Name:");
lblsd_name.setForeground(Color.WHITE);
lblsd_name.setFont(new Font("Arial", Font.PLAIN, 14));
lblsd_name.setBounds(93, 110, 120, 44);
SD_lpane.add(lblsd_name);

JLabel lblsd_mid = new JLabel("Module ID:");
lblsd_mid.setForeground(Color.WHITE);
lblsd_mid.setFont(new Font("Arial", Font.PLAIN, 14));
lblsd_mid.setBounds(93, 179, 90, 44);
SD_lpane.add(lblsd_mid);

JLabel lblsd_mname = new JLabel("Module Name:");
lblsd_mname.setForeground(Color.WHITE);
lblsd_mname.setFont(new Font("Arial", Font.PLAIN, 14));
lblsd_mname.setBounds(93, 250, 90, 44);
SD_lpane.add(lblsd_mname);

JLabel lblsd_result = new JLabel("Result:");
lblsd_result.setForeground(Color.WHITE);
lblsd_result.setFont(new Font("Arial", Font.PLAIN, 14));
lblsd_result.setBounds(93, 316, 90, 44);
SD_lpane.add(lblsd_result);

//-----------------------------------------------------------------SD Text field---------------------------------------------------------------

s_id= new JTextField();
s_id.setColumns(10);
s_id.setBounds(223, 43, 241, 40);
SD_lpane.add(s_id);

s_name = new JTextField();
s_name.setColumns(10);
s_name.setBounds(223, 110, 241, 40);
SD_lpane.add(s_name);

sdm_id = new JTextField();
sdm_id.setColumns(10);
sdm_id.setBounds(223, 179, 241, 40);
SD_lpane.add(sdm_id);

sdm_name = new JTextField();
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
btnm_add_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
btnm_add_1.setBounds(93, 453, 132, 37);
SD_lpane.add(btnm_add_1);

JButton btnm_delete_1 = new JButton("DELETE");
btnm_delete_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
btnm_delete_1.setBounds(304, 454, 160, 37);
SD_lpane.add(btnm_delete_1);

JButton btnm_update_1 = new JButton("UPDATE");
btnm_update_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
btnm_update_1.setBounds(558, 454, 160, 37);
SD_lpane.add(btnm_update_1);

JButton btnm_showadetail_1 = new JButton("SHOW ALL DETAILS");
btnm_showadetail_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
btnm_showadetail_1.setBounds(813, 454, 209, 37);
SD_lpane.add(btnm_showadetail_1);

JLabel lbl_teacherid_1_6_1 = new JLabel("Percentage:");
lbl_teacherid_1_6_1.setForeground(Color.WHITE);
lbl_teacherid_1_6_1.setFont(new Font("Arial", Font.PLAIN, 14));
lbl_teacherid_1_6_1.setBounds(93, 384, 90, 44);
SD_lpane.add(lbl_teacherid_1_6_1);


//------------------------------------------------------ Background Images ---------------------------------------------------------------

   JLabel main_bgimage = new JLabel("");
   main_bgimage.setIcon(new ImageIcon("D:\\bg_img1.jpg"));
   main_bgimage.setBounds(0, 0, 1184, 691);
   mainw_contentPane.add(main_bgimage);

JLabel p_bgimage = new JLabel("");
p_bgimage.setForeground(new Color(255, 255, 255));
p_bgimage.setIcon(new ImageIcon("D:\\bg_img1.jpg"));
p_bgimage.setBounds(0, 0, 1097, 525);
profile_panel.add(p_bgimage);


JScrollPane sd_scrollpane = new JScrollPane();
sd_scrollpane.setBounds(553, 43, 469, 385);
SD_lpane.add(sd_scrollpane);

sd_table = new JTable();
sd_table.setModel(new DefaultTableModel(
new Object[][] {
},
new String[] {
"Student ID", "Student Name", "Module Id", "Module Name ", "Result", "Percentage"
}
));
sd_scrollpane.setViewportView(sd_table);

JLabel sd_bgimg = new JLabel("");
sd_bgimg.setIcon(new ImageIcon("D:\\bg img 11.jpg"));
sd_bgimg.setBounds(0, 0, 1118, 533);
SD_lpane.add(sd_bgimg);

}



public static void main(String[] args) {
Teacher frame = new Teacher();
frame.setVisible(true);
frame.setResizable(false);
}
}