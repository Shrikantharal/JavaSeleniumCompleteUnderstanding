package xmlunderstanding;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization
{
	@Parameters({"URL","URL2"})
	@Test
	public void test(String url,String url2)//argument is must to catch parameter
	{
		System.out.println("This is first test using gobal parameter from testng.xml");
		System.out.println(url+url2);
	}

}
