package lab.workshop.entity;

public class Magazine extends Book {
	private String category;
	private String description;

	public Magazine(String title, int price, String category, String description) {
		super(title, price);
		this.category = category;
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return  String.format("[����]%1$-20s[�з�]%2$-20s[����]%3$-20s[���]%1$-20s " ,getTitle(), category ,getPrice(),description);
		
	}

}
