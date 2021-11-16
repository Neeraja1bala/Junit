package packageB;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junit.StringFunctions;

public class ClassBTest {

	@Tag("Sanity")
	@Test
	@DisplayName("Test2")
	public void Test2() {
		
		assertFalse(StringFunctions.isPlaindrome("abcd"));
	}
}
