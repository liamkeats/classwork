package santa;

import java.util.Arrays;

public class SantsList {

	static String fullName, lastName, firstName;
	
	static String[] theArray = new String[100];
	
	public static void main(String[] args) {
		theArray[0] = "William Johnson";
		theArray[1] = "James Johnson";
		theArray[2] = "John Johnson";
		theArray[3] = "Robert Johnson";
		theArray[4] = "Michael Johnson";
		theArray[5] = "William Smith";
		theArray[6] = "James Smith";
		theArray[7] = "John Smith";
		theArray[8] = "Robert Smith";
		theArray[9] = "Michael Smith";
		theArray[10] = "William Green";
		theArray[11] = "James Green";
		theArray[12] = "John Green";
		theArray[13] = "Robert Green";
		theArray[14] = "Michael Green";
		theArray[15] = "James King";
		theArray[16] = "John King";
		theArray[17] = "Robert King";
		theArray[18] = "Michael King";
		theArray[19] = "William King";
		
		//System.out.println(Arrays.toString(theArray));
		printNames();
		seekAndDestroy("William Johnson");
		}
	public static void printNames() {
		for (String x : theArray){
			if(x != null)
			System.out.println(x + " ");
		}
		System.out.println();
}
	public static void seekAndDestroy(String name) {
		int nameIndex;
		for (int i = 0; i < theArray.length; i++) {
			if(theArray[i].equals(name)) {
				theArray[i] = null;
				for (nameIndex = i; nameIndex < theArray.length; nameIndex++) {
					//System.out.println("inside for");
					if(theArray[nameIndex + 1] != null) {
						//System.out.println("inside if");
						theArray[nameIndex] = theArray[nameIndex + 1];
					}
					else {
						break;
					}
				}
				//System.out.println("ope");
				System.out.println();
				printNames();
				//System.out.println(Arrays.toString(theArray));

				break;


					}
				}
			}
	}


