package first;
import javax.swing.*;
import java.sql.*;


public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getConnection();
//		insert();
//		edit();		
//		delete();
		view ();
		   

	}
	
	public static void delete() throws Exception {
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement("DELETE FROM testarif.test WHERE name = ?");
		st.setString(1,"null");
		st.executeUpdate();
	}
	public static void edit () throws Exception {
		Connection con = getConnection();
		String sql="Update testarif.test set name=? , place = ? where id='3'";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,"baharp"); // set parameter value for first_name
		ps.setString(2,"bahar");
		ps.executeUpdate();
		ps.close();
		con.close();
		
	}
	
	public static void view () throws Exception {
		Connection con = getConnection();
		PreparedStatement view = con.prepareStatement("Select * from testarif.test");
		ResultSet r = view.executeQuery();
		String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
		while(r.next()) {
			
			Object[][] data = {
				    {"company_name", "date",
				     "start_time", "end_time", "total_time" }
				    
				    
			};
			
			JTable table = new JTable(data, columnNames);
			
		
//			JOptionPane.showMessageDialog ( 
//				null, r.getString("company_name")+" " + r.getString("total_time")); 

		}
	}
	
	public static void insert() throws Exception{

//				String nam = JOptionPane.showInputDialog(
//		                "Please Enter Your Name");
//			System.out.println(nam);
//
//						String plac = JOptionPane.showInputDialog(
//				                null, "Please Enter Your place");
//			
		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		JTextField field3 = new JTextField();
		JTextField field4 = new JTextField();
		JTextField field5 = new JTextField();
		Object[] message = {
			    "Insert Company Name :", field1,
			    "Insert Date :", field5,
			    "Insart Start Time:", field2,
			    "Insart End Time:", field3,
			    "Total Time :", field4,
		};
		int option = JOptionPane.showConfirmDialog(null, message, "Enter all your values", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION)
		{
		    String companyName = field1.getText();
		    String date =  field5.getText();
		    int startTime = Integer.parseInt(field2.getText());
		    int endTime = Integer.parseInt(field3.getText());
		    int totalTime = Integer.parseInt(field4.getText());
		try {
		Connection conn = getConnection();
		PreparedStatement insert = conn.prepareStatement("INSERT INTO testarif.test (company_name, date, start_time, end_time, total_time) "
				+ "VALUES ('"+companyName+"','"+date+"', '"+startTime+"', '"+endTime+"', '"+totalTime+"')");
		insert.executeUpdate();
	} catch(Exception e)
		{
			//System.out.println(e);
		}
	finally 
	{
		System.out.println("Inserted");}
		}
	
	}
	
	public static Connection getConnection() throws Exception{
		
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false";
			String username = "root";
			String password = "root";
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return con;
		} catch(Exception e) { System.out.println(e);}
		return null;
		
	}

}


