package xmlunderstanding;

import org.testng.annotations.Test;

public class Day3 
{
	@Test
	public void homeloanExist()
	{
		System.out.println("this is exist home loan");
	}
	
	@Test
	public void homeloanExit()
	{
		System.out.println("this is exit home loan");
	}
	
	@Test
	public void carloanExist()
	{
		System.out.println("this is exit car loan");
	}
	
	@Test(groups="smoke")
	public void personelloanExist()
	{
		System.out.println("this is exit personel loan");
	}

}
