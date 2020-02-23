package contact;

public class Home {
	public static void main(String[] args) {
		Contact c1 = new Contact("TURNY TANIA TASNIM", "18-36752-1", 21, "01756894320", 'F');
		c1.showPersonInfo();
		c1.detectMobileOperator();
	}
}
