package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersExample {
	
	@ParameterizedTest
	@ValueSource(strings= {"oppo","madam","abcd"})
	public void PalindromeCheck(String name) {
		
		assertTrue(StringFunctions.isPlaindrome(name));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {5,7,9,10})
	public void oddnumcheck(int num) {
		
		assertTrue(num%2!=0);
	}
	
	@ParameterizedTest
	@EnumSource(Month.class)
	public void MonthCheck(Month month) {
		int monthnum = month.getValue();
		assertTrue(monthnum>=1 && monthnum<=12);
	}
	
	
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
	public void MonthDayCheck(Month month) {
		int days = month.length(false);
		assertEquals(days, 30);
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {"FEBRUARY"})
	public void LeapYearCheck(Month month) {
		int days = month.length(false);
		assertEquals(days, 28);
	}
	
	@ParameterizedTest
	@MethodSource("DpMethod")
	public void PalindromeCheck1(String name) {
		
		assertTrue(StringFunctions.isPlaindrome(name));
		
	}
	
	static Stream<String> DpMethod(){
		
		return Stream.of("racecar","radar","mom","dad");
		
	}
	
	
	
}
