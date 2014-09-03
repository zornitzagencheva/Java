import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Problem06_Random_Hands_of_5_Cards 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A"};
        String[] faces = {"♣", "♦", "♥", "♠" };
        int fullHouseCount = 0;
        
        
        ArrayList<String> allCards = new ArrayList<String>();
        
        for (String card : cards) 
        {
            for(String face : faces)
            {
                String tempcard = card+face;
                allCards.add(tempcard);
            }
        }
        
        Random rnd = new Random();
        int numberOfCards = 5;
        
        for (int i = 0; i < num; i++) 
        {
        	for (int j = 0; j < numberOfCards; j++) 
        	{
				int current = rnd.nextInt(52);
				System.out.printf("%s", allCards.get(current));
			}
        	System.out.println();
		}
	}
}
