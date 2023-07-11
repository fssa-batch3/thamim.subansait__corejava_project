package day02.Solved;

public class App {
	
	public static void main(String [] args) {

	Person person = new Person();
	person.setName("John");
	String name = person.getName();
	System.out.println(name);
	
	Calculator calc = new Calculator();
	System.out.println(calc.add(2, 3));           // Output: 5
	System.out.println(calc.add(2.5, 3.7));       // Output: 6.2
	System.out.println(calc.add("Hello", "World"));
	
	
	
	
	
	}
	
	

}
