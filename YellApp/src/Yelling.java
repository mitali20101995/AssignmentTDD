
public class Yelling {
	
	
	//@param name array
	public String scream(String[] names)
	{
		if(names == null)
		{
			return "Nobody is yelling";
		}
		String result = names[0] + " is yelling";
		return result;
	}

}
