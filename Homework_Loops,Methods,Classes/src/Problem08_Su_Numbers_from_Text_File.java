import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Problem08_Su_Numbers_from_Text_File
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
        int sum = 0;
        
	    try 
	    {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) 
	        {
	            sb.append(line);
	            int currentNum = Integer.parseInt(line);
                    sum += currentNum;
	            line = br.readLine();
	        }
	        String everything = sb.toString();
	    } 
	    catch(IOException ex)
	    {
	    	System.out.println("Error");
	    }
	    finally 
	    {
	        br.close();
	    }
            
        System.out.println(sum);
	}
}
