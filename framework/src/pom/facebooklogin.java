package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class facebooklogin 
{
	@FindBy(xpath="//input[@name='email']")
	private WebElement user;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement lgn_btn;
	
	public facebooklogin(WebDriver g)
	{
		super();
	}
	public void un(String username)
	{
		user.sendKeys(username);
	}
	public void pas(String password)
	{
		pwd.sendKeys(password);
	}
	public void login()
	{
		lgn_btn.click();
	}

}
