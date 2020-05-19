package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	static WebDriver driver;
	Test2 LoginPage;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Antony\\eclipse for Appium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");


	WebDriver driver = new ChromeDriver();

	driver.get("http://newtours.demoaut.com/");
	LoginPage = PageFactory.initElements(driver, Test2.class);
	LoginPage.Login();

	
	WebElement t=driver.findElement(By.linkText("Hotels"));
	LoginPage.Click(t);
	}
	}
