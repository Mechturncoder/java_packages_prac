package day04;
import java.util.Arrays;

public class Strings {
    public static boolean areAnagrams(String s1, String s2)
    {
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args)
    {
        String str1 = "abcdef";
        String str2 = "defcba";	

        if (areAnagrams(str1, str2)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        
        
//        String x[] = str2.split("");
//        for (String i: x) {
//        	System.out.print(i + " ");
//        }
//        System.out.println();
//        Arrays.sort(x);
//        for (String i: x) {
//        	System.out.print(i + " ");
//        }
//        
    }
}