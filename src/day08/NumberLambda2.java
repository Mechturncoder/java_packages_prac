package day08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberLambda2 {
	
	public static String operateOnString(StringInterface filter, String s) {
		return filter.apply(s);
	}
	
	
	public static String revString(String s) {
		String re = "";
		for (int i = s.length()-1; i>=0; i--) {
			re += s.charAt(i);
		}
		return re;
	}
	
	
	
	public static boolean operateOnNumber(NumberFilter filter , int n)
	{
		return filter.test(n);
	}
	
	public static ArrayList<Integer> operateOnNumber(NumberFilter filter , List<Integer> lst)
	{
		ArrayList<Integer> filtered = new ArrayList<>();
		for(Integer n : lst)
		{
			if(filter.test(n))
			{
				filtered.add(n);
			}
		}
		return filtered;
	}
	public static boolean isPrime(int n) {
		for (int i = 2; i<n; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String result1 = operateOnString( NumberLambda2 :: revString, "qwerty");
		System.out.println(result1);
		
		boolean result = operateOnNumber(NumberLambda2:: isPrime, 11);
		System.out.println(result);
		
		boolean isMultipleOf5 = operateOnNumber((n) -> n%5==0, 100);
		System.out.println(isMultipleOf5);
		
		Integer [] arr = {113,50,145,22,58,85,125,475,21};
		List<Integer> mylist = Arrays.asList(arr);
		
		List<Integer> multiplesOfFive = operateOnNumber((n) -> n%5==0, mylist);
		System.out.println(multiplesOfFive);
		
	}
}
