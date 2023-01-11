package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.ApproveCaseReport;
import pages.UserLogin;

public class ApproveCasereportEvaluationmanager extends TestBase{

	public ApproveCasereportEvaluationmanager (String url) {
		super();
		this.url = "internal";
	}
	UserLogin userlogin;
	ApproveCaseReport approvecasereport;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	
	@Test
	public void LoginmanagerEvaluation() throws InterruptedException
	{
		userlogin = new UserLogin(driver);
		userlogin.userlogin("Mariam.Zekry@codelab.sa", "Test123");
	}
	@Test (dependsOnMethods = {"LoginmanagerEvaluation"})
	public void managmentevaluation() throws InterruptedException
	{
		approvecasereport = new ApproveCaseReport(driver);

		for(int i=1;i<=2;i++) {
			approvecasereport.evaluationmanager("(//div[@class='display-flex align-items-flex-start']/div[@class='display-flex flex-direction-column'])[1]");

		}
	}
	@Test (dependsOnMethods = {"managmentevaluation"})
	public void logout2() throws InterruptedException
	{
		WebElement logoutbutton = driver.findElement(By.id("b2-b3-Icon3"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", logoutbutton);
		System.out.println(driver.getCurrentUrl());
	}
	
	
}
