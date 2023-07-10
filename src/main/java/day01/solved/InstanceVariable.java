package day01.solved;

public class InstanceVariable {
	// Declare an instance variable
	public int instanceVariable;
	public static void main(String[] args) {
		// Create an object of MyClass
		InstanceVariable myObject = new InstanceVariable();
		// Access the instance variable using the object reference
		myObject.instanceVariable = 5;
		System.out.println(myObject.instanceVariable);
	}
}
