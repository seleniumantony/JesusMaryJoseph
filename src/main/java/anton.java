import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class anton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\resources\\chromedriver.exe");

		 
		WebDriver driver = new ChromeDriver();
WebElement  a,b,c,d,e,f,g,h,i,j,k,l,m,n,o;
		driver.get("https://dac-map-beta.azurewebsites.net/Homes/HomesIndex#");
		
		//WebElement o_tbl_object = driver.findElement(By.id("customers"));                    

		   driver.manage().window().maximize();
		  a= driver.findElement(By.id("txt_username")); b= driver.findElement(By.id("txt_password"));
		  a.sendKeys("ajeyaraj@dacgroup.com");  b.sendKeys("Welcome2DAC");
		  
		  c= driver.findElement(By.id("btlogin"));c.click();
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  driver.get("https://dac-map-beta.azurewebsites.net/Accounts/AccountsIndex#");
		  //d= driver.findElement(By.linkText("Accounts")); d.click();
		 // driver.switchTo().frame(1);
		Thread.sleep(5000);  
		 d= driver.findElement(By.xpath("//input[@class='form-control input-sm']"));
		 Thread.sleep(5000);
		 d.sendKeys("jmj");
		  Thread.sleep(5000);
		  e= driver.findElement(By.xpath("*//button[@id='btnTableSearch']"));e.click();
		  Thread.sleep(5000);
		  f= driver.findElement(By.xpath("//i[@class='fa fa-pencil']"));f.click();
		g= driver.findElement(By.xpath("//a[@id='liStep3']")); g.click();
		 Thread.sleep(20000);driver.switchTo().frame(0);  Thread.sleep(5000);
		h= driver.findElement(By.id("UploadType"));
		Select v=new Select(h);
		v.selectByIndex(1);
		i= driver.findElement(By.id("UniqueIdentifier"));
		Select v1=new Select(i);
		v1.selectByIndex(1); 
		
		//j= driver.findElement(By.id("dropzoneForm"));
		//j.click();
		Thread.sleep(5000);
		StringSelection sel = new StringSelection("Location Template-Trip Advisor.xlsx");
		//j.sendKeys("C:\\Users\\antonyj\\Location Template-Trip Advisor.xlsx");
	 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		 System.out.println("selection" +sel);
		 
		 
		// Open Monster.com
		 
		 Thread.sleep(2000);
		 
		 // This will scroll down the page 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("scroll(0,350)");
		 JavascriptExecutor js1 = (JavascriptExecutor)driver; 
		// Wait for 5 seconds
		 Thread.sleep(5000);
		 
		// This will click on Browse button
		 driver.findElement(By.id("dropzoneForm")).click();
		 
		 
		 
		 System.out.println("Browse button clicked");
		 
		 // Create object of Robot class
		 Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 Thread.sleep(1000);
		      
		  // Press Enter
		 robot.keyPress(KeyEvent.VK_ENTER);
		 
		// Release Enter
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(1000);
		        
		       
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 Thread.sleep(2000);
		 //js1.executeScript("window.scrollBy(0,750)");
		 Thread.sleep(6000);
			k= driver.findElement(By.id("//*[@id=\"btnNext\"]"));k.click();
		 
		 
	
	}

}
