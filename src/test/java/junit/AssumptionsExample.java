package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionsExample {
	
	@BeforeEach
	public void setup() {
		System.setProperty("ENV", "DEV");
	}
	@Test
	public void test1() {
		
		String expectedENV = "DEV";
		String actualENV = System.getProperty("ENV");
		assumeTrue(expectedENV.equals(actualENV));
		assertTrue(StringFunctions.isPlaindrome("oppo"));
		
	}

}
