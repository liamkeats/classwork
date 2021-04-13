//HEADER
//LIAM RYAN WALLACE KEATS
//DUE JAN 23rd 2021
//MAZE ASSIGNMENT
package maze;

import java.util.*;

public class mazeRunner 
{

	public static void main(String[] args) throws InterruptedException
	{
		String[][] theArray = new String[20][20];
		
		theMaze liam = new theMaze(theArray);
		movement moveBoi = new movement(theArray);
		@SuppressWarnings("resource")
		Scanner poop = new Scanner(System.in);
		
		liam.theMaking();
		System.out.println("Welcome to the game. To move, press W, A, S, D. To quit, press Q");
		for(int i = 0; i < 1000; i++) {
			System.out.println("To move, press W, A, S, D. To quit, press Q");
			liam.theTest();
			String choice = poop.nextLine();
			
			if(choice.equals("w")) {
				moveBoi.up(theArray);
				liam.theTest();
				if(moveBoi.up(theArray) == true) {
					System.out.println("You win!");
					break;
				}
			}
			else if(choice.equals("a")) {
				moveBoi.left(theArray);
				liam.theTest();
			}
			else if(choice.equals("s")) {
				moveBoi.down(theArray);
				liam.theTest();
			}
			else if(choice.equals("d")) {
				moveBoi.right(theArray);
				liam.theTest();
			}
			else if(choice.equals("q")) {
				break;
			}
			else {
				System.out.println("you had one job.");
				return;
			}
	}
	poop.close();
	
}
}

