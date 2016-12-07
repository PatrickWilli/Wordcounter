package wordcounter;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wordcounter
{
	private String pathtofile;
	private int counter = 0;
	
	public Wordcounter(String pathtofile)
	{
		this.pathtofile = pathtofile;
	}
	
	public int startcounting()
	{
		try
		{
			Scanner scan = new Scanner(new FileInputStream(pathtofile));
			while(scan.hasNext())
			{
				scan.next();
				counter++;
			}
			
			System.out.println("Number of Words: " + counter);
			
		} 
		catch (FileNotFoundException e)
		{
			
		}
		return counter;
	}
}
