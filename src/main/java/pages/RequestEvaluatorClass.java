package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequestEvaluatorClass {
	
	private WebDriver driver;
	private WebDriverWait wait;

	public RequestEvaluatorClass(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	
	//user1  Evaluation Manager
	private By preparingscopebutton = By.xpath("(//div[@class='display-flex align-items-center']/span)[2]");

	private By hireevaluationrequestbutton = By.xpath("//div[@class='display-flex justify-content-flex-end margin-bottom-base']/button[text()='Hire Evaluation Request']");
	private By responsibleemployeedropdownlist = By.xpath("//select[@id='b4-b5-Dropdown1']");
	private By sendhirerequest = By.xpath("//button[@class='btn btn-primary OSFillParent']");
	
	public void openpreparingscopetab() 
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(preparingscopebutton)));
		
		WebElement button1 = driver.findElement(preparingscopebutton);
		clickButtonJS(button1);		
	}
	public void selectassets(String assetcheckbox) 
	{
		By checkbox = By.xpath(assetcheckbox);

		WebElement selectassetcheckbox1element = driver.findElement(checkbox);
		clickButtonJS(selectassetcheckbox1element);
	}
	public void sendhirerequest() throws InterruptedException 
	{
		WebElement hireevaluationrequestbuttonelement = driver.findElement(hireevaluationrequestbutton);
		clickButtonJS(hireevaluationrequestbuttonelement);
		
		Select list1value = new Select(driver.findElement(responsibleemployeedropdownlist));
		list1value.selectByVisibleText("Ahmed");
		
		Thread.sleep(1000);
		
		WebElement sendhirerequestelement = driver.findElement(sendhirerequest);
//		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.visibilityOf(sendhirerequestelement));
		clickButtonJS(sendhirerequestelement);
	}
	
}
