package day06.solved;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Frequency {

	public static void main(String[] args) {
		Collection<String> list = new ArrayList<>();
		list.add("cse");
		list.add("cse");
		list.add("eee");
		int cnt = Collections.frequency(list, "cse");
		System.out.println(cnt);

	}

}
