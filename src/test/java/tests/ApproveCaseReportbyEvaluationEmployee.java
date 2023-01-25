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
		for(int i=1;i<=8;i++)
		{
			approvecasereport = new ApproveCaseReport(driver);
			approvecasereport.evaluationemployee("(//div[@class='display-flex align-items-flex-start']/div[@class='display-flex flex-direction-column'])[1]");

		}
	}
	@Test (dependsOnMethods = {"employeeevaluation"})
	public void logout1() throws InterruptedException
	{
		WebElement logoutbutton = driver.findElement(By.id("b2-b3-Icon3"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", logoutbutton);
		System.out.println(driver.getCurrentUrl());
	}
	
	
}
