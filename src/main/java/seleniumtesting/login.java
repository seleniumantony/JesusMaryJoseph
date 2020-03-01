package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
			System.setProperty("webdriver.chrome.driver", "D:\\Antony\\eclipse for Appium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");

			 
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.linkedin.com/login");
			driver.manage().window().maximize();
			
			WebElement a,b,c,d,e;
			a=driver.findElement(By.id("username"));
			a.sendKeys("xavier@gmail.com");
			b=driver.findElement(By.id("password"));
			b.sendKeys("Test@123");
			c=driver.findElement(By.xpath("//a[@class='btn__tertiary--medium action__btn']"));
			c.click();
 
	 
	}

}
