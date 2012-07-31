import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestDB {
public static void main(String[] args) {

	 Connection con=null;
	try {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   System.out.println("step1 completed");
		   con=DriverManager.getConnection("jdbc:oracle:thin:@m039206:1521:orcl","system","u_pick_it");
		   System.out.println("step2 completed");
		   Statement stmt=con.createStatement();
		   System.out.println("step3 completed");
		   System.out.println(stmt);				
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				if(con!=null)
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		 

}
}
