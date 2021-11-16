package packageA;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junit.StringFunctions;

public class ClassATest {
	
	@Tag("Sanity")
	@Test
	@DisplayName("Test1")
	public void Test1() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}
	
	

}
