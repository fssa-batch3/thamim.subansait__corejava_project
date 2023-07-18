package day06.practice;

import java.util.*;

public class ArrayListTask {

	public boolean findTaskByName(String name, ArrayList<Task> task) {
		for (int i = 0; i < task.size(); i++) {

			if (task.get(i).taskName.equals(name)) {
				break;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		Task task1 = new Task();
		task1.taskName = "Shopping";
		task1.priority = 1;

		Task task2 = new Task();
		task2.taskName = "Music";
		task2.priority = 2;

		List<Task> task = new ArrayList<>();
		task.add(task1);
		task.add(task2);

		for (int i = 0; i < task.size(); i++) {

			System.out.println(task.get(i));
		}
		

	}

}
