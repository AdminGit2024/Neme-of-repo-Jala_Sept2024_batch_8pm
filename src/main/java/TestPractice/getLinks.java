package TestPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLinks {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		List<WebElement> getNumberOfLinks = driver.findElements(By.tagName("a"));
		System.out.println(getNumberOfLinks.size());
		int count =0;
		for(int i=0;i<getNumberOfLinks.size();i++) {
			System.out.println(getNumberOfLinks.get(i).getText());
			if(getNumberOfLinks.get(i).isDisplayed()) {
				count++;
			}
			
		}
		
		System.out.println("total number of visible links : "+count);
		System.out.println("total number of invisible/broken links :"+(getNumberOfLinks.size()-count));
	}

}
