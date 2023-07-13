package day04.solved;

public class Animal2 {
	private int age;
	private String name;
	
	public Animal2(String name) {
		System.out.println("Calling Parent Constructor");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}