package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

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
		driver.findElement(By.id("btn-six")).click();
		Thread.sleep(4000);
//		2.	xpath by text
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
	}
}
