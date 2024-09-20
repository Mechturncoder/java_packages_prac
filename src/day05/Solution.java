package day05;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
   for(int i=1; i<=3; i++) {
       String str = sc.next();
       int n = sc.nextInt();
       System.out.print(str);
       for( int j=str.length(); j<15; j++) {
           System.out.print(" ");
       } if(n>=10 && n<100) {
           System.out.println("0" + n);
       } else if(n<10) {
           System.out.println("00" + n);
       } else if(n==0){
           System.out.println("000");
       }
       else {
            System.out.println(n);
       }
}
System.out.println("================================");
}
}