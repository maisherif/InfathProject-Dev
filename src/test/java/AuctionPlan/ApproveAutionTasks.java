package AuctionPlan;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import AuctionPlanPages.ApproveAuctionPlanClass;
import pages.UserLogin;
import tests.TestBase;

public class ApproveAutionTasks extends TestBase{
	public ApproveAutionTasks (String url) {
		super();
		this.url = "internal";
	}
	
	UserLogin userlogin;
	ApproveAuctionPlanClass approveauctionplan;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@Test
	public void LoginPM() throws InterruptedException
	{
		userlogin = new UserLogin(driver);
		userlogin.userlogin("Mohammadsaad@ads.infath.sa", "Test123");
	}
	
	@Test (dependsOnMethods = {"LoginPM"})
	public void approveTasks() throws InterruptedException
	{
		approveauctionplan = new ApproveAuctionPlanClass(driver);
		approveauctionplan.openauctions();
		approveauctionplan.gotonotstartedauctions();
		approveauctionplan.openauction("(//span[@class='text-secondary OSFillParent'])[1]");
		approveauctionplan.openauctionplan();
		approveauctionplan.approvemaininfotask();
		approveauctionplan.openauctionplan();
		approveauctionplan.approveutilitybillstask();

	}
}
