//HEADER
//LIAM RYAN WALLACE KEATS
//DUE OCTOBER 14th 2020
//DINNER PARTY ASSIGNMENT

package DinnerParty;
import java.util.Random;

public class DinnerParty 
{
	private static Guest alan, elon, bill, jeff, mark, steve, ken, barb, blackie;
	
	public static void main(String[] args)
	{
		//this was just for testing.
		//Random rand = new Random();
		//int upperbound = 25;
		//int dumbInt = rand.nextInt(upperbound);
		
		
		//create a new object of the class guest
		//name, job, age, fact, fact 2
		alan = new Guest("Alan Mathison Turing", "mathematician", 108, "are the reason the Turing Award exists.", "is the father of modern computer science.");
		
		elon = new Guest("Elon Musk", "CEO of SpaceX", 49, "taught themself to program at the age of 9.", "has 3 citizenships.");
		
		bill = new Guest("William Henry Gates III", "american business magnate", 64, "are also known as Bill, he is the co-founder of Microsoft.", "helped eradicate polio.");
	
		jeff = new Guest("Jeffrey Preston Bezos", "american internet entrepreneur", 56, "are founder, CEO, and president of Amazon.", "got divorced, for 30 billion dollars.");
		
		mark = new Guest("Mark Elliot Zuckerberg", "Chief Executive Officer of Facebook", 36, "were inventing in middle school.", "dropped out of Harvard");
		
		steve = new Guest("Steven Paul Jobs", "industrial designer", 65, "is dead.", "is still richer than you.");
		
		ken = new Guest("Kenneth Lane Thompson", "american computer designer", 77, "are better known as Ken, he designed the original Unix OS.", "recieved the Turing Award for their development of generic operating system theory.");
		
		barb = new Guest("Barbara Liskov", "american computer scientist", 80, "were one of the first women granted a doctorate in computer science.", "also won a Turing Award fpr cpmtriburtions to practical and theroretical foundations of programming language and system design.");
		
		blackie = new Guest();
		blackie.setName("Jesus");
	
		startConversation();
		
		
	}
	
		public static void startConversation()
	{
		System.out.println("Hey guys! Welcome to my dinner party. How are you doing today? I have brought a few friends, would you like to meet them?");
		System.out.println("Let's go!" + "\n");
		System.out.println(alan);
		System.out.println("Thanks Alan for coming!, Elon you're up!" + "\n");
		System.out.println(elon);
		System.out.println("Wow! That was interesting!, Your turn Bill!" + "\n");
		System.out.println(bill);
		System.out.println("Thanks for coming.. William!, hah! Jeff, you ready to go?" + "\n");
		System.out.println(jeff);
		System.out.println("Okay, guys. Why are you talking in the third person?" + "\n");
		System.out.println(mark);
		System.out.println("\tMark: Because Liam coded us to be way cooler and random toStrings but got to lazy to change us back" + "\n");
		System.out.println(steve);
		System.out.println("Steve, you are truly a man!" + "\n");
		System.out.println(ken);
		System.out.println("Ken! Can I have your award??" + "\n");
		System.out.println(barb);
		System.out.println("Barb, I wish I was as cool as you. Now, are you guys ready to eat?" + "\n");
		System.out.println(blackie.getName());
	
	}
}

