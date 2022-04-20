package lab.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import lab.web.vo.MemberVO;

public class UserManageDAO {
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
  
  public MemberVO loginProc(String userid, String userpwd) {
	MemberVO user = null;
	Connection con = null;
  	PreparedStatement stat = null;
  	ResultSet rs = null;
  	String sql = "select * from members where userid=? and userpwd=?";
  	try {
	    con = dbConnect();
	    stat = con.prepareStatement(sql);
	    stat.setString(1, userid);
	    stat.setString(2, userpwd);
	    rs =stat.executeQuery();	    
	    while(rs.next()) {
	    	user = new MemberVO();
	    	user.setAddress(rs.getString("address"));
	    	user.setUserid(rs.getString("userid"));
	    	user.setEmail(rs.getString("email"));
	    	user.setPhone(rs.getString("phone"));
	    	user.setUsername(rs.getString("username"));
	    	user.setGender(rs.getString("gender"));
	    	user.setP_lang(rs.getString("p_lang"));
	    }
  	}catch(Exception  e) {
		e.printStackTrace();
	}finally {
		dbClose(con, stat, rs );
	}
  	return user;
  }
  
  public MemberVO getUserInfo(String userid ) {
		MemberVO user = null;
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
		    	user = new MemberVO();
		    	user.setAddress(rs.getString("address"));
		    	user.setUserid(rs.getString("userid"));
		    	user.setEmail(rs.getString("email"));
		    	user.setUserpwd(rs.getString("userpwd"));
		    	user.setPhone(rs.getString("phone"));
		    	user.setUsername(rs.getString("username"));
		    	user.setGender(rs.getString("gender"));
		    	user.setP_lang(rs.getString("p_lang"));
		    }
	  	}catch(Exception  e) {
			e.printStackTrace();
		}finally {
			dbClose(con, stat, rs );
		}
	  	return user;
	  }
  
    public int updateUser(MemberVO vo) {
    	int rows = 0;   
    	Connection con = null;
	  	PreparedStatement stat = null;	  	
	  	String sql = "update members set userpwd=? , username=?, email=? , phone=?, address=?, p_lang=? where userid=?";
	  	try {
		    con = dbConnect();
		    stat = con.prepareStatement(sql);
		    stat.setString(1, vo.getUserpwd( ));
		    stat.setString(2, vo.getUsername( ));
		    stat.setString(3, vo.getEmail( ));
		    stat.setString(4, vo.getPhone( ));
		    stat.setString(5, vo.getAddress( ));
		    stat.setString(6, vo.getP_lang( ));
		    stat.setString(7, vo.getUserid( ));
		    rows = stat.executeUpdate();		    
	  	}catch(Exception  e) {
			e.printStackTrace();
		}finally {
			dbClose(con, stat, null );
		}
	  	return rows;
		    
    }
}
