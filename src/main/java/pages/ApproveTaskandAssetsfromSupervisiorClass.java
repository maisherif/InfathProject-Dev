package pages;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ApproveTaskandAssetsfromSupervisiorClass {

	private WebDriver driver;
	public ApproveTaskandAssetsfromSupervisiorClass(WebDriver driver) {
		this.driver=driver;
	}
	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	WebDriverWait wait;
	//Assign Task by supervisor
	        private By pendingoninitialapprovalbutton = By.xpath("(//div[@class='display-flex align-items-center margin-right-base OSInline']/span)[5]");
			private By assigntask_button = By.id("b4-b5-Title");
			private By ResearcherName_dropdownlist = By.xpath("(//div[@class='dropdown-container OSFillParent']/select)[2]");
//			private By ApproverName_dropdownlist = By.xpath("(//div[@class='dropdown-container OSFillParent']/select)[2]");
			private By Assign_button = By.xpath("//div[@class='OSInline']/button");
			private By taskname = By.xpath("(//div[@class='display-flex align-items-flex-start']/div[text()='Judicial Decision Number'])[1]");

	public void assigntaskbyserverprovider()  
	{	
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(pendingoninitialapprovalbutton)));
		
		WebElement button1 = driver.findElement(pendingoninitialapprovalbutton);
		clickButtonJS(button1);
		
		WebElement tasknameelement = driver.findElement(taskname);
		clickButtonJS(tasknameelement);
		
		WebElement assigntask_buttonement = driver.findElement(assigntask_button);
		clickButtonJS(assigntask_buttonement);
		
		Select listvalue = new Select(driver.findElement(ResearcherName_dropdownlist));
		listvalue.selectByVisibleText("LegalConsultation Researcher2");
		
//		Select listvalue2 = new Select(driver.findElement(ApproverName_dropdownlist));
//		listvalue2.selectByVisibleText("LegalConsultation Approval2");
		
		WebElement Assigntask = driver.findElement(Assign_button);
		clickButtonJS(Assigntask);
		
	}
	
}
