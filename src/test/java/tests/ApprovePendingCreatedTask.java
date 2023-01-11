package tests;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.ApproveTaskandAssetsfromSupervisiorClass;
import pages.UserLogin;

public class ApprovePendingCreatedTask extends TestBase{
	UserLogin userlogin;
	ApproveTaskandAssetsfromSupervisiorClass approvetask;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public ApprovePendingCreatedTask (String url) {
		super();
		this.url = "internal";
	}
	@Test 
	public void LoginSuccessfullysuppervisor2() throws InterruptedException
	{
		Thread.sleep(2000);
		userlogin = new UserLogin(driver);	
		userlogin.userlogin("LCS1@ads.infath.sa", "Infath@1234");
	}
	@Test (dependsOnMethods = {"LoginSuccessfullysuppervisor2"} )
	public void Assigntaskbyserverprovider() throws InterruptedException, AWTException
	{
		approvetask = new ApproveTaskandAssetsfromSupervisiorClass(driver);
		approvetask.assigntaskbyserverprovider();
		
	}
//	@Test (dependsOnMethods = {"Assigntaskbyserverprovider"})
//	public void logout() throws InterruptedException
//	{
//		WebElement logoutbutton = driver.findElement(By.id("b2-b3-Icon3"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", logoutbutton);
//		System.out.println(driver.getCurrentUrl());
//	}
}
