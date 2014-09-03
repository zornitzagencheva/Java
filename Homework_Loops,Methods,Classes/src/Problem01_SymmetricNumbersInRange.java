import java.util.Scanner;

public class Problem01_SymmetricNumbersInRange 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		
		start = Math.abs(start);
		end = Math.abs(end);
		boolean isSymetric = true;
		
		for (int i = start; i <= end; i++) 
		{
			String currentNum = Integer.toString(i);
			char[] charsOfCurrentNum = currentNum.toCharArray();
			
			if (charsOfCurrentNum.length == 1) 
			{
				System.out.println(currentNum + " ");
				continue;
			}
			else 
			{
				for (int j = 0; j < charsOfCurrentNum.length / 2; j++) 
				{
					if (charsOfCurrentNum[j] != charsOfCurrentNum[(charsOfCurrentNum.length - 1) - j]) 
					{
						isSymetric = false;
						break;
					}					
				}
			}
			
			if (isSymetric == true) 
			{
				System.out.print(currentNum + " ");
				continue;
			}
			isSymetric = true;
		}
	}
}
