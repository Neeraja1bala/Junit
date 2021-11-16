package junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public interface DefaultTestInterface {
	
	public void method1();
	public void method2();
	
	@Test
	default void test() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}
	

}
