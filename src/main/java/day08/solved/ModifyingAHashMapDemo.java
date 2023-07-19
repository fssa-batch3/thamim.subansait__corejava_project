package day08.solved;
import java.util.HashMap;

public class ModifyingAHashMapDemo {
	public static void main(String[] args) {

		// Task: store department name and no of employees working in the department
		HashMap<String, Integer> deptMap = new HashMap<String, Integer>();
		deptMap.put("HR", 5);
		deptMap.put("ADMIN", 10);
		deptMap.put("DEVELOPERS", 300);


		// Modifying a particular count
		int hrCount = deptMap.get("HR");// get
		hrCount += 1; // modify
		deptMap.put("HR", hrCount); // reassign to the key

		// Iterate
		for (String deptName : deptMap.keySet()) {

			Integer count = deptMap.get(deptName);
			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}
	}
}
