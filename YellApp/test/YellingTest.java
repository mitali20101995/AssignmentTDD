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
	
	@Test
	//Requirement 3
	public void testscream3()
	{
		Yelling y = new Yelling();
		String expectedResult = "PETER IS YELLING";
		String[] arrayInput = new String[]{"PETER"};
		
		String actualResult = y.scream(arrayInput);
		
		assertEquals(expectedResult,actualResult);
	}

	@Test
	//Requirement 4
	public void testscream4()
	{
		Yelling y = new Yelling();
		String expectedResult = "Peter and Kadeem are yelling";
		String[] arrayInput = new String[]{"Peter", "Kadeem"};
		
		String actualResult = y.scream(arrayInput);
		
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	//Requirement 4
	public void testscream5()
	{
		Yelling y = new Yelling();
		String expectedResult = "Peter, Kadeem, and Albert are yelling";
		String[] arrayInput = new String[]{"Peter", "Kadeem", "Albert"};
		
		String actualResult = y.scream(arrayInput);
		
		assertEquals(expectedResult,actualResult);
	}
	
	
	
}
