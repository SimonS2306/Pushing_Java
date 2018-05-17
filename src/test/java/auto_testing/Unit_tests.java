package auto_testing;

import static org.junit.Assert.*;

import org.junit.Test;

import inheritance.Euro;
import testing.Factorial;
import testing.Fib_Prime;
import testing.Palin_Arm;

public class Unit_tests {

	@Test
	public void test() {
		
		assertEquals(10, Factorial.factorial(4));
		assertEquals(10, Factorial.factorial_i(4));
		
		System.out.println(Fib_Prime.fibonacci(5));
		System.out.println(Fib_Prime.fibonacci_i(7));
		System.out.println((int)Math.sqrt(6));
		System.out.print(Fib_Prime.is_prime(9));
		
		System.out.println(Palin_Arm.armstrong(146));
		System.out.println(Palin_Arm.palin_int(100));
		System.out.println(Palin_Arm.palin_string("LagerregaL"));
	}

}
