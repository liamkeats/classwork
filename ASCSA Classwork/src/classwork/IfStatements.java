package classwork;

import java.util.Scanner;
public class IfStatements {
	
	private static Scanner kb = new Scanner(System.in);
	
	public static void Main(String[] args)
	{
		System.out.print("Enter a number: ");
		int x = kb.nextInt();
		System.out.println();
		
		if (x==3)
		{
			System.out.println("YOUR NUMBER IS THREE");
		}
		else if(x >5)
		{
			System.out.println("BIGGER THAN 5");
		}
		else if(x<0)
		{
			System.out.println("NEGATIVE");
		}
		else
		{
			System.out.println("EITHER 1 2 3 or 5");
		}
		
		
		
		//BOOLEANS
		// || this is the or syntax
		// && is the and syntax
		// ! this is the not syntax
		
		
		
	}
	
	

}
