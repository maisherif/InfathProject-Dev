package pages;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignEvaluatorClass {
	
	private WebDriver driver;
	private WebDriverWait wait;

	public AssignEvaluatorClass(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	
	
	//user  Purchasing Employee
	private By dropdownlist = By.xpath("//div[@class='choices']");
	private By searchtextbox = By.xpath("//input[@class='choices__input choices__input--cloned']");
	private By evaluatordropdownlist = By.xpath("//div[@id='choices--b4-b2-DropdownSelect-item-choice-3']");
	private By saveevaluator = By.xpath("//div[@class='OSInline']/button");

	private By requestsandinvoicesbutton = By.xpath("//div[@id='b3-b1-Menu']");

	private By requestsbutton = By.xpath("(//a[text()='Requests'])[2]");
	public void openrequest() throws InterruptedException
	{
		WebElement requests = driver.findElement(requestsandinvoicesbutton);
		clickButtonJS(requests);
		
		requests = driver.findElement(requestsbutton);
		clickButtonJS(requests);
		
		Thread.sleep(2000);
	}
	public void assignresposible(String eyeicon, String evaluatorname) 
	{
		
		
		By eyeiconbutton = By.xpath(eyeicon);
		
		WebElement eyeiconbuttonelement = driver.findElement(eyeiconbutton);
		clickButtonJS(eyeiconbuttonelement);
		
		WebElement dropsownlistelement = driver.findElement(dropdownlist);
		clickButtonJS(dropsownlistelement);
		  
		WebElement search = driver.findElement(searchtextbox);
		search.sendKeys(evaluatorname);
		
		search.sendKeys(Keys.ENTER);

		WebElement evaluator = driver.findElement(evaluatordropdownlist);
		clickButtonJS(evaluator);
		
		WebElement saveevaluatorelement = driver.findElement(saveevaluator);
		clickButtonJS(saveevaluatorelement);
	}

}
