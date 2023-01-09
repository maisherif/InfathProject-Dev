package pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilldataJusticWriterClass {
	
	private WebDriver driver;
	private WebDriverWait wait;

	public FilldataJusticWriterClass(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

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

	
}
