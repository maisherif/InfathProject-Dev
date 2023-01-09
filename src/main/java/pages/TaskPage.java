package pages;

import java.awt.AWTException;

import java.time.Duration;

import org.openqa.selenium.Keys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TaskPage {

	private WebDriver driver;
	public TaskPage(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	WebDriverWait wait;
	private By taskname = By.xpath("(//div[@class='display-flex align-items-flex-start']/div[text()='Judicial Decision Number'])[1]");
	private By pendingonentrybutton = By.xpath("//div[@class='display-flex align-items-center ThemeGrid_Width10']/span[text()='Pending on Entry']"); // filtering pending o entry Tasks List

	
	
	public void opentask() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement button1 = driver.findElement(pendingonentrybutton);
		wait.until(ExpectedConditions.visibilityOf(button1));
		
		clickButtonJS(button1);

		WebElement tasknameelement = driver.findElement(taskname);
		clickButtonJS(tasknameelement);
	}
	//Task Details
	
		private By selectclaimtype = By.xpath("//select[@id='b4-b13-Claim_Type']");
		private By ExecutionRequestTypedropdownlist = By.xpath("//select[@id='b4-b13-Request_TypeDDL']");
		private By ibantextbox = By.xpath("//input[@id='b4-b13-Input_IBAN']");
		private By JudicialDecisionTpedropdownlist = By.xpath("//select[@id='b4-b13-JudicialDecisionType']");
		private By ExecutionDeedNumberTextbox = By.xpath("//input[@id='b4-b13-Input_Execution_Deed_Number']");
		private By subcourtdropdownlist = By.xpath("//select[@id='b4-b13-LC_Sub_CourtDDL']");
		private By courtdropdownlist = By.xpath("//select[@id='b4-b13-LC_CourtDDL']");

//		private By region = By.xpath("//div[@id='b4-b13-RegionDDL-container']/select");
//		private By city = By.xpath("//div[@id='b4-b13-CityDDL-container']/select");


		
		private By ExecutionDeed_dropdownlist = By.xpath("//select[@id='b4-b13-ExecutionDeedTypeDDL']");
		private By ExecutioRequestDebit_textbox = By.xpath("//input[@id='b4-b13-Input_Request_Debit_Amount_Numeric']");
		private By TotalDebitAmountnumerically_textbox = By.xpath("//input[@id='b4-b13-Input_Total_Debit_Amount_Numerical']");
		private By JudicialDecisionImage_uploadfilebutton = By.xpath("//input[@id='b4-b13-b2-FileUploadInput']");

		
//		private By contactnumbertextbox = By.id("b4-b13-Input_Contact_Number");
		private By saveasdraftfirstsection = By.xpath("(//div[@class='footer-actions margin-top-base']/button)[1]");
		private By IsJudicialDecisionAttached_radiobutton = By.xpath("//input[@id='b4-b14-RadioButton1-input']");
		private By IDsof_radiobutton = By.xpath("//input[@id='b4-b14-RadioButton5-input']");
//		private By IsStockingDetails_radiobutton = By.xpath("//input[@id='b4-b14-RadioButton9-input']");
		private By EstimatedValue_radiobutton = By.xpath("//input[@id='b4-b14-RadioButton14-input']");
		private By NumberofAssetsinJudicial_radiobutton = By.xpath("//input[@id='b4-b14-RadioButton3-input']");
		private By IsDateofBirth_radiobutton = By.xpath("//input[@id='b4-b14-RadioButton7-input']");
		private By savesecondsection = By.xpath("(//div[@class='footer-actions margin-top-base']/button)[2]");	
	public void TaskDetails(String tasknametext, String ExecutioRequestDebit,String TotalDebitAmountnumerically,String Contactnumber, String iban,String JudicialDecisionNumber,String ExecutionDeedNumber, String NumberofAssetsinTask) throws InterruptedException, AWTException 
	{
	
		JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript("arguments[0].scrollIntoView();", 	driver.findElement(ExecutionRequestTypedropdownlist));
	
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(ExecutionRequestTypedropdownlist)));
		
		Select listvalue1 = new Select(driver.findElement(ExecutionRequestTypedropdownlist));
		listvalue1.selectByValue("1");
		
		driver.findElement(ibantextbox).sendKeys(iban);
//		driver.findElement(JudicialDecisionNumbertextbox).sendKeys(JudicialDecisionNumber);
		
		Select listvalue3 = new Select(driver.findElement(JudicialDecisionTpedropdownlist));
		listvalue3.selectByValue("1");
		
		driver.findElement(ExecutioRequestDebit_textbox).sendKeys(ExecutioRequestDebit);

		Select listvalue = new Select(driver.findElement(subcourtdropdownlist));
		listvalue.selectByValue("1");
		
		Select listvalue4 = new Select(driver.findElement(courtdropdownlist));
		listvalue4.selectByIndex(2);

//		Select listvalueregion = new Select(driver.findElement(region));
//		listvalueregion.selectByValue("1");
//
//
//		Thread.sleep(1000);
//		Select listvaluecity = new Select(driver.findElement(city));
//		listvaluecity.selectByValue("1");
		
//	    driver.findElement(NumberofAssetsinTaskTextbox).sendKeys(NumberofAssetsinTask);
		driver.findElement(ExecutionDeedNumberTextbox).sendKeys(ExecutionDeedNumber);
		driver.findElement(TotalDebitAmountnumerically_textbox).sendKeys(TotalDebitAmountnumerically);
		Select value = new Select(driver.findElement(selectclaimtype));
		value.selectByValue("0");
		
		
//		 WebElement noradiobuttonelement1 = driver.findElement(noradiobutton1);
//		 clickButtonJS(noradiobuttonelement1);
//		 
//		 WebElement yesradiobuttonelement2 = driver.findElement(noradiobutton2);
//		 clickButtonJS(yesradiobuttonelement2);
//
//		driver.findElement(contactnumbertextbox).sendKeys(Contactnumber);
			
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			
		Select listvalue2 = new Select(driver.findElement(ExecutionDeed_dropdownlist));
		listvalue2.selectByIndex(2);
		

		String filename="abc.pdf";
		String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
		  
		WebElement upload1 = driver.findElement(JudicialDecisionImage_uploadfilebutton);
		upload1.sendKeys(filepath);

//		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//		wait.until(ExpectedConditions.visibilityOf(JudicialDecisionImage_uploadfilebuttonelement));
		Thread.sleep(3000);

	    WebElement saveasdraftfirstsectionelement = driver.findElement(saveasdraftfirstsection);
		clickButtonJS(saveasdraftfirstsectionelement);
		  
		  WebElement IsJudicialDecisionAttached_radiobuttonelement = driver.findElement(IsJudicialDecisionAttached_radiobutton);
		  js.executeScript("arguments[0].scrollIntoView();", 	IsJudicialDecisionAttached_radiobuttonelement);

		  clickButtonJS(IsJudicialDecisionAttached_radiobuttonelement);
		  
		  WebElement IDsof_radiobuttonelement = driver.findElement(IDsof_radiobutton);
		  clickButtonJS(IDsof_radiobuttonelement);
		  
//		  WebElement IsStockingDetails_radiobuttonelement = driver.findElement(IsStockingDetails_radiobutton);
//		  clickButtonJS(IsStockingDetails_radiobuttonelement);
		  
		  WebElement EstimatedValue_radiobuttonelement = driver.findElement(EstimatedValue_radiobutton);
		  clickButtonJS(EstimatedValue_radiobuttonelement);
		  
		  WebElement NumberofAssetsinJudicial_radiobuttonelement = driver.findElement(NumberofAssetsinJudicial_radiobutton);
		  clickButtonJS(NumberofAssetsinJudicial_radiobuttonelement);
		  
		  WebElement IsDateofBirth_radiobuttonelement = driver.findElement(IsDateofBirth_radiobutton);
		  clickButtonJS(IsDateofBirth_radiobuttonelement);
		  
//		  WebElement IsMorrorPrint_radiobuttonelement = driver.findElement(IsMorrorPrint_radiobutton);
//		  clickButtonJS(IsMorrorPrint_radiobuttonelement);
		  
		  WebElement savesecondsectionelement = driver.findElement(savesecondsection);
		  clickButtonJS(savesecondsectionelement);
	}
	//Task parties part
		private By taskpartiesbutton = By.id("b4-b3-Title");
		private By pencilbuuton1 = By.xpath("(//a[@href='#']/i[@class='icon fa fa-pencil-square-o fa-1x'])[1]");
		private By partyname_textbox = By.id("b4-b16-Input_Party_Name");

		private By partycategorydropdownlist = By.xpath("//div[@id='b4-b16-Input_Identity_Type2-container']/select");
		private By contractnumber_textbox = By.id("b4-b16-Input_Contact_Number");
		private By email_textbox = By.id("b4-b16-Input_Email");
		private By yesradiobutton = By.id("b4-b16-Yes-input");
		private By partycategory1_savebuuton = By.xpath("(//div[@class='footer-actions margin-top-base']/button[@class='btn btn-primary ThemeGrid_MarginGutter'])");

		private By pencilbuuton2 = By.xpath("(//a[@href='#']/i[@class='icon fa fa-pencil-square-o fa-1x'])[2]");
		private By partycategory2_savebuuton = By.xpath("(//div[@class='footer-actions margin-top-base']/button[@class='btn btn-primary ThemeGrid_MarginGutter'])");
		private By taskparties_savebuuton = By.xpath("(//div[@class='footer-actions margin-top-base']/button[text()='Save'])[2]");
		
	public void addtaskparties1(String partyname, String contractnumber, String email) throws InterruptedException 
	{
		  WebElement taskpartiesbuttonelement = driver.findElement(taskpartiesbutton);
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		  wait.until(ExpectedConditions.visibilityOf(taskpartiesbuttonelement));
		  clickButtonJS(taskpartiesbuttonelement);
		
		  WebElement pencilbuuton1element = driver.findElement(pencilbuuton1);

		  Thread.sleep(1000);
		  clickButtonJS(pencilbuuton1element);
		  
		  Select listvalue = new Select(driver.findElement(partycategorydropdownlist));
		  listvalue.selectByIndex(1);
		  driver.findElement(partyname_textbox).sendKeys(partyname);
		  driver.findElement(contractnumber_textbox).sendKeys(contractnumber);
		  
		  WebElement yesradiobuttonelement1 = driver.findElement(yesradiobutton);
		  clickButtonJS(yesradiobuttonelement1);
		  driver.findElement(email_textbox).sendKeys(email);
		  WebElement partycategory1_savebuutonement = driver.findElement(partycategory1_savebuuton);
		  clickButtonJS(partycategory1_savebuutonement);
	
		  WebElement pencilbuuton1element2 = driver.findElement(pencilbuuton2);
		  clickButtonJS(pencilbuuton1element2);
		  
		  Select listvalue2 = new Select(driver.findElement(partycategorydropdownlist));
		  listvalue2.selectByIndex(1);
		  driver.findElement(partyname_textbox).sendKeys(partyname);
		  driver.findElement(contractnumber_textbox).sendKeys(contractnumber);
		  WebElement yesradiobuttonelement = driver.findElement(yesradiobutton);
		  clickButtonJS(yesradiobuttonelement);
		  driver.findElement(email_textbox).sendKeys(email);

		  WebElement partycategory2_savebuutonement = driver.findElement(partycategory2_savebuuton);
		  clickButtonJS(partycategory2_savebuutonement);
		  
		  WebElement taskparties_savebuutonement = driver.findElement(taskparties_savebuuton);
		  clickButtonJS(taskparties_savebuutonement);
		  
	}
	//Assets list
	private By assetslistbutton = By.id("b4-b4-Title");
	private By subtypetextbox = By.xpath("//input[@id='b4-b19-b7-Asset_Sub_Type']");

	private By Propertystatus_dropdownlist = By.xpath("//select[@id='b4-b19-b7-Dropdown4']");
	private By PropertyDeedType_dropdownlist = By.xpath("//div[@id='b4-b19-b7-Dropdown7-container']/select");
	private By Issaleforthewholeproprietyorpartofpropriety_dropdownlist = By.xpath("//div[@id='b4-b19-b7-Dropdown12-container']/select");
	private By deedregision_dropdownlist = By.xpath("//div[@id='b4-b19-b7-Dropdown9-container']/select");
	private By deedcity_dropdownlist = By.xpath("//div[@id='b4-b19-b7-Dropdown10-container']/select");
	
	private By deedneighborhood_dropdownlist = By.xpath("(//div[@class='choices__item needsclick choices__item--selectable choices__placeholder'])[1]");
	private By searchtextboxdropdownlist = By.xpath("(//div[@class='search--wrapper']/input[@class='choices__input choices__input--cloned'])[1]");
			
	
	private By Schema_textbox = By.xpath("//input[@id='b4-b19-b7-Input_Schema']");
	private By PartNumber_textbox = By.xpath("//input[@id='b4-b19-b7-Input_PartNumber']");
	private By area_textbox = By.xpath("//input[@id='b4-b19-b7-Input_Area']");
	
	private By BorderFromNorth_textbox = By.id("b4-b19-b7-TextArea_North_Border");
	private By LengthFromNorth_textbox = By.id("b4-b19-b7-Input_NorthNumber");
	private By BorderFromSouth_textbox = By.id("b4-b19-b7-TextArea_South_Border");
	private By LengthFromSouth_textbox = By.id("b4-b19-b7-Input_SouthNumber3");
	private By BorderFromEast_textbox = By.id("b4-b19-b7-TextArea_East_Border");
	private By LengthFromEast_textbox = By.id("b4-b19-b7-Input_EastNumber4");
	private By BorderFromWest_textbox = By.id("b4-b19-b7-TextArea_West_Border");
	private By LengthFromWest_textbox = By.id("b4-b19-b7-Input_WestNumber5");
	private By NameOfOwner_textbox = By.id("b4-b19-b7-Input_OwnerNameOfThePropertyDeed");
	private By Attachments_checkbox = By.xpath("(//input[@class='checkbox'])[1]");
	private By addassetsowner_button = By.xpath("//button[@class='btn btn-primary ThemeGrid_MarginGutter']/i[@class='icon margin-right-s fa fa-plus fa-1x']");
	private By ownerid_textbox = By.xpath("//input[@id='b4-b19-b7-b15-Owner_ID']");
	private By ownername_textbox = By.xpath("//input[@id='b4-b19-b7-b15-Input_Party_Number']");
	private By dateofbirth_textbox = By.xpath("//input[@id='b4-b19-b7-b15-b3-Input_DateVar']");
	private By ownershippercentage_textbox = By.xpath("//input[@id='b4-b19-b7-b15-Percentage']");
	private By saveassetbutton = By.xpath("(//div[@id='b4-b19-b7-b15-b6-Button']/button[@class='btn btn-primary'])");
	private By approveassetbutton = By.xpath("//button[text()='Approve']");
	private By confirmapproveassetbutton = By.xpath("//div[@class='footer-actions margin-top-base']/button[text()='Approve']");
	
public void addassetsentry(String assettitlepath,String Schema,String PartNumber,String area, String LengthFromSouth, String LengthFromNorth, String BorderFromEast, String BorderFromWest, String LengthFromEast, String LengthFromWest,String NameOfOwner,String ownerid, String ownername, String dateofbirth, String percantage) throws InterruptedException 
{
	Thread.sleep(2000);

	wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	
	By assettitle = By.xpath(assettitlepath);

	WebElement assetslistbuttonement = driver.findElement(assetslistbutton);
	wait.until(ExpectedConditions.visibilityOf(assetslistbuttonement));

	System.out.println(assetslistbuttonement.getText());
	clickButtonJS(assetslistbuttonement);
	

	
	WebElement asset1titleement = driver.findElement(assettitle);
	wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	wait.until(ExpectedConditions.visibilityOf(asset1titleement));
	clickButtonJS(asset1titleement);
	
//	wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	
	
	driver.findElement(subtypetextbox).sendKeys("Sub Type text");

	Select list2value = new Select(driver.findElement(Propertystatus_dropdownlist));
	list2value.selectByValue("0");
	
	 Select listvalue2 = new Select(driver.findElement(PropertyDeedType_dropdownlist));
	 listvalue2.selectByIndex(2);
	 
	 Select listvalue3 = new Select(driver.findElement(Issaleforthewholeproprietyorpartofpropriety_dropdownlist));
	 listvalue3.selectByIndex(1);
	
	 Select listvalue7 = new Select(driver.findElement(deedregision_dropdownlist));
	 listvalue7.selectByIndex(6);
	 


	 Select listvalue6 = new Select(driver.findElement(deedcity_dropdownlist));
	 listvalue6.selectByIndex(14);

	 WebElement deednegement = driver.findElement(deedneighborhood_dropdownlist);
	 clickButtonJS(deednegement);
	 		 
	
	  WebElement searchitem=driver.findElement(searchtextboxdropdownlist);
	  searchitem.sendKeys("ا");
	  System.out.println(searchitem.getTagName());
	  searchitem.sendKeys(Keys.ENTER);
	 
        
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView();",driver.findElement(Schema_textbox));

	driver.findElement(Schema_textbox).sendKeys(Schema);
	driver.findElement(PartNumber_textbox).sendKeys(PartNumber);
	driver.findElement(area_textbox).sendKeys(area);
	driver.findElement(BorderFromNorth_textbox).sendKeys(BorderFromEast);
	driver.findElement(LengthFromNorth_textbox).sendKeys(LengthFromNorth);
	driver.findElement(BorderFromSouth_textbox).sendKeys(BorderFromWest);
	driver.findElement(LengthFromSouth_textbox).sendKeys(LengthFromSouth);
	driver.findElement(BorderFromEast_textbox).sendKeys(BorderFromEast);
	driver.findElement(LengthFromEast_textbox).sendKeys(LengthFromEast);
	driver.findElement(BorderFromWest_textbox).sendKeys(BorderFromWest);
	driver.findElement(LengthFromWest_textbox).sendKeys(LengthFromWest);
	driver.findElement(NameOfOwner_textbox).sendKeys(NameOfOwner);
	 
	WebElement Attachments_checkboxement = driver.findElement(Attachments_checkbox);
	clickButtonJS(Attachments_checkboxement);
	
	 
	WebElement addassetsowner_buttonement = driver.findElement(addassetsowner_button);
	clickButtonJS(addassetsowner_buttonement);
	


	driver.findElement(ownerid_textbox).sendKeys(ownerid);
	driver.findElement(ownername_textbox).sendKeys(ownername);
	WebElement Date = driver.findElement(dateofbirth_textbox);
	Date.click();
	Date.sendKeys(Keys.ENTER);
//	driver.findElement(dateofbirth_textbox).sendKeys(dateofbirth);
	driver.findElement(ownershippercentage_textbox).sendKeys(percantage);

	WebElement saveassetbuttonement = driver.findElement(saveassetbutton);

	clickButtonJS(saveassetbuttonement);
	
	WebElement approveement = driver.findElement(approveassetbutton);
	clickButtonJS(approveement);
	

	WebElement confirmement = driver.findElement(confirmapproveassetbutton);
	wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	wait.until(ExpectedConditions.visibilityOf(confirmement));
	clickButtonJS(confirmement);
	
}
	 //Send for initial approve
	
		private By sendforinitialapprovalbutton = By.xpath("//div[@class='footer-actions margin-top-base background-neutral-2 padding-s border-radius-soft']/button[text()='Send for Initial Approval']");
		private By approvesendingbutton = By.xpath("//div[@class='footer-actions margin-top-base']/button[text()='Approve']");
		
	public void sendforinitialapproval() throws InterruptedException
	{
		

		WebElement sendforinitialapprovalbuttononement = driver.findElement(sendforinitialapprovalbutton);
		
		clickButtonJS(sendforinitialapprovalbuttononement);
		

		
		WebElement approvesendingbuttonement = driver.findElement(approvesendingbutton);
		clickButtonJS(approvesendingbuttonement);
		
		
	}
	//Assign Task by supervisor
	        private By pendingoninitialapprovalbutton = By.xpath("(//div[@class='display-flex align-items-center ThemeGrid_Width10']/span)[5]");
			private By assigntask_button = By.id("b4-b5-Title");
			private By ResearcherName_dropdownlist = By.xpath("(//div[@class='dropdown-container OSFillParent']/select)[2]");
			private By ApproverName_dropdownlist = By.xpath("(//div[@class='dropdown-container OSFillParent']/select)[2]");
			private By Assign_button = By.xpath("//div[@class='OSInline']/button");
	
	public void assigntaskbyserverprovider() throws InterruptedException 
	{	
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(pendingoninitialapprovalbutton)));
		
		WebElement button1 = driver.findElement(pendingoninitialapprovalbutton);
		clickButtonJS(button1);
		Thread.sleep(1000);
		
		WebElement tasknameelement = driver.findElement(taskname);
		clickButtonJS(tasknameelement);
		
		WebElement assigntask_buttonement = driver.findElement(assigntask_button);
		clickButtonJS(assigntask_buttonement);
		
		Select listvalue = new Select(driver.findElement(ResearcherName_dropdownlist));
		listvalue.selectByIndex(2);
		
		Select listvalue2 = new Select(driver.findElement(ApproverName_dropdownlist));
		listvalue2.selectByIndex(2);
		
		WebElement Assigntask = driver.findElement(Assign_button);
		clickButtonJS(Assigntask);
		
	}
	
	 private By nextbutton = By.xpath("//button[@aria-label='go to next page']");
     public void nextpage() throws InterruptedException
 	{
 		WebElement element = driver.findElement(nextbutton);
 		clickButtonJS(element);
 	}
	
}
