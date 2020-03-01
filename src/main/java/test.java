import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
			System.setProperty("webdriver.chrome.driver", "D:\\Antony\\eclipse for Appium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");

		 
		      ChromeOptions chromeOptions = new ChromeOptions();
		      chromeOptions.setBinary("/Applications/Google Chrome Canary.app/Contents/MacOS/Google Chrome Canary");
		      chromeOptions.addArguments("--headless");

		      ChromeOptions options = new ChromeOptions();
	          options.addArguments("headless");
	          options.addArguments("window-size=1200x600");
	          WebDriver fd = new ChromeDriver(options);
	         // driver.get("https://contentstack.built.io");
	          fd.get("https://www.dell.com/en-in/shop/laptops-2-in-1-pcs/sc/laptops"); 
	          File scrFile = ((TakesScreenshot)fd).getScreenshotAs(OutputType.FILE);
	      	//The below method will save the screen shot in d drive with name "screenshot.png"
	      	try {
	      		//learn
	      		FileUtils.copyFile(scrFile, new File("D:\\kingxavier.png"));
	      	} catch (IOException e) {
	      		// TODO Auto-generated catch block
	      		e.printStackTrace();
	      	}		        }      
	          
	     }