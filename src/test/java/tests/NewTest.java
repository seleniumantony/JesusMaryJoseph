package tests;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.enterprise.util.io.FileUtils;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("JMJ");
	  String s="Antony";
	  Assert.assertEquals("Antony", s);
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\resources\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.google.com/?gws_rd=ssl");
	  
	  List<WebElement> co=driver.findElements(By.xpath("a"));
	  int h=co.size();
	  for(WebElement lis:co)
	  {
		  System.out.println(lis.getTagName());
		  System.out.println(lis.getAttribute("href"));
	  }
	  WebDriverWait ws=new WebDriverWait(driver,20);
	  WebElement o=ws.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" ")));
	// Initialize the JS object.
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String t=(String)js.executeScript("return document.title");
	System.out.println(t);
	
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("document.getElementBy.Id('').value('')");
	driver.manage().deleteAllCookies();
	
	driver.switchTo().alert().accept();
	
	
	WebElement st=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
	boolean buttonPresence = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
	System.out.println("---------");
	System.out.println(buttonPresence);
	System.out.println("---------");
	Actions a=new Actions(driver);
	a.doubleClick().build().perform();
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copy(f, new File("D:\\selenium\\websites\\j.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
