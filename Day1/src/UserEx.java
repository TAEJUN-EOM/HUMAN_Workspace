class User {
	private String socialId;
	private String name;
	private int age;
	private boolean gender;
	public User() {
		
	}
	public User(String socialId, String name) { //overload
		this.socialId = socialId;
		this.name = name;
	}
}
public class UserEx {

	public static void main(String[] args) {
		User  u = new User();
		User  u2 = new User("100", "korea");
	}

}
