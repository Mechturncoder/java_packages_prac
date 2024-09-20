package day02;

public class Controller {

	public static void main(String[] args) {
		Curtain c = new Curtain();
		System.out.println(c.isIsopen());
		c.changeState();
		System.out.println(c.isIsopen());
	}
}
