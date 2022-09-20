import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91845\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		//String name=driver.findElement(By.linkText("Blog")).getAttribute("href");
		//System.out.println(name);
		WebElement from=driver.findElement(By.id("fromCity"));
		from.sendKeys("Mumbai");
		Thread.sleep(10000);
		List<WebElement> a=driver.findElements(By.cssSelector(".calc60"));
		for(WebElement i:a)
		{
		
			if(i.getText().contains("Pune"))
			{
				i.click();
				break;
			}
		}
		WebElement to=driver.findElement(By.id("toCity"));
		Thread.sleep(5000);
		to.sendKeys("Aurangabad");
		List<WebElement> b=driver.findElements(By.cssSelector(".calc60"));
		for(WebElement i:b)
		{
		
			if(i.getText().contains("Mumbai, India"))
			{
				i.click();
				break;
			}
		}
		

		
		
		
		

	}

}
