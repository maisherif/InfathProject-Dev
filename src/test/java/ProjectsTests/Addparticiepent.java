package ProjectsTests;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.ExternalUserLogin;
import tests.TestBase;
import ProjectsPages.AddParticipants;


public class Addparticiepent extends TestBase{
	
	public Addparticiepent (String url) {
		super();
		this.url = "external";
	}
	public Random rand = new Random();
	int upperbound = 2000;
    int int_random = rand.nextInt(upperbound); 
    String randomnumber = Integer.toString(int_random);
	
	ExternalUserLogin externallogin;
	AddParticipants addpartipent;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	@Test
	public void loginSP() throws InterruptedException
	{
		externallogin = new ExternalUserLogin(driver);	
		externallogin.userlogin("7006337674", "123123123456123");

	}
	@Test (dependsOnMethods = {"loginSP"} )
	public void addpartipenttypeonbehalfofhimself() throws InterruptedException
	{
		randomnumber = Integer.toString(int_random);
		addpartipent = new AddParticipants(driver);	
		addpartipent.openauctionlist();		
		addpartipent.gotoparticipenttab();
		addpartipent.addpartipent();
		addpartipent.addParticipantDetails("2222222222", "partipent1", randomnumber, "0512345678", "mai@hotmail.com");
		addpartipent.addtypeCheque("10000", randomnumber);
		addpartipent.addtypeTransfer("10000", randomnumber, "SA0410000079451000000207");
		addpartipent.addtypeEwallet("10000", randomnumber);
		addpartipent.nextbutton();
		addpartipent.registerparticipant();
	}
	
	@Test (dependsOnMethods = {"addpartipenttypeonbehalfofhimself"} )
	public void addpartipenttypeonbehalfofentity() throws InterruptedException
	{
		randomnumber = Integer.toString(int_random);
		addpartipent = new AddParticipants(driver);	
		
		addpartipent.openauctionlist();		
		addpartipent.gotoparticipenttab();
		addpartipent.addpartipent();
		addpartipent.addParticipantDetails("1004933261", "partipent2", "4", "0512345678", "mai@hotmail.com");
		addpartipent.addtypeCheque("10000", "4");
		addpartipent.addtypeTransfer("10000", "4", "SA0410000079451000000207");
		addpartipent.addtypeEwallet("10000", "4");
		addpartipent.nextbutton();
//	    addpartipent.participanttype("1");
//		addpartipent.typeonbehalfofanentity("7012345678", "namee");
//		addpartipent.ProveEntityAuthorization("1");
		addpartipent.registerparticipant();
	}


}
