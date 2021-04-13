package ch08;

public class HomeworkQ11 
{
	public static void main(String[] args)
	{
		String str = "Hi-ho, hi-ho";
		String result = cutOut(str, "-ho");
		//result should be Hi, hi-ho
		
		System.out.println(result);
	}
	
	public static String cutOut(String word, String remove)
	{
		
		// word = Hi-ho, hi-ho
		//remove = -ho
		
		int index = word.indexOf(remove);
		
		System.out.println(index);
		// index = 2, that means at the index of 2 -ho starts
		
		String newWord = "";
		
		int removeLength = remove.length();
		// length of variable remove
		
		//System.out.println(removeLength);
		
		String begin = word.substring(0, index);
		//we have a word up until the word we are removing
		
		int endLength = index + removeLength;
		
		//System.out.println(endLength);
		
		String end = word.substring(endLength);
		newWord = begin + end;
		
		return newWord;
	}
}
