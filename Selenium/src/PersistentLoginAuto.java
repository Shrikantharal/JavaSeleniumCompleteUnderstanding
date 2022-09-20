import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PersistentLoginAuto {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91845\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://careers.persistent.com/candidate/login");
		
		WebElement Email=driver.findElement(By.xpath("input[placeholder='Email Id']"));
		WebElement password=driver.findElement(By.name("password"));
		
		Email.sendKeys("shrikant.m.haral@gmail.com");
		password.sendKeys("shri#@12345");
		driver.findElement(By.className("recaptcha-checkbox"));
		driver.findElement(By.linkText("LOGIN"));

	}

}
