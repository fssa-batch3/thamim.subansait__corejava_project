package day07.practice;

import java.util.*;

public class TestTask {

	public static void main(String[] args) {
		ArrayList<Task> taskArrayList = new ArrayList<>();

        // Add tasks to the ArrayList
        taskArrayList.add(new Task("Task1", "2023-07-25"));
        taskArrayList.add(new Task("Task2", "2023-07-20"));
        taskArrayList.add(new Task("Task1", "2023-07-25"));
        taskArrayList.add(new Task("Task3", "2023-07-28"));
        taskArrayList.add(new Task("Task2", "2023-07-20"));

        // Print the ArrayList with duplicates
        System.out.println("ArrayList with duplicates:");
        for (Task task : taskArrayList) {
            System.out.println(task.getName() + " - " + task.getDeadline());
        }

        // Use HashSet to remove duplicates
        HashSet<Task> taskHashSet = new HashSet<>(taskArrayList);
       
       

        // Print the ArrayList without duplicates
        System.out.println("\nArrayList without duplicates:");
        for (Task task : taskHashSet) {
            System.out.println(task.getName() + " - " + task.getDeadline());
        }
		
		
		
	
		
	}

}
