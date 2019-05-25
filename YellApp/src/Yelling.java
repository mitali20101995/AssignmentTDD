
public class Yelling {
	
	
	//@param name array
	public String scream(String[] name)
	{
		if(name == null)
		{
			return "Nobody is yelling";
		}
		String result = name[0] + " is yelling";
		return result;
	}

}
