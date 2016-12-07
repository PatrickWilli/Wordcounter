package wordcounter;

public class Main
{
	public static void main(String[]args)
	{
		
		if(args.length < 1)
		{
			System.out.println("Please specify path to an textfile!");
			System.exit(0);
		}
		Wordcounter c = new Wordcounter(args[0]);
		c.startcounting();
		
	}
}
