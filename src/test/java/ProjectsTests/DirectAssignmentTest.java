package ProjectsTests;

import org.testng.annotations.Test;
import pages.UserLogin;
import pages.UserLogout;
import tests.TestBase;

import org.openqa.selenium.JavascriptExecutor;

public class DirectAssignmentTest extends TestBase {
	
	public DirectAssignmentTest (String url)
	{
		super();
		this.url= "Internal";
	}
	
	UserLogin userlogin;
	UserLogout userlogout;
	 ProjectsPages.DirectAssignmentClass  DirectAssignmentClass;

	JavascriptExecutor js = (JavascriptExecutor) driver;

//  @Test (priority = 1, enabled = true) //ProcurementLogin
//  public void LoginSuccessfullyProcurement() throws InterruptedException
//	{
//		userlogin = new UserLogin(driver);	
//		userlogin.userlogin("smohamed-v@infath.sa", "Test123");
//	}
//  
//  @Test (priority = 2, enabled = true)
//  public void ProcurementSelectProject() throws InterruptedException  //Procurement approve the project
//	{
//		DirectAssignmentClass = new ProjectsPages.DirectAssignmentClass(driver);
//		DirectAssignmentClass.OpenProject("//*[@id='$b3']/div/a[2]/div/img");
//		
//	}
//  
//  @Test (priority = 3 , enabled = true)
//  public void ProcurementSendProject()  //Procurement approve the project
//	{
//		DirectAssignmentClass = new ProjectsPages.DirectAssignmentClass(driver);
//		DirectAssignmentClass.Procurementapprove();
//	}
//  
//  @Test (priority = 4, enabled = true) //ProcurementLogout
//  public void ProcurementLogout() throws InterruptedException
// 	{
//	  userlogout = new UserLogout(driver);
//	  userlogout.logout();
// 	}
//  
  @Test (priority = 5, enabled = true) //Committee HeadLogin
  public void LoginSuccessfullyQA() throws InterruptedException
 	{
 		userlogin = new UserLogin(driver);	
 		userlogin.userlogin("abdullahali@infath.sa", "Test123");
 	}
  @Test (priority = 6, enabled = true) 
  public void QASelectProject() throws InterruptedException  //Procurement approve the project
	{
		DirectAssignmentClass = new ProjectsPages.DirectAssignmentClass(driver);
		DirectAssignmentClass.OpenProject("//*[@id='$b3']/div/a[3]/div/img");
		
	}
  @Test (priority = 7, enabled = true) 
  public void AssignSP() throws InterruptedException  //Procurement approve the project
	{
		DirectAssignmentClass = new ProjectsPages.DirectAssignmentClass(driver);
		DirectAssignmentClass.SelectSP();
		
	}  
  
  @Test (priority = 8, enabled = true) //Head Logout
  public void QALogout() throws InterruptedException
 	{
	  userlogout = new UserLogout(driver);
	  userlogout.logout();
 	}

  @Test (priority = 9 , enabled = true) //Member Login
  public void LoginSuccessfullyMember() throws InterruptedException
 	{
 		userlogin = new UserLogin(driver);	
 		userlogin.userlogin("smohamed-v@infath.sa", "Test123");
 	}
  
  @Test (priority = 10, enabled = true)
  public void MemberSelectProject() throws InterruptedException  //Procurement approve the project
	{
		DirectAssignmentClass = new ProjectsPages.DirectAssignmentClass(driver);
		DirectAssignmentClass.OpenProject("//*[@id='$b3']/div/a[2]/div");
		
	}
  @Test (priority = 11, enabled = true)

  public void SendRecommendation() throws InterruptedException  //Procurement approve the project
 	{
 		DirectAssignmentClass = new ProjectsPages.DirectAssignmentClass(driver);
 		DirectAssignmentClass.MemberSendRecommendation();
 		
 	}
  
  @Test (priority = 12,  enabled = true) //member Logout
  public void MemberLogout() throws InterruptedException
 	{
	  userlogout = new UserLogout(driver);
	  userlogout.logout();
 	}
  
  @Test (priority = 13 , enabled = true) //Member2 Login
  public void LoginSuccessfullyMember2() throws InterruptedException
 	{
 		userlogin = new UserLogin(driver);	
 		userlogin.userlogin("Mohammadsaad@ads.infath.sa", "Test123");
 	}
  
  @Test (priority = 14, enabled = true)
  public void MemberSelectProject2() throws InterruptedException  //Procurement approve the project
	{
		DirectAssignmentClass = new ProjectsPages.DirectAssignmentClass(driver);
		DirectAssignmentClass.OpenProject("//*[@id='$b3']/div/a[2]/div");
		
	}
  @Test (priority = 15, enabled = true)

  public void MemberSendRecommendation2() throws InterruptedException  //Procurement approve the project
 	{
 		DirectAssignmentClass = new ProjectsPages.DirectAssignmentClass(driver);
 		DirectAssignmentClass.MemberSendRecommendation2();
 		
 	}
  
  @Test (priority = 16,  enabled = true) //Head Logout
  public void MemberLogout2() throws InterruptedException
 	{
	  userlogout = new UserLogout(driver);
	  userlogout.logout();
 	}
  
  @Test (priority = 17, enabled = true) //ComitteeHead login
  public void LoginSuccessfullyComitteeHead() throws InterruptedException
 	{
 		userlogin = new UserLogin(driver);	
 		userlogin.userlogin("ADSINFATH\\fathiarafat", "Test123");
 	}
  
  
  
  @Test (priority = 18, enabled = true)

  public void HeadOpenProject() throws InterruptedException  //Head Open Project
 	{
	  DirectAssignmentClass = new ProjectsPages.DirectAssignmentClass(driver);
		DirectAssignmentClass.OpenProject("//*[@id='$b3']/div/a[2]/div");
 		
 	}
  
  @Test (priority = 19, enabled = true)

  public void HeadApprove() throws InterruptedException  //Head approve the project
 	{
	  DirectAssignmentClass = new ProjectsPages.DirectAssignmentClass(driver);
		DirectAssignmentClass.HeadApprove();
 		
 	}
  
  @Test (priority = 20,  enabled = true) //Head Logout
  public void HeadLogout() throws InterruptedException
 	{
	  userlogout = new UserLogout(driver);
	  userlogout.logout();
 	}
  
  @Test (priority = 21) //CEO login
  public void LoginSuccessfullyCEO() throws InterruptedException
 	{
 		userlogin = new UserLogin(driver);	
 		userlogin.userlogin("ahmadalothman@ads.infath.sa", "Test123");
 	}
  
  @Test (priority = 22, enabled = true)

  public void CEPOpenProject() throws InterruptedException  //CEO open the project
 	{
	  DirectAssignmentClass = new ProjectsPages.DirectAssignmentClass(driver);
		DirectAssignmentClass.OpenProject("//*//*[@id=\"$b3\"]/div/a[3]/div/span");
 		
 	}
  
  @Test (priority = 23, enabled = true)

  public void CEOApprove() throws InterruptedException  //CEO approve the project
 	{
	  DirectAssignmentClass = new ProjectsPages.DirectAssignmentClass(driver);
		DirectAssignmentClass.CEOApprove();
 		
 	}
  
  
}
