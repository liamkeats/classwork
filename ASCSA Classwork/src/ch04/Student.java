package ch04;

public class Student 
{

	//field variables
	public String firstName, middleName, lastName, address, dateOfBirth;
	private int age, myID;
	private static int idTracker = 2020001;
	
	//constructors. If we don't have a constructor they don't know what to do with the student
	public Student()
	{
		myID = idTracker;
		idTracker++;
		//this takes the idTracker that everyone can see, and then sets it to their I. Someone steals that number that only they can see. Then it is changed by one.
		
	}
	public Student(String fn, String mn, String ln, String add, String dob, int a)
	{
		myID = idTracker;
		idTracker++;
		firstName = fn;
		middleName = mn;
		lastName = ln;
		address = add;
		dateOfBirth = dob;
		age = a;
	}
	
	//accessor methods
	public int getID()
	{
		return myID;
	}
	public int getAge()
	{
		return age;
		
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getMiddleName()
	{
		return middleName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getAddress()
	{
		return address;
	}
	public String getDateOfBirth()
	{
		return dateOfBirth;
	}
	
	//mutator methods
	
	public void setAge(int a)
	{
		age = a;
	}
	public void setFirstName(String fn)
	{
		firstName = fn;
	}
	public void setMiddleName(String mn)
	{
		middleName = mn;
	}
	public void setLastName(String ln)
	{
		lastName = ln;
	}
	public void setAddress(String add)
	{
		address = add;
	}
	public void setDateOfBirth(String dob)
	{
		dateOfBirth = dob;
	}
	//tostring override method
	public String toString()
	{
		return "Name " + firstName + " " + middleName + " " + lastName + 
				"\nAge: " + age + "\tID: " + myID + "\tDOB: " + dateOfBirth + 
				"\nAddress: " + address;
	}
}
