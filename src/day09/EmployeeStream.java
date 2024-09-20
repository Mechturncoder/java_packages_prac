package day09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmployeeStream {
	
	public static List<Employee> initializeEmployeeData() {
		List<Employee> emps = new ArrayList<>();
		TreeSet<String> skills1 = new TreeSet<>();
		skills1.add("java");
		skills1.add("Python");
		Employee e1 = new Employee(565, "ank" ,"IT" , 70000, skills1);
		
		TreeSet<String> skills2 = new TreeSet<>();
		skills2.add("java");
		skills2.add("GoLang");
		Employee e2 = new Employee(566, "abc" ,"IT" , 80000, skills2);
		
		TreeSet<String> skills3 = new TreeSet<>();
		skills3.add("C");
		skills3.add("C++");
		Employee e3 = new Employee(567, "def" ,"IT" , 60000, skills3);
		
		TreeSet<String> skills4 = new TreeSet<>();
		skills4.add("java");
		skills4.add("GoLang");
		Employee e4 = new Employee(568, "ghi" ,"IT" , 40000, skills4);
		
		TreeSet<String> skills5 = new TreeSet<>();
		skills5.add("java");
		skills5.add("GoLang");
		Employee e5 = new Employee(568, "jkl" ,"Sales" , 55000, skills5);
		
		Employee e6 = new Employee(568, "mno" ,"IT" , 45000, skills5);
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);  
		emps.add(e5);
		emps.add(e6);
		return emps;
	
	}
	public static void main(String[] args) {
		List<Employee> emplist = initializeEmployeeData();
		Stream<Employee> stream = emplist.stream();
		
		Comparator<Employee> byname = Comparator.comparing(Employee::getName);
		System.out.println("Sorting by name");
		stream.sorted(byname).forEach(System.out::println);
		
		Comparator<Employee> deptdata = Comparator.comparing(Employee::getDepartment).thenComparing(byname);
		stream = emplist.stream();
		System.out.println("Sorting by name in department");
		stream.sorted(deptdata).forEach(System.out::println);
		
		stream = emplist.stream();
		System.out.println("Dept wise employee list");
		stream.collect(Collectors.groupingBy(Employee::getDepartment)).forEach((k,v) -> System.out.println(k + ":" + v));
		
		stream = emplist.stream();
		System.out.println("Dept wise total salary");
		Map<String, Double> salbydept = stream.collect(Collectors.groupingBy(Employee::getDepartment ,Collectors.summingDouble(Employee::getSalary)));
		salbydept.forEach((k,v) -> System.out.println("Department : " + k + " Total salary :" + v));
		
		stream = emplist.stream();
		System.out.println("After salary increment");
		stream.map((emp) -> new Employee(emp.getEmpid(), emp.getName(), emp.getDepartment(), emp.getSalary()*1.1, emp.getSkills())).forEach(System.out::println);
		
		stream = emplist.stream();
		System.out.println("Employee who know java");
		stream.filter((emp) -> emp.getSkills().contains("java")).forEach(System.out::println);
		
		stream = emplist.stream();
		System.out.println("Min, Max avg salary");
		OptionalDouble minsal = stream.mapToDouble(Employee::getSalary).min();
		System.out.println(minsal.getAsDouble());
		
		stream = emplist.stream();
		OptionalDouble maxsal = stream.mapToDouble(Employee::getSalary).max();
		System.out.println(maxsal.getAsDouble());
		
		stream = emplist.stream();
		OptionalDouble avg = stream.mapToDouble(Employee::getSalary).average();
		System.out.println(avg.getAsDouble());
	}

}
