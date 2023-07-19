package day08.partice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DepartmentEmployeeList {

	public static void main(String[] args) {
		HashMap<String, List<String>> departmentEmployeesMap = new HashMap<>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the comma-separated department name and employee name pairs (e.g., HR,Ram):");
		System.out.println("Type 'done' to finish input.");

		while (true) {
			System.out.print("Input: ");
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("done")) {
				break;
			}

			String[] values = input.split(",");
			if (values.length != 2) {
				System.out.println("Invalid input format. Please try again.");
				continue;
			}

			String department = values[0].trim();
			String employee = values[1].trim();

			List<String> employees = departmentEmployeesMap.getOrDefault(department, new ArrayList<>());
			employees.add(employee);
			departmentEmployeesMap.put(department, employees);
		}

		// Print department names and employees
		System.out.println("\nOutput:");
		for (String department : departmentEmployeesMap.keySet()) {
			List<String> employees = departmentEmployeesMap.get(department);

			System.out.print(department + ": ");
			for (int i = 0; i < employees.size(); i++) {
				if (i > 0) {
					System.out.print(", ");
				}
				System.out.print(employees.get(i));
			}
			System.out.println();
		}
	}

}
