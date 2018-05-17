package testing;

public class Palin_Arm {
	
	public static void main (String args []) {
		System.out.println(armstrong(120));
	}
	
	public static boolean palin_string (String s) {
		int h = s.length()/2 - 1;
		for (int i = 0; i < h; i++) {
			if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
				i++;
			}
			else {return false;}
		}
		return true;
	}
	
	public static int palin_int (int n) {

		int normal_rank = n;
		int normal_r = n;
		int reverse = 0;
		int order = 1;
		
		while(normal_rank/10 != 0) {
			normal_rank = normal_rank/10;
			order ++;
		}
		
		for (int i = order; i >= 1; i--) {
			reverse = (int) (reverse + ((normal_r%10) * Math.pow(10, i-1)));
			normal_r = normal_r/10;
		}
		return reverse;
	}
	
	public static boolean armstrong (int n) {
		
		int sum = 0;
		int i = 0;
		int number = n;
		while (number != 0) {
			i = number % 10;
			sum = (int) (sum + Math.pow(i, 3));
			number = number / 10;
		}
		if (sum == n) {
			return true;
		}
		return false;
	}
}
