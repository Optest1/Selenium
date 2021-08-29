package Mavendemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import config.base;
import uicontrols.Wait;
import utility.Screenshots;



public class screentest extends base{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(screentest.class.getName());
	
	Wait wait = new Wait();
	
	/*
	 * @Test public void login() throws IOException { driver = InitializeDriver();
	 * wait.globalWait(driver); log.info("URL launched");
	 * //Assert.assertTrue(false); }
	 */
	
	@Test
	public void login1() throws IOException {
		System.out.println("Hello");
	}
	
	@Test
	public void login2() throws IOException {
		System.out.println("Hello");
	}



}
