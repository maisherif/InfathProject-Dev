package AuctionPlanPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainInformationTask {
	private WebDriver driver;
	private  String gettotal;
	private int total=3;
	
	public MainInformationTask(WebDriver driver) {
		this.driver=driver;
	}
	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);
	}
	private By maininformationtaskdetailsicon = By.xpath("(//button[@class='btn border-size-none OSFillParent'])[1]");
	private By fromtimetextbox = By.xpath("(//input[@class='form-control OSFillParent'])[1]");
	private By totimetextbox = By.xpath("(//input[@class='form-control OSFillParent'])[2]");
	private By location = By.xpath("(//div[@id='b5-b1-b4-MapContainer']/div[2]/div/div/div[2]/div/div/div[2])[1]");
	private By extendicon = By.xpath("(//div[@class='section-expandable-icon'])[2]");
	private By sendtaskbutton = By.xpath("//button[@class='btn btn-primary OSFillParent']");
	private By confirmsending = By.xpath("(//button[@class='btn btn-primary OSFillParent'])[2]");
	
	private By numberofassets = By.xpath("(//div[@class='display-flex flex-direction-column']/span)[4]");
	
	private By auctionstab = By.xpath("//span[text()='Auctions']");
	
	public void openauctions () 
	{
		 WebElement button =driver.findElement(auctionstab);
		 clickButtonJS(button);
		 
		 WebElement value =driver.findElement(numberofassets);

		  //gettotal = value.getText();
		 // total =Integer.parseInt(gettotal);
	}
	
	public void openauction(String auctionpath)
	{
		 By path = By.xpath(auctionpath);
		 WebElement button =driver.findElement(path);
		 clickButtonJS(button);
	}
	
	public void addmaininformationtask (String EntryChequevalue) throws InterruptedException 
	{
		 WebElement button =driver.findElement(maininformationtaskdetailsicon);
		 clickButtonJS(button);
		 
		 Thread.sleep(2000);
		 
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		 // wait.until(ExpectedConditions.visibilityOf( driver.findElement(viewdate)));
		 
		 wait.until(ExpectedConditions.elementToBeClickable(fromtimetextbox)).click();
		 wait.until(ExpectedConditions.elementToBeClickable(fromtimetextbox)).sendKeys("14:24");
		 
		 wait.until(ExpectedConditions.elementToBeClickable(totimetextbox)).click();
		 wait.until(ExpectedConditions.elementToBeClickable(totimetextbox)).sendKeys("14:24");
		 
		 
		 WebElement loc = driver.findElement(location);
		 clickButtonJS(loc);
		 
//		 driver.findElement(fromtimetextbox).sendKeys("14:24");
//		 driver.findElement(totimetextbox).sendKeys("15:30");
//		 
//		 WebElement loc = driver.findElement(location);
//		 clickButtonJS(loc);

//		 loc = driver.findElement(extendicon);
//		 clickButtonJS(loc);
//		 
			System.out.println(total);
		    int j =3;
			for(int i=1;i<=2;i++)
			{
				
				 By entrychequetextbox = By.xpath("(//input[@class='form-control OSFillParent'])["+j+"]");
				 wait.until(ExpectedConditions.elementToBeClickable(entrychequetextbox)).click();
				 wait.until(ExpectedConditions.elementToBeClickable(entrychequetextbox)).sendKeys(EntryChequevalue);
				 j++;
			}
			
		 
		 
//		 driver.findElement(entrychequetextbox).sendKeys(EntryChequevalue);
//
		 button =driver.findElement(sendtaskbutton);
		 clickButtonJS(button);
		 
		 button =driver.findElement(confirmsending);
		 clickButtonJS(button);
		 
		 
	}

	
}
