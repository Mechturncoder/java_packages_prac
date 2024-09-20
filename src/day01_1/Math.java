package day01_1;
import java.util.Scanner;
public class Math
{
	public void factorial(int n)
	{
		int fact=1;
		for(int i = 1; i<= n; i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args)
{
	Math m = new Math();
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);	
	int num = sc.nextInt();
	m.factorial(num);
	
}
}