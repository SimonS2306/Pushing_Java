package testing;

public class Factorial {
	
	public static void main (String [] args) {
		System.out.println(factorial(5));
		System.out.println(factorial_i(5));
	}

	public static int factorial (int n) {
		
		if (n == 0) { return 0;}
		if (n == 1) { return 1;}
		if (n > 1) {
			return n + factorial (n-1);
		}
		return n;
	}
	
	public static int factorial_i (int n) {
		
		int factorial = 0;
		
		for (int i = 0; i <= n; i++) {
			factorial += i;
		}
		return factorial;
	}
}
