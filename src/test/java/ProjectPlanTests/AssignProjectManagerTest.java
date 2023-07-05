package ProjectPlanTests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ProjectPlan.AssignProjectManagerClass;
import ProjectPlan.OpenProjectClass;
import pages.UserLogin;
import tests.TestBase;

public class AssignProjectManagerTest extends TestBase{
	public AssignProjectManagerTest (String url) {
		super();
		this.url = "internal";
	}
	
	UserLogin userlogin;
	OpenProjectClass projectobject;
	AssignProjectManagerClass assignpm;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@Test
	public void LoginPortofolioManager() throws InterruptedException
	{
		userlogin = new UserLogin(driver);
		userlogin.userlogin("ADS.INFATH.SA\\fathiarafat", "Test123");
	}
	@Test (dependsOnMethods = {"LoginPortofolioManager"})
	public void assignpm() throws InterruptedException
	{

		projectobject = new OpenProjectClass(driver);
		assignpm = new AssignProjectManagerClass(driver);

		projectobject.openprojectslist();
		projectobject.opennotstartedprojects();
		projectobject.openproject("(//span[@class='text-secondary'])[1]");
		assignpm.assignprojectmanager();
		
	}
}
