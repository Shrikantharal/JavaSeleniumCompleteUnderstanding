package xmlunderstanding;

import org.testng.annotations.Test;

public class Day2 
{
	@Test(dependsOnMethods= {"personalloanlogin"})
	public void homeloanlogin()
	{
		System.out.println("this is login home loan");
	}
	
	@Test(groups="smoke")
	public void carloanlogin()
	{
		System.out.println("this is login car loan");
	}
	
	@Test
	public void personalloanlogin()
	{
		System.out.println("this is login personel loan");
	}

}
