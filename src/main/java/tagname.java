


 
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

		public class tagname {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\resources\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();						 
						 
		driver.manage().window().maximize();
		driver.get("https://www.dell.com/en-in/shop/laptops-2-in-1-pcs/sc/laptops");
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

 
