package day02.pratice;

public class Logger {
	public static void debug (String msg) {
		
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		System.out.println("INFO: " + msg);
	}
	
	public static void error (String msg) {
		System.out.println("ERROR: " + msg);

	}
	
	public static void debug (int num) {
		System.out.println("DEBUG: " + num);
	}
	
	// Similarly write overloaded methods for error and info.
	
	public static void info (int CountInfo) {
		System.out.println("INFO: " + CountInfo);
	}
	
	public static void error (int CountError) {
		System.out.println("ERROR: " + CountError);

	}
	
	
	
	
}