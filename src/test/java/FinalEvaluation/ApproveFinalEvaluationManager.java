package FinalEvaluation;

import tests.TestBase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.ApproveCaseReport;
import pages.UserLogin;

public class ApproveFinalEvaluationManager extends TestBase{
	public ApproveFinalEvaluationManager (String url) {
		super();
		this.url = "internal";
	}
	UserLogin userlogin;
	ApproveCaseReport approvecasereport;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Test 
	public void loginEvaluationEmploee() throws InterruptedException
	{
		userlogin = new UserLogin(driver);	
		userlogin.userlogin("Mariam.Zekry@codelab.sa", "Test123");
	}
	@Test (dependsOnMethods = {"loginEvaluationEmploee"}) 
	public void employeeevaluation() throws InterruptedException
	{
		for(int i=0;i<1;i++)
		{
			approvecasereport = new ApproveCaseReport(driver);
			approvecasereport.evaluationmanagerfinalevaluation("(//div[@class='display-flex align-items-flex-start']/div[@class='display-flex flex-direction-column'])[1]");

		}
	}
}
