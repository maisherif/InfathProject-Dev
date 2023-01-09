package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.AssignEvaluatorClass;
import pages.UserLogin;

public class AssignEvaluatorTest extends TestBase{
	public AssignEvaluatorTest (String url) {
		super();
		this.url = "internal";
	}
	
	UserLogin userlogin;
	AssignEvaluatorClass assignevaluator;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Test 
	public void LoginSuccessfullyPurchasingdepartment() throws InterruptedException
	{
		userlogin = new UserLogin(driver);	
		userlogin.userlogin("smohamed-v@infath.sa", "Test123");
	}
	
	@Test (enabled = true,dependsOnMethods= {"LoginSuccessfullyPurchasingdepartment"})
	public void AssignEvaluator() throws InterruptedException
	{
		assignevaluator = new AssignEvaluatorClass(driver);
		assignevaluator.assignresposible();
	}
	@Test (dependsOnMethods = {"AssignEvaluator"}, enabled = true )
	public void logout2() throws InterruptedException
	{
		WebElement logoutbutton = driver.findElement(By.id("b2-b3-Icon3"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", logoutbutton);
		System.out.println(driver.getCurrentUrl());
	}
}
