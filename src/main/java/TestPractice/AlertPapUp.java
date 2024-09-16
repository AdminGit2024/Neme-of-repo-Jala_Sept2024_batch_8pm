package TestPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPapUp {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.linkText("Forgot Password")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Popups")).click();
		driver.findElement(By.id("alertBox")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();
		
		driver.findElement(By.id("confirmBox")).click();
		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alt1.dismiss();
		
	}

}
