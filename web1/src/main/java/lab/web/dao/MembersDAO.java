package lab.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import lab.web.vo.UserVO;

public class MembersDAO {
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
    
    public int insertMember(UserVO vo) {
    	int rows = 0;
    	Connection con = null;
    	PreparedStatement stat = null;
    	String sql = "insert into members (userid, username, userpwd, email, "
    			+ "phone, address, gender, p_lang) values ( ?,?,?,?,?,?,?,? ) ";
    	try {
    	    con = dbConnect();
    	    stat = con.prepareStatement(sql);
    	    stat.setString(1, vo.getUserid());
    	    stat.setString(2, vo.getUsername());
    	    stat.setString(3, vo.getUserpwd());
    	    stat.setString(4, vo.getEmail());
    	    stat.setString(5, vo.getPhone());
    	    stat.setString(6, vo.getAddress());
    	    stat.setString(7, vo.getGender());
    	    stat.setString(8, vo.getP_lang());
    	    rows =stat.executeUpdate();
    	}catch(Exception  e) {
    		e.printStackTrace();
    	}finally {
    		dbClose(con, stat, null );
    	}
    	return rows;
    	
    	
    	
    	
    }
}
