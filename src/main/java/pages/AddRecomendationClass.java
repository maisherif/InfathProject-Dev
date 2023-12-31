package pages;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddRecomendationClass {
	
	private WebDriver driver;
	private WebDriverWait wait;

	public AddRecomendationClass(WebDriver driver) {
		this.driver=driver;
	}

	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
		
		private By taskname = By.xpath("(//div[@class='display-flex align-items-flex-start']/div[text()='Judicial Decision Number'])[1]");
//		private By pendlingonpreparationbutton = By.xpath("(//span[@class='white-space-nowrap'])[2]");
		private By assetlistbutton = By.xpath("//div[@id='b4-b4-Title']");
//		private By addrecomendationbutton = By.xpath("//span[text()='Add New Recommendation']");
//		private By recomendationdropdownlist = By.xpath("//select[@id='b4-b19-b15-b2-RecommendationType']");
		private By salablebutton = By.xpath("(//div[@class='footer-actions margin-top-base']/button)[3]");
		
		private By recomendationdetails = By.xpath("//textarea[@id='b4-b19-b7-TextArea_Recommendation_Details']");
		private By submitaddingrecomendation = By.xpath("(//button[@class='btn btn-primary ThemeGrid_MarginGutter'])[2]");
		private By searchtasknumberresearcher = By.xpath("//input[@id='b4-Input_Name4']");
		private By searchbutton2 = By.xpath("//button[text()='Search']");

		public void opentask (String tasknumber) 
       
		{
			wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchtasknumberresearcher)));
			
//			 driver.findElement(searchtasknumberresearcher).sendKeys(tasknumber);

//			 WebElement button =driver.findElement(searchbutton2);
//			 clickButtonJS(button);
			 WebElement  button = driver.findElement(taskname);
			 clickButtonJS(button);
			 
		}

		
		public void addrecomendation (String assetnumber) throws InterruptedException
		{	Thread.sleep(1000);

		
		WebElement button =driver.findElement(assetlistbutton);
		clickButtonJS(button);
		 
		Thread.sleep(1000);

		 By assetinlist = By.xpath(assetnumber);
		 button =driver.findElement(assetinlist);
		 clickButtonJS(button);
		 
		 Thread.sleep(2000);
		 
//		 button =driver.findElement(addrecomendationbutton);
//		 clickButtonJS(button);
		 
//		 Select list1value = new Select(driver.findElement(recomendationdropdownlist));
//		 list1value.selectByValue("0");
		 
		 button =driver.findElement(salablebutton);
		 clickButtonJS(button);

		 driver.findElement(recomendationdetails).sendKeys("notess");
		 
		 button =driver.findElement(submitaddingrecomendation);
		 clickButtonJS(button);
		}

		 private By nextbutton = By.xpath("//button[@aria-label='go to next page']");
	     public void nextpage() throws InterruptedException
	 	{
	 		WebElement element = driver.findElement(nextbutton);
	 		clickButtonJS(element);
	 	}
	
}
