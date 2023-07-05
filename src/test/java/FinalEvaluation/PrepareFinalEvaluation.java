package FinalEvaluation;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import tests.TestBase;

import pages.ApproveAssignRequestClass;
import pages.ExternalUserLogin;
import pages.finalEvaluationClass;

public class PrepareFinalEvaluation extends TestBase{
	public PrepareFinalEvaluation (String url) {
		super();
		this.url = "external";
	}
	finalEvaluationClass evaluation;
	ApproveAssignRequestClass approveassignclass;
	ExternalUserLogin externallogin;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Test
	public void LoginExternalUser() throws InterruptedException
	{
		externallogin = new ExternalUserLogin(driver);	
		externallogin.userlogin("3101829103", "123123123456123");
		//3101829103  3101380793  7001863898
	}
	@Test (dependsOnMethods = {"LoginExternalUser"}, enabled = true )
	public void CaseReportTest() throws InterruptedException, AWTException
	{
		evaluation = new finalEvaluationClass(driver);
//		finalevaluation = new finalEvaluationClass2(driver);
		 
		 approveassignclass = new ApproveAssignRequestClass(driver);


	     approveassignclass.openassignmentrequests();
		 approveassignclass.approverequest("(//i[@class='icon fa fa-eye fa-1x'])[1]");
		  
		    evaluation.openassets();
			evaluation.openasset("(//div[@class='display-flex align-items-flex-start']/div[@class='display-flex flex-direction-column']/span[@class='white-space-nowrap '])[8]");
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
