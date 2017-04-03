
public class NewBook {

	private String ISBN;
	private String Author;
	private String Title;
	private double price;
	
	
public NewBook(String ISBN, String Author, String Title, double price) {
	
	this.ISBN = ISBN;
	this.Author = Author;
	this.Title = Title;
	this.price = price;	
	
}

public String getMake() {
	return ISBN;
}

public void setMake(String ISBN) {
	this.ISBN = ISBN;
}

public String getModel() {
	return Author;
}

public void setModel(String model) {
	this.Author = model;
}

public String getTitle() {
	return Title;
}

public void setTitle(String Title) {
	this.Title = Title;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}





}
