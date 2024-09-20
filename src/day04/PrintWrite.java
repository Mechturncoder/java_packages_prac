package day04;

public interface PrintWrite {
	default void print() {
		System.out.println("Printing data");
	}
	default void write() {
		System.out.println("Writing data");
	}

}
