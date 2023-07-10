package day01.solved;

public class StaticVariable {
    // Declare a static variable
    public static int staticVariable;
    public static void main(String[] args) {
        // Access the static variable using the class name
    	StaticVariable.staticVariable = 10;
        System.out.println(StaticVariable.staticVariable);
    }
}
