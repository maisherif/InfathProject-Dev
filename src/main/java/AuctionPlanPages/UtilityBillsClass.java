package AuctionPlanPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityBillsClass {
	
	private WebDriver driver;
	private  String gettotal;
	private int total;
	
	public UtilityBillsClass(WebDriver driver) {
		this.driver=driver;
	}
	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);
	}
	
	private By utilitybillsicon = By.xpath("(//button[@class='btn border-size-none OSFillParent'])[14]");
	private By dropdownlist = By.xpath("(//div[@class='dropdown-container']/select)[1]");
	private By addnewbillsbutton = By.xpath("//button[@class='btn margin-x-base']");

	private By invoicetypedropdownlist = By.xpath("(//div[@class='dropdown-container']/select)[2]");
	private By invoicenumbertextbox = By.xpath("//input[@id='b5-b13-b3-b1-Input_Water_Meter_ID']");
	private By utilitybillsattachment = By.xpath("//input[@id='b5-b13-b3-b1-b1-FileUploadInput']");
	private By currentinvoicevaluetextbox = By.xpath("//input[@id='b5-b13-b3-b1-Input_Current_Invoice_Value']");
	private By responsibledropdownlist = By.xpath("(//div[@class='dropdown-container']/select)[3]");
	private By notestextbox = By.xpath("//input[@id='b5-b13-b3-b1-Input_Note']");
	private By addassettask = By.xpath("(//button[@class='btn btn-primary ThemeGrid_MarginGutter'])[2]");

	
    private By numberofassets = By.xpath("(//div[@class='display-flex flex-direction-column']/span)[4]");
	
	private By auctionstab = By.xpath("//span[text()='Auctions']");
	
	public void openauctions () 
	{
		 WebElement button =driver.findElement(auctionstab);
		 clickButtonJS(button);
		 
		 WebElement value =driver.findElement(numberofassets);

		  gettotal = value.getText();
		  total =Integer.parseInt(gettotal);
	}
	
	public void openutilitybillstask (int numberofassets) throws InterruptedException 
	{
		 WebElement button =driver.findElement(utilitybillsicon);
		 clickButtonJS(button);
		 
	}
	public void addnewbillsasset1() throws InterruptedException {
		Thread.sleep(2000);
	 Select list1value = new Select(driver.findElement(dropdownlist));
	 list1value.selectByValue("0");
	 
	 WebElement button =driver.findElement(addnewbillsbutton);
	 clickButtonJS(button);
	}
	
	public void addnewbillsasset2() throws InterruptedException {
		Thread.sleep(2000);
	 Select list1value = new Select(driver.findElement(dropdownlist));
	 list1value.selectByValue("1");
	 
	 WebElement button =driver.findElement(addnewbillsbutton);
	 clickButtonJS(button);
	}
	
	public void addwater(String invoicenumber, String invoicevalue) throws InterruptedException{
		
		
		
		  Select list1value = new Select(driver.findElement(invoicetypedropdownlist));
		  list1value.selectByValue("0");
		 
		  driver.findElement(invoicenumbertextbox).sendKeys(invoicenumber);
		 
		  String filename="abc.pdf";
		  String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
		  
		  WebElement upload1 = driver.findElement(utilitybillsattachment);
		  upload1.sendKeys(filepath);
		  
		  driver.findElement(currentinvoicevaluetextbox).sendKeys(invoicevalue);
		  
		  list1value = new Select(driver.findElement(responsibledropdownlist));
		  list1value.selectByValue("0");
		  
		  driver.findElement(notestextbox).sendKeys("Some Notes");
		  
			Thread.sleep(2000);

		  
		  WebElement button =driver.findElement(addassettask);
		  clickButtonJS(button);
		  

	}
	
	public void addelectricity(String invoicenumber, String invoicevalue) throws InterruptedException{
		
		  Select list1value = new Select(driver.findElement(invoicetypedropdownlist));
		  list1value.selectByValue("1");
		 
		  driver.findElement(invoicenumbertextbox).sendKeys(invoicenumber);
		 
		  String filename="abc.pdf";
		  String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
		  
		  WebElement upload1 = driver.findElement(utilitybillsattachment);
		  upload1.sendKeys(filepath);
		  
		  driver.findElement(currentinvoicevaluetextbox).sendKeys(invoicevalue);
		  
		  list1value = new Select(driver.findElement(responsibledropdownlist));
		  list1value.selectByValue("0");
		  
		  driver.findElement(notestextbox).sendKeys("Some Notes");
		  
			Thread.sleep(2000);

		  
		  WebElement button =driver.findElement(addassettask);
		  clickButtonJS(button);

	}
	private By sendtask = By.xpath("//button[@class='btn btn-primary ThemeGrid_MarginGutter']");
	private By confirmsending = By.xpath("//button[@class='btn btn-primary OSFillParent']");
	public void sendtask()  {
		
     WebElement button =driver.findElement(sendtask);
	 clickButtonJS(button);
	 
	 button =driver.findElement(confirmsending);
	 clickButtonJS(button);
	}
}
