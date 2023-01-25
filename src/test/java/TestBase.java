


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public String url = ""; 
	JavascriptExecutor js = (JavascriptExecutor) driver;

//	@BeforeSuite
//	@Parameters({"browser"})
//	public void Startdriver(@Optional ("chrome") String browsername) //optional if it is not come from testng.xml
//	{
//		if (browsername.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//	        ChromeOptions option = new ChromeOptions();
//	        option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//	        option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//	        WebDriverManager.chromedriver().setup();
//	        driver = new ChromeDriver(option);
//		}
//		driver.manage().window().maximize();
////		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='90%';");
//
////		for(int i=0; i<3; i++){
////			driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
////		}
//		if (externel.equalsIgnoreCase("internal")) {
//			driver.navigate().to("https://172.20.25.21/Eservices_Internal/AssetsList");
//		} else if (externel.equalsIgnoreCase("external")) {
//			driver.navigate().to("https://172.20.25.21/Eservices_External/Login");
//		}
//
//	}
	@BeforeClass
	@Parameters({"browser"})
	public void Startdriver(@Optional ("firefox") String browsername) //optional if it is not come from testng.xml
	{
		if (browsername.equalsIgnoreCase("firefox")) {
			FirefoxOptions option = new FirefoxOptions();  
//		    option.setLegacy(true);  
			WebDriverManager.firefoxdriver().setup();
	        option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	        option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); 
	        WebDriverManager.firefoxdriver().setup();
	        driver = new FirefoxDriver(option);
		}
		driver.manage().window().maximize();
//		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='90%';");

//		for(int i=0; i<3; i++){
//			driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
//		}
		if (url.equalsIgnoreCase("internal")) {
			driver.navigate().to("https://172.20.25.21/Eservices_Internal/AssetsList");
		} else if (url.equalsIgnoreCase("external")) {
			driver.navigate().to("https://172.20.25.21/Eservices_External/Login");
		}
		//dev
//		if (url.equalsIgnoreCase("internal")) {
//			driver.navigate().to("https://172.20.23.14/Eservices_Internal/AssetsList");
//		} else if (url.equalsIgnoreCase("external")) {
//			driver.navigate().to("https://172.20.23.14/Eservices_External/Login");
//		}

	}
	
	@AfterClass
	public void Closedriver() {
	driver.close();
}

}
