package tests;



import org.openqa.selenium.JavascriptExecutor;

import org.testng.annotations.Test;

import pages.AssignTaskSupervisiorClass;
import pages.UserLogin;

public class AssignTaskfromSupervisior_Test extends TestBase{
	
	public class TotalAssest {
	    public int totalassets;
	}
	
	UserLogin userlogin; //object from userlogin page
	AssignTaskSupervisiorClass assigntaskfromsupervisior;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public AssignTaskfromSupervisior_Test (String url) {
		super();
		this.url = "internal"; // send url type to Testbase Class
	}
	
	@Test 
	public void LoginSuccessfullysuppervisor() throws InterruptedException
	{
		userlogin = new UserLogin(driver);	
		userlogin.userlogin("LCS1@ads.infath.sa", "Infath@1234");
	}
	
	/**
	 * @throws InterruptedException
	 */
	@Test (enabled = true, dependsOnMethods = {"LoginSuccessfullysuppervisor"})
	public void Assigndataentry() throws InterruptedException
	{
		assigntaskfromsupervisior = new AssignTaskSupervisiorClass(driver);	
		assigntaskfromsupervisior.suppervisorassigndataentry(); 

	}

}
