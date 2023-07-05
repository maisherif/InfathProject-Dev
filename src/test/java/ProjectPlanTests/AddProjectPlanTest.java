package ProjectPlanTests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ProjectPlan.AddprojctPlanClass;
import pages.ExternalUserLogin;
import tests.TestBase;

public class AddProjectPlanTest extends TestBase{
	public AddProjectPlanTest (String url) {
		super();
		this.url = "external";
	}
	ExternalUserLogin externallogin;
	AddprojctPlanClass addprojectplan;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Test
	public void LoginExternalUser() throws InterruptedException
	{
		externallogin = new ExternalUserLogin(driver);	
		externallogin.userlogin("7006337674", "123123123456123");
	}
	@Test (dependsOnMethods = {"LoginExternalUser"})
	public void addprojectplan() throws InterruptedException 
	{

		addprojectplan = new AddprojctPlanClass(driver);
		addprojectplan.openprojectslist();
		addprojectplan.openallprojects();
		addprojectplan.openproject("(//span[@class='text-secondary'])[1]");
		addprojectplan.openprojectplan();
		addprojectplan.addauctiontypeElectronic("action automation1", "2023/05/05", "2023/06/06");
		addprojectplan.submitforapproval();
	}
	
	
}
