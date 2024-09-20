package day07;

import java.util.HashSet;
import java.util.Iterator;

public class DemoSet {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		
		System.out.println(set);
		
		set.remove("one");
		System.out.println(set);
		set.add("five");
		set.add("four");
		for(String item : set) {
			System.out.println(item.toUpperCase());
		}
		System.out.println("===========================");
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===============================");
		System.out.println(set.contains("four"));
	}

}
