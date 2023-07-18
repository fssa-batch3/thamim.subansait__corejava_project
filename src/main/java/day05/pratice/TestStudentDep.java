package day05.pratice;

public class TestStudentDep {

	public static void main(String[] args) {

		Department dept = new Department("astroPhysics", 69);
		
		Student std = new Student("tommy", 6969, dept);
		System.out.print(std.toString());

	}

}
