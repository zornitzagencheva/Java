import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
public class Problem01_Rectangle_Area {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter first side of rectangle: ");
		int a = input.nextInt();
		System.out.print("Please enter second side of rectangle: ");
		int b = input.nextInt();
		int area = a * b;
		System.out.println("Area = " + area);
	}
}