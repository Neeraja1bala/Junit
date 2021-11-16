package junit;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AssertionExample {
	
	@Test
	public void test() {
		
		String name1 = "Rohan";
		String name2 = "Rohan";
		
		assertEquals(name1, name2);
		
		String[] exparr = {"one","two","three"};
		String[] resarr = {"one","two","three"};
		assertArrayEquals(exparr,resarr);
		
	}

	

}
