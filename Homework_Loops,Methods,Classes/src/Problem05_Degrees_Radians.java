import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Problem05_Degrees_Radians 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.ROOT); 
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
        scan.nextLine();
		ArrayList<Double> arrOfNumbers = new ArrayList<>();
		ArrayList<String> arrOfMeasureStrings = new ArrayList<>();
		
		fillArrays(scan, num, arrOfNumbers, arrOfMeasureStrings);
		
		for (int i = 0; i < arrOfNumbers.size(); i++) 
		{
			if (arrOfMeasureStrings.get(i).equals("deg")) 
			{
				convertsFromDegreesToRadians(arrOfNumbers, i);
			}
			
			if (arrOfMeasureStrings.get(i).equals("rad")) 
			{
				convertFromRadiansToDegrees(arrOfNumbers, i);
			}
		}
	}

	private static void fillArrays(Scanner scan, int num,
			ArrayList<Double> arrOfNumbers,
			ArrayList<String> arrOfMeasureStrings) {
		double number;
		String measure;
		for (int i = 0; i < num; i++)
		{
			String current = scan.nextLine();
			String[] currentArr = current.split(" ");
			number = Double.parseDouble(currentArr[0]);
			measure = currentArr[1];
			arrOfNumbers.add(number);
			arrOfMeasureStrings.add(measure);
		}
	}

	private static void convertFromRadiansToDegrees(
			ArrayList<Double> arrOfNumbers, int i) {
		double convertsRadiansToDegrees = arrOfNumbers.get(i) * (180 / Math.PI);
		System.out.printf("%.6f %s%n" ,convertsRadiansToDegrees, "deg");
	}

	private static void convertsFromDegreesToRadians(
			ArrayList<Double> arrOfNumbers, int i) {
		double convertsDegreesToRadians = arrOfNumbers.get(i) * (Math.PI / 180);
		System.out.printf("%.6f %s%n" ,convertsDegreesToRadians, "rad");
	}
}
