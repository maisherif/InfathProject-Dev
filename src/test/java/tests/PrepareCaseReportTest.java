package tests;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.EvaluationClass;
import pages.ExternalUserLogin;

public class PrepareCaseReportTest extends TestBase{
	public PrepareCaseReportTest (String url) {
		super();
		this.url = "external";
	}
	EvaluationClass evaluation;
	ExternalUserLogin externallogin;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Test
	public void LoginExternalUser() throws InterruptedException
	{
		externallogin = new ExternalUserLogin(driver);	
//		externallogin.userlogin("sp-2300000031", "123123123456123"); --dev
		externallogin.userlogin("3101380793", "123123123456123");
		//not used
//		externallogin.userlogin("3101829103", "123123123456123");
		

	}
	@Test (dependsOnMethods = {"LoginExternalUser"}, enabled = true )
	public void CaseReportTest() throws InterruptedException, AWTException
	{
		evaluation = new EvaluationClass(driver);
		for(int i=1;i<=10;i++) {
			evaluation.openasset("(//div[@class='display-flex align-items-flex-start']/div[@class='display-flex flex-direction-column']/span[@class='white-space-nowrap '])[1]");
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

}
