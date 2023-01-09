package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UserLogin {

	private WebDriver driver;
	public UserLogin(WebDriver driver) {
		this.driver= driver;
		
	}
	private By usernametextbox = By.xpath("//input[@id='Input_UsernameVal']");
	private By passwordtextbox = By.xpath("//input[@id='Input_PasswordVal']");
	private By loginbutton = By.xpath("//div[@class=' full-width OSInline']/button");
	
	
	public void userlogin(String username, String password) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120)); //wait for 120 sec
		WebElement usernametext = driver.findElement(usernametextbox);
		wait.until(ExpectedConditions.visibilityOf(usernametext)); //wait until element is displayed 

		usernametext.sendKeys(username);
		driver.findElement(passwordtextbox).sendKeys(password);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(loginbutton));  // click using javascript


	}
	
	

}
