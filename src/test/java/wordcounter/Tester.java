package wordcounter;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class Tester extends TestCase
{

	@Test
	public void test()
	{
		Wordcounter c = new Wordcounter("C:\\Users\\phamm\\Desktop\\count.txt");
		assertEquals(5, c.startcounting());
	}

}
