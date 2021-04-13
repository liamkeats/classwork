package ch08;

public class Q13 

	{
		public static void main(String[] args)
		{
			System.out.println(startsWith("y"));
			System.out.println(endsWith("w"));
		}
		
		
		public static boolean startsWith(String starts)
		{
			
			String bacon = "bacon";
			int index = bacon.indexOf(starts);
			
			if(index == 0)
			{
				return true;
			}
			else if(index < 0)
			{
				System.out.println("Are you dumb bruh? That's not even in the word.");
				return false;
			}
			else
			{
				return false;
			}
		}
		public static boolean endsWith(String ends)
		{
			String bacon = "supercalifragilisticespialidocious";
			
			int length = bacon.length();
			int subLength = ends.length();
			
			int indexEnds = bacon.indexOf(ends);
			
			//System.out.println(indexEnds);
			
			if(indexEnds + subLength == length)
			{
				return true;
			}
			else if(indexEnds < 0)
			{
				System.out.println("Are you dumb bruh? That's not even in the word.");
				return false;
			}
			else
			{
				return false;
			}
			
		}
	}
