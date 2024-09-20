package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamArrayPrac {
	public static void main(String[] args) {
		
		
		double [] arr = {5.5, 6.6, 3.5 ,2.2 ,12.9 ,53.55 ,50.12, 21.85, 63.5, 10, 76, 17, 24, 75.5, 12.9, 23.55};
		DoubleStream dstream = Arrays.stream(arr);
		
		System.out.println("================= Sorted Array===============");
		dstream = dstream.distinct().sorted();
		dstream.forEach(System.out::println);
		
		System.out.println("================= 10% increase===============");
		dstream = Arrays.stream(arr);
		List<Double> tenPercentIncrease = dstream.map((n) -> n*1.1).boxed().collect(Collectors.toList());
		System.out.println(tenPercentIncrease);
		
		System.out.println("=================First 10 elements===============");
		dstream = Arrays.stream(arr);
		dstream.limit(10).forEach(System.out::println);
		
		System.out.println("=================Greater than 50===============");
		dstream = Arrays.stream(arr);
		List<Double> greaterThan50 = dstream.filter((n) -> n>50).boxed().collect(Collectors.toList());
		System.out.println(greaterThan50);
		
		System.out.println("====================e===============");
		dstream = Arrays.stream(arr);
		double sum = dstream.sum();
		System.out.println("Sum of Elements : " + sum);
		
		dstream = Arrays.stream(arr);
		double maxEl = dstream.max().getAsDouble();
		System.out.println("Max element : " + maxEl);
		
		dstream = Arrays.stream(arr);
		double minEl = dstream.min().getAsDouble();
		System.out.println("Min element : " +minEl);
		
		dstream = Arrays.stream(arr);
		double avg = dstream.average().getAsDouble();
		System.out.println("Average  : " + avg);
		
	}

}
