package lab.workshop.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {

	public static void main(String[] args) {
		Connection con = null;
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String pwd="oracle";
		PreparedStatement stat = null;
		String sql = "insert into dept (deptno, dname, loc) values (?,?,?) ";
		Scanner input = new Scanner(System.in);
		try{
		       Class.forName("oracle.jdbc.OracleDriver") ;		       
		       con = DriverManager.getConnection(url, user, pwd);
		       stat = con.prepareStatement(sql);
		       System.out.print ("> 부서번호 :");
		       int deptno = Integer.parseInt(input.nextLine());
		       System.out.print ("> 부서이름 :");
		       String dname =  input.nextLine();
		       System.out.print ("> 부서위치 :");
		       String loc = input.nextLine();
		       stat.setInt(1, deptno);
		       stat.setString(2, dname);
		       stat.setString(3, loc);
		       int rows = stat.executeUpdate();
		       if(rows>0) {
		    	   System.out.println("insert completed");
		       }
		       
		     }catch(ClassNotFoundException e) {
		            e.printStackTrace();
		     }catch(SQLException e) {
	            e.printStackTrace();
	         }finally {
	        	try {	        	  
	        	    if(stat!=null) stat.close();
	        	     if(con!=null) con.close();
	        	}catch(Exception e) {
	        		
	        	}
	         }

	}

}




