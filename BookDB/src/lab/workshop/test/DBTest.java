package lab.workshop.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) {
		Connection con = null;
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String pwd="oracle";
		Statement stat = null;
		String sql = "select * from dept ";
		ResultSet rs = null;
		try{
		       Class.forName("oracle.jdbc.OracleDriver") ;
		       System.out.println("driver loaded");
		       con = DriverManager.getConnection(url, user, pwd);
		       System.out.println("DB connected");
		       stat = con.createStatement();
		       rs = stat.executeQuery(sql);
		       while(rs.next()) {
//		    	   System.out.print (rs.getInt("deptno")+" ");
//		    	   System.out.print (rs.getString("dname")+" ");
//		    	   System.out.println (rs.getString("loc")+" ");
		    	   System.out.print (rs.getInt(1)+" ");
		    	   System.out.print (rs.getString(2)+" ");
		    	   System.out.println (rs.getString(3)+" ");
		       }
		       
		     }catch(ClassNotFoundException e) {
		            e.printStackTrace();
		     }catch(SQLException e) {
	            e.printStackTrace();
	         }finally {
	        	try {
	        	    if(rs!=null) rs.close();
	        	    if(stat!=null) stat.close();
	        	     if(con!=null) con.close();
	        	}catch(Exception e) {
	        		
	        	}
	         }

	}

}




