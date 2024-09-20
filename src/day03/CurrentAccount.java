package day03;

public class CurrentAccount extends Account{
	private boolean checkAllowed;
	
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
		this.checkAllowed = false;
		
	}

	public CurrentAccount(double balance, boolean checkAllowed) {
		super(balance);
		this.checkAllowed = checkAllowed;
	}

	public boolean isCheckAllowed() {
		return checkAllowed;
	}

	public void setCheckAllowed(boolean checkAllowed) {
		this.checkAllowed = checkAllowed;
	}

	@Override
	public String toString() {
		return "CurrentAccount [checkAllowed=" + checkAllowed + ", balance=" + balance + ", isCheckAllowed()="
				+ isCheckAllowed() + ", getBalance()=" + getBalance()+ "]";
	}
	
	
	
}
