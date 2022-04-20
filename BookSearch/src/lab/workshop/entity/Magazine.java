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
		return  String.format("[제목]%1$-20s[분류]%2$-20s[가격]%3$-20s[비고]%1$-20s " ,getTitle(), category ,getPrice(),description);
		
	}

}
