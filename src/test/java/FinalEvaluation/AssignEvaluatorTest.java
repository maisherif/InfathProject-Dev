package FinalEvaluation;

import tests.TestBase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.AssignEvaluatorClass;
import pages.UserLogin;

public class AssignEvaluatorTest extends TestBase{
	public AssignEvaluatorTest (String url) {
		super();
		this.url = "internal";
	}
	
	UserLogin userlogin;
	AssignEvaluatorClass assignevaluator;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Test 
	public void LoginSuccessfullyPurchasingdepartment() throws InterruptedException
	{
		userlogin = new UserLogin(driver);	
		userlogin.userlogin("smohamed-v@infath.sa", "Test123");
	}
	
	@Test (enabled = true,dependsOnMethods= {"LoginSuccessfullyPurchasingdepartment"})
	public void AssignEvaluator() throws InterruptedException
	{
		assignevaluator = new AssignEvaluatorClass(driver);
		assignevaluator.openrequest();
		assignevaluator.assignresposible("(//a[@href='#']/i[@class='icon fa fa-eye fa-1x'])[1]","06AprTest01");
		assignevaluator.openrequest();
		assignevaluator.assignresposible("(//a[@href='#']/i[@class='icon fa fa-eye fa-1x'])[2]","21AprREPTest04");
	}
}
