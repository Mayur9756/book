package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Contact {
	
	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
	Contact c = new Contact();
	 driver  = new ChromeDriver();
	c.initialize(driver);
	c.login(driver);
	 c.projectSelect(driver);
	}

	public void initialize(WebDriver driver)
	{
		driver=this.driver;
		
		System.setProperty("webdriver.chrome.driver","F://chromedriver//chromedriver.exe");
		 
		
		 driver.get("https://app.mysitebook.io/app/auth/signin/");
		 driver.manage().window().maximize();
	}
	
	public void login(WebDriver driver) throws InterruptedException
	{
		driver=this.driver;
		Thread.sleep(5000); 
		 driver.findElement(By.id("mobileNumber")).sendKeys("9850196001"+Keys.ENTER);
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@class='button-group text-center']/button")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("password")).sendKeys("Book@9756");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@class=\"button-group text-center\"]/button")).click();
		 
	}
	
	public void projectSelect(WebDriver driver) throws InterruptedException
	{
		driver=this.driver;
		Thread.sleep(5000); 
		 driver.findElement(By.xpath("//div[@class='open-button ng-star-inserted']//button")).click();
		
	}
}
