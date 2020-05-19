package package1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
WebDriver driver;
By Username = By.name("username");
By Password = By.name("password");
By LoginButton = By.id("btlogin");

public Loginpage(WebDriver driver) {
this.driver = driver;
}

public void typeUsername(String uname) {
driver.findElement(Username).sendKeys(uname);

}

public void typePassword(String pass) {
driver.findElement(Password).sendKeys(pass);

}

public void clickLoginButton() {
driver.findElement(LoginButton).click();

}

}