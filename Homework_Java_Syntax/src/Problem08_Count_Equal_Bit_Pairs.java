import java.util.Scanner;


public class Problem08_Count_Equal_Bit_Pairs 
{
	public static void main(String[] args) 
	{
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();
		String binInt = String.format(Integer.toBinaryString(n));
		char[] arr = binInt.toCharArray();
		int count = 0;
		
		for (int j = 0; j < binInt.length() - 1; j++) 
		{
			if (arr[j] == arr[j + 1]) 
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}
