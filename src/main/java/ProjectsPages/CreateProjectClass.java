package ProjectsPages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateProjectClass {
	private WebDriver driver;
	private WebDriverWait wait;

	public CreateProjectClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
        
	} //constructor with the driver 
	
	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	
	private By AdvancedSearchButton = By.xpath("//*[@id=\"$b5\"]/div/div/div/div/div/div[2]/div[7]/button[3]");
	private By AssetStatusList = By.xpath("//*[@id=\"b5-Dropdown1\"]");
	private By ShowSearchResault = By.xpath("//button[@id=\"b5-SearchBTN2\"][@class=\"btn btn-large btn-primary margin-top-base\"]");
	private By CreateNewProject = By.xpath("//*[@id=\"$b5\"]/div/div/div/div/div/div[1]/div[2]/div/button/span");
	private By AssetCheckBox = By.xpath("(//input[@type='checkbox'])[2]");
	private By Next = By.xpath("//div[@id='b4-NextBttoun']/button");
    private By ProjectName = By.xpath("//input[@id='b4-ProjectName']");
    private By StartDate = By.xpath("//input[@id='b4-ProjectStartDate']");
    private By EndDate = By.xpath("//input[@id='b4-ProjectEndDate']");
    private By SaveandSend = By.xpath("(//button[@class=\"btn btn-primary\"])[2]");
    
    
    


	//Open Advanced Search pop-up
	
	public void OpenAdvancedSearch ()
	{
		WebElement SearchButton = driver.findElement(AdvancedSearchButton);

		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(SearchButton));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", SearchButton );
		
	}
	
	//Search By Not Assigned 
	
	public void SearchByNotAssignedAsset () throws Throwable
	
	{
		WebElement ShowResultButton = driver.findElement(ShowSearchResault);

		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(AssetStatusList)));
		Select Searchelement = new Select(driver.findElement(AssetStatusList));
		Searchelement.selectByVisibleText("Not Assigned");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ShowResultButton );
		Thread.sleep(2000);
		
	}
	
//Select assets and Start
	
	public void SelectassetsAndStartCreate() throws InterruptedException
	{ 
		
		//Select assets 
		WebElement ClickOnCard = driver.findElement(AssetCheckBox);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(ClickOnCard));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		for(int i=1 ; i<=3 ; i++)
		{
			
			js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//input[@type='checkbox'])["+i+"]")) );
		}
		
		//Start Create
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(CreateNewProject)));
		WebElement ClickAddNewProject = driver.findElement(CreateNewProject);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", ClickAddNewProject );
				
	}
	
	//Add Project data and Save

	public void EnterProjectData () throws InterruptedException
	{
		
		
		long todaydate = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(todaydate);
        String startdate=String.valueOf(date);
		
		WebElement ClickNext = driver.findElement(Next);

		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(ClickNext));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", ClickNext );
		
		//Enter Project Name
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(ProjectName)));
		WebElement AddProjectName = driver.findElement(ProjectName);
		AddProjectName.sendKeys("Automation Omnia");
		Thread.sleep(2000);
		
		//Enter Start Date
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(StartDate)));
		
         WebElement Startdateinput = driver.findElement(StartDate);
         Startdateinput.sendKeys(startdate);
         
         //Enter End Date
         
     	wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(EndDate)));
		
         WebElement Enddateinput = driver.findElement(EndDate);
         Enddateinput.sendKeys("2023-12-01");
         
         //Click Next
	
     	wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(Next)));
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("arguments[0].click();", ClickNext );
		
		//Click Save
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(SaveandSend)));
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("arguments[0].click();", driver.findElement(SaveandSend) );
         
	}
	
	
	
	

}
