
public class UsedBook extends NewBook {

	private String wear;
	
	public UsedBook(String ISBN, String Author, String Title, double price) {
		super(ISBN, Author, Title, price);
		
	}

	public UsedBook(String ISBN, String Author, String Title, double price, String wear) {
		super(ISBN, Author, Title, price);
		this.wear = wear;
	}
}
