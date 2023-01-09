package pages;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewProject {

	private WebDriver driver;
	private WebDriverWait wait;
	
	public AddNewProject(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	
	
	private By advancedsearch = By.xpath("//button[@class='btn ThemeGrid_MarginGutter']");
	private By assetstatusdropdownlist = By.xpath("(//div[@class='dropdown-container']/select)[1]");
	private By notassignedbutton = By.xpath("(//div[@class='dropdown-container']/select/option[11])[1]");

	private By showresultbutton = By.xpath("(//button[@class='btn btn-large btn-primary margin-top-base'])[1]");
	private By assetcheckbox = By.xpath("(//input[@class='checkbox'])[1]");

	public void selectasset( ) throws InterruptedException
	{
//		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(advancedsearch)));
		Thread.sleep(1000);

		WebElement button1 = driver.findElement(advancedsearch);
		clickButtonJS(button1);
		
		Thread.sleep(5000);

//		System.out.println(driver.findElement(assetstatusdropdownlist).getTagName()+" mm");
//		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(assetstatusdropdownlist)));
		
//		Select list1value = new Select(driver.findElement(assetstatusdropdownlist));
//		list1value.selectByValue("9");
		
		WebElement clickdropdownlist = driver.findElement(assetstatusdropdownlist);
		clickButtonJS(clickdropdownlist);
		
		
		WebElement chooseslected = driver.findElement(notassignedbutton);
		clickButtonJS(chooseslected);
		
		Thread.sleep(1000);
		
		WebElement button2 = driver.findElement(showresultbutton);
		clickButtonJS(button2);
		
		WebElement button3 = driver.findElement(assetcheckbox);
		clickButtonJS(button3);
		
		
	}
	public static  DateTimeFormatter day = DateTimeFormatter.ofPattern("dd");
	public static  DateTimeFormatter month = DateTimeFormatter.ofPattern("MM");
	public static  DateTimeFormatter year = DateTimeFormatter.ofPattern("yyyy");
	public static  LocalDateTime now = LocalDateTime.now();	
	
	private By addnewprojectbutton = By.xpath("//button[@class='btn btn-primary']");
	private By nextbutton = By.xpath("(//div[@class='margin-right-s OSInline']/button)[2]");
	private By projectnametextbox  = By.id("b4-ProjectName");
	private By startdatetextbox = By.id("b4-ProjectStartDate");
	private By enddatetextbox = By.id("b4-ProjectEndDate");
	private By notestextbox = By.id("b4-TextArea_Notes");
	private By saveandsendbutton = By.xpath("(//button[@class='btn btn-primary'])[2]");


	

	public void AddnewProject(String projectname,String notes ) throws InterruptedException
	{
		WebElement button1 = driver.findElement(addnewprojectbutton);
		clickButtonJS(button1);
		
		Thread.sleep(1000);
//		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(nextbutton)));
		
		WebElement button2 = driver.findElement(nextbutton);
		clickButtonJS(button2);
		
		 driver.findElement(projectnametextbox).sendKeys(projectname);
		 String startdate = month.format(now)+"-" +day.format(now)+"-"  + year.format(now);
		 driver.findElement(startdatetextbox).sendKeys(startdate);
		 
		 int endmonth= Integer.parseInt(month.format(now));
		 endmonth+=1;
		 String endate = endmonth+"-" +day.format(now)+"-"  + year.format(now);
		 driver.findElement(enddatetextbox).sendKeys(endate);
		 
		 
		 clickButtonJS(button2);
		 
		 Thread.sleep(1000);
		 driver.findElement(notestextbox).sendKeys(notes);

		 WebElement button3 = driver.findElement(saveandsendbutton);
		 clickButtonJS(button3);
		
	}


}
