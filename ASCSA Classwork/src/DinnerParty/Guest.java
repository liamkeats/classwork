//HEADER
//LIAM RYAN WALLACE KEATS
//DUE OCTOBER 14th 2020
//DINNER PARTY ASSIGNMENT

package DinnerParty;

import java.util.Random;

public class Guest 
{
	private String fullName, job, interestingFact1, interestingFact2;
	private int age, myID;
	//int dumbInt;
	private static int idTracker;
	
	
	//this creates the class rand which generates a random number
	
	Random rand = new Random();
	int upperbound = 25;
	
	public Guest()
	{
		idTracker = rand.nextInt(upperbound);
		myID = idTracker;
		idTracker = rand.nextInt(upperbound);
	}

	public Guest(String guestName, String guestJob, int guestAge, String factOne, String factTwo)
	{
		fullName = guestName;
		job = guestJob;
		interestingFact1 = factOne;
		interestingFact2 = factTwo;
		age = guestAge;
		idTracker = rand.nextInt(upperbound);
		
	}

	//accesssor and mutator methods
	
	public int getID()
	{
		return myID;
	}
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return fullName;
	}

	public void setName(String name) {
		this.fullName = name;
	}

	public String getInterestingFact1() {
		return interestingFact1;
	}

	public void setInterestingFact1(String interestingFact1) {
		this.interestingFact1 = interestingFact1;
	}

	public String getInterestingFact2() {
		return interestingFact2;
	}

	public void setInterestingFact2(String interestingFact2) {
		this.interestingFact2 = interestingFact2;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		//if (myID > 20)
		//{
			return "Welcome " + fullName + " to my dinner party!" +
		
				"\n " + fullName + " is " + age + " years old. " +
				"\nThey are a great " + job + " and " + interestingFact1 + 
				"\n" + fullName + " also " + interestingFact2 +
				"\n";
		//}
		
		//couldn't make work yet idk why
		//else if(myID > 10)
		//{
		//	return "Welcome " + fullName + " to my supper!" +
					
		//		"\n " + fullName + " is a great " + job + " and he is " + age + " years old. " +
		//		"\nThey " + interestingFact1 + " and also " +  interestingFact2;
				
		//}
		//
		//else
		//{
		//	return "Welcome " + fullName + " " +
					
		//		"\n " + fullName + " is a great " + job + " and he " + interestingFact1 + " and also is very good at " +  interestingFact2 +
		//		"\n" + age;
		}
}
