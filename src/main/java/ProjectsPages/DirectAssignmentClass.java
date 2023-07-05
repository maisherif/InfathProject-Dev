package ProjectsPages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DirectAssignmentClass {
	private WebDriver driver;
	private WebDriverWait wait;

	public DirectAssignmentClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
        
	} //constructor with the driver 
	
	public void clickButtonJS(WebElement button) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

	}
	
	private By NotStartedProjects = By.xpath("//*[@id=\"b4-ProjectStats2\"]/a[4]/div/div[1]/span  ");
	private By SelectProject = By.xpath("(//div[@class='display-flex align-items-center text-primary margin-top-base'])[1]");
    private By SendToOperationCommittee = By.xpath("//button[@id='b4-b18-Btn_ProcurmentApprove']");
	WebElement FilterwithNostarted;
	
    private By ProjectsList;

    
	//Open ProjectsList and select Project
	public void OpenProject(String Path) throws InterruptedException
	{   
		Thread.sleep(2000);
		
		  ProjectsList= By.xpath(Path);
		  WebElement ProjectsListbutton = driver.findElement(ProjectsList);
			wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(ProjectsListbutton));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ProjectsListbutton );
			Thread.sleep(2000);
			//Filter with No started projects
			FilterwithNostarted = driver.findElement(NotStartedProjects);

			wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(FilterwithNostarted));
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("arguments[0].click();", FilterwithNostarted );
			
			Thread.sleep(1000);
			//Select Project
					WebElement SelectProjectButton = driver.findElement(SelectProject);

					wait = new WebDriverWait(driver, Duration.ofSeconds(60));
					wait.until(ExpectedConditions.visibilityOf(SelectProjectButton));
					JavascriptExecutor js3 = (JavascriptExecutor) driver;
					js3.executeScript("arguments[0].click();", SelectProjectButton );
		
	}
	
    public void Procurementapprove ()
	{		
				
				//Approve Project 
				WebElement ApproveProjectButton = driver.findElement(SendToOperationCommittee);

				wait = new WebDriverWait(driver, Duration.ofSeconds(500));
				wait.until(ExpectedConditions.visibilityOf(ApproveProjectButton));
				JavascriptExecutor js4 = (JavascriptExecutor) driver;
				js4.executeScript("arguments[0].click();", ApproveProjectButton );
	}
    
      private By OperationCommitte = By.xpath("//div[@id='b4-b6-Title']");
      private By SelectAnotherSP = By.xpath("//*[@id=\"b4-b24-btn_ManualSearch\"]/span");
      private By SPSearchText = By.xpath("//*[@id=\"b4-b24-$b6\"]/div/div[2]/div[1]/div[1]/span/input");
      private By SPSearchButton = By.xpath("//button[@id='b4-b24-b6-btn_Find']");
      private By SelectSP = By.xpath("(//input[@class='checkbox'])[9]");
      private By ConfirmSelectedSP = By.xpath("//button[@id='b4-b24-b6-Btn_Confirm']");
      private By SendToMembers = By.xpath("//*[@id=\"b4-b24-b5-Secretary_Action\"]/button[1]");
      private By SelectMembers = By.xpath("(//input[@class='checkbox'])[4]");
      private By SelectMembers2 = By.xpath("(//input[@class='checkbox'])[5]");

         public void SelectSP() throws InterruptedException
         {      
        	 //Open Operation committee tab
        	 WebElement OperationCommitteTab = driver.findElement(OperationCommitte);

				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(OperationCommitteTab));
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].click();", OperationCommitteTab );
				
			//Open SPs List
				
				WebElement SPsList = driver.findElement(SelectAnotherSP);

				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(SPsList));
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js2.executeScript("arguments[0].click();", SPsList );
				
			//Search For SP
				WebElement SearchBox = driver.findElement(SPSearchText);
				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(SearchBox));
				SearchBox.sendKeys("7006337674");
	
			//Click Search 
				WebElement ClickSearch = driver.findElement(SPSearchButton);
				JavascriptExecutor js3 = (JavascriptExecutor) driver;
				js3.executeScript("arguments[0].click();", ClickSearch );
				Thread.sleep(1000);
			//Select specific SP
				WebElement SelectSPCheckbox = driver.findElement(SelectSP);
				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(SelectSPCheckbox));
				JavascriptExecutor js4 = (JavascriptExecutor) driver;
				js4.executeScript("arguments[0].click();", SelectSPCheckbox );
				
			//Confirm Selected SP 
				WebElement ConfirmSP = driver.findElement(ConfirmSelectedSP);
				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(ConfirmSP));
				JavascriptExecutor js5 = (JavascriptExecutor) driver;
				js5.executeScript("arguments[0].click();", ConfirmSP);
				Thread.sleep(500);
				
			//Select Members1
				
				
				WebElement SelectMemberCheckbox = driver.findElement(SelectMembers);
				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(SelectMemberCheckbox));
				JavascriptExecutor js7 = (JavascriptExecutor) driver;
				js7.executeScript("arguments[0].click();", SelectMemberCheckbox );
				
				WebElement SelectMemberCheckbox2 = driver.findElement(SelectMembers2);
				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(SelectMemberCheckbox2));
				JavascriptExecutor js77 = (JavascriptExecutor) driver;
				js77.executeScript("arguments[0].click();", SelectMemberCheckbox2 );
				
				
				 //SendToMembers
				WebElement SendToMembersButton = driver.findElement(SendToMembers);
				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(SendToMembersButton));
				JavascriptExecutor js6 = (JavascriptExecutor) driver;
				js6.executeScript("arguments[0].click();", SendToMembersButton);
						    
         }
	
         private By SendRecommendation = By.xpath("//button[@id='b4-b24-b5-btn_Confirm']");
      
         public void MemberSendRecommendation()
         {
        	 //Open Operation committee tab
        	 WebElement OperationCommitteTab = driver.findElement(OperationCommitte);

				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(OperationCommitteTab));
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].click();", OperationCommitteTab );
				
			//Click Send Recommendation
				WebElement SendRecommendationButton = driver.findElement(SendRecommendation);

				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(SendRecommendationButton));
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js2.executeScript("arguments[0].click();", SendRecommendationButton );
       	  
         }
         //member 2 send recommendation
         private By SendRecommendation2 = By.xpath("//button[@id='b4-b24-b5-btn_Confirm']");
         
         public void MemberSendRecommendation2()
         {
        	 //Open Operation committee tab
        	 WebElement OperationCommitteTab = driver.findElement(OperationCommitte);

				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(OperationCommitteTab));
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].click();", OperationCommitteTab );
				
			//Click Send Recommendation
				WebElement SendRecommendationButton2 = driver.findElement(SendRecommendation2);

				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(SendRecommendationButton2));
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js2.executeScript("arguments[0].click();", SendRecommendationButton2 );
       	  
         }
       private By HeadApprove = By.xpath("//button[@id='b4-b24-b5-Btn_CommittyHeadApprove']");
       
         public void HeadApprove()
         {
        	 
        	WebElement  HeadApproveButton = driver.findElement(HeadApprove);
        	 
        	 //Open Operation committee tab
        	 WebElement OperationCommitteTab = driver.findElement(OperationCommitte);

				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(OperationCommitteTab));
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].click();", OperationCommitteTab );
				
			//Head Click Approve

				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(HeadApproveButton));
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js2.executeScript("arguments[0].click();",HeadApproveButton );
       	  
         }   
         
         //CEO Approve
         private By CEOApprove = By.xpath("//button[@id='b4-b24-b5-Btn_CEOApprove']");

         public void CEOApprove()
         {
        	 
        	WebElement  CEOApproveButton = driver.findElement(CEOApprove);
        	 
        	 //Open Operation committee tab
        	 WebElement OperationCommitteTab = driver.findElement(OperationCommitte);

				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(OperationCommitteTab));
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].click();", OperationCommitteTab );
				
			//Head Click Approve

				wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(CEOApproveButton));
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js2.executeScript("arguments[0].click();",CEOApproveButton );
       	  
         }  
					    
  }


