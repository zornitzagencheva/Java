import java.util.Scanner;

public class Problem02_Triangle_Area {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter X coor. of first point: ");
		int aX = input.nextInt();
		System.out.print("Please enterY coor. of first point: ");
		int aY = input.nextInt();
		System.out.print("Please enter X coor. of second point: ");
		int bX = input.nextInt();
		System.out.print("Please enter Y coor. of second point: ");
		int bY = input.nextInt();
		System.out.print("Please enter X coor. of third point: ");
		int cX = input.nextInt();
		System.out.print("Please enter Y coor. of third point: ");
		int cY = input.nextInt();
		
		int area = ((aX * (bY -cY)) + (bX * (cY - aY)) + (cX * (aY - bY))) / 2;
		System.out.println(Math.abs(area));
	}

}
