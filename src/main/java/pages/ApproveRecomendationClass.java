package pages;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApproveRecomendationClass {
	
	private WebDriver driver;
	private WebDriverWait wait;

	public ApproveRecomendationClass(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}


		
		private By taskname = By.xpath("(//div[@class='display-flex align-items-flex-start']/div[text()='Judicial Decision Number'])[1]");
//		private By searchtasknumberresearcher = By.xpath("//input[@id='b4-Input_Name4']");
		private By searchbutton2 = By.xpath("//button[text()='Search']");

		public void opentask (String tasknumber) throws InterruptedException{
//			wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//			wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchtasknumberresearcher)));
//			 driver.findElement(searchtasknumberresearcher).sendKeys(tasknumber);

			 WebElement button =driver.findElement(searchbutton2);
			 clickButtonJS(button);
			  button = driver.findElement(taskname);
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
