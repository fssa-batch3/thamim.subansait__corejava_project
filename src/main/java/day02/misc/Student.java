package day02.misc;

public class Student {
	
	private String name;
	private int id;
	private String emial;
	public static String academy;
	static int count=0;
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String newEmial) {
		emial = newEmial;
	}
	
	Student(){
		Student.count = count + 1;
	}
		
	
	static {
		
		Academy academy1 = new Academy();
		
		academy=academy1.getCode();
	}
	
	
	
	
	
	
	
}
