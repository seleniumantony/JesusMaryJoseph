import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();						 
				 
driver.manage().window().maximize();
driver.get("https://www.testandquiz.com/selenium/testing.html");
//Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
WebElement a=driver.findElement(By.id("testingDropdown"));
Select dropdown = new Select(a);
//dropdown.selectByVisibleText("Database Testing");  
dropdown.selectByIndex(3);  
	
	
	}}	
	 

 
