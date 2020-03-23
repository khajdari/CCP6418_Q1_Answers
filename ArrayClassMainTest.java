import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ArrayClassMainTest {

	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(ArrayClassTest.class);
		
		for(Failure f: r.getFailures())
			System.out.println(f.toString());
		
		System.out.println("Running test cases on arrays finished!");
	}
}
