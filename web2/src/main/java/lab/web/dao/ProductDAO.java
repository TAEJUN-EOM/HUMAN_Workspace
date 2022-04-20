package lab.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import lab.web.vo.ProductVO;

public class ProductDAO {
	public Connection dbConnect() {
		Connection con = null;
		try {
			// WAS 의 디렉토리 네이밍 컨텍스트를 사용하기 위한 객체 생성
			Context initCtx = new InitialContext();
			// 톰캣의 디렉토리 네이밍 컨텍스트를 Access할 수 있는 Context객체를 받아옴
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			// 톰캣의 디렉토리 네이밍 컨텍스트에 등록된 DataSource 객체를 받아옴( pool에서 꺼내옴)
			DataSource ds = (DataSource) envCtx.lookup("jdbc/oracle");
			// DB 연결
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public void dbClose(Connection con, Statement stat, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (stat != null)
				stat.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<ProductVO>  getPRoductList( ){
		  //전체 상품조회, ArrayList에 담아서 리턴
		  List<ProductVO> plists = new ArrayList<ProductVO>();
		  Connection con = null;
		  	PreparedStatement stat = null;
		  	ResultSet rs = null;
		  	String sql = "select * from  product" ;
		  	try {
			    con = dbConnect();
			    stat = con.prepareStatement(sql);
			    rs =stat.executeQuery();	    
			    while(rs.next()) {
			    	ProductVO vo = new ProductVO();
			    	vo.setPid(rs.getString("pid"));
			    	vo.setPname(rs.getString("pname"));
			    	vo.setPrice(rs.getInt("price"));
			    	vo.setQty(rs.getInt("qty")); 
			    	vo.setPimg(rs.getString("pimg"));
			    	plists.add(vo);
			    }
		  	}catch(Exception  e) {
				e.printStackTrace();
			}finally {
				dbClose(con, stat, rs );
			}
		return plists;  
	  }

	public ProductVO getProduct(String pid) {
		// 상품id로 조회 상품1개를 ProductVO 저장 리턴
		ProductVO product = null;
		 Connection con = null;
		  	PreparedStatement stat = null;
		  	ResultSet rs = null;
		  	String sql = "select * from  product where pid=?" ;
		  	try {
			    con = dbConnect();
			    stat = con.prepareStatement(sql);
			    stat.setString(1, pid);
			    rs =stat.executeQuery();	    
			    while(rs.next()) {
			    	product = new ProductVO();
			    	product.setPid(rs.getString("pid"));
			    	product.setPname(rs.getString("pname"));
			    	product.setPrice(rs.getInt("price"));
			    	product.setQty(rs.getInt("qty")); 
			    	product.setPimg(rs.getString("pimg"));			    	 
			    }
		  	}catch(Exception  e) {
				e.printStackTrace();
			}finally {
				dbClose(con, stat, rs );
			}
		  	return product;
	}

}
