package day08;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,6,3,2,12,23,10,21,23,10,7,17,24};
		IntStream istream = Arrays.stream(arr);
		
		istream = istream.distinct().sorted();
		istream.forEach(System.out::print);
		
		istream = Arrays.stream(arr);
		List<Integer> list = istream.boxed().collect(Collectors.toList());
		System.out.println(list);
		
		// Mapping the stream
		istream = Arrays.stream(arr);
		List<Integer> doubleVal = istream.map((n) -> n*2).boxed().collect(Collectors.toList());
		System.out.println(doubleVal);
		
		// Filter the stream
		istream = Arrays.stream(arr);
		List<Integer> evenNum = istream.filter((n) -> n%2==0).boxed().collect(Collectors.toList());
		System.out.println(evenNum);
		
		istream = Arrays.stream(arr);
		long totalItems = istream.count();
		System.out.println(totalItems);
		
		istream = Arrays.stream(arr);
		int minimum = istream.min().getAsInt();
		System.out.println(minimum);
		
		istream = Arrays.stream(arr);
		int maximum = istream.max().getAsInt();
		System.out.println(maximum);
		
		istream = Arrays.stream(arr);
//		double avg = istream.average().getAsDouble();
//		System.out.println(avg);
		OptionalDouble avg = istream.average();
		if(avg.isPresent())
			System.out.println(avg.getAsDouble());
		

	}

}
