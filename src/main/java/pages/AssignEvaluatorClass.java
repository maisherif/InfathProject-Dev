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
	private By eyeiconbutton = By.xpath("(//a[@href='#']/i[@class='icon fa fa-eye fa-1x'])[1]");
	private By dropdownlist = By.xpath("//div[@class='choices']");
	private By searchtextbox = By.xpath("//input[@class='choices__input choices__input--cloned']");
	private By evaluatordropdownlist = By.xpath("//div[@id='choices--b4-b2-DropdownSelect-item-choice-3']");
	private By saveevaluator = By.xpath("//div[@class='OSInline']/button");

	public void assignresposible() 
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(eyeiconbutton)));
		
		WebElement eyeiconbuttonelement = driver.findElement(eyeiconbutton);
		clickButtonJS(eyeiconbuttonelement);
		
		WebElement dropsownlistelement = driver.findElement(dropdownlist);
		clickButtonJS(dropsownlistelement);
		  
		WebElement search = driver.findElement(searchtextbox);
		search.sendKeys("شركة معايير للتقييم");
		
		search.sendKeys(Keys.ENTER);

		WebElement evaluator = driver.findElement(evaluatordropdownlist);
		clickButtonJS(evaluator);
		
		WebElement saveevaluatorelement = driver.findElement(saveevaluator);
		clickButtonJS(saveevaluatorelement);
	}

}
