package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//By username=By.cssSelector("input#USER");
	//By password=By.cssSelector("input#PASSWORD");
	//By loginbutton=By.cssSelector("input#cmdEnter");
	
	@FindBy(css="input#USER")
	WebElement username;
	
	@FindBy(css="input#PASSWORD")
	WebElement password;
	
	@FindBy(css="input#cmdEnter")
	WebElement loginbutton;
	
	public WebElement username()
	{
		return username;
	}

	public WebElement password()
	{
		return password;
	}
	
	public WebElement loginbutton()
	{
		return loginbutton;
	}
}
