package ch08;

public class Q2 
{
	public static void main(String [] args)
	{
		System.out.println(endWithStar("*h"));
		System.out.println(twoChars("hell*o*"));
	}
	
	public static boolean endWithStar(String word)
	{
		//System.out.println(word); this is h*
		int length = word.length();
		
		//System.out.println(length); this is 2
		
		if(length > 1) // this is true
		{
			char lastLetter = word.charAt(length - 1); // this is *
			//System.out.println(lastLetter);
			
			//String gottaBe = "*"; // this is also * this is useless. do it as a string
			//System.out.println(gottaBe);
			
			if(lastLetter == '*') // this word if you do it as a character
			{

				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
		
		
	}
	public static boolean twoChars(String word)
	{
		int length = word.length();
		if(length > 2)
		{
			String twoStars = "**";
			System.out.println(twoStars);
			String lastTwo = word.substring(length - 2);
			System.out.println(lastTwo);
			

			if(twoStars.equals(lastTwo))//make sure you compare them with string methods
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		else
		{
			return false;
		}
	}
}

