package TestPractice;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAlllinksWithCurrentUrl {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			
			if(links.get(i).isDisplayed()) {
			String nameOfLinks = links.get(i).getText();
			links.get(i).click();
			
			String pageUrl = driver.getCurrentUrl();
			System.out.println(nameOfLinks+ "  "+pageUrl);
			
			driver.navigate().back();
			links = driver.findElements(By.tagName("a"));
			
			}
		}
	} 
}
