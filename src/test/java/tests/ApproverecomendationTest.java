package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.ApproveRecomendationClass;
import pages.UserLogin;

public class ApproverecomendationTest extends TestBase{
	
	public ApproverecomendationTest (String url) {
		super();
		this.url = "internal";
	}
	
	
	UserLogin userlogin;
	ApproveRecomendationClass approverecomendation;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	

	
	@Test
	public void loginLegalConsultationapproval2() throws InterruptedException
	{
		userlogin = new UserLogin(driver);	
		userlogin.userlogin("lca2@ads.infath.sa", "Infath@1234");
	}
	@Test (dependsOnMethods = {"loginLegalConsultationapproval2"}) 
	public void approverecomendation() throws InterruptedException
	{
		approverecomendation = new ApproveRecomendationClass(driver);
//		approverecomendation.gotorecomendationtab();
		for(int i=1;i<=2;i++) {
			if(i>=9)
			{
				for(int j=1;j<=2;j++) {
				approverecomendation.nextpage();
//				approverecomendation.approverecomendation("(//i[@class='icon fa fa-check fa-1x'])["+j+"]");
				}
				break;
			}
//			else {
//				approverecomendation.approverecomendation("(//i[@class='icon fa fa-check fa-1x'])["+i+"]");
//			}
		}
			
	}
	@Test (dependsOnMethods = {"approverecomendation"})
	public void logout3() throws InterruptedException
	{
		WebElement logoutbutton = driver.findElement(By.id("b2-b3-Icon3"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", logoutbutton);
		System.out.println(driver.getCurrentUrl());
	}
	
	

}
