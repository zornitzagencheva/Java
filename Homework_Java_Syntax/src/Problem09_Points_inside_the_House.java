import java.util.Locale;
import java.util.Scanner;

public class Problem09_Points_inside_the_House 
{
	private static final double By = 3.5;
	private static final double Bx = 17.5;
	private static final double Cx = 22.5;
	private static final double Cy = 8.5;
	private static final double Ax = 12.5;
	private static final double Ay = 8.5;

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.ROOT);
		Scanner inputScanner = new Scanner(System.in);
		double X = inputScanner.nextDouble();
		double Y = inputScanner.nextDouble();
		Double positionLeftLine = ((Bx-Ax)*(Y-Ay) - (By-Ay)*(X-Ax));
		Double positionRigthLine = ((Bx-Cx)*(Y-Cy) - (By-Cy)*(X-Cx));
		
		if (positionLeftLine >= 0 && positionRigthLine <= 0 && Y < 8.5) 
		{
			System.out.println("Inside");
		}
		else if (X > 12.5 && X < 17.5 && Y > 8.5 && Y < 13.5) 
		{
			System.out.println("Inside");
		}
		else if (X > 20 && X < 22.5 && Y > 8.5 && Y < 13.5) 
		{
			System.out.println("Inside");
		}
		else 
		{
			System.out.println("Outside");
		}
	}
}
