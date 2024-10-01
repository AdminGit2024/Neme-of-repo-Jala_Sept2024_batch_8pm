package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
static WebDriver driver;
	public static File screenshot() throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\OM SAI AM\\eclipse-workspace\\Sept2024_SeleniumBatch\\Screenshot\\img.png");
	FileHandler.copy(src, des);
	
	return des;
	}
	
}
