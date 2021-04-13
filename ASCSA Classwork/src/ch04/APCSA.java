package ch04;

public class APCSA 
{
	//fields
	private static Student liam, ryan, kyle, alex, jeff;
	//if you don't do this, you can't see them outside of main method
	public static void main(String[] args)
	{
		//create a new object of the Student Class
		liam = new Student("Liam", "Ryan Wallace", "Keats", "123 Mobile St", "June 23 2091", 42);
		rollCall();
		ryan = new Student();
		kyle = new Student();
		alex = new Student();
		jeff = new Student();
	}
	
	public static void rollCall()
	{
		System.out.println(liam);
		System.out.println(kyle);
		System.out.println(alex);
		System.out.println(jeff);
		System.out.println(ryan);
		
		
		
	}
}
