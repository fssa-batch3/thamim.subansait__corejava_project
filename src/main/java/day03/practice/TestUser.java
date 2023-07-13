package day03.practice;
public class TestUser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName("Ajun");
		user.setEmailId("ajundcruzz55@gmail.com");
		user.setPassword("ajunajun55");
		
		System.out.println("name : " + user.getName() + " email : " + user.getEmailId() + " password : " + user.getPassword());
		User user2 = new User("Sugu", "sugu23@gmail.com", "sugu12");
		System.out.println("name : " + user2.getName() + " email : " + user2.getEmailId() + " password : " + user2.getPassword());
	}
}