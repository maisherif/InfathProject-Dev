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

public class finalEvaluationClass2 {
	private WebDriver driver;
	private WebDriverWait wait;

	public finalEvaluationClass2(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);
	}
	//External User
        private By newbutton = By.xpath("(//div[@class='display-flex align-items-center']/span)[2]");
  		private By casesreportbutton = By.xpath("//div[@class='display-flex margin-right-s']/span");
		
		public void openasset(String deednumber) throws InterruptedException  
		{
			Thread.sleep(2000);
			wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			WebElement button = driver.findElement(newbutton);
			wait.until(ExpectedConditions.visibilityOf(button));
			clickButtonJS(button);
			
			Thread.sleep(2000);
			By deednumberbutton_assetcard = By.xpath(deednumber);
			WebElement element = driver.findElement(deednumberbutton_assetcard);
			clickButtonJS(element);
		
			Thread.sleep(2000);
			
			
			
		}	
		public void opencasestudy()
		{
			WebElement casestudybuttonelement = driver.findElement(casesreportbutton);
			clickButtonJS(casestudybuttonelement);
		}
		public void openfinalevaluation(String finalevaluationbutton) 
		{
			By finalevaluation=By.xpath(finalevaluationbutton);
			WebElement casestudybuttonelement = driver.findElement(finalevaluation);
			clickButtonJS(casestudybuttonelement);
		}
		
		
		//report data
		private By viewdate = By.xpath("//input[@id='b5-b21-b7-Input_DateVar']");
		private By evaluationdate = By.xpath("//input[@id='b5-b21-b7-Input_DateVar2']");
		private By addresstextbox = By.xpath("//input[@id='b5-b21-b7-Input_DateVar3']");
		private By methoddropdownlist = By.xpath("//div[@id='b5-b21-b7-Dropdown1-container']/select");
		private By contactnumbertextbox = By.xpath("//input[@id='b5-b21-b7-Input_DecimalVar']");
		private By savereportdatabutton = By.xpath("//div[@id='b5-b21-b7-b1-Button']/button");

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
		private By reportidtextbox = By.xpath("//input[@id='b5-b21-b9-Input_TextVar']");
		private By costbasictextbox = By.xpath("//input[@id='b5-b21-b9-Input_TextVar2']");
		private By checkbox = By.xpath("//input[@id='b5-b21-b9-Checkbox1']");
		private By saveworkscope = By.xpath("(//div[@id='b5-b21-b9-b1-Button']/button)");
		
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
		private By liciencenumbertextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar']");
		private By streetwidthtextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar2']");
		private By constructionareatextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar3']");
		private By numFragmentationRecordtextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar4']");
		private By streetnametextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar5']");
		private By nameNearestMainStreettextbox = By.xpath("//input[@id='b5-b21-b11-Input_varText']");

		//*[@id=\"b5-b17-b1-b11-MapContainer\"]/div[2]/div/div/div[2]/div[2]/div
		private By location = By.xpath("(//div[@id='b5-b21-b11-MapContainer']/div[2]/div/div/div[2]/div/div/div[2]/div[2])[1]");

		private By numroomstextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar6']");
		private By numhallstextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar7']");
		private By numapartmenttextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar8']");
		private By numbathroomtextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar9']");
		private By propertyagetextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar10']");
		private By demondtextbox = By.xpath("//input[@id='b5-b21-b11-Input_varText2']");
		private By numgalleriestextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar13']");
		private By numtowerstextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar15']");
		private By propertydescriptiontextbox = By.xpath("//textarea[@id='b5-b21-b11-TextArea_PropertyDescription']");
		
		private By availableservicesdropdownlist = By.xpath("//div[@id='b5-b21-b11-b5-DropdownBar']");
		private By selectallcheckbox = By.xpath("//div[@class='multi-select-react-and-mob-checkbox-container servicestudio']/span/input[@id='b5-b21-b11-b5-Checkbox_SelectAll']");
		
		private By facilitiessdropdownlist = By.xpath("//div[@id='b5-b21-b11-b6-DropdownBar']");
		private By selectallcheckbox2 = By.xpath("//div[@class='multi-select-react-and-mob-checkbox-container servicestudio']/span/input[@id='b5-b21-b11-b6-Checkbox_SelectAll']");
		
		private By numwelltextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar11']");
		private By advtextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar16']");
		private By waytextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar17']");
		private By propertynotestextbox = By.xpath("//input[@id='b5-b21-b11-Input_DecimalVar18']");
		
		private By saveassetinfo = By.xpath("(//div[@id='b5-b21-b11-b7-Button']/button)");

		
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
		private By numberofBuildingsFloorstextbox = By.xpath("//input[@id='b5-b21-b13-Input_BuildingFloorsNo']");
		private By basementtextbox = By.xpath("//input[@id='b5-b21-b13-Input_BasementArea']");
		private By annextextbox = By.xpath("//input[@id='b5-b21-b13-Input_AnnexArea']");
		private By buildingareatextbox = By.xpath("//input[@id='b5-b21-b13-Input_BuildingArea']");

		private By saveborders = By.xpath("(//div[@id='b5-b21-b13-b1-Button']/button)");

		
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
		private By LandNumericalValuetextbox = By.xpath("//input[@id='b5-b21-b17-Input_LandNumericalValue']");
		private By BuildingNumericalValuetextbox = By.xpath("//input[@id='b5-b21-b17-Input_BuildingNumericalValue']");
		private By totalValuetextbox = By.xpath("//input[@id='b5-b21-b17-Input_TotalPropertyNumerical2']");
		private By DosciuntPercentageValuetextbox = By.xpath("//input[@id='b5-b21-b17-Input_DosciuntPercentageValue']");

		private By saveestimatevalue = By.xpath("//div[@id='b5-b21-b17-b1-Button']/button");
		
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
		private By assetlocationtextbox = By.xpath("//input[@id='b5-b21-b19-Input_AssetLocation']");
		private By uploadimagebutton1 = By.xpath("//input[@id='b5-b21-b19-b1-FileUploadInput']");
		private By uploadimagebutton2 = By.xpath("//input[@id='b5-b21-b19-b3-FileUploadInput']");
		private By uploadimagebutton3 = By.xpath("//input[@id='b5-b21-b19-b5-FileUploadInput']");
		private By uploadimagebutton4 = By.xpath("//input[@id='b5-b21-b19-b7-FileUploadInput']");

		private By saveassetpictures = By.xpath("//div[@id='b5-b21-b19-b9-Button']/button");

		

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
		private By addpersonbutton = By.xpath("//div[@id='b5-b21-b21-AddBtn']/button");
		private By personnametextbox = By.xpath("//input[@id='b5-b21-b21-Input_Name']");
		private By licencenumbertextbox = By.xpath("//input[@id='b5-b21-b21-Input_Name2']");
		private By licencedate = By.xpath("//input[@id='b5-b21-b21-Input_Name3']");
		private By licienceuploader = By.xpath("//input[@id='b5-b21-b21-b2-FileUploadInput']");

		private By saveaddperson = By.xpath("//div[@id='b5-b21-b21-b4-Button']/button");
		
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
		private By saveresearchdomain = By.xpath("//div[@id='b5-b21-b23-b1-Button']/button");
		public void addresearchdomain()
		{
			
			 WebElement save = driver.findElement(saveresearchdomain);
			  clickButtonJS(save);
		}
		
		//The Final Data
		private By notestextbox = By.xpath("//textarea[@id='b5-b21-b25-TextArea_Notes']");
		private By attachmentbutton = By.xpath("//input[@id='b5-b21-b25-b1-FileUploadInput']");
		private By savefinaldata = By.xpath("//div[@id='b5-b21-b25-b3-Button']/button");

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
		
		private By sendevaluationforreviewbutton = By.xpath("//div[@id='b5-b21-b29-b8-Button']/button");
		private By assetlistpagebutton =By.xpath("//div[@class='display-flex text-align-center flex-direction-column align-items-center  item  active ']/img");
		public void sendevaluationforreview() throws InterruptedException
		{
			  Thread.sleep(10000);

			 WebElement save = driver.findElement(sendevaluationforreviewbutton);
			  clickButtonJS(save);
			  
			  WebElement assetlistbutton = driver.findElement(assetlistpagebutton);
			  clickButtonJS(assetlistbutton);
		}
}
