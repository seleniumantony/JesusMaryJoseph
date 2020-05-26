package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import package1.Loginpage;

public class TestCases {

public static void main(String[] args) {
// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\resources\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://dac-map-beta.azurewebsites.net/#");
driver.manage().window().maximize();

Loginpage login = new Loginpage(driver);
login.typeUsername("ajeyaraj@dacgroup.com");
login.typePassword("Welcome2DAC");
login.clickLoginButton();
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
String url = driver.getCurrentUrl();
if (url.equals("https://dac-map-beta.azurewebsites.net/Homes/HomesIndex/#")) {

System.out.println("match");
} else {
System.out.println("not match");
}
// driver.close();
}
}