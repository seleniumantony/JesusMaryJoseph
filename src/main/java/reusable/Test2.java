package reusable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@FindBy(name="userName")
	private WebElement username;

	@FindBy(name="password")
	private WebElement password;

	@FindBy(name="login")
	private WebElement login;


	public void Login() {
	username.sendKeys("mercury");
	password.sendKeys("mercury");
	login.click();
	}
	public void Click(WebElement s)
	{

	s.click();
	}
	}

