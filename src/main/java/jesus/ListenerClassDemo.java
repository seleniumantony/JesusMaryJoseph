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
                   System.setProperty("webdriver.chrome.driver", "C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\resources\\chromedriver.exe");

       			WebDriver driver = new ChromeDriver();
       			 
       					 
       					 
       	driver.manage().window().maximize();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

driver.get("https://www.gmail.com");

          }
         

}

