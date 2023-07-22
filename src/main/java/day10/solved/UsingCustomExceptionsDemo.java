package day10.solved;
class ValidationException extends Exception {
	
	private static final long serialVersionUID = -8105491977357554060L;

	public ValidationException(String msg) {
		super(msg);
	}

	public ValidationException(Throwable te) {
		super(te);
	}

	public ValidationException(String msg, Throwable te) {
		super(msg, te);
	}
}

class Task {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class TaskValidator {
	public static boolean validate(Task task) throws ValidationException {
		if (task == null)
			throw new ValidationException("Task is null");
		else if (task.getName() == null || "".equals(task.getName()))
			throw new ValidationException("Task name is empty");
			return true;
	}
}


public class UsingCustomExceptionsDemo {
	public static void main(String[] args) {
		Task task = new Task();
//		task.setName("Creating test case"); 
		try {
			TaskValidator.validate(task);
			
		} catch (ValidationException e) {
			e.printStackTrace();
		}
	}

}