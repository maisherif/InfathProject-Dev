package AuctionPlan;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import AuctionPlanPages.AuctionPlanClass;
import AuctionPlanPages.MainInformationTask;
import AuctionPlanPages.UtilityBillsClass;
import pages.ExternalUserLogin;
import tests.TestBase;

public class AddAuctionTasks extends TestBase{
	public AddAuctionTasks (String url) {
		super();
		this.url = "external";
	}
	ExternalUserLogin externallogin;
	AuctionPlanClass auctionplan;
	MainInformationTask maininfotask;
	UtilityBillsClass utilitybills;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Test
	public void LoginExternalUser() throws InterruptedException
	{
		externallogin = new ExternalUserLogin(driver);	
		externallogin.userlogin("7006337674", "123123123456123");
	}
	@Test (dependsOnMethods = {"LoginExternalUser"})
	public void openauctionplan() throws InterruptedException
	{
		auctionplan = new AuctionPlanClass(driver);
		maininfotask =new MainInformationTask(driver);

		auctionplan.openauctions();
		auctionplan.gotonotstartedauctions();
		maininfotask.openauction("(//span[@class='text-secondary OSFillParent'])[1]");
		auctionplan.gotoauctionplan();
	}
	

	@Test (dependsOnMethods = {"openauctionplan"})
	public void addmaininformationTask() throws InterruptedException
	{
		maininfotask =new MainInformationTask(driver);
		maininfotask.addmaininformationtask("10000");
	}
	@Test (dependsOnMethods = {"addmaininformationTask"})
	public void openauctionplan2() throws InterruptedException
	{
		auctionplan = new AuctionPlanClass(driver);
		maininfotask =new MainInformationTask(driver);

		auctionplan.openauctions();
		auctionplan.gotonotstartedauctions();
		maininfotask.openauction("(//span[@class='text-secondary OSFillParent'])[1]");
		auctionplan.gotoauctionplan();
	}
	@Test (dependsOnMethods = {"openauctionplan2"})
	public void addutilitybills() throws InterruptedException
	{
		utilitybills =new UtilityBillsClass(driver);
		utilitybills.openutilitybillstask(1);
		utilitybills.addnewbillsasset1();
		utilitybills.addwater("123", "5000");
		utilitybills.addnewbillsasset2();
		utilitybills.addelectricity("345", "5000");
		utilitybills.sendtask();
	}
	
}
