package pages;

import java.awt.AWTException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EvaluationClass {
	
	private WebDriver driver;
	private WebDriverWait wait;

	public EvaluationClass(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}

	//External User
//        private By newbutton = By.xpath("(//div[@class='display-flex align-items-center']/span)[2]");
  		private By casesreportbutton = By.xpath("//div[@class='display-flex margin-right-s']/span");
		
		public void openasset(String deednumber) throws InterruptedException  
		{
//			wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//			WebElement button = driver.findElement(newbutton);
//			wait.until(ExpectedConditions.visibilityOf(button));
//			clickButtonJS(button);
			
			Thread.sleep(2000);
			By deednumberbutton_assetcard = By.xpath(deednumber);
			WebElement element = driver.findElement(deednumberbutton_assetcard);
			clickButtonJS(element);
		
			
			WebElement casestudybuttonelement = driver.findElement(casesreportbutton);
			clickButtonJS(casestudybuttonelement);
			
		}	
		
		//report data
		private By viewdate = By.xpath("(//span[@class='input-date']/input)[1]");
		private By evaluationdate = By.xpath("(//span[@class='input-date']/input)[2]");
		private By addresstextbox = By.xpath("//input[@id='b5-b17-b1-b7-Input_DateVar3']");
		private By methoddropdownlist = By.xpath("//div[@id='b5-b17-b1-b7-Dropdown1-container']/select");
		private By contactnumbertextbox = By.xpath("//input[@id='b5-b17-b1-b7-Input_DecimalVar']");
		private By savereportdatabutton = By.xpath("//div[@class='footer-actions margin-top-base OSInline']/button[text()='Save']");

		public void addreportdata(String viewdatestring, String evaluationdatee, String address, String contactnumber) throws InterruptedException 
		{
			
//			  wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//			  wait.until(ExpectedConditions.visibilityOf( driver.findElement(viewdate)));

			  Thread.sleep(5000);
			  driver.findElement(viewdate).sendKeys(viewdatestring);
			  driver.findElement(evaluationdate).sendKeys(evaluationdatee);
			  

			  
			  Select list1value = new Select(driver.findElement(methoddropdownlist));
				list1value.selectByValue("1");
			  
			  driver.findElement(addresstextbox).sendKeys(address);

			  driver.findElement(contactnumbertextbox).sendKeys(contactnumber);

			  WebElement save = driver.findElement(savereportdatabutton);
			  clickButtonJS(save);

		}	
		
		//work scope
		private By reportidtextbox = By.xpath("//input[@id='b5-b17-b1-b9-Input_TextVar']");
		private By costbasictextbox = By.xpath("//input[@id='b5-b17-b1-b9-Input_TextVar2']");
		private By checkbox = By.xpath("//input[@id='b5-b17-b1-b9-Checkbox1']");
		private By saveworkscope = By.xpath("(//div[@class='footer-actions margin-top-base']/button)[1]");
		
		public void addworkscope(String reportid, String costbasic) throws InterruptedException 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;

			  js.executeScript("arguments[0].scrollIntoView();", 	driver.findElement(reportidtextbox));
			  
			  driver.findElement(reportidtextbox).sendKeys(reportid);
			  driver.findElement(costbasictextbox).sendKeys(costbasic);
			  
			  WebElement checkboxelement = driver.findElement(checkbox);
			  clickButtonJS(checkboxelement);
			 
			  WebElement save = driver.findElement(saveworkscope);
			  clickButtonJS(save);

		}	
		
		//asset information
		private By liciencenumbertextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar']");
		private By streetwidthtextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar2']");
		private By constructionareatextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar3']");
		private By numFragmentationRecordtextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar4']");
		private By streetnametextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar5']");
		private By nameNearestMainStreettextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_varText']");

		//*[@id=\"b5-b17-b1-b11-MapContainer\"]/div[2]/div/div/div[2]/div[2]/div
		private By location = By.xpath("(//div[@id='b5-b17-b1-b11-MapContainer']/div[2]/div/div/div[2]/div/div/div[2]/div[2])[1]");

		private By numroomstextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar6']");
		private By numhallstextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar7']");
		private By numapartmenttextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar8']");
		private By numbathroomtextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar9']");
		private By propertyagetextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar10']");
		private By demondtextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_varText2']");
		private By numgalleriestextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar13']");
		private By numtowerstextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar15']");
		private By propertydescriptiontextbox = By.xpath("//textarea[@id='b5-b17-b1-b11-TextArea_PropertyDescription']");
		
		private By availableservicesdropdownlist = By.xpath("//div[@id='b5-b17-b1-b11-b5-DropdownBar']");
		private By selectallcheckbox = By.xpath("//div[@class='multi-select-react-and-mob-checkbox-container servicestudio']/span/input[@id='b5-b17-b1-b11-b5-Checkbox_SelectAll']");
		
		private By facilitiessdropdownlist = By.xpath("//div[@id='b5-b17-b1-b11-b6-DropdownBar']");
		private By selectallcheckbox2 = By.xpath("//div[@class='multi-select-react-and-mob-checkbox-container servicestudio']/span/input[@id='b5-b17-b1-b11-b6-Checkbox_SelectAll']");
		
		private By numwelltextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar11']");
		private By advtextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar16']");
		private By waytextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar17']");
		private By propertynotestextbox = By.xpath("//input[@id='b5-b17-b1-b11-Input_DecimalVar18']");
		
		private By saveassetinfo = By.xpath("(//div[@class='footer-actions margin-top-base']/button)[2]");

		
		public void addassetinfo() throws InterruptedException 
		{
			 JavascriptExecutor js = (JavascriptExecutor) driver;

			  js.executeScript("arguments[0].scrollIntoView();", 	driver.findElement(liciencenumbertextbox));
//			  wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//			  wait.until(ExpectedConditions.visibilityOf(driver.findElement(liciencenumbertextbox)));

			  Thread.sleep(2000);
			  
			  driver.findElement(liciencenumbertextbox).sendKeys("123");
			  driver.findElement(streetwidthtextbox).sendKeys("123");
			  js.executeScript("arguments[0].scrollIntoView();", 	driver.findElement(constructionareatextbox));

			  driver.findElement(constructionareatextbox).sendKeys("123");
			  
			  driver.findElement(streetnametextbox).sendKeys("codelab");
			  driver.findElement(numFragmentationRecordtextbox).sendKeys("9");
			  driver.findElement(nameNearestMainStreettextbox).sendKeys("street");

			  Thread.sleep(2000);

//
			  wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			  wait.until(ExpectedConditions.visibilityOf(driver.findElement(location)));
			  
			  WebElement loc = driver.findElement(location);
			  clickButtonJS(loc);
			  
			  js.executeScript("arguments[0].scrollIntoView();", 	 driver.findElement(numroomstextbox));
			  driver.findElement(numroomstextbox).sendKeys("9");
			  driver.findElement(numhallstextbox).sendKeys("6");
			  driver.findElement(numapartmenttextbox).sendKeys("5");
			  driver.findElement(propertyagetextbox).sendKeys("10");
			  driver.findElement(numgalleriestextbox).sendKeys("6");
			  driver.findElement(numtowerstextbox).sendKeys("5");
			  driver.findElement(propertydescriptiontextbox).sendKeys("description");
			  driver.findElement(numbathroomtextbox).sendKeys("3");
			  driver.findElement(demondtextbox).sendKeys("9");

			  WebElement element1 = driver.findElement(availableservicesdropdownlist);
			  clickButtonJS(element1);

			  wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			  wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectallcheckbox)));
			  
			  WebElement element2 = driver.findElement(selectallcheckbox);
			  clickButtonJS(element2);
			 
			  WebElement element3 = driver.findElement(facilitiessdropdownlist);
			  clickButtonJS(element3);
			  
			  wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			  wait.until(ExpectedConditions.visibilityOf(driver.findElement(selectallcheckbox2)));

			  WebElement element4 = driver.findElement(selectallcheckbox2);
			  clickButtonJS(element4);

			  driver.findElement(numwelltextbox).sendKeys("9");
			  driver.findElement(advtextbox).sendKeys("adv dis");
			  driver.findElement(waytextbox).sendKeys("ways");
			  driver.findElement(propertynotestextbox).sendKeys("some notes");
			 
			  WebElement save = driver.findElement(saveassetinfo);
			  clickButtonJS(save);
			  

			  Thread.sleep(1000);

		}	
		//Borders and lengths for the asset
		private By numberofBuildingsFloorstextbox = By.xpath("//input[@id='b5-b17-b1-b13-Input_BuildingFloorsNo']");
		private By basementtextbox = By.xpath("//input[@id='b5-b17-b1-b13-Input_BasementArea']");
		private By annextextbox = By.xpath("//input[@id='b5-b17-b1-b13-Input_AnnexArea']");
		private By buildingareatextbox = By.xpath("//input[@id='b5-b17-b1-b13-Input_BuildingArea']");

		private By saveborders = By.xpath("(//div[@id='b5-b17-b1-b13-b1-Button']/button)");

		
		public void addborder() throws InterruptedException 
		{
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].scrollIntoView();",  driver.findElement(numberofBuildingsFloorstextbox));

			  driver.findElement(numberofBuildingsFloorstextbox).sendKeys("123");
			  driver.findElement(buildingareatextbox).sendKeys("123");
			  driver.findElement(basementtextbox).sendKeys("123");
			  driver.findElement(annextextbox).sendKeys("9");
			  
			  WebElement save = driver.findElement(saveborders);
			  clickButtonJS(save);
			  
			  Thread.sleep(1000);

		}
		
		//Estimated value
		private By LandNumericalValuetextbox = By.xpath("//input[@id='b5-b17-b1-b15-Input_LandNumericalValue']");
		private By BuildingNumericalValuetextbox = By.xpath("//input[@id='b5-b17-b1-b15-Input_BuildingNumericalValue']");
		private By totalValuetextbox = By.xpath("//input[@id='b5-b17-b1-b15-Input_TotalPropertyNumerical2']");
		private By DosciuntPercentageValuetextbox = By.xpath("//input[@id='b5-b17-b1-b15-Input_DosciuntPercentageValue']");

		private By saveestimatevalue = By.xpath("//div[@id='b5-b17-b1-b15-b1-Button']/button");
		
		public void addestimatevalue() throws InterruptedException 
		{
			Thread.sleep(3000);
			  driver.findElement(LandNumericalValuetextbox).sendKeys("9");
			  driver.findElement(BuildingNumericalValuetextbox).sendKeys("9");
			  driver.findElement(totalValuetextbox).sendKeys("100");

			  driver.findElement(DosciuntPercentageValuetextbox).sendKeys("20");
			  
			  WebElement save = driver.findElement(saveestimatevalue);
			  clickButtonJS(save);
			  
			  Thread.sleep(1000);

			  
		}
		//Asset Pictures
		private By assetlocationtextbox = By.xpath("//input[@id='b5-b17-b1-b17-Input_AssetLocation']");
		private By uploadimagebutton1 = By.xpath("//input[@id='b5-b17-b1-b17-b1-FileUploadInput']");
		private By uploadimagebutton2 = By.xpath("//input[@id='b5-b17-b1-b17-b3-FileUploadInput']");
		private By uploadimagebutton3 = By.xpath("//input[@id='b5-b17-b1-b17-b5-FileUploadInput']");
		private By uploadimagebutton4 = By.xpath("//input[@id='b5-b17-b1-b17-b7-FileUploadInput']");

		private By saveassetpictures = By.xpath("(//div[@class='footer-actions margin-top-base']/button)[3]");

		

		public void addassetpictures() throws InterruptedException, AWTException 
		{
			//comment
			 JavascriptExecutor js = (JavascriptExecutor) driver;
				Thread.sleep(3000);

			  js.executeScript("arguments[0].scrollIntoView();", 	driver.findElement(assetlocationtextbox));
			  driver.findElement(assetlocationtextbox).sendKeys("9");
			  String filename="abc.pdf";
			  String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
			  
			  WebElement upload1 = driver.findElement(uploadimagebutton1);
			  upload1.sendKeys(filepath);
			  
			  WebElement upload2 = driver.findElement(uploadimagebutton2);
			  upload2.sendKeys(filepath);
			  
			  WebElement upload3 = driver.findElement(uploadimagebutton3);
			  upload3.sendKeys(filepath);
			  
			  WebElement upload4 = driver.findElement(uploadimagebutton4);
			  upload4.sendKeys(filepath);
			  
			  Thread.sleep(7000);
			  
			  WebElement save = driver.findElement(saveassetpictures);
			  clickButtonJS(save);
			  
			  Thread.sleep(2000);
		}
		//Persons work on report
		private By addpersonbutton = By.xpath("//div[@id='b5-b17-b1-b19-AddBtn']/button");
		private By personnametextbox = By.xpath("//input[@id='b5-b17-b1-b19-Input_Name']");
		private By licencenumbertextbox = By.xpath("//input[@id='b5-b17-b1-b19-Input_Name2']");
		private By licencedate = By.xpath("//input[@id='b5-b17-b1-b19-Input_Name3']");
		private By licienceuploader = By.xpath("//input[@id='b5-b17-b1-b19-b2-FileUploadInput']");

		private By saveaddperson = By.xpath("//div[@class='footer-actions margin-top-base']/button[@class='btn btn-primary ThemeGrid_MarginGutter']");
		
		public void addpersonworkreport() throws InterruptedException, AWTException 
		{
			Thread.sleep(3000);

			  WebElement add = driver.findElement(addpersonbutton);
			  clickButtonJS(add);
			  driver.findElement(personnametextbox).sendKeys("Mai");
			  driver.findElement(licencenumbertextbox).sendKeys("123");
			  Thread.sleep(500);

			  driver.findElement(licencedate).sendKeys("09-10-2022");


			//Uploader
			  String filename="abc.pdf";
			  String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
			  WebElement upload = driver.findElement(licienceuploader);
			  upload.sendKeys(filepath);

			  Thread.sleep(2000);

			  WebElement save = driver.findElement(saveaddperson);
			  clickButtonJS(save);
			  
			  Thread.sleep(1000);
		}
		private By saveresearchdomain = By.xpath("(//div[@class='footer-actions margin-top-base']/button)[4]");
		public void addresearchdomain()
		{
			
			 WebElement save = driver.findElement(saveresearchdomain);
			  clickButtonJS(save);
		}
		
		//The Final Data
		private By notestextbox = By.xpath("//textarea[@id='b5-b17-b1-b23-TextArea_Notes']");
		private By attachmentbutton = By.xpath("//input[@id='b5-b17-b1-b23-b1-FileUploadInput']");
		private By savefinaldata = By.xpath("//div[@id='b5-b17-b1-b23-b3-Button']/button");

		public void addfinaldata() throws InterruptedException, AWTException 
		{			
			  driver.findElement(notestextbox).sendKeys("Notes Notes Notes Notes Notes Notes Notes ");

			//Uploader
			  String filename="abc.pdf";
			  String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
			  WebElement upload = driver.findElement(attachmentbutton);
			  upload.sendKeys(filepath);

			  Thread.sleep(3000);
			  
			  WebElement save = driver.findElement(savefinaldata);
			  clickButtonJS(save);
			  
			   wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		}
		
		private By sendevaluationforreviewbutton = By.xpath("//button[@id='b5-b17-b1-b27-Btn_ServiceProvider_Aprrove']");
		private By assetlistpagebutton =By.xpath("//div[@class='display-flex text-align-center flex-direction-column align-items-center  item  active ']/img");
		public void sendevaluationforreview() throws InterruptedException
		{
			  Thread.sleep(10000);

			 WebElement save = driver.findElement(sendevaluationforreviewbutton);
			  clickButtonJS(save);
			  
			  WebElement assetlistbutton = driver.findElement(assetlistpagebutton);
			  clickButtonJS(assetlistbutton);
		}
		
		
		private By sentbyevaluator = By.xpath("(//div[@class='display-flex align-items-center']/span)[2]");
//		private By employeenotestextbox = By.xpath("//div[@id='b4-b17-b1-EmployeeNotes']/span/textarea");
		private By searchsourcetextbox = By.xpath("//input[@id='b4-b17-b1-SearchSource2']");
		private By indicatedvaluetextbox = By.xpath("//input[@id='b4-b17-b1-IndictiveValue']");
		private By searchsourcelinktextbox = By.xpath("//input[@id='b4-b17-b1-SearchSourceLink2']");
		
		private By sendapproveevaluationbutton = By.id("b4-b17-b1-b27-Btn_EvaluationEmployee_Approve");
		private By propertieslistbutton = By.xpath("//div[@class='side-list-items selected']");
		
		public void evaluationemployee (String deednumber) throws InterruptedException
		{
			Thread.sleep(5000);
					
			WebElement button = driver.findElement(sentbyevaluator);
			clickButtonJS(button);
			
			By deednumberbutton_assetcard = By.xpath(deednumber);

			WebElement element = driver.findElement(deednumberbutton_assetcard);
			clickButtonJS(element);
			
			Thread.sleep(300);
			 
			 wait = new WebDriverWait(driver, Duration.ofSeconds(120));

			 
			 WebElement btn3 = driver.findElement(casesreportbutton);
			 wait.until(ExpectedConditions.visibilityOf(btn3));

			 clickButtonJS(btn3);
			 
			  wait = new WebDriverWait(driver, Duration.ofSeconds(200));
			  Thread.sleep(2000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;

			  js.executeScript("arguments[0].scrollIntoView();", 	driver.findElement(searchsourcetextbox));

//			  driver.findElement(employeenotestextbox).sendKeys("notess");
			  driver.findElement(searchsourcetextbox).sendKeys("text");
			  driver.findElement(indicatedvaluetextbox).sendKeys("4565");
			  driver.findElement(searchsourcelinktextbox).sendKeys("554");

//			 String filename="abc.pdf";
//			 String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
//			 WebElement upload = driver.findElement(attachments);
//			 
//			 upload.sendKeys(filepath);
			 
			   wait = new WebDriverWait(driver, Duration.ofSeconds(120));


			 WebElement approve = driver.findElement(sendapproveevaluationbutton);
			 clickButtonJS(approve);
			 
			 button = driver.findElement(propertieslistbutton);
			 clickButtonJS(button);
			 
		}
		private By pendingondepartmentmanagment = By.xpath("(//div[@class='display-flex align-items-center']/span[@class='white-space-nowrap'])[4]");

		private By sendapproveevaluationbutton2 = By.id("b4-b17-b1-b27-Btn_EvaluationManager_Approve");

		public void evaluationmanager (String deednumber) throws InterruptedException
		{
			Thread.sleep(3000);
			 WebElement btn = driver.findElement(pendingondepartmentmanagment);
			 clickButtonJS(btn);
			  
			    By deednumberbutton_assetcard = By.xpath(deednumber);

				WebElement element = driver.findElement(deednumberbutton_assetcard);
				clickButtonJS(element);
			 
			   wait = new WebDriverWait(driver, Duration.ofSeconds(120));

			 
			 WebElement btn3 = driver.findElement(casesreportbutton);
			 clickButtonJS(btn3);
			 
			  wait = new WebDriverWait(driver, Duration.ofSeconds(200));
			  Thread.sleep(2000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;

			  js.executeScript("arguments[0].scrollIntoView();", 	driver.findElement(sendapproveevaluationbutton2));
			 

			 WebElement approve = driver.findElement(sendapproveevaluationbutton2);
			 clickButtonJS(approve);
			 
			 WebElement button = driver.findElement(propertieslistbutton);
			 clickButtonJS(button);
			 
		}
//		private By justicnotes = By.xpath("//input[@id='b4-Input_AssetNumber']");
		private By radiobutton1 = By.xpath("//input[@id='b4-RadioButton17-input']");
		private By radiobutton2 = By.xpath("//input[@id='b4-RadioButton20-input']");
		private By radiobutton3 = By.xpath("//input[@id='b4-RadioButton18-input']");
		private By radiobutton4 = By.xpath("//input[@id='b4-RadioButton19-input']");
		private By JusticeWriterAttachments = By.xpath("//input[@id='b4-b1-FileUploadInput']");
		private By submitjusticwriter = By.xpath("//button[@id='b4-Submit']");
		private By approvejusticwriterbutton = By.xpath("//button[@class='btn btn-primary OSFillParent']");
		private By searchtasknumber = By.xpath("//input[@id='b4-Input_Task_Number']");
		private By searchbutton = By.xpath("//button[text()='Search']");


		
		public void justicwriterapproval (String eyexpath,String tasknumber) throws InterruptedException
		{
			
			 driver.findElement(searchtasknumber).sendKeys(tasknumber);

			 WebElement button =driver.findElement(searchbutton);
			 clickButtonJS(button);
			
			 By eyeicon = By.xpath(eyexpath);
			 Thread.sleep(5000);

			 WebElement eye = driver.findElement(eyeicon);
			 clickButtonJS(eye);
			 
			 Thread.sleep(5000);
			
			 button =driver.findElement(radiobutton1);
			 clickButtonJS(button);
			 
			 button =driver.findElement(radiobutton2);
			 clickButtonJS(button);
			 
			 button =driver.findElement(radiobutton3);
			 clickButtonJS(button);
			 
			 button =driver.findElement(radiobutton4);
			 clickButtonJS(button);
			 
			  String filename="abc.pdf";
			  String filepath=  System.getProperty("user.dir")+"\\uploads\\"+filename;
			  
			  WebElement upload = driver.findElement(JusticeWriterAttachments);
			  upload.sendKeys(filepath);
			  
				 Thread.sleep(3000);

			 button =driver.findElement(submitjusticwriter);
			 clickButtonJS(button);
			 
			 Thread.sleep(3000);
			 
			 WebElement button2 =driver.findElement(approvejusticwriterbutton);
			 Thread.sleep(3000);
				wait = new WebDriverWait(driver, Duration.ofSeconds(120));
				wait.until(ExpectedConditions.visibilityOf(button2));
			 clickButtonJS(button2);
			 
			 
		}
		
		private By taskname = By.xpath("(//div[@class='display-flex align-items-flex-start']/div[text()='Judicial Decision Number'])[1]");
//		private By pendlingonpreparationbutton = By.xpath("(//span[@class='white-space-nowrap'])[2]");
		private By assetlistbutton = By.xpath("//div[@id='b4-b4-Title']");
		private By addrecomendationbutton = By.xpath("//span[text()='Add New Recommendation']");
		private By recomendationdropdownlist = By.xpath("//select[@id='b4-b19-b16-RecommendationType']");
		private By recomendationdetails = By.xpath("//textarea[@id='b4-b19-b16-TextArea_RecommendationDetails']");
		private By submitaddingrecomendation = By.xpath("//button[@class='btn btn-primary margin-x-base']");
		private By searchtasknumberresearcher = By.xpath("//input[@id='b4-Input_Name4']");
		private By searchbutton2 = By.xpath("//button[text()='Search']");

		public void opentask (String tasknumber) throws InterruptedException{
			Thread.sleep(2000);
			 driver.findElement(searchtasknumberresearcher).sendKeys(tasknumber);

			 WebElement button =driver.findElement(searchbutton2);
			 clickButtonJS(button);
			  button = driver.findElement(taskname);
			 clickButtonJS(button);
			
			Thread.sleep(1000);
		}

		
		public void addrecomendation (String assetnumber) throws InterruptedException
		{
			
			WebElement button =driver.findElement(assetlistbutton);
			 clickButtonJS(button);
			 
			Thread.sleep(1000);

			 By assetinlist = By.xpath(assetnumber);
			 button =driver.findElement(assetinlist);
			 clickButtonJS(button);
			 
			 button =driver.findElement(addrecomendationbutton);
			 clickButtonJS(button);
			 
			 Select list1value = new Select(driver.findElement(recomendationdropdownlist));
			 list1value.selectByValue("0");

			 driver.findElement(recomendationdetails).sendKeys("notess");
			 
			 button =driver.findElement(submitaddingrecomendation);
			 clickButtonJS(button);

		}
		
		private By recomendatioinbutton = By.xpath("//div[@id='b4-b8-Title']");
		public void gotorecomendationtab () throws InterruptedException
		{
			WebElement button =driver.findElement(recomendatioinbutton);
			 clickButtonJS(button);
			 
			Thread.sleep(1000);
		
		}
		public void approverecomendation (String actionindex) throws InterruptedException
		{
			
			 By index = By.xpath(actionindex);
			 WebElement button =driver.findElement(index);
			 clickButtonJS(button);
		}

	
}
