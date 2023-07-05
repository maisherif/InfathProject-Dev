package Auctionstarted;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApproveAssetSellRequestTask {
	private WebDriver driver;

	public ApproveAssetSellRequestTask(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	
	
	private By auctionstabbutton = By.xpath("(//div[@class='side-list-items ']/span[text()='Auctions List'])[2]");

	public void openauctionlist()  throws InterruptedException 
	{
		 WebElement button =driver.findElement(auctionstabbutton);	
		 clickButtonJS(button);
		 
		 Thread.sleep(3000);
	}
	
	private By auctiontitlebutton = By.xpath("(//span[@class='text-secondary OSFillParent'])[1]");
	public void openauction() throws InterruptedException 
	{
		 WebElement button =driver.findElement(auctiontitlebutton);
		 clickButtonJS(button);
		 
		 Thread.sleep(3000);

	}
    private By assetsellrequeststab = By.xpath("//div[@id='b4-b7-Title']");
	
	
	public void openassetsellrequeststab() throws InterruptedException 
	{
		WebElement button =driver.findElement(assetsellrequeststab);
		clickButtonJS(button);
	}
	
	private By dotsbutton = By.xpath("(//div[@class='submenu-header']/div/i)[1]");
	private By revieewrequestbutton = By.xpath("(//div[@class='submenu-items']/div/a/span)[1]");

	public void opensellrequestdetails() throws InterruptedException 
	{
		WebElement button =driver.findElement(dotsbutton);
		clickButtonJS(button);
		
		button =driver.findElement(revieewrequestbutton);
		clickButtonJS(button);
		
		Thread.sleep(2000);

	}
	
	    private By chequestab = By.xpath("//div[@id='b4-b22-b20-b5-Icon']");
	    private By acceptrequest = By.xpath("(//button[@class='btn ThemeGrid_MarginGutter'])[2]");

		public void approverequest() throws InterruptedException 
		{	
			WebElement button =driver.findElement(chequestab);
			clickButtonJS(button);
			
			Thread.sleep(2000);
			
			button =driver.findElement(acceptrequest);
			clickButtonJS(button);
		}
	
	
}
