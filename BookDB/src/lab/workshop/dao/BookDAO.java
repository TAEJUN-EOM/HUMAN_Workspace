package lab.workshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import lab.workshop.entity.Book;

public class BookDAO {
	
	public Connection dbCon() {
		Connection con = null;
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String pwd="oracle";		 
		try{
		       Class.forName("oracle.jdbc.OracleDriver") ;		       
		       con = DriverManager.getConnection(url, user, pwd);
		}catch(Exception e) {
            e.printStackTrace();
		}
		return con;
	}
	public void dbClose(Connection con, Statement stat, ResultSet rs ) {
		try {
    	    if(rs!=null) rs.close();
    	    if(stat!=null) stat.close();
    	     if(con!=null) con.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}		
	}
	
	public ArrayList<Book> getAllBooks() {		 
		Connection con = null;
		Statement stat = null;
		String sql = "select * from book";
		ResultSet rs = null;
		ArrayList<Book> books = new ArrayList<Book>();
		try {
			con = dbCon();
			stat = con.createStatement();
			rs = stat.executeQuery(sql);
			while(rs.next()) {
				Book b = new Book();
				b.setAuthor(rs.getString("author"));
				b.setTitle(rs.getString("title"));
				b.setCategory(rs.getString("category"));
				b.setDescription(rs.getString("description"));
				b.setPrice(rs.getInt("price"));
				books.add(b);
			}
			
		}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		dbClose(con, stat, rs);
    	}
		return books;
	}

	public ArrayList<Book> getAllMagazines() {
		Connection con = null;
		Statement stat = null;
		String sql = "select * from book where category is not null ";
		ResultSet rs = null;
		ArrayList<Book> books = new ArrayList<Book>();
		try {
			con = dbCon();
			stat = con.createStatement();
			rs = stat.executeQuery(sql);
			while(rs.next()) {
				Book b = new Book();
				b.setAuthor(rs.getString("author"));
				b.setTitle(rs.getString("title"));
				b.setCategory(rs.getString("category"));
				b.setDescription(rs.getString("description"));
				b.setPrice(rs.getInt("price"));
				books.add(b);
			}
			
		}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		dbClose(con, stat, rs);
    	}
		return books;
		 
	}

	public ArrayList<Book> getAllNovels() {
		Connection con = null;
		Statement stat = null;
		String sql = "select * from book where author is not null ";
		ResultSet rs = null;
		ArrayList<Book> books = new ArrayList<Book>();
		try {
			con = dbCon();
			stat = con.createStatement();
			rs = stat.executeQuery(sql);
			while(rs.next()) {
				Book b = new Book();
				b.setAuthor(rs.getString("author"));
				b.setTitle(rs.getString("title"));
				b.setCategory(rs.getString("category"));
				b.setDescription(rs.getString("description"));
				b.setPrice(rs.getInt("price"));
				books.add(b);
			}
			
		}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		dbClose(con, stat, rs);
    	}
		return books;
	}

	 

	public ArrayList<Book> searchNovelByAuthor(String author) {
		Connection con = null;
		PreparedStatement stat = null;
		String sql = "select * from book where author like ? ";
		ResultSet rs = null;
		ArrayList<Book> books = new ArrayList<Book>();
		try {
			con = dbCon();
			stat = con.prepareStatement(sql);
			stat.setString(1, author+"%");
			rs = stat.executeQuery( );
			while(rs.next()) {
				Book b = new Book();
				b.setAuthor(rs.getString("author"));
				b.setTitle(rs.getString("title"));
				b.setCategory(rs.getString("category"));
				b.setDescription(rs.getString("description"));
				b.setPrice(rs.getInt("price"));
				books.add(b);
			}
			
		}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		dbClose(con, stat, rs);
    	}
		return books;
	}

	public ArrayList<Book> searchNovelByPrice(int minPrice, int maxPrice) {
		Connection con = null;
		PreparedStatement stat = null;
		String sql = "select * from book where price between ? and ? ";
		ResultSet rs = null;
		ArrayList<Book> books = new ArrayList<Book>();
		try {
			con = dbCon();
			stat = con.prepareStatement(sql);
			stat.setInt(1, minPrice);
			stat.setInt(2, maxPrice);
			rs = stat.executeQuery( );
			while(rs.next()) {
				Book b = new Book();
				b.setAuthor(rs.getString("author"));
				b.setTitle(rs.getString("title"));
				b.setCategory(rs.getString("category"));
				b.setDescription(rs.getString("description"));
				b.setPrice(rs.getInt("price"));
				books.add(b);
			}
			
		}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		dbClose(con, stat, rs);
    	}
		return books;
	}
	

	 
}
