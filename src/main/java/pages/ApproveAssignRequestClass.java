package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApproveAssignRequestClass {

	private WebDriver driver;
	private WebDriverWait wait;

	public ApproveAssignRequestClass(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	private By assignmentrequestsbutton = By.xpath("//span[text()='Assignment Requests']");

	public void openassignmentrequests() 
	{
		WebElement button = driver.findElement(assignmentrequestsbutton);
		clickButtonJS(button);
	}
	private By acceptbutton = By.xpath("//button[@class='btn btn-primary margin-x-s']");
	private By acceptcheckbox = By.xpath("//input[@id='b5-Checkbox1']");
	private By acceptconfirmbutton = By.xpath("//button[@class='btn btn-primary OSFillParent']");

	
	public void approverequest(String eyeicon)
	{
	   By eyeiconbutton = By.xpath(eyeicon);
	   
	   WebElement button = driver.findElement(eyeiconbutton);
	   clickButtonJS(button);
		
	   button = driver.findElement(acceptbutton);
	   clickButtonJS(button);
	   
	   button = driver.findElement(acceptcheckbox);
	   clickButtonJS(button);
	   
	   button = driver.findElement(acceptconfirmbutton);
	   clickButtonJS(button);
	}
}
