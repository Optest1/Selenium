package Mavendemo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.base;
import page.loginPage;
import uicontrols.Wait;
import utility.Data;


public class Login extends base{
	
	public static Logger log=LogManager.getLogger(Login.class.getName());
	
	Wait wait=new Wait();
	Data dt=new Data("Data.xlsx");


	@Test(dataProvider="getData")
	public void login(int user, String pass) throws IOException
	{
		driver=InitializeDriver();
		log.info("Hi");
		wait.globalWait(driver);
		log.info("URL launched");
		String username=String.valueOf(user);
		
		loginPage lg=new loginPage(driver);
		/*
		 * lg.username().sendKeys(username); lg.password().sendKeys(pass);
		 * lg.loginbutton().click();
		 */
		log.info("Login successful");
		log.info("Hi");
		
		
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= dt.credentials("Login");
		
		return data;
		
	}
}
