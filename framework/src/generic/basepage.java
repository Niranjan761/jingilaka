package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basepage {
	
	public WebDriver g;
	public   basepage(WebDriver g) 
	{
	PageFactory.initElements(g, this);
	}

}
