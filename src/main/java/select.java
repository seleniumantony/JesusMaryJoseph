import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Antony\\eclipse for Appium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();						 
				 
driver.manage().window().maximize();
driver.get("https://www.testandquiz.com/selenium/testing.html");
Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
//dropdown.selectByVisibleText("Database Testing");  
dropdown.selectByIndex(3);  
	
	
	}}	
	 

 
