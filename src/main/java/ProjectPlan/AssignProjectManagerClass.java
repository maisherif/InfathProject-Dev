package ProjectPlan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignProjectManagerClass {
	private WebDriver driver;

	public AssignProjectManagerClass(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	private By projectmanagertab = By.xpath("//div[@id='b4-b7-Title']");
	private By mohamadsaadicon = By.xpath("(//i[@class='icon margin-right-s fa fa-user-plus fa-1x'])[3]");
	private By assignproject = By.xpath("(//button[@class='btn btn-primary'])[2]");
	
	public void assignprojectmanager() 
	{
		WebElement button =driver.findElement(projectmanagertab);
		clickButtonJS(button);
		
		button =driver.findElement(mohamadsaadicon);
		clickButtonJS(button);
		
		button =driver.findElement(assignproject);
		clickButtonJS(button);
	}


}
