import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem04_The_Smallest_of_3_Numbers 
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.ROOT);
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter three numbers: ");
		BigDecimal a = inputScanner.nextBigDecimal();
		BigDecimal b = inputScanner.nextBigDecimal();
		BigDecimal c = inputScanner.nextBigDecimal();
		
		BigDecimal small = a.min(b);
		BigDecimal smallest = small.min(c);
		System.out.println(smallest);
	}
}
