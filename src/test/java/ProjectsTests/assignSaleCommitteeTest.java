package ProjectsTests;

import org.testng.annotations.Test;

import pages.UserLogin;
import pages.UserLogout;
import tests.TestBase;

public class assignSaleCommitteeTest extends TestBase{
	
	UserLogin login;
	ProjectsPages.assignSaleComittee assignSaleComittee;
	UserLogout logout;
	
	public assignSaleCommitteeTest (String URL)
	{
		super();
		this.url = "internal";
		
	}
  @Test (priority = 1, enabled = true)
  public void QALogin() throws InterruptedException {
	  login = new UserLogin(driver);
	  login.userlogin("abdullahali@infath.sa", "Test123");
  }
  
  @Test(priority = 2, enabled = true)
  public void OpenAuctionsList() {
	  assignSaleComittee = new ProjectsPages.assignSaleComittee(driver);
	  assignSaleComittee.OpenAuctionsList();
	  
  }
  
  @Test(priority = 3, enabled = true)
  public void OpenAuction() {
	  assignSaleComittee = new ProjectsPages.assignSaleComittee(driver);
	  assignSaleComittee.OpenAuction();
	  
  }
  
  @Test(priority = 4, enabled = true)
  public void OpenCommitteeTab() {
	  assignSaleComittee = new ProjectsPages.assignSaleComittee(driver);
	  assignSaleComittee.OpenSaleCommitteeTab();
	  
  }
  
  @Test(priority = 5, enabled = true)
  public void ChooseHead() {
	  assignSaleComittee = new ProjectsPages.assignSaleComittee(driver);
	  assignSaleComittee.ChooseHead();
	  
  }
  //QA Logout
  @Test(priority = 6, enabled = true)
  public void QALogout() throws InterruptedException {
	  logout = new UserLogout(driver);
	  logout.logout();
	  
  }
  
  //CEO Login
  @Test (priority = 7, enabled = true)
  public void CEOLogin() throws InterruptedException {
	  login = new UserLogin(driver);
	  login.userlogin("ahmadalothman@ads.infath.sa", "Test123");
  }
 
  @Test (priority = 8, enabled = true)
  public void ApproveByCEO() {
	 
	  assignSaleComittee = new ProjectsPages.assignSaleComittee(driver);
	  assignSaleComittee.CEOApprove();
	  }
  
  
  //CEO Logout
  @Test(priority = 9, enabled =true)
  public void CEOLogout() throws InterruptedException {
	  logout = new UserLogout(driver);
	  logout.logout();
	  
  }
  
  //Head Committee login 
  @Test (priority = 10, enabled = true)
  public void HeadLogin() throws InterruptedException {
	  login = new UserLogin(driver);
	  login.userlogin("ADS.INFATH.SA\\fathiarafat", "Test123");
  }
  
  @Test (priority = 11, enabled = true)
  public void AddSaleLetter() throws Throwable {
	 
	  assignSaleComittee = new ProjectsPages.assignSaleComittee(driver);
	  assignSaleComittee.AddSellLetter();
	  }
  
	  
  }
  
  

