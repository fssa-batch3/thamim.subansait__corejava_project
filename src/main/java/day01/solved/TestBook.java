package day01.solved;

/**
 * Solved Example for day 1
 * @author BharathwajSoundarara
 *
 */
class Book {
	public String title;
	public String author;
	public double price;
	
	public void printBookDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
	
	
}

public class TestBook {
	public static void main(String[] args) {
		Book book1 = new Book();
		
		book1.title = "Harry Potter";
		book1.author = "JK Rowling";
		book1.price = 400;
		System.out.println("------------Book1 Details---------");
		book1.printBookDetails();
		
		Book book2 = new Book();
		
		book2.title = "Lord of the Rings";
		book2.author = "JRR Tolkien";
		book2.price = 800;
		System.out.println("------------Book2 Details---------");
		book2.printBookDetails();
		
		
	}
	
	
} 



