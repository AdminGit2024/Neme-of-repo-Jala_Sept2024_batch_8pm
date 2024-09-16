package TestPractice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Locator {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.linkText("Forgot Password")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create")).click();
//		4.	xpath by index
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("hello");
//	1.	xpath by attribute	
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("hi");
		
//		screenShot code
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		System.out.println(source);
		
		String random = RandomString.make(3);
		 String timeStamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		 String localPath = System.getProperty("user.dir");
		File target = new File(localPath+"\\Screenshot\\"+random+timeStamp+".png");
		FileHandler.copy(source, target);
	}

}
