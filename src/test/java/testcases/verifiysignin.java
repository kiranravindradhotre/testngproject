package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageobjectmodel.signinpageobject;
import resources.baseclass;

public class verifiysignin extends baseclass {
	@Test
	public void enterCredientials() {
		// driver.findElement(By.xpath("username")).sendKeys("");
		signinpageobject spo = new signinpageobject(driver);
		spo.enterUserName().sendKeys("kiran");
		spo.enterPassword().sendKeys("gauri");
		spo.clickonLogin().click();
	}

}
