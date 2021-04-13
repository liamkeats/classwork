package maze;

//import java.util.*;

public class theMaze 
{
	private String[][] theArray;
	
	public theMaze(String[][] jimmy) {
		theArray = jimmy;
	}
	
	public void theMaking()
	{
		theFilling();
		theStart();
		theEnd();
		theEl();
		theEye();
		theEh();
		theEm();
	
	}
	
	public void theFilling() {
		int x = 0;
		while(x < 20){
			for(int i = 0; i < 20; i++){
				theArray[x][i] = "X";}
			x++;}
	}
	
	private void theStart(){
		theArray[19][18] = "@";
	}
	
	private void theEnd() {
		theArray[0][2] = "*";
		//theArray[10][18] = "*";
	}

	private void theEl(){
		//row 2 - 4, column 1 - 6
		for(int i = 1; i <= 7; i++) {
			for(int x = 2; x <= 2; x++) {
				theArray[i][x] = " ";
			}
		}
		for(int i = 7; i <= 7; i++) {
			for(int x = 3; x < 8; x++) {
				theArray[i][x] = " ";
			}
		}

		for(int i = 9; i <= 14; i++) {
			theArray[3][i] = " ";
		}
		for(int i = 3; i < 8; i++) {
			theArray[i][8] = " ";
		}
	}
	
	private void theEye() {
		for(int i = 13; i <= 17; i++) {
			theArray[7][i] = " ";
		}
		for(int i = 13; i <= 17; i++) {
			theArray[1][i] = " ";
		}
		for(int i = 1; i < 7; i++) {
			theArray[i][15] = " ";
		}
	}
	
	private void theEh() {
		theArray[18][2] = " ";
		theArray[17][2] = " ";
		theArray[16][2] = " ";
		theArray[15][2] = " ";
		theArray[14][2] = " ";
		theArray[13][2] = " ";
		theArray[13][3] = " ";
		theArray[12][3] = " ";
		theArray[11][3] = " ";
		theArray[11][4] = " ";
		theArray[11][5] = " ";
		theArray[11][6] = " ";
		theArray[11][7] = " ";
		theArray[12][7] = " ";
		theArray[13][8] = " ";
		theArray[13][7] = " ";
		theArray[14][8] = " ";
		theArray[15][8] = " ";
		theArray[16][8] = " ";
		theArray[17][8] = " ";
		theArray[18][8] = " ";
		for(int i = 3; i < 8; i++) {
			theArray[15][i] = " ";
		}
		theArray[9][5] = " ";
		theArray[10][5] = " ";
		for(int i = 6; i < 16; i++) {
			theArray[9][i] = " ";
		}
		theArray[8][15] = " ";
		}
	
	private void theEm() {
		theArray[18][9] = " ";
		theArray[18][10] = " ";
		theArray[18][11] = " ";
		for(int i = 11; i < 18; i++) {
			theArray[i][11] = " ";
		}
		theArray[12][12] = " ";
		theArray[11][13] = " ";
		theArray[11][14] = " ";
		for(int i = 12; i < 16; i++) {
			theArray[i][15] = " ";
		}
		theArray[11][16] = " ";
		theArray[11][17] = " ";
		for(int i = 12; i < 19; i++) {
			theArray[i][18] = " ";
		}
		theArray[11][15] = " ";
		theArray[11][18] = " ";
		theArray[12][13] = " ";
	}
	
	public void theTest(){
		for (String[] x : theArray){
		   for (String y : x){
		        System.out.print(y + " ");
		   }
		   System.out.println();
		}
	}
	
}
