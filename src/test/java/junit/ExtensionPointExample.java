package junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EvnCheck.class)
public class ExtensionPointExample {

	
	@Test
	@DisplayName("Positive")
	public void test1() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}

	//@Disabled
	@Test
	@DisplayName("Negative")
	public void test2() {
		
		assertFalse(StringFunctions.isPlaindrome("abcd"));
	}
}
