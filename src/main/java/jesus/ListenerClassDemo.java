package jesus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class ListenerClassDemo {
          @Test
          public void method()
          {
                   System.out.println("Starting test method");
                   System.setProperty("webdriver.chrome.driver", "D:\\Antony\\eclipse for Appium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");

       			WebDriver driver = new ChromeDriver();
       			 
       					 
       					 
       	driver.manage().window().maximize();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

driver.get("https://www.gmail.com");

          }
         

}

