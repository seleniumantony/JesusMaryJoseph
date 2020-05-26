import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();						 
				 
driver.manage().window().maximize();
driver.get("https://www.dell.com/en-in/shop/laptops-2-in-1-pcs/sc/laptops");
  
WebElement a=driver.findElement(By.xpath("//button[@id='l1']"));
a.click();
Actions b = new Actions(driver);
b.moveToElement(a).perform();
driver.findElement(By.linkText("View All Products")).click();
try{Thread.sleep(3000);}catch(InterruptedException ie1 ){ie1.printStackTrace();}
 
driver.quit();

	
	
	}}	
	 

 
