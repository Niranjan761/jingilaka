package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basetest implements framework_constants
{
	public static WebDriver g;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(gecko_key, gecko_value);
		WebDriver g=new FirefoxDriver();
		g.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		g.get(url);
		}
@AfterMethod
public void closeapp()
{
	g.close();
}
}
