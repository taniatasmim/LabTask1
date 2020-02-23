package book;

public class Home {

	public static void main(String[] args) {
		Book b1 = new Book("Java The Complete Refference", "Harvert Scheild", "18-36752-1", "Thrilar", 13);
		b1.showInfo();
		Book.showTotalBookInfo();
	}

}
