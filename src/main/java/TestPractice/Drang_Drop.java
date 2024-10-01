package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drang_Drop {
	@Test
	public void DoubleClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement src = driver.findElement(By.id("box2"));
		Actions action = new Actions(driver);
		action.clickAndHold(src).perform();
		WebElement des = driver.findElement(By.id("box104"));
		action.release(des).perform();
	}
}
