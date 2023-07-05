package AuctionPlanPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuctionPlanClass {
	private WebDriver driver;
	public AuctionPlanClass(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	
	private By auctionstab = By.xpath("//span[text()='Auctions']");
	private By notstartedauctions = By.xpath("(//a[@class='margin-right-base margin-bottom-s'])[4]");
	
	public void openauctions () 
	{
		 WebElement button =driver.findElement(auctionstab);
		 clickButtonJS(button);
	}
	public void gotonotstartedauctions () 
	{
		
		 WebElement button =driver.findElement(notstartedauctions);
		 clickButtonJS(button);
	}
	public void openauction(String auctionpath)
	{
		 By path = By.xpath(auctionpath);
		 WebElement button =driver.findElement(path);
		 clickButtonJS(button);
	}
	
	private By auctionplantab = By.xpath("//div[@id='b5-b5-Title']");
	
	private By startdate1 = By.xpath("(//input[@class='form-control OSFillParent'])[8]");
	private By startdate2 = By.xpath("(//input[@class='form-control OSFillParent'])[10]");
	private By startdate3 = By.xpath("(//input[@class='form-control OSFillParent'])[12]");
	private By startdate4 = By.xpath("(//input[@class='form-control OSFillParent'])[14]");
	private By startdate5 = By.xpath("(//input[@class='form-control OSFillParent'])[16]");
	private By startdate6 = By.xpath("(//input[@class='form-control OSFillParent'])[18]");
	private By startdate7 = By.xpath("(//input[@class='form-control OSFillParent'])[20]");
	private By startdate8 = By.xpath("(//input[@class='form-control OSFillParent'])[22]");
	private By startdate9 = By.xpath("(//input[@class='form-control OSFillParent'])[24]");
	private By startdate10 = By.xpath("(//input[@class='form-control OSFillParent'])[26]");
	private By startdate11 = By.xpath("(//input[@class='form-control OSFillParent'])[28]");
	private By startdate12 = By.xpath("(//input[@class='form-control OSFillParent'])[30]");
	private By startdate13 = By.xpath("(//input[@class='form-control OSFillParent'])[32]");
	private By startdate14 = By.xpath("(//input[@class='form-control OSFillParent'])[34]");
	private By startdate15 = By.xpath("(//input[@class='form-control OSFillParent'])[36]");
	private By startdate16 = By.xpath("(//input[@class='form-control OSFillParent'])[38]");


	private By enddate1 = By.xpath("(//input[@class='form-control OSFillParent'])[9]");
	private By enddate2 = By.xpath("(//input[@class='form-control OSFillParent'])[11]");
	private By enddate3 = By.xpath("(//input[@class='form-control OSFillParent'])[13]");
	private By enddate4 = By.xpath("(//input[@class='form-control OSFillParent'])[15]");
	private By enddate5 = By.xpath("(//input[@class='form-control OSFillParent'])[17]");
	private By enddate6 = By.xpath("(//input[@class='form-control OSFillParent'])[19]");
	private By enddate7 = By.xpath("(//input[@class='form-control OSFillParent'])[21]");
	private By enddate8 = By.xpath("(//input[@class='form-control OSFillParent'])[23]");
	private By enddate9 = By.xpath("(//input[@class='form-control OSFillParent'])[25]");
	private By enddate10 = By.xpath("(//input[@class='form-control OSFillParent'])[27]");
	private By enddate11 = By.xpath("(//input[@class='form-control OSFillParent'])[29]");
	private By enddate12 = By.xpath("(//input[@class='form-control OSFillParent'])[31]");
	private By enddate13 = By.xpath("(//input[@class='form-control OSFillParent'])[33]");
	private By enddate14 = By.xpath("(//input[@class='form-control OSFillParent'])[35]");
	private By enddate15 = By.xpath("(//input[@class='form-control OSFillParent'])[37]");
	private By enddate16 = By.xpath("(//input[@class='form-control OSFillParent'])[39]");

	private By sendforapproval = By.xpath("//button[@class='btn btn-primary']");
	private By approvesubmit = By.xpath("(//div[@class='footer-actions margin-top-base']/button)[2]");

	public void gotoauctionplan()
	{
		 WebElement button =driver.findElement(auctionplantab);
		 clickButtonJS(button);
	}
	
	public void auctionplan(String startdatepar, String enddatepar) throws InterruptedException
	{
		
		long todaydate = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(todaydate);
        String startdate=String.valueOf(date);
        String enddate=String.valueOf(date);
		
		 Thread.sleep(1000);
		 driver.findElement(startdate1).sendKeys(startdate);
		 driver.findElement(startdate2).sendKeys(startdate);
		 driver.findElement(startdate3).sendKeys(startdate);
		 driver.findElement(startdate4).sendKeys(startdate);
		 driver.findElement(startdate5).sendKeys(startdate);
		 driver.findElement(startdate6).sendKeys(startdate);
		 driver.findElement(startdate7).sendKeys(startdate);
		 driver.findElement(startdate8).sendKeys(startdate);
		 driver.findElement(startdate9).sendKeys(startdate);
		 driver.findElement(startdate10).sendKeys(startdate);
		 driver.findElement(startdate11).sendKeys(startdate);
		 driver.findElement(startdate12).sendKeys(startdate);
		 driver.findElement(startdate13).sendKeys(startdate);
		 driver.findElement(startdate14).sendKeys(startdate);
		 driver.findElement(startdate15).sendKeys(startdate);
		 driver.findElement(startdate16).sendKeys(startdate);
		 
		 driver.findElement(enddate1).sendKeys(enddate);
		 driver.findElement(enddate2).sendKeys(enddate);
		 driver.findElement(enddate3).sendKeys(enddate);
		 driver.findElement(enddate4).sendKeys(enddate);
		 driver.findElement(enddate5).sendKeys(enddate);
		 driver.findElement(enddate6).sendKeys(enddate);
		 driver.findElement(enddate7).sendKeys(enddate);
		 driver.findElement(enddate8).sendKeys(enddate);
		 driver.findElement(enddate9).sendKeys(enddate);
		 driver.findElement(enddate10).sendKeys(enddate);
		 driver.findElement(enddate11).sendKeys(enddate);
		 driver.findElement(enddate12).sendKeys(enddate);
		 driver.findElement(enddate13).sendKeys(enddate);
		 driver.findElement(enddate14).sendKeys(enddate);
		 driver.findElement(enddate15).sendKeys(enddate);
		 driver.findElement(enddate16).sendKeys(enddate);

		 WebElement button =driver.findElement(sendforapproval);
		 clickButtonJS(button);
		 
		 button =driver.findElement(approvesubmit);
		 clickButtonJS(button);
	}
	


}
