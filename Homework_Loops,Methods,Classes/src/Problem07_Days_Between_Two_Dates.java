import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Problem07_Days_Between_Two_Dates 
{
	public static void main(String[] args) throws ParseException  
	{
		Scanner input = new Scanner(System.in);
		String date1 = input.nextLine();
		String date2 = input.nextLine();
		
		SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		Calendar dateOne = Calendar.getInstance();
		dateOne.setTime(dFormat.parse(date1));
		
		Calendar dateTwo = Calendar.getInstance();
		dateTwo.setTime(dFormat.parse(date2));
		
		int count = 0;
		
		if(dateOne.compareTo(dateTwo) == -1) 
		{
			while (dateOne.before(dateTwo)) 
			{
				count++;
				dateOne.add(Calendar.DATE, 1);
			}
		}
		else 
		{
			while (dateTwo.before(dateOne)) 
			{
				count--;
				dateTwo.add(Calendar.DATE, 1);
			}
		}
		
		System.out.println(count);
	}
}
