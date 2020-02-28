import java.util.List;

import org.openqa.selenium.By;
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
	          fd.get("https:https://dac-map-beta.azurewebsites.net/Homes/HomesIndex#"); 
	          
	          
	     }}