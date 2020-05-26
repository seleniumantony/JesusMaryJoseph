

	import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	public class screenshot {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\resources\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			 
					 
					 
	driver.manage().window().maximize();
	driver.get("https://www.linkedin.com/login");
	 //learn
	 		              File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//The below method will save the screen shot in d drive with name "screenshot.png"
	try {
		//learn
		FileUtils.copyFile(scrFile, new File("D:\\xavier.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		        } }


 
