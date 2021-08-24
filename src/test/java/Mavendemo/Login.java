package Mavendemo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.base;
import page.loginPage;
import uicontrols.Wait;
import utility.Data;


public class Login extends base{
	
	
	
	Wait wait=new Wait();
	Data dt=new Data("Data.xlsx");


	@Test(dataProvider="getData")
	public void login(int user, String pass) throws IOException
	{
		driver=InitializeDriver();
		wait.globalWait(driver);
		System.out.println(user);
		String username=String.valueOf(user);
		
		loginPage lg=new loginPage(driver);
		lg.username().sendKeys(username);
		lg.password().sendKeys(pass);
		lg.loginbutton().click();
		
		
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= dt.credentials("Login");
		
		return data;
		
	}
}
