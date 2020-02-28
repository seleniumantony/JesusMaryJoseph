


 
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

		public class tagname {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\Antony\\eclipse for Appium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();						 
						 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> link=driver.findElements(By.xpath("//a"));
		int a=link.size();
		System.out.println(a);
			 
			for(WebElement li:link)
			{
			 System.out.println(li.getText());
				 System.out.println(li.getTagName());
				//System.out.println(li.getAttribute("href"));
			}
			}
		 


	}

 
