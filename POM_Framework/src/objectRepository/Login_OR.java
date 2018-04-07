package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testScripts.Preconditions;

public class Login_OR extends Preconditions {
	
	/*@FindBy(id="login1")
	WebElement uid;*/
	
	By username = By.id("login1");
	By password = By.id("password");
	
	public WebElement userid()
	{
		return driver.findElement(username);
	}
	
	public WebElement pass()
	{
		return driver.findElement(password);
	}
	
	public void submit()
	{
		driver.findElement(By.name("proceed")).click();;
	}

}
