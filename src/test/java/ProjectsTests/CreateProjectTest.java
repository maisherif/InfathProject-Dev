package ProjectsTests;

import org.testng.annotations.Test;

import ProjectsPages.CreateProjectClass;
import pages.UserLogin;
import tests.TestBase;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;

public class CreateProjectTest extends TestBase {
	
	public CreateProjectTest (String url)
	{
		super();
		this.url= "Internal";
	}
	
	UserLogin userlogin;
	CreateProjectClass CreateProjectClass;

	JavascriptExecutor js = (JavascriptExecutor) driver;

  @Test (priority = 1)
  public void LoginSuccessfullyPMO() throws InterruptedException
	{
		userlogin = new UserLogin(driver);	
		userlogin.userlogin("ADSINFATH\\fathiarafat", "Test123");
	}
  
  @Test (priority = 2)
  public void OpenAdvancedSearch() 
	{
		CreateProjectClass = new CreateProjectClass(driver);
	    CreateProjectClass.OpenAdvancedSearch();
	}
  
  @Test (priority = 3)
  public void ShowSearchResault() throws Throwable 
	{
		CreateProjectClass = new CreateProjectClass(driver);
	    CreateProjectClass.SearchByNotAssignedAsset();
	}
  @Test (priority = 4)
  public void SelectAssets() throws InterruptedException
	{
		CreateProjectClass = new CreateProjectClass(driver);
	    CreateProjectClass.SelectassetsAndStartCreate();
	}
  @Test (priority = 5)
  public void AddData() throws InterruptedException 
	{
		CreateProjectClass = new CreateProjectClass(driver);
	    CreateProjectClass.EnterProjectData();
	}

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
