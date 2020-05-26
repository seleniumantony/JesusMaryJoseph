import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jmj {
	public static void main(String[] args)  {
	  
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\resources\\chromedriver.exe");

	 
	      ChromeOptions chromeOptions = new ChromeOptions();
	      chromeOptions.setBinary("/Applications/Google Chrome Canary.app/Contents/MacOS/Google Chrome Canary");
	      chromeOptions.addArguments("--headless");

	      ChromeOptions options = new ChromeOptions();
          options.addArguments("headless");
          options.addArguments("window-size=1200x600");
          WebDriver fd = new ChromeDriver(options);
         // driver.get("https://contentstack.built.io");
          
          fd.get("https://www.microsoft.com/en-us/worldwide.aspx");
          List <WebElement> alllinks = fd.findElements(By.tagName("a"));
          for(int i=0;i<alllinks.size();i++)
              System.out.println(alllinks.get(i).getText());
          
           
          for(int i=0;i<alllinks.size();i++){
              alllinks.get(i).click();
            
              WebElement webElement = fd.findElement(By.xpath("//div[@class='m-banner f-align-left']")); 
            	      System.out.println(webElement.getText()); 
              //  WebDriverWait wait = new WebDriverWait(fd, 15);
              //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='m-banner f-align-left']"))); 
              
              
             // String yourtext= fd.findElement(By.xpath("//div[@class='m-banner f-align-left']")).getText();
             // System.out.println(yourtext);
              fd.navigate().back();
          }}}