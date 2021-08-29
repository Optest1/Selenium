package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshots{
	
	
	public void getScreenshota(WebDriver driver,String testname) throws IOException
	{
		long imageName = System.currentTimeMillis();

		String cwd = System.getProperty("user.dir");
		System.out.println(driver);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination=cwd+"//Report//"+testname+imageName+".png";
		System.out.println(destination);
		FileUtils.copyFile(source, new File(destination));
		
	}

}
