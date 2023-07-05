package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.FilldataJusticWriterClass;
import pages.UserLogin;

public class FillDataJusticWriterTest extends TestBase{
	
	public FillDataJusticWriterTest (String url) {
		super();
		this.url = "internal";
	}
	
	
	UserLogin userlogin;
	FilldataJusticWriterClass filldatajusticwriter;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	@Test 
	public void loginJusticeWriter() throws InterruptedException
	{
		userlogin = new UserLogin(driver);
		
		userlogin.userlogin("LCJW@ads.infath.sa", "Infath@1234");
		
	}
	@Test (dependsOnMethods = {"loginJusticeWriter"}) 
	public void justicwriterapproval() throws InterruptedException
	{
		filldatajusticwriter = new FilldataJusticWriterClass(driver);
		for(int i=1;i<=10;i++) {
			filldatajusticwriter.justicwriterapproval("(//td[@data-header='View Request Details']/a)["+i+"]","191234567876");
		}
	}
	@Test (dependsOnMethods = {"justicwriterapproval"})
	public void logout1() throws InterruptedException
	{
		WebElement logoutbutton = driver.findElement(By.id("b2-b3-Icon3"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", logoutbutton);
		System.out.println(driver.getCurrentUrl());
	}

}
