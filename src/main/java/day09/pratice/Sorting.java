package day09.pratice;
import java.util.*;

public class Sorting {
	public static void main(String [] args ) {
		List <Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(44);
		arr.add(10);
		arr.add(22);
		arr.add(33);
		
		
		System.out.println("ArrayList before sort:"+arr);
		
		Collections.sort(arr);
		
		System.out.println("ArrayList after sort:"+arr);
		
		
		
	}
	
	
}
