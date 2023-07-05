package ProjectPlan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenProjectClass {
	private WebDriver driver;
	private WebDriverWait wait;

	public OpenProjectClass(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	private By projectsbutton = By.xpath("//span[text()='Projects List']");
	
	public void openprojectslist() throws InterruptedException 
	{
		WebElement button =driver.findElement(projectsbutton);
		clickButtonJS(button); 
	}
	
    private By notstartedprojectstab = By.xpath("(//a[@class='margin-right-base'])[4]");
	
	public void opennotstartedprojects() 
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(notstartedprojectstab)));
		
		WebElement button =driver.findElement(notstartedprojectstab);
		clickButtonJS(button);
	}
	public void openproject(String projectpath) 
	{
		By path = By.xpath(projectpath);

		WebElement button =driver.findElement(path);
		clickButtonJS(button);
	}
}
