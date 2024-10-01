package TestPractice;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MousehoverAction {

	@Test
	public void DoubleClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement dobleClick = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		action.doubleClick(dobleClick).perform();
	}
}
