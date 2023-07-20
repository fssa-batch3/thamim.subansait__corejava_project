package day09.pratice;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class Task implements Comparable<Task>{
	private int id;
	private String name;
	private LocalDate deadLine;
	
	public Task(int id, String name, String deadLine) {
		
		this.id = id;
		this.name = name;
		
		try {
            this.deadLine = LocalDate.parse(deadLine);
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid deadline format. Please use the format 'YYYY-MM-DD'");
        }
	}
	
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDeadline() {
		return deadLine;
	}
	
	@Override
	public int compareTo(Task t) {
//
//		if (deadLine == t.getDeadline()) {
//			return 0;
//		} else {
//			if (this.deadLine.compareTo(t.getDeadline())) {
//				return 1;
//			} else {
//				return -1;
//			}
//			// return ( this.balance > o.getBalance()) ? 1: -1;
//		}
		
		return this.deadLine.compareTo(t.getDeadline());
	}
	@Override
	public String toString() {
		return "Task [Id=" + id + ", Task name=" + name + ", DeadLine=" + deadLine + "]";
	}
}
