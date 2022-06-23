package testPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

 @Disabled
public class AssertDemo {
	
	@Test
public void Simple() {
	int result=1;
	int expected =1;
	assertEquals(result,expected);
	
}
	@Test
	public void Simple1() {
		int result=1;
		int expected =7;
		assertEquals(result,expected);
		
	}
	@Test
	public void Simple2() {
		int result=1;
		int expected =4;
		assertEquals(result,expected);
		
	}
}
