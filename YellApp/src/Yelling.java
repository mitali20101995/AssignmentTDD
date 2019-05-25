
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
		
		if(names.length == 2) {
			String s2 = names[1];
			return s + " and " + s2 + " are yelling";
		}
		String result = s + " is yelling";
		return result;
		
		
		
	}

}
