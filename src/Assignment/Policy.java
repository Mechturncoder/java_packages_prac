package Assignment;

public class Policy {
	
	public void displayInsurance(Vehicle v) {
		System.out.println(v);
	}

	public static void main(String[] args) {
		
		TwoWheeler tw = new TwoWheeler(101, "Royal Enfield","RE500", 500000);
		FourWheeler fw = new FourWheeler(102, "Hyundai", "i20", 800000);
		
		Policy p = new Policy();
		p.displayInsurance(fw);
		p.displayInsurance(tw);
	}

}


