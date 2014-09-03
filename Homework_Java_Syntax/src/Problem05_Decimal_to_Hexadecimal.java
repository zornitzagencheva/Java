import java.util.Locale;
import java.util.Scanner;

import com.sun.corba.se.impl.orbutil.HexOutputStream;
import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;
import com.sun.xml.internal.fastinfoset.algorithm.HexadecimalEncodingAlgorithm;


public class Problem05_Decimal_to_Hexadecimal 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.ROOT);
		Scanner inputScanner = new Scanner(System.in);
		
//		int num = inputScanner.nextInt();
//		int result = Integer.parseInt(""+num, 16);
//		Integer resInteger = Integer.valueOf(String.valueOf(num), 16);
		
		int num = inputScanner.nextInt();
		String hex = Integer.toHexString(num);
		
		System.out.println(hex.toUpperCase());
		//Convert back to int;
		int parsedResult = (int) Long.parseLong(hex, 16);
	}
}
