package day06.practice;
import java.util.*;


public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		System.out.println(cityList.toString()); 
		 Set<String> s = new LinkedHashSet<String>(cityList);  
	        System.out.println(s);  

	}

}
