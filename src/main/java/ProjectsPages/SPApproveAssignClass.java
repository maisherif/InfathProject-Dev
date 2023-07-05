package ProjectsPages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SPApproveAssignClass {
	
	private WebDriver driver;
	private WebDriverWait wait;

	 public SPApproveAssignClass(WebDriver driver)
	{	 
		// TODO Auto-generated constructor stub
		this.driver = driver;
        
	} 
	 private By projectsbutton = By.xpath("//span[text()='Projects']");
		
		public void openprojectslist() 
		{
			
			WebElement OpenProjects = driver.findElement(projectsbutton);
			wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			wait.until(ExpectedConditions.visibilityOf(OpenProjects));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", OpenProjects );
		}
		
	 
	 
	private By SPOpenProject = By.xpath("//div[@class = 'display-flex align-items-center text-primary margin-top-base'][1]");
	
	//Open Project to approve assign 
		public void OpenProject()
		
		{
			WebElement OpenProject = driver.findElement(SPOpenProject);
			wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			wait.until(ExpectedConditions.visibilityOf(OpenProject));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", OpenProject );
			
		}
		
		
		//click check box then Approve 
		int i ;
		private By CheckBox = By.xpath("//input[@id='b5-b18-Checkbox1']");
		private By ClickApprove = By.xpath("//button[@id='b5-b18-Btn_SPApprove']");
		private By Submit = By.xpath("//button[@class=\"btn btn-primary ThemeGrid_MarginGutter\"]");
		//private By OTP;
		
		public void SPApprove ()
		{
			//Click check box 
			
			WebElement ClickCheckBox = driver.findElement(CheckBox);
			wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			wait.until(ExpectedConditions.visibilityOf(ClickCheckBox));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ClickCheckBox );
			
			//////////////////////
			
//Click Approve
			
			WebElement ClickApproveButton = driver.findElement(ClickApprove);
			wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			wait.until(ExpectedConditions.visibilityOf(ClickApproveButton));
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("arguments[0].click();", ClickApproveButton );
			
			/////////////////////////
			
			//Enter OTP
			WebElement EnterOTP;
			
			for(i=1; i<=4 ; i++)
			{
			 EnterOTP = driver.findElement(By.xpath("//input[@id='b5-b18-b2-Input_pin"+i+"']"));
			 EnterOTP.sendKeys(""+i+"");
			
			}
			
			////////////// click submit 
			
			
			WebElement Clicksubmit = driver.findElement(Submit);
			wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			wait.until(ExpectedConditions.visibilityOf(ClickApproveButton));
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("arguments[0].click();", Clicksubmit );
			
			
			
			
			
		}

}
