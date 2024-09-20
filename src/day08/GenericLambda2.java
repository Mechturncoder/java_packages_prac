package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericLambda2 {
	
	public static <T> T genericOperation(Function<T> op, T data) // A method return in a non generic class that operates on a generic data is a generic method
																 // All methods in a generic class are generic by default
	{
		return op.apply(data);
	}
	
	public static <T> ArrayList<T> genericOperation(Function<T> func, List<T> lst)
	{
		ArrayList<T> mapped = new ArrayList<T>();
		for( T item : lst) {
			mapped.add(func.apply(item));
		}
		return mapped;
	}
	
	public static String revString(String s) {
		String re = "";
		for (int i = s.length()-1; i>=0; i--) {
			re += s.charAt(i);
		}
		return re;
	}

	public static void main(String[] args) {
		
		String result1 = genericOperation( GenericLambda2 :: revString, "qwerty");
		System.out.println(result1);
		// TODO Auto-generated method stub
//		int x = genericOperation((n) -> n*n, 14);
//		System.out.println(x);
//		
//		String str = genericOperation((s) -> s.toUpperCase(), "hello");
//		System.out.println(str);
//		
//		Integer [] arr = {113,50,145,22,58,85,125,475,21};
//		List<Integer> mylist = Arrays.asList(arr);
//		
//		List<Integer> cubes = genericOperation((Integer n) -> n*n*n, mylist);
//		System.out.println(cubes);
//		
		
	}

}
