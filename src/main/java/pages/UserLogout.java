package pages;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UserLogout {

	private WebDriver driver;
	public UserLogout(WebDriver driver) {
		this.driver= driver;
		
	}
	private By logoutbutton = By.xpath("//*[@id='b2-b3-Icon3']");
	
	
	public void logout() throws InterruptedException
	{
		WebElement Logout = driver.findElement(logoutbutton);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120)); //wait for 120 sec
		wait.until(ExpectedConditions.visibilityOf(Logout)); //wait until element is displayed 
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Logout);  // click using javascript


	}
	
  
	

}
