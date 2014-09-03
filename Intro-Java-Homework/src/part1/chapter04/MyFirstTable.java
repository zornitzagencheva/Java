
/*
 * This class is part of the book "iText in Action - 2nd Edition"
 * written by Bruno Lowagie (ISBN: 9781935182610)
 * For more info, go to: http://itextpdf.com/examples/
 * This example only works with the AGPL version of iText.
 */
 
package part1.chapter04;
 
import java.awt.Font;
import java.beans.Encoder;
import java.io.FileOutputStream;
import java.io.IOException;
 
import java.util.Locale;

import org.omg.IOP.Encoding;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
 
public class MyFirstTable 
{
	 
    /** The resulting PDF file. */
    public static final String RESULT
        = "first_table.pdf";
    
    /**
     * Main method.
     * @param    args    no arguments needed
     * @throws DocumentException 
     * @throws IOException
     */
    public static void main(String[] args)
        throws IOException, DocumentException {
    	
    	new MyFirstTable().createPdf(RESULT);
        
    }
 
    /**
     * Creates a PDF with information about the movies
     * @param    filename the name of the PDF file that will be created.
     * @throws    DocumentException 
     * @throws    IOException
     */
    public void createPdf(String filename)
        throws IOException, DocumentException {
    	// step 1
    	
        Document document = new Document();
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        // step 3
        document.open();
        // step 4
        BaseFont font = BaseFont.createFont("C:\\Windows\\Fonts\\arial.TTF", BaseFont.IDENTITY_H, true);
        
        document.add(createFirstTable());
        // step 5
        document.close();
    }
 
    /**
     * Creates our first table
     * @return our first table
     * @throws IOException 
     * @throws DocumentException 
     */
    public static PdfPTable createFirstTable() throws DocumentException, IOException 
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
		
        PdfPTable table = new PdfPTable(4);
        
        for (int i = 0; i < cards.length; i++)
        {
        	PdfPCell c1 = new PdfPCell(new Phrase(cards[i]));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        	table.addCell(c1);
		}
       
        return table;
    }
}
