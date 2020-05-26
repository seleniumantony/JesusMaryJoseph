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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\resources\\chromedriver.exe");


	WebDriver driver = new ChromeDriver();

	driver.get("http://newtours.demoaut.com/");
	LoginPage = PageFactory.initElements(driver, Test2.class);
	LoginPage.Login();

	
	WebElement t=driver.findElement(By.linkText("Hotels"));
	LoginPage.Click(t);
	}
	}
