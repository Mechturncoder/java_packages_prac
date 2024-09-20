package day08;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import day07.Employee;

public class DemoGenericFunction {
	
	public static <T> T genericOperation(Function<T> op, T data)
	{
		return op.apply(data);
	}
	
	public static void main(String[] args) {
		Function<Integer> square = (n) -> n*n;
		System.out.println(square.apply(14));
		
		Function<String> substring = (str) -> str.substring(5);
		System.out.println(substring.apply("this is labda function imp"));
		
		Function<Employee> incrementedsal = (emp) -> new Employee(emp.getEmpid(), emp.getName(), emp.getSalary()+5000, emp.getSkills());
		
		TreeSet<String> skills1 = new TreeSet<>();
		skills1.add("java");
		skills1.add("python");
		Employee e = incrementedsal.apply(new Employee(123, "aaa", 50000, skills1));
		System.out.println(e);
		
		//generic operation
		
		int n = genericOperation(square, 14);
		System.out.println(n);
		Employee a = genericOperation(incrementedsal, e);
		System.out.println(a);
		
	}
}
