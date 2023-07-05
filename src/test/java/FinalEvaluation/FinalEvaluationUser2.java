package FinalEvaluation;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.ApproveAssignRequestClass;
import pages.ExternalUserLogin;
import pages.finalEvaluationClass;
import tests.TestBase;

public class FinalEvaluationUser2 extends TestBase{


	public FinalEvaluationUser2 (String url) {
		super();
		this.url = "external";
	}
	ExternalUserLogin externallogin;
	ApproveAssignRequestClass approveassignclass;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	finalEvaluationClass evaluation;

	@Test
	public void LoginExternalUser() throws InterruptedException
	{
		externallogin = new ExternalUserLogin(driver);	
		externallogin.userlogin("2300000034", "123123123456123");

	}
	@Test (enabled = true,dependsOnMethods = {"LoginExternalUser"})
	public void SendhireRequestTest() throws InterruptedException, AWTException
	{
        approveassignclass = new ApproveAssignRequestClass(driver);
        approveassignclass.openassignmentrequests();
	    approveassignclass.approverequest("(//i[@class='icon fa fa-eye fa-1x'])[1]");
	    
		evaluation = new finalEvaluationClass(driver);

	    evaluation.openassets();
		evaluation.openasset("(//div[@class='display-flex align-items-flex-start']/div[@class='display-flex flex-direction-column']/span[@class='white-space-nowrap '])[1]");
		evaluation.openfinalevaluation("(//span[text()='Final Evaluation'])[1]");
		evaluation.addreportdata("2022-01-01", "2022-01-01", "codelab", "0512345678");
		evaluation.addworkscope("123422", "1000");
		evaluation.addassetinfo();
		evaluation.addborder();
		evaluation.addestimatevalue();
		evaluation.addassetpictures();
		evaluation.addpersonworkreport();
		evaluation.addresearchdomain();
		evaluation.addfinaldata();
		evaluation.sendevaluationforreview();
	}
	
}
