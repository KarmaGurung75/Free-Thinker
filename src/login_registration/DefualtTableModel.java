/*package login_registration;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;

public class DefualtTableModel extends Teacher_test {
	
	
	Connection myConn = null;
	PreparedStatement myStmt = null;
	ResultSet Rs = null;
	int q, i, id, deleteItem;
	
	public void tabledata() {
		try {
			//1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_n_register","root","karma16502@");
			myStmt = myConn.prepareStatement("select * from tbl_teacher");
			Rs = myStmt.executeQuery();
			ResultSetMetaData stData = Rs.getMetaData();
			
			q = stData.getColumnCount();
			DefaultTableModel RecordTable = (DefaultTableModel)table.getModel();
			RecordTable.setRowCount(0);;
			
			while(Rs.next()) {
				Vector columnData = new Vector();
				
				for ( i = 1; i <= q ; i++) {
					columnData.add(Rs.getString("teacherid"));
					columnData.add(Rs.getString("first_name"));
					columnData.add(Rs.getString("last_name"));
					columnData.add(Rs.getString("username"));
					columnData.add(Rs.getString("age"));
					columnData.add(Rs.getString("experience"));
					columnData.add(Rs.getString("qualification"));
					columnData.add(Rs.getString("gender"));	
					columnData.add(Rs.getString("email"));
					columnData.add(Rs.getString("contact"));
					columnData.add(Rs.getString("dob"));
					
				}
				RecordTable.addRow(columnData);
			}
		}
		catch(Exception exc) {
			JOptionPane.showMessageDialog(null, exc);
		
			}
	
}
}*/
	
