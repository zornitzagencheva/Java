import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class Problem03_Points_inside_Figure 
{
	public static void main(String[] args) 
	{
    	Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter X and Y coor. of the point: ");
		double aX = input.nextDouble();
		double aY = input.nextDouble();
		
		if (aX >= 12.5 && aX <= 22.5 && aY >= 6 && aY <= 8.5) 
		{
			System.out.println("Inside");
		}else if (aX >= 12.5 && aX <= 17.5 && aY >= 8.5 && aY <= 13.5) 
		{
			System.out.println("Inside");
		}else if (aX >= 20 && aX <= 17.5 && aY >= 8.5 && aY <= 13.5) 
		{
			System.out.println("Inside");
		}else 
		{
			System.out.println("Outside");
		}
	}
}
