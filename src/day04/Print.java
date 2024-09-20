package day04;

public interface Print {
	default void print() {
		System.out.println("printing data - old");
	}
}
