package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExamples {
	
	@TestFactory
	public Collection<DynamicTest> method1(){
		
		return Arrays.asList(
				
				DynamicTest.dynamicTest("positive test1", 
						
						() -> assertTrue(StringFunctions.isPlaindrome("oppo"))),
				DynamicTest.dynamicTest("positive test2", 
						
						() -> assertTrue(StringFunctions.isPlaindrome("madam"))),
				DynamicTest.dynamicTest("Negative test", 
						
						() -> assertFalse(StringFunctions.isPlaindrome("abcd")))
				
				
				
		);
				
	}

}
