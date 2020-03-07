package com.objectrepository.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class TestNGAsserts {
 @Test
 public void testNGAsserts() throws Exception{
	 System.setProperty("webdriver.chrome.driver", "D:\\Antony\\eclipse for Appium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();				 
driver.manage().window().maximize();
 driver.get("https://www.gmail.com");
 String actualTitle = "Gmail";

 System.out.println("JMJ");
 Assert.assertEquals(driver.getTitle(), actualTitle);
 System.out.println("JMJ");
 Thread.sleep(2000);
 //driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("SoftwareTestingMaterial.com");
 //Test Condition 2: If page title didnt match with actualTitle then script throws an exception
 Thread.sleep(2000);
/* driver.get("https://www.gmail.com");
 actualTitle = "GoogleMail";
 Thread.sleep(2000);
 //Assert.assertEquals(driver.getTitle(), actualTitle, "Title not matched");
 Assert.assertEquals(driver.getTitle(), actualTitle);*/
 }
}