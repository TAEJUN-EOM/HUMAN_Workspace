package lab.board.vo;

import java.sql.Date;
import java.util.Vector;

public class Board {
	private int num;
	private String title;
	private String writer;
	private String password;
	private String contents;
	private int rcount;
	private Date regdate;
	private String ip;
	private String rnum;
	private  int size;
	private int vcount;
	protected Vector<Comment>  comments;	
	
	public Board() {
		comments = new Vector<Comment>();
	}	
	
	public void addComment(Comment a) {
		comments.add(a);
	}
	
	public Vector<Comment> getComments() {
		return comments;
	}	
	
	public int getVcount() {
		return vcount;
	}

	public void setVcount(int vcount) {
		this.vcount = vcount;
	}

	
    
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getRnum() {
		return rnum;
	}

	public void setRnum(String rnum) {
		this.rnum = rnum;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getRcount() {
		return rcount;
	}

	public void setRcount(int rcount) {
		this.rcount = rcount;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", writer=" + writer + ", password=" + password
				+ ", contents=" + contents + ", rcount=" + rcount + ", regdate=" + regdate + ", ip=" + ip + "]";
	}

}
