package junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ParameterProvidedClass.class)
public class JunitWithParameterClass {
	
	@Test
	@DisplayName("Positive")
	public void test1(String parm1) {
		
		assertTrue(StringFunctions.isPlaindrome(parm1));
	}

}
