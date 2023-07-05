package AuctionPlan;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import AuctionPlanPages.AuctionPlanClass;
import tests.TestBase;
import pages.ExternalUserLogin;

public class AuctionPlanTest  extends TestBase{
	public AuctionPlanTest (String url) {
		super();
		this.url = "external";
	}
	ExternalUserLogin externallogin;
	AuctionPlanClass auctionplan;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Test
	public void LoginExternalUser() throws InterruptedException
	{
		externallogin = new ExternalUserLogin(driver);	
		externallogin.userlogin("7006337674", "123123123456123");
	}
	@Test (dependsOnMethods = {"LoginExternalUser"})
	public void auctionplan() throws InterruptedException
	{
		auctionplan = new AuctionPlanClass(driver);
		auctionplan.openauctions();
		auctionplan.gotonotstartedauctions();
		auctionplan.openauction("(//span[@class='text-secondary OSFillParent'])[1]");
		auctionplan.gotoauctionplan();
		auctionplan.auctionplan("2023-09-09", "2023-09-09");
	}

}
