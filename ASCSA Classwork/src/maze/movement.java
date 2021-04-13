package maze;
//import java.util.*;
//import java.util.concurrent.TimeUnit;

public class movement {
	String[][] jimmy;
	theMaze liam = new theMaze(jimmy);
	int x;
	int y;
	
	public movement(String[][] theArray) {
		jimmy = theArray;
	}
	
	public boolean up(String[][] array)
    {
		for(int j = 0; j < array.length; j++) {
			for(int i = 0; i < array.length; i++) {
				if(array[i][j].equals("@"))
					if(array[i-1][j].equals("X")) {
						System.out.println("lol");
					}
					else if(array[i-1][j].equals("*")) {
						return true;
					}
					else{
						array[i][j] = " ";
						array[i - 1][j] = "@";
						System.out.println("test");
					}
			}
		}
        System.out.println();
        return false;
    }
	public void left(String[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j].equals("@"))
                {
                    if (array[i][j - 1].equals("X"))
                    {
                        System.out.println("lol");
                    }

                    else
                    {
                    	array[19][18] = "X";
                        array[i][j] = " ";
                        array[i][j - 1] = "@";
                    }
                }
            }
        }
        System.out.println();
    }
	public void down(String[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j].equals("@"))
                {
                    if (array[i + 1][j].equals("X"))
                    {
                        System.out.println("lol");
                    }

                    else
                    {
                    	array[19][18] = "X";
                        array[i][j] = " ";
                        array[i + 1][j] = "@";
                    }
                }
            }
        }
        System.out.println();
    }
	public void right(String[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j].equals("@"))
                {
                    if (array[i][j + 1].equals("X"))
                    {
                        System.out.println("lol");
                    }

                    else
                    {
                    	array[19][18] = "X";
                        array[i][j] = " ";
                        array[i][j + 1] = "@";
                    }
                }
            }
        }
        System.out.println();
    }
}