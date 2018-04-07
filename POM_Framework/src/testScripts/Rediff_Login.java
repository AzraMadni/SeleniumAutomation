package testScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import objectRepository.Login_OR;
import testScripts.Preconditions;

public class Rediff_Login extends Preconditions {
	
	
	@Test
	public void login()
	{
		
		
		/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("#login1")).sendKeys("xyz@rediffmail.com");
		
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Pass123");
		
		driver.findElement(By.cssSelector("[name='proceed']")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Forgot")).click();*/
		
		Login_OR obj = new Login_OR();
		
		
		//obj.userid().sendKeys("abc@gmail.com");;
		obj.pass().sendKeys("124");
		obj.submit();
		
	}

}
