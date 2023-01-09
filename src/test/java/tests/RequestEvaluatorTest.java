package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.RequestEvaluatorClass;
import pages.UserLogin;

public class RequestEvaluatorTest extends TestBase{
	public RequestEvaluatorTest (String url) {
		super();
		this.url = "internal";
	}
	
	UserLogin userlogin;
	RequestEvaluatorClass requestevaluator;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	
	@Test (enabled = true)
	
	public void LoginSuccessfullyEvaluationManager() throws InterruptedException
	{
		userlogin = new UserLogin(driver);	
		userlogin.userlogin("Mariam.Zekry@codelab.sa", "Test123");
	}
	@Test (enabled = true,dependsOnMethods = {"LoginSuccessfullyEvaluationManager"})
	public void SendhireRequestTest() throws InterruptedException
	{
		requestevaluator = new RequestEvaluatorClass(driver);
		requestevaluator.openpreparingscopetab();
		for(int i=2;i<=20;i+=2) {
		requestevaluator.selectassets("(//div[@class='position-absolute absolute-top-right ']/span/input)["+i+"]");
		}
		requestevaluator.sendhirerequest();
	}
	
	@Test (dependsOnMethods = {"SendhireRequestTest"}, enabled = true )
	public void logout1() throws InterruptedException
	{
		WebElement logoutbutton = driver.findElement(By.id("b2-b3-Icon3"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", logoutbutton);
		System.out.println(driver.getCurrentUrl());
	}
	
}
