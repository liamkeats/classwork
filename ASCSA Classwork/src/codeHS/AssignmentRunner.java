package codeHS;

import java.util.*;

public class AssignmentRunner {

    public static void main(String[] args) {

        // Start here
        String name, dueDate, testDate, testOrP;
        double earned, available;
        boolean groups;
        
        ArrayList<Assignment> steve = new ArrayList<>();
        Scanner boi = new Scanner(System.in);
        
        while(true){
            System.out.println("Please enter an assignment name (exit to quit):");
            name = boi.nextLine();
            if(name.equals("exit")){
                break;
            }
            System.out.println("Please enter the available points:");
            available = boi.nextDouble();
            System.out.println("Please enter the earned points:");
            earned = boi.nextDouble();
            System.out.println("Is this a (t)est or a (p)roject:");
            boi.nextLine();
            testOrP = boi.nextLine();
            //System.out.println("test");
            if(testOrP.equals("t") || testOrP.equals("T")){
                System.out.println("Please enter the test date:");
                testDate = boi.nextLine();
                //System.out.println("test1");
                Assignment test = new Test(name, available, earned, testDate);
                steve.add(test);
            }
            else if(testOrP.equals("P") || testOrP.equals("p")){
                System.out.println("Please enter the due date:");
                dueDate = boi.nextLine();
                System.out.println("Group project? true or false:");
                groups = boi.nextBoolean();
                //System.out.println("test2");
                Assignment test = new Project(name, available, earned, dueDate, groups);
                steve.add(test);
                boi.nextLine();
            }
        }
        System.out.println("Your average: " + 100 * average(steve));
    }

    public static double average(ArrayList<Assignment> assignments) {
        double sum = 0;
        double top;
        double bottom;
        double average;
       for(Assignment test : assignments){
           top = test.getEarnedPoints();
           bottom = test.getAvailablePoints();
           average = top/bottom;
           sum = average + sum;
       }
       //System.out.println("Current Average: " + sum/assignments.size());
       return sum / assignments.size();
       
    }
}

