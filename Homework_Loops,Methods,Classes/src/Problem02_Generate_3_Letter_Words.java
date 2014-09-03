import java.util.Arrays;
import java.util.Scanner;

public class Problem02_Generate_3_Letter_Words 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String inputChars = input.nextLine();
		char[] arrayOfInputChars = inputChars.toCharArray();
		int[] numsFromOneToLengthToChars = new int[arrayOfInputChars.length];
		Arrays.sort(arrayOfInputChars);
		int length = arrayOfInputChars.length;

		for (int i = 0; i < numsFromOneToLengthToChars.length; i++) 
		{
			numsFromOneToLengthToChars[i] = i + 1;
		}
		
		String startStr = ""; 
		for (int i = 0; i < 3; i++) 
		{
			startStr += '1';
		}
		int start = Integer.parseInt(startStr); //First number  - start ot loop;
		
		String endString = String.valueOf(length); 
		String str = "";
		for (int i = 0; i < 3; i++) 
		{
			str += endString;
		}
		
		int end = Integer.parseInt(str); //End number - end of loop;
		int count = 0;
		
		for (int i = start; i <= end; i++) 
		{
			int current = i;
			String currentNum = String.valueOf(i);
			char[] arr = currentNum.toCharArray();
			int[] currentInt = new int[arr.length];
			StringBuilder currentStr = new StringBuilder();
			
			for (int j = 0; j < currentInt.length; j++) 
			{
				currentInt[j] = current % 10;
				current /= 10;
			}
			
			for (int c : currentInt) 
			{
				for (int e : numsFromOneToLengthToChars) 
				{
					if (c == e) 
					{
						count++;
						currentStr.append(arrayOfInputChars[c - 1]);
					}
				}
			}
		
			if (count == 3) 
			{
				System.out.println(currentStr);
			}
		
			count = 0;
			currentStr.setLength(0);
		}
	}
}
