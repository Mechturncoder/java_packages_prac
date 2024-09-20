package day03;

public class Payroll {
	
	public void displayTax(TaxPayer payer) {
		System.out.println("Tax for the current month :" + payer.calculateTax()) ;
	}
	
	public void displayGross(Employee e) {   // Polymorphic Arguments (Employee e)
		System.out.println(e);
		System.out.println("Gross Salary for the month : " + e.calculateGross());
	}
	
	public void displayNet(SalariedEmployee e) {
		System.out.println(e);
		System.out.println("net Salary for the month : " + e.calculateNet());
	}
	
	
	
	public static void main(String[] args) {
		
		Payroll payroll = new Payroll();
		SalariedEmployee se = new SalariedEmployee(351, "ankit", 80000);
		Manager m = new Manager(123,"abcde", 60000,10000);
		
		payroll.displayGross(se);  // Upcasting is done automatically
		payroll.displayGross(m);
		
		//However the Downcasting is not done automatically
		
		Employee [] emps = new Employee[3];
		emps[0] = new SalariedEmployee(301,"absb",50000);
		emps[1] = new Manager(302,"ddfg",50000,10000);
		emps[2] = new SalesManager(303,"dfgfdg",60000,25,1000);
		
		for(Employee e : emps) {
			payroll.displayGross(e);
		}
		
		SalariedEmployee [] semps = new SalariedEmployee[3];
		semps[0] = new SalariedEmployee(301,"absb",50000);
		semps[1] = new Manager(302,"ddfg",50000,10000);
		semps[2] = new SalesManager(303,"dfgfdg",60000,25,1000);
		
		for(SalariedEmployee semp : semps) {
			payroll.displayNet(semp);
			if(semp instanceof SalesManager) {		// instanceof in java is also known as type comparison operator because it compares the instance with type.
				SalesManager ss = (SalesManager)semp ;
				ss.showIncentive();
			}
		}
		// down casting is required to invoke methods present in subclass but not present in super class


//		SalesManager ss = (SalesManager)semps[2] ;
//		ss.showIncentive();
	}
}
