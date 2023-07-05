package ProjectsPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignSaleComittee {
	private WebDriver driver;
	private WebDriverWait wait;
	public assignSaleComittee (WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	
	private By AuctionsList = By.xpath("//*[@id=\"$b3\"]/div/a[4]/div/span");
	
	public void OpenAuctionsList ()
	{

		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(AuctionsList)));
		clickButtonJS(driver.findElement(AuctionsList));		
	}
	
	private By OpenAuction = By.xpath("(//div[@class='flex-fill'])[1]");
	
	public void OpenAuction ()
	{

		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(OpenAuction)));
		clickButtonJS(driver.findElement(OpenAuction));		
	}
	
	private By OpenTab  = By.xpath("//div[@id='b4-b9-Title']");
	
	public void OpenSaleCommitteeTab ()
	{

		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(OpenTab)));
		clickButtonJS(driver.findElement(OpenTab));		
	}
	
	private By CommitteeHead = By.xpath("//div[@class='choices__item needsclick choices__item--selectable choices__placeholder']");
	private By SearchBox = By.xpath("(//input[@class='choices__input choices__input--cloned'])[1]");
	private By SendSaleCommittee = By.xpath("//button[@id='b4-b26-SendRequest']");
	
	public void ChooseHead ()
	{
		//Click on list

		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(CommitteeHead)));
		clickButtonJS(driver.findElement(CommitteeHead));
		
		//search and Select
		
		
		driver.findElement(SearchBox).sendKeys("أحمد العثمان");
		//Select Head = new Select (driver.findElement(CommitteeHead));
		//Head.selectByVisibleText("Ã™ï¿½Ã˜ÂªÃ˜Â­Ã™Å  Ã˜Â¹Ã˜Â±Ã™ï¿½Ã˜Â§Ã˜Âª");
		driver.findElement(SearchBox).sendKeys(Keys.ENTER);
		
		//Send Committee for approve
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(SendSaleCommittee)));
		clickButtonJS(driver.findElement(SendSaleCommittee));
		
	}
	
	
	private By ClickApprove = By.xpath("(//button[@class='btn btn-primary OSFillParent'])[1]");
	private By SaleCommitteeforCEO = By.xpath("(//span[text()='Sale Committee List'])[2]");
    public void CEOApprove ()
    
    {
    	//Open Sale committee
    	wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(SaleCommitteeforCEO)));
		clickButtonJS(driver.findElement(SaleCommitteeforCEO));
		
		// Click Approve 
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(ClickApprove)));
		clickButtonJS(driver.findElement(ClickApprove));
    	
    }
    
    
    private By AuctionsbyHead = By.xpath("//*[@id=\"$b3\"]/div/a[3]/div/span");
    private By AuctionbyCEO = By.xpath("//*[@id=\"$b3\"]/div/a[4]/div");
    private By NotStartedFilter = By.xpath("(//span[@class='white-space-nowrap text-ellipsis'])[4]");
    private By ClickOnAuction = By.xpath("(//div[@class='flex-fill'])[1]");
    private By SaleLetterTab = By.xpath("//div[@id='b4-b6-Title']");
    private By MeetinLocationList = By.xpath("//div[@id='b4-b19-Dropdown1-container']/select");
    private By Submit = By.xpath("//div[@class='btn-label OSInline']");
    Select select;

    public void AddSellLetter() throws InterruptedException
    {
    	//OpenAuctions List
    	wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(AuctionbyCEO)));
		clickButtonJS(driver.findElement(AuctionbyCEO));
		
		//Open Not started filter 
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(NotStartedFilter)));
		clickButtonJS(driver.findElement(NotStartedFilter));
		
		// Open Auction
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(ClickOnAuction)));
		clickButtonJS(driver.findElement(ClickOnAuction));
		
		// Open Sale letter Tab
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(SaleLetterTab)));
		clickButtonJS(driver.findElement(SaleLetterTab));
		
		Thread.sleep(100);
		//select location
		wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(MeetinLocationList)));
		//clickButtonJS(driver.findElement(MeetinLocationList));
		//driver.findElement(MeetinLocationList).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(MeetinLocationList).sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.elementToBeClickable(MeetinLocationList)).click();
    	select = new Select(driver.findElement(MeetinLocationList));
    	select.selectByVisibleText("Remote");
    	
    	// Click Submit
		Thread.sleep(500);
    	wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(Submit)));
		clickButtonJS(driver.findElement(Submit));
    
    	
    }
	
	
}
