package day07.solved;
import java.util.ArrayList;
import java.util.HashSet;

public class HashCodeEqualsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Employee emp1 = new Employee(23);
        Employee emp2 = new Employee(23);
 
        System.out.println("emp1.equals(emp2)--->>>" + emp1.hashCode());
        System.out.println("emp1.equals(emp2)--->>>" + emp2.hashCode());
        System.out.println("emp1.equals(emp2)--->>>" + emp1.equals(emp2));
 
        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(emp1);
        empList.add(emp2);
        System.out.println("ArrayList size:" + empList.size());
 
        HashSet<Employee> setOfEmps = new HashSet<>();
        setOfEmps.add(emp1);
        setOfEmps.add(emp2);
 
        for (Employee emp : setOfEmps) {
            System.out.println(emp);
        }
 
        System.out.println("HashSet size:" + setOfEmps.size());
 
	}

}