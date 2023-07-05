package ProjectsTests;
import org.testng.annotations.Test;
import pages.ExternalUserLogin;
import tests.TestBase;
public class SPApproveAssigningTest extends TestBase {
	
	public SPApproveAssigningTest (String url)
	{
		super();
		this.url = "external";
	}	
	
	ExternalUserLogin SPuserlogin;
	ProjectsPages.SPApproveAssignClass SPApproveAssignClass;
	
  @Test(priority = 1)
  public void SPLogin() throws InterruptedException {
	  SPuserlogin = new ExternalUserLogin(driver);
	  SPuserlogin.userlogin("7006337674","123123123456123");
  }
  
  @Test(priority = 2)
  public void SPOpenProject(){
	  SPApproveAssignClass = new ProjectsPages.SPApproveAssignClass(driver);
	  SPApproveAssignClass.openprojectslist();
	  SPApproveAssignClass.OpenProject();
  }
  
  @Test(priority = 3)
  public void Approve(){
	  SPApproveAssignClass = new ProjectsPages.SPApproveAssignClass(driver);
	  SPApproveAssignClass.SPApprove();
  }
  
}
