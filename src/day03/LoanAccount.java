package day03;

public class LoanAccount extends Account {
	private boolean checkDisbured;
	
	public LoanAccount() {
		// TODO Auto-generated constructor stub
		this.checkDisbured = false;
		
	}

	public LoanAccount(double balance, boolean checkDisbured) {
		super(balance);
		this.checkDisbured = checkDisbured;
	}

	public boolean isCheckDisbured() {
		return checkDisbured;
	}

	public void setCheckDisbured(boolean checkDisbured) {
		this.checkDisbured = checkDisbured;
	}

	@Override
	public String toString() {
		return "LoanAccount [checkDisbured=" + checkDisbured + ", balance=" + balance + ", isCheckDisbured()="
				+ isCheckDisbured() + ", getBalance()=" + getBalance()+"]";
	}
	
	
	
}
