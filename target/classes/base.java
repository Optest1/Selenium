package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	public WebDriver InitializeDriver () throws IOException
	{
	String path = System.getProperty("user.dir");
	Properties pos=new Properties();
	FileInputStream fis=new FileInputStream(path+File.separator+"src/main/java"+File.separator+"//config//data.properties");
	pos.load(fis);
	String browser=pos.getProperty("Browser");
	String url=pos.getProperty("URL");
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",
				path + File.separator + "Drivers" + File.separator + "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		log.info("Chrome Browser launched");
	}

	else if(browser.equalsIgnoreCase("firefox"))
	{
		
	}
	else if(browser.equalsIgnoreCase("IE"))
	{
		
	}
	
	return driver;
	}
	
	public void getScreenshot(WebDriver driver,String testname) throws IOException
	{
		long imageName = System.currentTimeMillis();

		String cwd = System.getProperty("user.dir");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination=cwd+"//Report//"+testname+imageName+".png";
		FileUtils.copyFile(source, new File(destination));
		
	}

}
