package day07.practice;



public class Task {
	private String name;
    private String deadline;

    public Task(String name, String deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return name.equals(task.name) && deadline.equals(task.deadline);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + deadline.hashCode();
    }

}
