import java.util.Iterator;
import java.util.Scanner;


public class Problem07_Count_of_Bits_One 
{
	public static void main(String[] args)
	{
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();
		String binInt = String.format(Integer.toBinaryString(n));
		char[] arr = binInt.toCharArray();
		int count = 0;
		
		for (int j = 0; j < binInt.length(); j++) 
		{
			if (arr[j] == '1') 
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}
