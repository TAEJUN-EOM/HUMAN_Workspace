package lab.web.ajax;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class LoginDAO {
	public Connection dbConnect() {
		Connection con = null; 
	  	try{
	  		//WAS 의 디렉토리 네이밍 컨텍스트를 사용하기 위한 객체 생성
	  		Context initCtx = new InitialContext();
	  		//톰캣의 디렉토리 네이밍 컨텍스트를 Access할 수 있는 Context객체를 받아옴
	  		Context envCtx = (Context) initCtx.lookup("java:comp/env");
	  		//톰캣의 디렉토리 네이밍 컨텍스트에 등록된 DataSource 객체를 받아옴( pool에서 꺼내옴)
	  		DataSource ds = (DataSource) envCtx.lookup("jdbc/oracle");
	  		//DB 연결
	  		con= ds.getConnection();
	  	}catch(Exception  e) {
	  		e.printStackTrace();
	  	}
	  	return con;
	  }
	  public void dbClose(Connection con, Statement stat, ResultSet rs) {
		  try{
	  		if (rs!=null) rs.close();
	  		if (stat!=null) stat.close();
	  		if (con!=null) con.close();
	  	}catch(Exception  e) {
	  		e.printStackTrace();
	  	}
	  }
	  
	  public int loginProc(String userid, String userpwd) {
		int success = 3;
		Connection con = null;
	  	PreparedStatement stat = null;
	  	ResultSet rs = null;
	  	String sql = "select * from members where userid=? ";
	  	try {
		    con = dbConnect();
		    stat = con.prepareStatement(sql);
		    stat.setString(1, userid);		    
		    rs =stat.executeQuery();	    
		    while(rs.next()) {
		    	String pwd = rs.getString("userpwd");
		    	if(userpwd.equals(pwd)) {
		    		success = 1;
		    	}else {
		    		success = 2;
		    	}		    	
		    }
	  	}catch(Exception  e) {
			e.printStackTrace();
		}finally {
			dbClose(con, stat, rs );
		}
	  	System.out.println(success);
	  	return success;
	  }
	  
}
