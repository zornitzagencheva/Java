import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test_9_zada4a 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
		Writer writer = new BufferedWriter(new FileWriter("Output.txt"));
		String line;
        int sum = 0;
        
	    try 
	    {
	        line = br.readLine();

	        while (line != null) 
	        {
	            String[] currentArr = line.split(" ");
	            writer.write(currentArr[1] + " " + currentArr[0] + "\r\n");
	            line = br.readLine();
	        }
	    } 
	    catch(IOException ex)
	    {
	    	System.out.println("Error");
	    }
	    finally 
	    {
	        br.close();
	        writer.close();
	    }
            
	}
}