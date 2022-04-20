package lab.workshop.entity;

public class Novel extends Book {
	private String author;

	public Novel(String title, int price, String author) {
		super(title, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return  String.format("[����]%1$-20s[����]%2$-20s[����]%3$-20s " ,getTitle(), author ,getPrice());
	}

}
