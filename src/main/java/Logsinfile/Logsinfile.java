package Logsinfile;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logsinfile {
	 public static void main(String[] args) {
	        
		    // Here we need to create logger instance so we need to pass Class name for which we want to create log file in my case Google is classname
		         Logger logger=Logger.getLogger("Google");
		        
		       PropertyConfigurator.configure("C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\java\\Logsinfile\\Log4j.properties");

		       System.setProperty("webdriver.chrome.driver", "D:\\Antony\\eclipse for Appium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				 
						 
						 
		driver.manage().window().maximize();
		        logger.info("Browser Opened");
		      
		      
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        logger.info("Implicit wait given");
		      
		        driver.get("https://www.google.co.in/");
		        logger.info("Url opened");
		      
		        driver.findElement(By.name("q")).sendKeys("Selenium");
		        logger.info("keyword type");           
		    }
		}


 
