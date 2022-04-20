package lab.workshop.entity;

public class Book {
	private String title;
	private int price;
	private String category;
	private String description;
	private String author;
	private String gubun;
	public Book() {
		super();
	}	
	 
	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		String str = null;
		if (category==null) {
			str = String.format("[제목]%1$-20s[저자]%2$-20s[가격]%3$-20s " ,getTitle(), author ,getPrice());
		}else {
			str =String.format("[제목]%1$-20s[분류]%2$-20s[가격]%3$-10s[비고]%4$-20s " ,getTitle(), category ,getPrice(),description);
		}
		return str;
	}
     
	 
}
