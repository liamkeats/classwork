package ch08;

public class Q4 
{
	public static void main(String [] args)
	{
		String date = "06/23/2003";
		System.out.println(dateReturnOne(date));
		System.out.println(dateReturnTwo(date));
	}
	
	public static String dateReturnOne(String date)
	{
		/*date.replace('/', '-');
		
		you can't do this because string are immuatable. remember to make a copy of the old string.
		
		return date;
		*/
		
		String newDate = date.replace('/', '-');
		return newDate;
	}
	public static String dateReturnTwo(String date)
	{
		StringBuffer sb = new StringBuffer();
		
		sb.append(date);
		
		for(int i = 0; i < 2; i++)
		{
			int index = sb.indexOf("/");
			String a
			sb.replace(index, index + 1, "");
		}
		return sb.toString();
	}
}
