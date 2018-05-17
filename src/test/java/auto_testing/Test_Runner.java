package auto_testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test_Runner {

	 public static void main(String[] args) {
		    Result result = JUnitCore.runClasses(Unit_tests.class);
		    for (Failure failure : result.getFailures()) {
		      System.out.println(failure.toString());
		    }
	 }
}
