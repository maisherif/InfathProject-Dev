package AuctionStarted;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.ExternalUserLogin;
import tests.TestBase;
import Auctionstarted.CreateAssetSaleRequest; 

public class MakeAssetSellRequest extends TestBase{
	public MakeAssetSellRequest (String url) {
		super();
		this.url = "external";
	}
	ExternalUserLogin externallogin;
	CreateAssetSaleRequest sellrequest;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Test
	public void LoginExternalUser() throws InterruptedException
	{
		externallogin = new ExternalUserLogin(driver);	
		externallogin.userlogin("7006337674", "123123123456123");
	}
	@Test (dependsOnMethods = {"LoginExternalUser"})
//	public void MakeSellRequest() throws InterruptedException
//	{
//		sellrequest = new CreateAssetSaleRequest(driver);	
//		sellrequest.openauctionlist();
//		sellrequest.openauction("(//span[@class='text-secondary OSFillParent'])[1]");
//		sellrequest.makesellrequest();
//	}
//	@Test (dependsOnMethods = {"MakeSellRequest"})
	public void competesellrequest() throws InterruptedException
	{
		sellrequest = new CreateAssetSaleRequest(driver);
		sellrequest.openauctionlist();
		sellrequest.openauction("(//span[@class='text-secondary OSFillParent'])[1]");
		sellrequest.openassetsellrequeststab();
	     
		sellrequest.completesellrequest("2000000");
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(0));
	    sellrequest.uploadfile();
	    sellrequest.chequetab();

	}
}
