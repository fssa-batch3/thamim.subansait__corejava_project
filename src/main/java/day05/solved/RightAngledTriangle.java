package day05.solved;

public class RightAngledTriangle implements Polygon  {
	@Override
	public double area(double a, double b)  {
		System.out.println("Calculating RightAngledTriangle area");
		return (0.5 * a * b);
	}

}
