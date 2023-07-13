package day04.misc;

public class Rectangle {
    protected double length;
    protected double breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public double calculateArea() {
        return length * breadth;
    }
}
class Square extends Rectangle {
	
    public Square(double side) {
        super(side, side);
    }
}

