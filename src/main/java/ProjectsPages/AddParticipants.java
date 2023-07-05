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

public class AddParticipants
 {
	
	private WebDriver driver;
	private WebDriverWait wait;

	public AddParticipants(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	public void removereadonly(WebElement removeelement) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('readonly')",removeelement);
	}
	private By auctionstabbutton = By.xpath("//span[text()='Auctions']");

	public void openauctionlist() 
	{
		 
		 wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		 WebElement button =driver.findElement(auctionstabbutton);
		 wait.until(ExpectedConditions.visibilityOf(button));
	
		 clickButtonJS(button);

	}
	private By auctiontitlebutton = By.xpath("(//span[@class='text-secondary OSFillParent'])[1]");
	private By participenttab = By.xpath("//div[@id='b5-b6-Title']");


	public void gotoparticipenttab() 
	{
		 WebElement button =driver.findElement(auctiontitlebutton);
		 clickButtonJS(button);
		 
		 button =driver.findElement(participenttab);
		 clickButtonJS(button);
	}

	private By addparticipent = By.xpath("//button[@class='btn btn-primary']");


	public void addpartipent() 
	{
		 WebElement button =driver.findElement(addparticipent);
		 clickButtonJS(button);
	}
	
	//Participant Details tab
	private By dateofbirthinput = By.xpath("//input[@id='b5-b5-b1-Input_DateVar']");
	private By backbutton = By.xpath("//a[@class='calendars-cmd calendars-cmd-prev ']");
	private By nininput = By.xpath("//input[@id='b5-b5-Input_NationalId']");
	private By nameinput = By.xpath("//input[@id='b5-b5-Input_Name2']");
	private By genderdropdownlist = By.xpath("//select[@id='b5-b5-Input_Gender']");
	private By participantidinput = By.xpath("//input[@id='b5-b5-Input_VisitorAuctionId']");
	private By mobileinput = By.xpath("//input[@id='b5-b5-Input_Mobile']");
	private By emailinput = By.xpath("//input[@id='b5-b5-Input_Email']");
	private By idpictureattachment = By.xpath("//input[@id='b5-b5-b2-FileUploadInput']");

	private By prferedassetslistbutton = By.xpath("//div[@id='b5-b5-b6-NothingSelectedText']");
	private By selectallcheckbox = By.xpath("//input[@id='b5-b5-b6-Checkbox_SelectAll']");
	private By nextbutton = By.xpath("//button[@class='btn btn-primary']");
	private By datetoselect = By.xpath("(//div[@class='calendars-month-row']/div[@class='calendars-month']/div[@class='calendars-month-header']/select[@class='calendars-month-year'])[2]/option[1]");



	public void addParticipantDetails(String nin, String name, String partipantid, String mobile, String email) throws InterruptedException 
	{
		Thread.sleep(4000);

		WebElement Date = driver.findElement(dateofbirthinput);
		Date.click();
		for(int i =0;i<250;i++) {
	    WebElement back = driver.findElement(backbutton);
		clickButtonJS(back);
		}
		Date.sendKeys(Keys.ENTER);
		
		driver.findElement(nininput).sendKeys(nin);
		driver.findElement(nameinput).sendKeys(name);
		driver.findElement(participantidinput).sendKeys(partipantid);
		driver.findElement(mobileinput).sendKeys(mobile);
		driver.findElement(emailinput).sendKeys(email);
	
		
		Select listvalue = new Select(driver.findElement(genderdropdownlist));
		listvalue.selectByIndex(1);

		String filename="abc.pdf";
		String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
		  
		WebElement upload1 = driver.findElement(idpictureattachment);
		upload1.sendKeys(filepath);
		
		 WebElement button =driver.findElement(prferedassetslistbutton);
		 clickButtonJS(button);
		 
		 button =driver.findElement(selectallcheckbox);
		 clickButtonJS(button);
		 
		 wait = new WebDriverWait(driver, Duration.ofSeconds(120));

			Thread.sleep(2000);

		 
		 button =driver.findElement(nextbutton);
		 clickButtonJS(button);
		
	}
	
	//add Entry Amounts Type Cheque
	private By addnewamountbutton = By.xpath("(//button[@class='btn btn-primary'])");
	private By typedropdownlist = By.xpath("//select[@id='b5-b6-Dropdown1']");
	private By amountinput = By.xpath("//input[@id='b5-b6-Input_InsurenceEnteredAmount']");
	private By referencenumberinput = By.xpath("//input[@id='b5-b6-Input_ReferenceNumber']");
	private By entryamountdateinput = By.xpath("//input[@id='b5-b6-b2-Input_DateVar']");
	private By bankdropdownlist = By.xpath("//select[@id='b5-b6-Dropdown2']");
	private By entryamountattachment = By.xpath("//input[@id='b5-b6-b3-FileUploadInput']");
	private By savebutton = By.xpath("(//button[@class='btn btn-primary'])[2]");
	private By ibaninput = By.xpath("//input[@id='b5-b6-Input_IBAN']"); // for Type Transfer
	
	public void addtypeCheque(String amount, String refrencenumber) throws InterruptedException
	{
		 wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		 WebElement element =driver.findElement(addnewamountbutton);
		 wait.until(ExpectedConditions.visibilityOf(element));
		 
		 WebElement button =driver.findElement(addnewamountbutton);
		 clickButtonJS(button);
		 
	     Select listvalue = new Select(driver.findElement(typedropdownlist));
		 listvalue.selectByVisibleText("Cheque");
		
		driver.findElement(amountinput).sendKeys(amount);
		driver.findElement(referencenumberinput).sendKeys(refrencenumber);
		driver.findElement(entryamountdateinput).sendKeys("12/12/2022");
		WebElement Date = driver.findElement(entryamountdateinput);
		Date.click();
		Date.sendKeys(Keys.ENTER);
		
		Select listvalue2 = new Select(driver.findElement(bankdropdownlist));
		listvalue2.selectByIndex(1);

		String filename="abc.pdf";
		String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
		  
		WebElement upload1 = driver.findElement(entryamountattachment);
		upload1.sendKeys(filepath);
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		 Thread.sleep(2000);

		 
		 button =driver.findElement(savebutton);
		 clickButtonJS(button);
		 

	}
	
	public void addtypeTransfer(String amount, String refrencenumber, String iban) throws InterruptedException
	{
		 wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		 WebElement element =driver.findElement(addnewamountbutton);
		 wait.until(ExpectedConditions.visibilityOf(element));
		 
		 WebElement button =driver.findElement(addnewamountbutton);
		 clickButtonJS(button);
		 
		 Select listvalue = new Select(driver.findElement(typedropdownlist));
		 listvalue.selectByVisibleText("Transfer");
		 
		driver.findElement(amountinput).sendKeys(amount);
		driver.findElement(referencenumberinput).sendKeys(refrencenumber);
		driver.findElement(entryamountdateinput).sendKeys("12/12/2022");
		WebElement Date = driver.findElement(entryamountdateinput);
		Date.click();
		Date.sendKeys(Keys.ENTER);
		
		Select listvalue2 = new Select(driver.findElement(bankdropdownlist));
		listvalue2.selectByIndex(1);

		
		driver.findElement(ibaninput).sendKeys(iban);

		String filename="abc.pdf";
		String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
		  
		WebElement upload1 = driver.findElement(entryamountattachment);
		upload1.sendKeys(filepath);
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		 Thread.sleep(2000);

		 button =driver.findElement(savebutton);
		 clickButtonJS(button);
		 
	}
	
	public void addtypeEwallet(String amount, String refrencenumber) throws InterruptedException
	{
		 wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		 WebElement element =driver.findElement(addnewamountbutton);
		 wait.until(ExpectedConditions.visibilityOf(element));
		 
		 WebElement button =driver.findElement(addnewamountbutton);
		 clickButtonJS(button);
		 
		 Select listvalue = new Select(driver.findElement(typedropdownlist));
		 listvalue.selectByVisibleText("E_Wallet");
		 
		driver.findElement(amountinput).sendKeys(amount);
		driver.findElement(referencenumberinput).sendKeys(refrencenumber);
		driver.findElement(entryamountdateinput).sendKeys("12/12/2022");
		WebElement Date = driver.findElement(entryamountdateinput);
		Date.click();
		Date.sendKeys(Keys.ENTER);

		String filename="abc.pdf";
		String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
		  
		WebElement upload1 = driver.findElement(entryamountattachment);
		upload1.sendKeys(filepath);
		
		 //wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		 Thread.sleep(2000);

		 button =driver.findElement(savebutton);
		 clickButtonJS(button);
		 
	}
	private By nextbutton2 = By.xpath("//button[@class='btn btn-primary margin-x-base']");

	public void nextbutton()
	{
		WebElement button =driver.findElement(nextbutton2);
		clickButtonJS(button);
		 
	}
	private By registerparticipantbutton = By.xpath("//button[@class='btn btn-primary']");
	public void registerparticipant()
	{
		WebElement button =driver.findElement(registerparticipantbutton);
		clickButtonJS(button);
	}
	private By participanttypedropdownlist = By.xpath("//select[@class='dropdown-display dropdown']");
	
	public void participanttype(String typeID)
	{

			if(typeID == "2" )
			{
				Select listvalue = new Select(driver.findElement(participanttypedropdownlist));
				listvalue.selectByVisibleText("On behalf of an entity");
			}
			if(typeID == "3" )
			{
				Select listvalue = new Select(driver.findElement(participanttypedropdownlist));
				listvalue.selectByVisibleText("On behalf of a person/group/heir");
			}
			if(typeID == "1" )
			{
				Select listvalue = new Select(driver.findElement(participanttypedropdownlist));
				listvalue.selectByVisibleText("On behalf of himself/herself");
			}
		
	}
	
	private By EstablishmentunifiednumberTextbox = By.xpath("//input[@id='b5-b7-Input_CR']");
	private By EntitynameTextbox = By.xpath("//input[@id='b5-b7-Input_EntityName']");
	private By crexpirydate = By.xpath("//input[@id='b5-b7-b2-Input_DateVar']");
	private By crcopyattachment = By.xpath("//input[@id='b5-b7-b3-FileUploadInput']");
	private By ProveEntityAuthorizationdropdownlist = By.xpath("//select[@id='b5-b7-Dropdown1']");
	
	
	
	public void typeonbehalfofanentity(String Establishmentunifiednumber, String Entityname) throws InterruptedException
	{
		  

			driver.findElement(EstablishmentunifiednumberTextbox).sendKeys(Establishmentunifiednumber);
			driver.findElement(EntitynameTextbox).sendKeys(Entityname);
			WebElement Date = driver.findElement(crexpirydate);
			Date.click();
			Date.sendKeys(Keys.ENTER);
			
			String filename="abc.pdf";
			String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
			  
			WebElement upload1 = driver.findElement(crcopyattachment);
			upload1.sendKeys(filepath);
			
			 wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			 Thread.sleep(2000);

	}
	
	public void ProveEntityAuthorization(String typeID)
	{

			if(typeID == "1" )
			{
				Select listvalue = new Select(driver.findElement(ProveEntityAuthorizationdropdownlist));
				listvalue.selectByVisibleText("Foundation Contract");
			}
			if(typeID == "2" )
			{
				Select listvalue = new Select(driver.findElement(ProveEntityAuthorizationdropdownlist));
				listvalue.selectByVisibleText("The Owner is the buyer");
			}
			if(typeID == "3" )
			{
				Select listvalue = new Select(driver.findElement(ProveEntityAuthorizationdropdownlist));
				listvalue.selectByVisibleText("Agency");
			}
		
	}
	private By poanumbertextbox = By.xpath("//input[@id='b5-b7-Input_POA_Number']");
	private By poatypetextbox = By.xpath("//input[@id='b5-b7-Input_POA_Type']");
	private By poastatustextbox = By.xpath("//input[@id='b5-b7-Input_POA_Status']");
	private By poaattachment = By.xpath("//input[@id='b5-b7-b8-FileUploadInput']");

	public void ProveEntityAuthorizationDetails (String poa, String type, String poastatus) throws InterruptedException
	{
		driver.findElement(poanumbertextbox).sendKeys(poa);
		driver.findElement(poatypetextbox).sendKeys(type);
		driver.findElement(poastatustextbox).sendKeys(poastatus);
		
		String filename="abc.pdf";
		String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
		  
		WebElement upload1 = driver.findElement(poaattachment);
		upload1.sendKeys(filepath);
		
	    Thread.sleep(2000);
	}
	
	private By addpersonbutton = By.xpath("(//button[@class='btn btn-large btn-primary'])[1]");
	private By nationalid = By.xpath("//input[@id='b5-b7-b1-Input_NationalId']");
	private By dateofbirthtextbox = By.xpath("//input[@id='b5-b7-b1-b2-Input_DateVar']");
	private By nametextbox2 = By.xpath("//input[@id='b5-b7-b1-Input_Name']");
	private By genderdropdownlist2 = By.xpath("//select[@id='b5-b7-b1-Input_Gender']");
	private By ownershippercentagetextbox = By.xpath("//input[@id='b5-b7-b1-Input_OwnershipPercentage']");
	private By Identitypictureattachment= By.xpath("//input[@id='b5-b7-b1-b3-FileUploadInput']");
	private By savebutton2 = By.xpath("//span[text()='Save']");

	
	public void typeonbehalfofgroup(String nin, String name, String percentage) throws InterruptedException
	{
		
		    WebElement button =driver.findElement(addpersonbutton);
			clickButtonJS(button);
			 
			driver.findElement(nationalid).sendKeys(nin);
			
			WebElement Date = driver.findElement(dateofbirthtextbox);
			Date.click();
			Date.sendKeys(Keys.ENTER);
			
			driver.findElement(nametextbox2).sendKeys(name);
			
		    Select listvalue = new Select(driver.findElement(genderdropdownlist2));
			listvalue.selectByIndex(1);
			
			Thread.sleep(1000);
			
			driver.findElement(ownershippercentagetextbox).sendKeys(percentage);

			
			String filename="abc.pdf";
			String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
		 
			WebElement upload1 = driver.findElement(Identitypictureattachment);
			upload1.sendKeys(filepath);
			
			 wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			 Thread.sleep(2000);
			 
			 button =driver.findElement(savebutton2);
			 clickButtonJS(button);

	}
	
	
}
