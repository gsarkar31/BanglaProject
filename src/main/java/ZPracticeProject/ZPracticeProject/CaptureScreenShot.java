package ZPracticeProject.ZPracticeProject;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {
	
	WebDriver driver;
	
	public static String ScreenShot(WebDriver driver, String pictureName) throws IOException{
		
		TakesScreenshot sunny = (TakesScreenshot)driver;
		File source = sunny.getScreenshotAs(OutputType.FILE);
		String dest = "C:\\Users\\Goutam\\Desktop\\Screenshot\\"+pictureName+".jpg";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		return dest;
		
		
	}

}
