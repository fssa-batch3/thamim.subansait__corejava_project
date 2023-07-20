package day09.pratice;
import java.util.*;
public class SortByDeadLine {
	public static void main(String[] args) {
		
		Task task1 = new Task(3, "Coding", "2022-10-22");
		Task task2 = new Task(5, "Product Design", "2022-10-01");
		Task task3 = new Task(1, "Software Design", "2022-10-07");
		Task task4 = new Task(3, "Coding", "2022-10-22");
		
		
		List<Task> tasks = new ArrayList<>();
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		tasks.add(task4);
		
		Collections.sort(tasks);
		
//		for(Task task:tasks) {
			System.out.println(tasks);
//		}
		
	}
	
}
