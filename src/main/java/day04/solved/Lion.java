package day04.solved;

public class Lion extends Animal {  // extends keyword use to inherit variables and methods from Animal
	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
	}
	public static void main(String[] args) {
		Lion simba = new Lion();
		simba.setAge(10); // setAge() method was not defined in Lion; it is inherited from Animal
		simba.roar();
	}
	
}