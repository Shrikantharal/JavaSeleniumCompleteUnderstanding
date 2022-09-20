import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import dev.failsafe.internal.util.Assert;



public class StaleElementDemo {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91845\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("LOG IN")).click();
		
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("secret_sauce");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		
		
		driver.navigate().refresh();
		try
		{
			username.sendKeys("secret_sauce");
			username.sendKeys("secret_sauce");	
		}
		catch(StaleElementReferenceException e)
		{
			WebElement usernameq=driver.findElement(By.name("email"));
			usernameq.sendKeys("secret_sauce");
			
			WebElement passwordq=driver.findElement(By.name("password"));
			passwordq.sendKeys("secret_sauce");
		}
       
		
		
		
	
		
		

	}

}
