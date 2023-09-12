package pages;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AssignTaskSupervisiorClass {

	private WebDriver driver;
	public AssignTaskSupervisiorClass(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	public String TotalAssets(String TotalAssets)
	{
		 String  TotalnoAssets = TotalAssets;
		 return TotalnoAssets;
	}
	WebDriverWait wait;
	
	private By newcreatedtasksbutton = By.xpath("(//div[@class='display-flex align-items-center margin-right-base OSInline']/span[text()='New'])"); //filter new in Task List
	private By taskname = By.xpath("(//div[@class='display-flex align-items-flex-start']/div[text()='Judicial Decision Number'])[1]");
	private By assigntaskbutton = By.xpath("//div[@class='tabs-header-tab ph']/div[text()='Assign task']");
	private By dataentrydropdownlist = By.xpath("//div[@class='dropdown-container OSFillParent']/select");
	private By assigntodataentry = By.xpath("//button/div[text()='Assign']");
	private By totalAssets = By.xpath("(//div[text()='Number of Assets']/span)[1]");

	private By checkbox1 = By.xpath("(//input[@type='checkbox'])[1]");
	
	 public void SelectassetsAndStartCreate() throws InterruptedException
	    { 
	        Thread.sleep(2000);
//	        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//	        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@class='checkbox'])[2]"))));
	        //JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement newbutton = driver.findElement(checkbox1);
			clickButtonJS(newbutton);
	    }
	
	public void suppervisorassigndataentry() throws InterruptedException  
	{
//		Thread.sleep(100);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				
		WebElement newbutton = driver.findElement(newcreatedtasksbutton);
		wait.until(ExpectedConditions.visibilityOf(newbutton));
		clickButtonJS(newbutton);
		
		WebElement totalnoofassets = driver.findElement(totalAssets);

		System.out.println(totalnoofassets.getText());
		
		TotalAssets(totalnoofassets.getText());
		
		WebElement tasknameelement = driver.findElement(taskname);
		wait.until(ExpectedConditions.visibilityOf(tasknameelement));
		clickButtonJS(tasknameelement);
	
        wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		WebElement assigntaskbuttonelement = driver.findElement(assigntaskbutton);
		wait.until(ExpectedConditions.visibilityOf(assigntaskbuttonelement));

		clickButtonJS(assigntaskbuttonelement);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		WebElement dataentrydropdownlistelement = driver.findElement(dataentrydropdownlist);
		wait.until(ExpectedConditions.visibilityOf(dataentrydropdownlistelement));

		
//		devenv
	    Select listvalue = new Select(driver.findElement(dataentrydropdownlist));
		listvalue.selectByValue("3");
		
		WebElement assigntodataentryelement = driver.findElement(assigntodataentry);
		clickButtonJS(assigntodataentryelement);

		
	}
	
	
}
