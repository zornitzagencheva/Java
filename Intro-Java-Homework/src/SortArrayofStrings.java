import java.util.Arrays;
import java.util.Scanner;


public class SortArrayofStrings 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number of strings: ");
		int n = input.nextInt();
		String[] names = new String[n];
		
		for(int i = 0; i < n; i++)
		{
			names[i] = input.next();
		}
		
		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		
		for(String str : names)
		{
			System.out.println(str);
		}
		
	}
}
