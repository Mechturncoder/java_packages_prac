package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CRUDOperations {
	
	public static void listRecords(Connection con) {
		String sql = "select * from students;";
		try {
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet re = st.executeQuery(sql);
			int count = 0;
			while (re.next()) {
				int rollNo = re.getInt(1);
				String firstName = re.getString(2);
				String lastName = re.getString(3);
				int depid = re.getInt(4);
				int marks = re.getInt(5);
				
				String output = "Student #%d: rollNo: %d - FirstName: %s - LastName: %s - Dep Id: %d - Marks: %d";
				System.out.println(String.format(output, ++count, rollNo, firstName, lastName, depid, marks));
			}
//			System.out.println(count + " row(s) affected");
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
	
	
	public static void insertRecord(Connection con, int rollNo, String firstName, String lastName, int depid, int marks) {
		String insertrecord = "insert into students values (?, ?, ?, ?, ?);";
		try {
			PreparedStatement pst = con.prepareStatement(insertrecord);
			pst.setInt(1, rollNo);
			pst.setString(2, firstName);
			pst.setString(3, lastName);
			pst.setInt(4, depid);
			pst.setInt(5, marks);
			
			int count = pst.executeUpdate();
			System.out.println(count + " row(s) affected");
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
	public static void updateRecord(Connection con, int rollNo, String firstName, String lastName, int depid, int marks) {
		String updaterecord = "update students set firstname=? where rollNo=?;";
		try {
			PreparedStatement pst = con.prepareStatement(updaterecord);
			pst.setString(1, firstName);
			pst.setInt(2, rollNo);
			
			int count = pst.executeUpdate();
			System.out.println(count + " row(s) affected");
			listRecords(con);

			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/mycollege";
		
		try {
			con = DriverManager.getConnection(url, "root", "root");
			
//			insertRecord(con, 14, "Annaya", "N", 2, 83);
//			listRecords(con);
			updateRecord(con, 11, "Dung", "N", 2, 83);
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
