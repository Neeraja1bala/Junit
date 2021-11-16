package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

public class StringFunctionsTest {
	
	@Test
	@DisplayName("Positive")
	public void test1() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}

	//@Disabled
	@CustomAnnotation
	public void test2() {
		
		assertFalse(StringFunctions.isPlaindrome("abcd"));
	}
}
