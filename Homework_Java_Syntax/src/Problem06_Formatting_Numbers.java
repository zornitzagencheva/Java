import java.util.Locale;
import java.util.Scanner;

public class Problem06_Formatting_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Locale.setDefault(Locale.ROOT);
		 Scanner input = new Scanner(System.in);
         int a = input.nextInt();
         double b = input.nextDouble();
         double c = input.nextDouble();
        
         String aHexString = Integer.toHexString(a).toUpperCase();
         String aBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
         System.out.format("|%-10s|%s|%10.2f|%-10.0f|",aHexString,aBinary,b,c);
	}

}
