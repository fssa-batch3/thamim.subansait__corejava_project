package day05.solved;

public class HasARelDemo {
	public static void main(String[] args) {
		// We need make the engine before making a car
		Engine engine1 = new Engine("1000cc");

		// Creating a maruti car
		Car marutiCar = new Car("Maruti", engine1);

		marutiCar.printCarDetails();

		// We need make the engine before making a car
		Engine engine2 = new Engine("1500cc");

		// Creating a benz car
		Car benz = new Car("Mercedes Benz", engine2);

		benz.printCarDetails();

	}

}
