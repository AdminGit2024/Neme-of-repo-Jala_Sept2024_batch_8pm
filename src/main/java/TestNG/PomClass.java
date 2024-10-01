package TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass extends TesBase123{

//	Pom - page Object Model 
//	it is handling the mulptiple pages
//	We can mainatian the code
//	We can easy to handle code
//	Pom is Page design pattern
//	1. Object factory - weblelements   2.Constructor  3. Action functions
	
	@FindBy(id = "UserName")
	WebElement username;
	
	@FindBy(id = "Password")
	WebElement passowrd;
	
	@FindBy(id = "btnLogin")
	WebElement loginBtn;
	
public	PomClass(){
		PageFactory.initElements(driver, this);
	}

public void username() {
	username.sendKeys("training@jalaacademy.com");
}
	public void passowrd() {
		passowrd.sendKeys("jobprogram");
	}
	
	public void loginbtn() {
		loginBtn.click();
	}
}
