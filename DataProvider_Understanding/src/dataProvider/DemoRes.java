package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DemoRes 
{
	
	
	@DataProvider(name="getData")
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];   //[3] data combinations and [2] is for each combination passing two values
											//each combination is a row and each column is value
		data[0][0]="fisruser";
		data[0][1]="firstpassword";			//[0] first combination [1]second column value i.e index starts with 0.
		
		data[1][0]="seconduser";			//[1] is second data combination [0] first column value
		data[1][1]="secondpassword";
		
		data[2][0]="thirduser";
		data[2][1]="thirdpassword";
		
		return data;	
	}
	@Test(dataProvider="getData")
	public void useData(String user,String pass)				  //use to catch value of each combination
	{
		System.out.println(user);
		System.out.println(pass);
	}

	
}
