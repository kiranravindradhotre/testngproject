package testcases;

import org.testng.annotations.Test;

import pageobjectmodel.Signuppageobject;
import pageobjectmodel.signinpageobject;
import resources.Constants;
import resources.baseclass;

public class verifysignup extends baseclass {
	
	@Test
	public void signupData() throws InterruptedException {
		signinpageobject spo = new signinpageobject(driver);
		spo.opensignuppage().click();
		Thread.sleep(2000);
		
		Signuppageobject sup= new Signuppageobject(driver);
        sup.enterFirstName().sendKeys(Constants.FirstName);  // this is use to hide data so we create one class in resourse
        sup.enterLastName().sendKeys(Constants.LastName); // and declare that variable as final and static so no need to create object of that 
        sup.enterUserEmail().sendKeys("dhotrek.7@gmail.com");
        sup.enterUserphone().sendKeys("1234567890");
        sup.enterCompayName().sendKeys("infosys");
	}
	

}
