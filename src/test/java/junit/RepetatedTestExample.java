package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;

public class RepetatedTestExample {
	
	@RepeatedTest(4)
	
	public void test1() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}

}
