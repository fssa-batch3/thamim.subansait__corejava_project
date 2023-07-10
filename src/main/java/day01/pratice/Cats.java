package day01.pratice;

public class Cats {
	
	private int age;
	private String color;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void speaks() {
		 System.out.print("Meow!"+"\n");
	}
	
	 public static void main(String[] args) {
		 
		 Cats cat1 = new Cats();
		 cat1.setAge(10);
		 cat1.setColor("orange");
		 System.out.println("Cat 1:");
		 System.out.println("Age: "+ cat1.getAge());
		 System.out.println("Color: "+ cat1.getColor());
		 System.out.print("Speaks: ");
		 
		 cat1.speaks();
		 
		 Cats cat2 = new Cats();
		 cat2.setAge(100);
		 cat2.setColor("White");
		 System.out.println("Cat 2:");
		 System.out.println("Age: "+ cat2.getAge());
		 System.out.println("Color: "+ cat2.getColor());
		 System.out.print("Speaks: ");
		 cat2.speaks();
		 
		 
	 }
	
	
}
