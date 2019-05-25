
public class Yelling {
	
	
	//@param name array
	public String scream(String[] names)
	{
		String result = "";
		String upperCaseName = "";
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
		
		else if(names.length > 2) {

			
			for(int i=0;i<names.length - 1;i++)
			{
				if(names[i] != names[i].toUpperCase())
				{
					result = result + names[i] + ", ";
				}
				else {
					upperCaseName = names[i];
				}
			}	
			result = result + "and " + names[names.length - 1] + " are yelling";
			if(upperCaseName != "") {
				result += ". SO IS " + upperCaseName + "!";
			}
			return result;
		}
		
		result = s + " is yelling";
		return result;
		
		
		
	}

}
