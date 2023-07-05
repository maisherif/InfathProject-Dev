package ProjectPlan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApproveprojectPlanClass {
	private WebDriver driver;

	public ApproveprojectPlanClass(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	private By projectplantab = By.xpath("//div[@id='b4-b8-Title']");
	public void openprojectplan() 
	{
		WebElement button =driver.findElement(projectplantab);
		clickButtonJS(button);
	}
	private By approveicon = By.xpath("(//a[@class='display-flex align-items-center justify-content-center'])[2]");
	private By submitdecisionbutton = By.xpath("(//button[@class='btn btn-primary'])[3]");

	public void approveprojectplan() 
	{
		WebElement button =driver.findElement(approveicon);
		clickButtonJS(button);
		
		button =driver.findElement(submitdecisionbutton);
		clickButtonJS(button);
	}
	
}
