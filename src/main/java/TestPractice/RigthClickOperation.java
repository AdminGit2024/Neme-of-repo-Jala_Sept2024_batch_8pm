package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RigthClickOperation {

	@Test
	public void RightClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		Actions action = new Actions(driver);
		action.contextClick(rightClick).perform();
	}
}
