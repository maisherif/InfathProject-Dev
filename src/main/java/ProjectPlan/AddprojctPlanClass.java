package ProjectPlan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddprojctPlanClass {
	private WebDriver driver;
	private WebDriverWait wait;
	public AddprojctPlanClass(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	private By projectsbutton = By.xpath("//span[text()='Projects']");
	private By allprojectstab = By.xpath("(//a[@class='margin-right-base'])[1]");
	public void openprojectslist() throws InterruptedException 
	{
		WebElement button =driver.findElement(projectsbutton);
		clickButtonJS(button);
		
		Thread.sleep(2000);
	}
	public void openallprojects() throws InterruptedException 
	{
		
		WebElement button =driver.findElement(allprojectstab);
		clickButtonJS(button);
		
		Thread.sleep(2000);
	}
	
	public void openproject(String projectpath) 
	{
		By path = By.xpath(projectpath);

		WebElement button =driver.findElement(path);
		clickButtonJS(button);
	}
	private By projectplantab = By.xpath("//div[@id='b5-b8-Title']");
	public void openprojectplan() 
	{
		WebElement button =driver.findElement(projectplantab);
		clickButtonJS(button);
	}
	
	private By addauction = By.xpath("(//button[@class='btn btn-primary'])[2]");
	
	private By auctionnametextbox = By.xpath("//input[@id='b5-b28-b2-AuctionNameInput']");
	private By auctiontypedropdownlist = By.xpath("(//div[@class='dropdown-container OSFillParent']/select)[2]");
	private By platformdropdownlist = By.xpath("(//div[@class='dropdown-container']/select)[1]");
	private By startdatetextbox = By.xpath("//input[@id='b5-b28-b2-b2-Input_DateVar']");
	private By enddatetextbox = By.xpath("//input[@id='b5-b28-b2-b3-Input_DateVar']");
	private By numberofassets = By.xpath("(//span[@class='text-primary'])[6]");
	private By addauctionbutton = By.xpath("(//button[@class='btn btn-primary'])[3]");


	public void addauctiontypeElectronic(String auctionname, String startdate, String enddate) throws InterruptedException 
	{
		
		WebElement button =driver.findElement(addauction);
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(button));
		clickButtonJS(button);
		
		Thread.sleep(1000);
		
		WebElement textbox = driver.findElement(auctionnametextbox);
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(textbox));
		textbox.sendKeys(auctionname);
		
		Select list1value = new Select(driver.findElement(auctiontypedropdownlist));
		list1value.selectByValue("1");
		
		list1value = new Select(driver.findElement(platformdropdownlist));
		list1value.selectByValue("1");
		
		//driver.findElement(startdatetextbox).sendKeys(startdate);
		
		WebElement Date = driver.findElement(startdatetextbox);
		Date.click();
		Date.sendKeys(Keys.ENTER);
		
		Date = driver.findElement(enddatetextbox);
		Date.click();
		Date.sendKeys(Keys.ENTER);
		
		
		//driver.findElement(enddatetextbox).sendKeys(enddate);
		 
		
		String gettotal = driver.findElement(numberofassets).getText();
		int total =Integer.parseInt(gettotal);
		
		for(int i=1;i<=total;i++)
		{
			By checkboxpath = By.xpath("(//input[@class='checkbox'])["+i+"]");
			button =driver.findElement(checkboxpath);
			clickButtonJS(button);
		}
		
		Thread.sleep(2000);
		button =driver.findElement(addauctionbutton);
		clickButtonJS(button);
		Thread.sleep(2000);
	}
	private By submitdorapprovalbutton = By.xpath("(//button[@class='btn btn-primary'])[2]");

	public void submitforapproval() 
	{
		
		
		WebElement button =driver.findElement(submitdorapprovalbutton);
		clickButtonJS(button);
		
	}
	
	

}
