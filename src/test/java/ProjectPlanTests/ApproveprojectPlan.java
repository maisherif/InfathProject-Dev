package ProjectPlanTests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ProjectPlan.ApproveprojectPlanClass;
import ProjectPlan.AssignProjectManagerClass;
import ProjectPlan.OpenProjectClass;
import pages.UserLogin;
import tests.TestBase;

public class ApproveprojectPlan extends TestBase{
	public ApproveprojectPlan (String url) {
		super();
		this.url = "internal";
	}
	
	UserLogin userlogin;
	OpenProjectClass projectobject;
	ApproveprojectPlanClass approveprojectplan;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@Test
	public void LoginPM() throws InterruptedException
	{
		userlogin = new UserLogin(driver);
		userlogin.userlogin("Mohammadsaad@ads.infath.sa", "Test123");
	}
	@Test (dependsOnMethods = {"LoginPM"})
	public void approveproject() throws InterruptedException
	{

		projectobject = new OpenProjectClass(driver);
		projectobject.openprojectslist();
		projectobject.openproject("(//span[@class='text-secondary'])[1]");
		
		approveprojectplan = new ApproveprojectPlanClass(driver);
		approveprojectplan.openprojectplan();
		approveprojectplan.approveprojectplan(); 

		
	}
}
