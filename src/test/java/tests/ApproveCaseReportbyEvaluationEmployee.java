package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.ApproveCaseReport;
import pages.UserLogin;

public class ApproveCaseReportbyEvaluationEmployee extends TestBase{

	public ApproveCaseReportbyEvaluationEmployee (String url) {
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
		userlogin.userlogin("aibrahim-v@infath.sa", "Test123");
	}
	@Test (dependsOnMethods = {"loginEvaluationEmploee"}) 
	public void employeeevaluation() throws InterruptedException
	{
		for(int i=0;i<7;i++)
		{
			approvecasereport = new ApproveCaseReport(driver);
			approvecasereport.evaluationemployee("(//div[@class='display-flex align-items-flex-start']/div[@class='display-flex flex-direction-column'])[1]");

		}
	}
	
	
}
