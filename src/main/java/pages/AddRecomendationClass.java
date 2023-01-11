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
		private By addrecomendationbutton = By.xpath("//span[text()='Add New Recommendation']");
		private By recomendationdropdownlist = By.xpath("//select[@id='b4-b19-b16-RecommendationType']");
		private By recomendationdetails = By.xpath("//textarea[@id='b4-b19-b16-TextArea_RecommendationDetails']");
		private By submitaddingrecomendation = By.xpath("//button[@class='btn btn-primary margin-x-base']");
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

	
}
