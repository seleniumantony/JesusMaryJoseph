package Logsinconsole;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logsinconsole {
    public static void main(String[] args) {
        
    // Here we need to create logger instance so we need to pass Class name for which we want to create log file in my case Google is classname
         Logger logger=Logger.getLogger("Google");
        
       PropertyConfigurator.configure("C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\java\\Logsinconsole\\Log4j.properties");

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\resources\\chromedriver.exe");

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

