/**
 * This program prompts the user to enter his or her
 * first name and last name and displays a greeting message.
 * Author: Maria Litvin
 */
package ch02;

import java.util.Scanner;

public class Greetings2
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = kboard.nextLine();

    System.out.print("Enter your last name: ");
    String lastName = kboard.nextLine();
    
    System.out.print("What grade are you in?: ");
    int personGrade = kboard.nextInt();
    
    System.out.print("How old are you?:");
    int personAge = kboard.nextInt();
    
    

    System.out.println("Hello, " + firstName + " " + lastName + "." + " You are " + personAge + " years old and you have " + (13 - personGrade) + " years until you graduate. CONGRATS!");
    System.out.println("Welcome to Java!");
    kboard.close();
  }
}
