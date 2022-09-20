package StratsWithSample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNG {
	
	@Test
	public void testSample()
	{
		System.setProperty("chromedriver.driver.chrome", "C:\\Users\\91845\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@data-group='men']"))).build().perform();
		//driver.findElement(By.xpath("//a[@data-group='men']")).click();
		
		driver.findElement(By.xpath("//a[text()='Topwear']")).click();
		
		driver.findElement(By.xpath("//label[text()='Black']")).click();
		String color=driver.findElement(By.xpath("//label[text()='Black']")).getText();
		
		driver.findElement(By.xpath("//label[text()='Roadster']")).click();
		String brand=driver.findElement(By.xpath("//label[text()='Roadster']")).getText();
		
		Assert.assertEquals(color, driver.findElement(By.xpath("//span[text()='Black']")).getText());
		Assert.assertEquals(brand, driver.findElement(By.xpath("//div[text()='Roadster']")).getText());
		System.out.println("Shrikant");
	}

}
