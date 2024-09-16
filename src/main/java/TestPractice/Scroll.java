package TestPractice;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,2500)");
		Thread.sleep(5000);
		WebElement Ref = driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].scrollIntoView(true);",Ref);
		Ref.click();
		js.executeScript("alert('hello deepak');");
	}

}
