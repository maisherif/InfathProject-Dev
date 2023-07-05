package AuctionPlanPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApproveAuctionPlanClass {
	private WebDriver driver;

	public ApproveAuctionPlanClass(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	private By auctionslisttab = By.xpath("(//a[@class='OSFillParent'])[10]");
    private By notstartedauctions = By.xpath("(//a[@class='margin-right-base margin-bottom-s'])[4]");
	
	public void openauctions () 
	{
		 WebElement button =driver.findElement(auctionslisttab);
		 clickButtonJS(button);
	}
	public void gotonotstartedauctions () throws InterruptedException 
	{
		
		 WebElement button =driver.findElement(notstartedauctions);
		 clickButtonJS(button);
		 
		 Thread.sleep(1000);
	}
	public void openauction(String auctionpath)
	{
		 By path = By.xpath(auctionpath);
		 WebElement button =driver.findElement(path);
		 clickButtonJS(button);
		 
	}
	private By auctionplantab = By.xpath("//div[@id='b4-b4-Title']");
	
	public void openauctionplan()
	{
		 WebElement button =driver.findElement(auctionplantab);
		 clickButtonJS(button);
	}
	
	private By approvebutton = By.xpath("(//div[@class='display-flex justify-content-flex-end margin-top-base']/button)[2]");
	public void approveauctionplan()
	{ 
		 WebElement button =driver.findElement(approvebutton);
		 clickButtonJS(button);
	}

	private By maininformationtaskdetailsicon = By.xpath("(//button[@class='btn border-size-none OSFillParent'])[1]");
	private By approvemaininfotaskbutton = By.xpath("(//button[@class='btn'])[1]");
	private By confirmsending = By.xpath("//button[@class='btn btn-primary OSFillParent']");

	public void approvemaininfotask()
	{
		 WebElement button =driver.findElement(maininformationtaskdetailsicon);
		 clickButtonJS(button);
		 
		 button =driver.findElement(approvemaininfotaskbutton);
		 clickButtonJS(button);
		 
		 button =driver.findElement(confirmsending);
		 clickButtonJS(button);
	}
	
	private By utilitybillsicon = By.xpath("(//button[@class='btn border-size-none OSFillParent'])[14]");
	private By approveutilitybillstaskbutton = By.xpath("//button[@class='btn btn-primary ']");
	
	public void approveutilitybillstask()
	{
		 WebElement button =driver.findElement(utilitybillsicon);
		 clickButtonJS(button);
		 
		 button =driver.findElement(approveutilitybillstaskbutton);
		 clickButtonJS(button);
		 
		 button =driver.findElement(confirmsending);
		 clickButtonJS(button);
	}
	

	
}
