package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	WebDriver driver;
	
	public homePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[contains(text(),'Telephonic Intake')]")
	WebElement telephonicbutton;
	
	@FindBy(xpath="//div[contains(text(),'Reporting')]")
	WebElement reportingbutton;
	
	@FindBy(xpath="//div[contains(text(),'Paper Intake')]")
	WebElement paperbutton;
	
	public WebElement telephonicbutton()
	{
		return telephonicbutton;
	}

	public WebElement reportingbutton()
	{
		return reportingbutton;
	}
	
	public WebElement paperbutton()
	{
		return paperbutton;
	}
}
