package Auctionstarted;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CreateAssetSaleRequest {
	private WebDriver driver;

	public CreateAssetSaleRequest(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	
	
	private By auctionstabbutton = By.xpath("//span[text()='Auctions']");

	public void openauctionlist() 
	{
		 WebElement button =driver.findElement(auctionstabbutton);	
		 clickButtonJS(button);
	}
	
	public void openauction(String auctionpath) 
	{
		 By path = By.xpath(auctionpath);
		 WebElement button =driver.findElement(path);
		 clickButtonJS(button);
	}
	
	private By sellassetbutton = By.xpath("(//button[@class='btn btn-primary  OSFillParent'])[1]");
	private By savebutton = By.xpath("//div[@class='btn-label OSInline']");
	
	public void makesellrequest() throws InterruptedException 
	{
		WebElement button =driver.findElement(sellassetbutton);
		clickButtonJS(button);
		
		button =driver.findElement(savebutton);
		clickButtonJS(button);
	}
	private By assetsellrequeststab = By.xpath("//div[@id='b5-b7-Title']");
	
	
	public void openassetsellrequeststab() throws InterruptedException 
	{
		WebElement button =driver.findElement(assetsellrequeststab);
		clickButtonJS(button);
	}
	
    private By completetherequestbutton = By.xpath("(//button[@class='btn btn-primary margin-right-s'])[1]");
    private By pricetextbox = By.xpath("//input[@id='b5-b21-b1-b20-Input_Price']");
    private By addparticipantbutton = By.xpath("(//button[@class='btn btn-primary'])[2]");
    private By participantcheckbox1 = By.xpath("(//input[@class='checkbox'])[1]");
    private By participantcheckbox2 = By.xpath("(//input[@class='checkbox'])[2]");
    private By addbuttonconfirm = By.xpath("(//button[@class='btn btn-primary ThemeGrid_MarginGutter'])[2]");
    private By createsellingdocpdf = By.xpath("(//div[@class='btn-label OSInline'])[1]");
    private By percentagetextbox1 = By.xpath("(//span[@class='input-number']/input)[3]");
    private By percentagetextbox2 = By.xpath("(//span[@class='input-number']/input)[4]");
    private By attachment = By.xpath("//span[@class='upload-file']/label/input");
    
	public void completesellrequest(String price) throws InterruptedException 
	{
		Thread.sleep(2000);
		
		WebElement button =driver.findElement(completetherequestbutton);
		clickButtonJS(button);
		
		Thread.sleep(2000);
		
		driver.findElement(pricetextbox).sendKeys(price);
		
		Thread.sleep(2000);
		
		button =driver.findElement(addparticipantbutton);
		clickButtonJS(button);
		
		button =driver.findElement(participantcheckbox1);
		clickButtonJS(button);
		
		button =driver.findElement(participantcheckbox2);
		clickButtonJS(button);
		
		button =driver.findElement(addbuttonconfirm);
		clickButtonJS(button);
		
		driver.findElement(percentagetextbox1).sendKeys("50");
		driver.findElement(percentagetextbox2).sendKeys("50");

//		String strUrl = driver.getCurrentUrl();
//        driver = new FirefoxDriver();
//        driver.navigate().to(strUrl);

		button =driver.findElement(createsellingdocpdf);
		clickButtonJS(button);
			  	
	}
	public void uploadfile() throws InterruptedException 
	{
		Thread.sleep(2000);
		
		String filename="attatchment.pdf";
		String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
		  
		WebElement upload1 = driver.findElement(attachment);
		upload1.sendKeys(filepath);
		
		Thread.sleep(3000);

		  
	}
    private By chequestab = By.xpath("//div[@id='b5-b21-b1-b20-b5-Icon']");
    private By allchequeamountradiobutton = By.xpath("(//div[@class='OSFillParent']/input)[1]");
    private By sendrequestbutton = By.xpath("(//button[@class='btn btn margin-left-base'])[1]");

	public void chequetab() throws InterruptedException 
	{	
		WebElement button =driver.findElement(chequestab);
		clickButtonJS(button);
		
		button =driver.findElement(allchequeamountradiobutton);
		clickButtonJS(button);
		
		Thread.sleep(4000);
		
		button =driver.findElement(sendrequestbutton);
		clickButtonJS(button);
	}
	

}
