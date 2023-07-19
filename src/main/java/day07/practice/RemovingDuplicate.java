package day07.practice;
import java.util.*;

public class RemovingDuplicate {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(2);
		arr.add(5);
		arr.add(4);
		arr.add(2);
		
		HashSet<Integer> unique = new HashSet<>();
		unique.addAll(arr);
		
		for(int a : unique) {
			System.out.println(a);
		}
	}

}
