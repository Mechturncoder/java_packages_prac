package day06;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		
		List lst = new ArrayList<>();
		lst.add(100);
		lst.add("test");
		lst.add(12.5f);
		lst.add(true);
		
		System.out.println(lst);
		System.out.println(lst.get(1));
		
		lst.add(100);
		System.out.println(lst);
		
		lst.remove(3);
		System.out.println(lst);
		
		System.out.println("=====================================");
		
		System.out.println("looping");
		
		for(int i = 0 ; i<lst.size()  ; i++) {
			System.out.println(lst.get(i));
		}
		
		System.out.println("=====================================");
		
		for(Object o : lst) {
			System.out.println(o);
		}
		System.out.println("=====================================");
		
		Iterator it = lst.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		String val = (String) lst.get(1); // class cast exception
		System.out.println(val);
	}

}
