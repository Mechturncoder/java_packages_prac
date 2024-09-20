package day09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarStreams {
	public static List<Car> initializeCarData(){
		
		List<Car> cars = new ArrayList<>();
		TreeSet<String> color1 = new TreeSet<>();
		color1.add("Black");
		Car a1 = new Car(101, 10000, "abc", "Thar", 2020, color1);
		
		TreeSet<String> color2 = new TreeSet<>();
		color2.add("Red");
		Car a2 = new Car(102, 20000, "def", "dzire", 2004, color2);
		
		TreeSet<String> color3 = new TreeSet<>();
		color3.add("White");
		Car a3 = new Car(103, 60000, "ghi", "fortuner", 2002, color3);
		
		TreeSet<String> color4 = new TreeSet<>();
		color4.add("Black");
		Car a4 = new Car(104, 70000, "jkl", "Thar", 2005, color4);
		
		cars.add(a1);
		cars.add(a2);
		cars.add(a3);
		cars.add(a4);
		return cars;
		
		
	}
	public static void main(String[] args) {
		List<Car> cars = initializeCarData();
		Stream<Car> s = cars.stream();
		System.out.println("1. stock and specific model and color");
		s.filter((c) -> c.getColors().contains("Black") && c.getModel().contains("Thar")).forEach(System.out::println);
		
		s = cars.stream();
		System.out.println("2. Group by model");
		s.filter((arts) -> arts.getModel().contains("fortuner")).forEach(System.out::println);
		
		s = cars.stream();
		System.out.println("3. Count by model");
		Map<String, Integer> countbymodel = s.collect(Collectors.groupingBy(Car::getModel ,Collectors.summingInt((i) -> 1)));
		countbymodel.forEach((k,v) -> System.out.println("Car : " + k + " Total model :" + v));
		
		s = cars.stream();
		System.out.println("4. Sorting by ascending prices");
		Comparator<Car> artData = Comparator.comparing(Car::getPrice);
		s.sorted(artData).collect(Collectors.toList()).forEach(System.out::println);
		
		s = cars.stream();
		System.out.println("5. List of cars manufactured before 2020");
		List<Car> list = s.filter((arts) -> arts.getMan_year()<2020).collect(Collectors.toList());
		System.out.println(list);
		
		s = cars.stream();
		System.out.println("6. Most expensive and Least expensive car");
		OptionalInt maxprice = s.mapToInt(Car::getPrice).max();
		System.out.println(maxprice.getAsInt());
		
		s = cars.stream();
		OptionalInt minprice = s.mapToInt(Car::getPrice).min();
		System.out.println(minprice.getAsInt());
	}

}
