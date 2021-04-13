package ch08;

import java.util.Scanner;

public class Q3 
{
	public static void main(String []args)
	{
		Scanner boi = new Scanner(System.in);
		System.out.println("Enter your SSN: ");
		String SSN = boi.nextLine();
		boi.close();
		
		System.out.println(changeSSN(SSN));
		
	}
	public static String changeSSN(String social)
	{
		String SSN = social;
		
		//create a string buffer object
		StringBuffer sb = new StringBuffer();
		
		sb.append(SSN);
		int limit = -1;
		int index = 0;
		
		for(int i = 0; i != limit; i = index)
		{
			index = sb.indexOf("-");
			if(index == -1)
			{
				break;
			}
			//System.out.println(index);
			sb.delete(index, index + 1);

			
		}
		
		String s1 = sb.substring(0);
		return s1;
		/*while(i != -1)
		{
			try
			{
				int index = sb.indexOf("-");
				sb.delete(index, index + 1);
				i = index;
			}
			catch (StringIndexOutOfBoundsException ex)
			{
				System.out.println("The program ALMOST broke...");
			}
			finally
			{
				System.out.println(sb.toString());

			}
		}
		*/
		

	}
}
