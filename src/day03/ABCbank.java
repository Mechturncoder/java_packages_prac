package day03;

import java.util.Scanner;

public class ABCbank{
	
	
	public void seeBalance(Account a, Account b, Account c) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Savings account");
		System.out.println("2. Loan account");
		System.out.println("3. Current account");
		int t = sc.nextInt();
		if (t==1) {
			System.out.println((SavingAccount) a);
		}
		
		if (t==2) {
			System.out.println((LoanAccount) b);
		}
		
		if (t==3) {
			System.out.println((CurrentAccount) c);
		}
	}
	
	
	public void withDraw(Account a, double money) {
		// SavingAccount
		if (a instanceof SavingAccount) {
			int transactionCount = ((SavingAccount) a).getTransactionCount();
			if (transactionCount > 3){
				System.out.println("Not allowed");
			}
			else {
				((SavingAccount) a).setTransactionCount(transactionCount + 2);

				a.setBalance(a.getBalance() - money);
				System.out.println("The balance remaining is: " + a.getBalance());
			}
		}
		
		// CurrentAccount
		if (a instanceof CurrentAccount) {
			boolean checkAllowed = ((CurrentAccount) a).isCheckAllowed();
			if (money > 20000){
				if (checkAllowed == false) {
					a.setBalance(a.getBalance() - money);
					System.out.println("The balance CurrentAccount remaining is: " + a.getBalance());
					
					checkAllowed = true;
					((CurrentAccount) a).setCheckAllowed(checkAllowed);
				}
				else {
					System.out.println("Not allowed");
				}		
			}
			else {
				a.setBalance(a.getBalance() - money);
				System.out.println("The balance CurrentAccount remaining is: " + a.getBalance());
			}
		}
		
		// LoanAccount
		if (a instanceof LoanAccount) {
			boolean checkDisbured = ((LoanAccount) a).isCheckDisbured();
			if (checkDisbured == true){
				System.out.println("Not allowed");
			}
			else {
				a.setBalance(a.getBalance() - money);
				System.out.println("The balance LoanAccount remaining is: " + a.getBalance());
			}
		}
	}
	
	
	public void seeProcessing() {
		System.out.println("1. Savings account - 500rs");
		System.out.println("2. Loan account - 2000rs");
		System.out.println("3. Current account - 1000rs");
		
	}
	
	
	public static void main(String[] args) {
		
		ABCbank abc = new ABCbank();
		SavingAccount a = new SavingAccount(10000, 0);
		LoanAccount b = new LoanAccount(20000, false);
		CurrentAccount c = new CurrentAccount(30000, false);
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. See balance");
			System.out.println("2. Withdraw monney");
			System.out.println("3. See processing fees");
			System.out.println("0. Exit");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				abc.seeBalance(a, b, c);
				break;
			}
			case 2: {
				System.out.println("Enter amount to be withdrawn: ");
				double money = sc.nextDouble();
//				System.out.println("Input account");
				System.out.println("1. Savings account");
				System.out.println("2. Loan account");
				System.out.println("3. Current account");
				int x = sc.nextInt();
				if (x==1) {
					
					abc.withDraw(a, money);
				}
				
				if (x==2) {
					abc.withDraw(b, money);
				}
				
				if (x==3) {
					abc.withDraw(c, money);	
				}
				
				break;
			}
			case 3: {
				abc.seeProcessing();
				break;
			}
			case 0: {
				System.exit(0);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + c);
			}
		}
	}

	

}
