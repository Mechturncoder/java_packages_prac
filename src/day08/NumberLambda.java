package day08;

public class NumberLambda {
	public static void main(String[] args) {
		NumberFilter ispositive = (n) -> n>0;
		boolean result = ispositive.test(12);
		System.out.println(result);
		
		NumberFilter isprime = (n) ->
		{
			if (n<2) return false;
			for(int i = 2; i<n ; i++) {
				if(n%i == 0)
					return false;
			}
			return true;
		};
		
		result = isprime.test(2);
		System.out.println(result);
	}
}
