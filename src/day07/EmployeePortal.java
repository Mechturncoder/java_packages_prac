package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class EmployeePortal {

	public static void main(String[] args) {
		EmployeeCollection e = new EmployeeCollection();
		List<Employee> emplist = e.initializeEmployeeData();
		// 1. print data 2. Search daa 3.Sort 4. filter
		e.printEmployeeData(emplist);
		
		System.out.println("Searchhing employee");
		Employee found = e.getEmployee(emplist, 565);
		System.out.println("Data : " + found);
		
		List<Employee> emps = new ArrayList<>();
		TreeSet<String> skills1 = new TreeSet<>();
		skills1.add("java");
		skills1.add("python");
		Employee e1 = new Employee(343, "rrr", 75000, skills1);
		
		e.addEmployee(emplist, e1);
		e.printEmployeeData(emplist);
		
		
		System.out.println("Sorting by employee id");
		Collections.sort(emplist);
		e.printEmployeeData(emplist);
		int index = Collections.binarySearch(emplist, new Employee(343, null, 0, null));
		System.out.println("Found at index : " + index);
		
		System.out.println("Sorting by name");
		Collections.sort(emplist, new NameComparator());
		e.printEmployeeData(emplist);
		index = Collections.binarySearch(emplist, new Employee(0, "ank", 0, null), new NameComparator());
		System.out.println("Found at index : " + index);
		
		System.out.println("Sorting by salary");
		Collections.sort(emplist, new SalaryComparator());
		e.printEmployeeData(emplist);
		
		System.out.println("Filter by java skill");
		ArrayList<Employee> filtered = e.filterList(emplist, "java");
		e.printEmployeeData(filtered);
		

	}

}
