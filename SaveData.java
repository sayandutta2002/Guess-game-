package jdbcApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class SaveData {
	public static void SavedataInfo(int id,String name,String sgn,String uen,int score,Timestamp standardtime) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","6296");
		PreparedStatement ps = con.prepareStatement("insert into game (id,name,sgn,uen,score,standardtime) values(?,?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, sgn);
		ps.setString(4, uen);
		ps.setInt(5, score);
		ps.setTimestamp(6, standardtime);
		ps.execute();
		System.out.println("Thank you");
			}
}
