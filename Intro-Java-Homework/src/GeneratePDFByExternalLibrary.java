import java.awt.Font;
import java.awt.print.PrinterException;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GeneratePDFByExternalLibrary 
{
	public static void main(String[] args) throws IOException, PrinterException 
	{
		Locale.setDefault(Locale.ROOT);
		
		String[] cards = new String[52];
		String temp = "";
		int count = 0;
		
		char[] suits = new char[4];
		suits[0] = '\u2663';
		suits[1] = '\u2665';
		suits[2] = '\u2666';
		suits[3] = '\u2660';
		
		for (int i = 0; i < suits.length; i++) 
		{
			for (int j = 2; j < 15; j++) 
			{
				switch (j) {
				case 11:
					temp = "J";
					break;
				case 12:
					temp = "Q";
					break;
				case 13:
					temp = "K";
					break;
				case 14:
					temp = "A";
					break;
				default:
					temp = temp + j;
					break;
				}
				temp += suits[i] + " ";
				cards[count] = temp;
				count++;
				temp = "";
			}
		}
		
		for (String str : cards) 
		{
			System.out.println(str);
		}
	}
}
