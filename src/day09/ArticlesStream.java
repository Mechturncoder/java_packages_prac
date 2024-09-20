package day09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArticlesStream {
	
	public static List<Articles> initializeArticleData(){
		List<Articles> arts = new ArrayList<>();
		TreeSet<String> categ1 = new TreeSet<>();
		categ1.add("Healthcare");
		Articles a1 = new Articles(101, "Humanity", 2023, 1000, categ1);
		
		TreeSet<String> categ2 = new TreeSet<>();
		categ2.add("Covid");
		Articles a2 = new Articles(102, "hospitality", 2024, 20000, categ2);
		
		TreeSet<String> categ3 = new TreeSet<>();
		categ3.add("Children Health");
		Articles a3 = new Articles(103, "fhgj", 2023, 3000, categ3);
		
		TreeSet<String> categ4 = new TreeSet<>();
		categ4.add("Arts");
		Articles a4 = new Articles(104, "Humanity", 2023, 1000, categ4);
		
		TreeSet<String> categ5 = new TreeSet<>();
		categ5.add("sports");
		Articles a5 = new Articles(105, "hospitality", 2024, 20000, categ5);
		
		TreeSet<String> categ6 = new TreeSet<>();
		categ6.add("politics");
		Articles a6 = new Articles(106, "fhgj", 2023, 30000, categ6);
		
		arts.add(a1);
		arts.add(a2);
		arts.add(a3);
		arts.add(a4);
		arts.add(a5);
		arts.add(a6);
		
		return arts;
	}
	
	public static void main(String[] args) {
		
		List<Articles> artList = initializeArticleData();
		Stream<Articles> stream = artList.stream();
		
		System.out.println("Articles created in 2023");
		stream.filter((arts) -> arts.getYearOfPublish() == 2023).forEach(System.out::println);
		
		System.out.println("Articles by subject");
		stream = artList.stream();
		stream.filter((arts) -> arts.getSubject().contains("Humanity")).forEach(System.out::println);
		
		System.out.println("Counting Articles by subject");
		stream = artList.stream();
		Map<String, Integer> countbysub = stream.collect(Collectors.groupingBy(Articles::getSubject ,Collectors.summingInt((i) -> 1)));
		countbysub.forEach((k,v) -> System.out.println("Subject : " + k + " Total articles :" + v));
		
		System.out.println("Articles with more than 10k views");
		stream = artList.stream();
		stream.filter((arts) -> arts.getViews() > 10000).forEach(System.out::println);
		
		System.out.println("Trending  Articles");
		stream = artList.stream();
		Comparator<Articles> artData = Comparator.comparing(Articles::getViews);
		stream.limit(5).sorted(artData).collect(Collectors.toList()).reversed().forEach(System.out::println);
	}

}
