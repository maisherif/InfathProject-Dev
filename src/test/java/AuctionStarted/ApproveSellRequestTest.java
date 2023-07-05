package AuctionStarted;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Auctionstarted.ApproveAssetSellRequestTask;
import Auctionstarted.CloseAuction;
import pages.UserLogin;
import tests.TestBase;

public class ApproveSellRequestTest extends TestBase{
	public ApproveSellRequestTest (String url) {
		super();
		this.url = "internal";
	}
	UserLogin userlogin;
	ApproveAssetSellRequestTask approvesellrequest;
	CloseAuction closeauction;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@Test

	public void LoginCommitteehead() throws InterruptedException
	{
		userlogin = new UserLogin(driver);
		userlogin.userlogin("ADS.INFATH.SA\\fathiarafat", "Test123");
	}
	
	@Test (dependsOnMethods = {"LoginCommitteehead"})
	public void approverequest() throws InterruptedException
	{
		approvesellrequest = new ApproveAssetSellRequestTask(driver);
		approvesellrequest.openauctionlist();
		approvesellrequest.openauction();
		approvesellrequest.openassetsellrequeststab();
		approvesellrequest.opensellrequestdetails();
		approvesellrequest.approverequest();
	}
	
//	@Test (dependsOnMethods = {"approverequest"})
//	public void closeauction() throws InterruptedException
//	{
//		closeauction = new CloseAuction(driver);
//		closeauction.openauctionlist();
//		closeauction.closeauction();
//	}
//	
	
}
