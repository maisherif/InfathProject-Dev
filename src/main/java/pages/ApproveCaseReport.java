package pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApproveCaseReport {
	
	private WebDriver driver;
	private WebDriverWait wait;

	public ApproveCaseReport(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}

		private By casesreportbutton = By.xpath("//div[@class='display-flex margin-right-s']/span");

		private By sentbyevaluator = By.xpath("(//div[@class='display-flex align-items-center']/span)[2]");
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

			  driver.findElement(searchsourcetextbox).sendKeys("text");
			  driver.findElement(indicatedvaluetextbox).sendKeys("4565");
			  driver.findElement(searchsourcelinktextbox).sendKeys("554");

			 
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
	
}
