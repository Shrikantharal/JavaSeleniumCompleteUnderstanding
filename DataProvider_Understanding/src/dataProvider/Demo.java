package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo 
{
	//purpose of using data provider is to achieve testing using multiple combi of data set
	//example
	//1.corect username and passowrd
	//2.wrong username and correct password
	//3.bot wrong username and password
	
	
	@DataProvider
	public static Object[][] getData()
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
	

}
