package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import pages.AssignTaskSupervisiorClass;
import pages.UserLogin;

public class AssignTaskfromSupervisior_Test extends TestBase{
	
	UserLogin userlogin; //object from userlogin page
	AssignTaskSupervisiorClass assigntaskfromsupervisior;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public AssignTaskfromSupervisior_Test (String url) {
		super();
		this.url = "internal"; // send url type to Testbase Class
	}
	@Test 
	public void LoginSuccessfullysuppervisor() throws InterruptedException
	{
		userlogin = new UserLogin(driver);	
		userlogin.userlogin("LCS1@ads.infath.sa", "Infath@1234");
	}
	
	@Test (enabled = true, dependsOnMethods = {"LoginSuccessfullysuppervisor"})
	public void Assigndataentry() throws InterruptedException
	{
		
		assigntaskfromsupervisior = new AssignTaskSupervisiorClass(driver);	
		assigntaskfromsupervisior.suppervisorassigndataentry(); 

	}
	@Test (dependsOnMethods = {"Assigndataentry"}, enabled = true )
	public void logout1() throws InterruptedException
	{
		WebElement logoutbutton = driver.findElement(By.id("b2-b3-Icon3"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", logoutbutton);
		System.out.println(driver.getCurrentUrl());
	}

}
