package day03.practice;
public class App {
	public static void main(String[] args) {
		Customor cus = new Customor("naresh", 1);
		System.out.println("id=" + cus.id+"," + " " + "name=" + cus.name);
		
		Customor cus2 = new Customor("suresh", 2);
		System.out.println("id=" + cus2.id+"," + " " + "name=" + cus2.name);
	}
}