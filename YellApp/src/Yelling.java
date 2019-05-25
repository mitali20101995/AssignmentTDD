
public class Yelling {
	
	
	//@param name array
	public String scream(String[] names)
	{
		if(names == null)
		{
			return "Nobody is yelling";
		}
		String s = names[0];
		
		if(s == s.toUpperCase())
		{
			return s + " IS YELLING";
		}
		String result = s + " is yelling";
		return result;
	}

}
