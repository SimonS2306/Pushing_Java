package testing;

public class Fib_Prime {
	
	public static void main (String [] args) {
		System.out.println(fibonacci(4));
		System.out.println(fibonacci_i(7));
		System.out.println((int)Math.sqrt(6));
		System.out.print(is_prime(9));
	}
	
	//FIBONACCI: 2 ways of implementing Fibonacci Series
	
	public static int fibonacci (int n) {
		if (n == 0 || n == 1) {return n;}
		else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
	}
	
	public static int fibonacci_i (int n) {
		
		int lastvalue = 0;
		int temp;
		int currentvalue = 1;
		
		if (n == 0 || n == 1) {return n;}
		else {
			for (int i = 1; i < n; i++) {
				temp = currentvalue;
				currentvalue = currentvalue + lastvalue;
				lastvalue = temp;
			}
			return currentvalue;
		}
	}

	//FIBONACCI: Memoization could increase performance
	
	@SuppressWarnings("unused")
	public static boolean is_prime (int n) {
		
		if(n < 0) { return false;}
		if (n == 0 || n == 1) { return false;}
		int h = (int) Math.sqrt(n);
		for (int i = 2; i < h; i += 2) {
			if (n % i == 0) {
			return false;
			}
		}
		return true;
	}
}
