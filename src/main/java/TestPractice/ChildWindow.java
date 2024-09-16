package TestPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String> itr = windows.iterator();
		String mainWindow = itr.next();
		String childWindow = itr.next();
		System.out.println("main windows id: "+ mainWindow);
		System.out.println("child windows id: "+ childWindow);
		driver.switchTo().window(childWindow);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		driver.switchTo().window(mainWindow);
		driver.findElement(By.name("NewTab")).click();
		driver.switchTo().window(childWindow);
		driver.close();
		driver.switchTo().window(mainWindow);
		driver.close();
	}

}
