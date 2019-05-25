import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YellingTest {

	@Test
	//Requirement 1
	public void testscream()
	{
		Yelling y = new Yelling();
		String expectedResult = "Peter is yelling";
		String[] arrayInput = new String[]{"Peter"};
		
		String actualResult = y.scream(arrayInput);
		
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	//Requirement 2
	public void testscream2()
	{
		Yelling y = new Yelling();
		String expectedResult = "Nobody is yelling";
		String[] arrayInput = null;
		
		String actualResult = y.scream(arrayInput);
		
		assertEquals(expectedResult,actualResult);
	}
	

}
