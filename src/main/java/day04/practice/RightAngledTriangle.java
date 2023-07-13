package day04.practice;

import day04.solved.Rectangle;

public class RightAngledTriangle extends Rectangle {
	
    public RightAngledTriangle(double base, double height) throws Exception {
        super(base, height);
    }
    public double area() {
        return super.calculateArea() / 2;
    }
    public double perimeter() {
        double hypotenuse = Math.sqrt(Math.pow(length, 2) + Math.pow(breadth, 2));
        return super.perimeter() + hypotenuse;
    }
}
