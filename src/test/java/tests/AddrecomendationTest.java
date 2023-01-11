package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.AddRecomendationClass;
import pages.UserLogin;

public class AddrecomendationTest extends TestBase{
	
	public AddrecomendationTest (String url) {
		super();
		this.url = "internal";
	}
	
	
	UserLogin userlogin;
	AddRecomendationClass addrecomendation;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	@Test
	public void loginLegalConsultationResearcher2() throws InterruptedException
	{
		userlogin = new UserLogin(driver);	
		userlogin.userlogin("lcr2@ads.infath.sa", "Infath@1234");
	}
	@Test (dependsOnMethods = {"loginLegalConsultationResearcher2"}) 
	public void addrecomendation() throws InterruptedException
	{
		
		addrecomendation = new AddRecomendationClass(driver);
		addrecomendation.opentask("122456789000");
		for(int i=1;i<=10;i++) {
		addrecomendation.addrecomendation("(//div[@class='display-flex align-items-flex-start']/div[text()='Asset Number'])["+i+"]");
		}
	}
	@Test (dependsOnMethods = {"addrecomendation"})
	public void logout2() throws InterruptedException
	{
		WebElement logoutbutton = driver.findElement(By.id("b2-b3-Icon3"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", logoutbutton);
		System.out.println(driver.getCurrentUrl());
	}
	

}
