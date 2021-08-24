package uicontrols;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


public class Wait {
	
	
	public WebDriver globalWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Wait");
		return driver;
	}
	

}
