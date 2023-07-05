package Auctionstarted;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CloseAuction {
	private WebDriver driver;

	public CloseAuction(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	
	
	private By auctionstabbutton = By.xpath("(//span[text()='Auctions List'])[2]");

	public void openauctionlist()  throws InterruptedException 
	{
		 WebElement button =driver.findElement(auctionstabbutton);	
		 clickButtonJS(button);
		 
		 Thread.sleep(3000);
	}
	
	private By closeauctionbutton = By.xpath("//div[@class='btn-label OSInline']");
	public void closeauction() throws InterruptedException 
	{
		 WebElement button =driver.findElement(closeauctionbutton);
		 clickButtonJS(button);
	}
}
