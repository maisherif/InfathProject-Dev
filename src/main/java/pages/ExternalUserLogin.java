package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExternalUserLogin {
	
	private WebDriver driver;
	public ExternalUserLogin(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	
	private By usernametextbox = By.id("Input_UsernameVal");
	private By passwordtextbox = By.id("Input_PasswordVal");
	private By loginbutton = By.xpath("//div[@id='b6-Button']/button/div[text()='Login']");
	
	
	public void userlogin(String username, String password) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		Thread.sleep(2000);
		driver.findElement(usernametextbox).sendKeys(username);
		driver.findElement(passwordtextbox).sendKeys(password);		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(loginbutton));
	

	}
}
