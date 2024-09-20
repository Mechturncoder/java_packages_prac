package day02;

public class Curtain {
	private static boolean isopen;
	
	 
	
	public Curtain() {
		this.isopen = true;
	}

	public Curtain(boolean isopen) {
		this.isopen = isopen;
	}

	public static boolean isIsopen() {
		return isopen;
	}

	public static void setIsopen(boolean isopen) {
		Curtain.isopen = isopen;
	}



	public static void changeState() {
		if (isopen == true) {
			isopen= false;
		}
		else {
			isopen=true;
		}
	}
}
