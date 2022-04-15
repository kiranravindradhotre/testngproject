package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signuppageobject {
	public WebDriver driver;

	private By firstname = By.xpath("//input[@name='UserFirstName']");
	private By lastname = By.xpath(" //input[@name='UserLastName']");
	private By useremail = By.xpath("//input[@name='UserEmail']");
	private By companyname = By.xpath("//input[@name='CompanyName']");
	private By userphone = By.xpath("//input[@name='UserPhone']");

	public Signuppageobject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement enterFirstName() {
		return driver.findElement(firstname);
	}

	public WebElement enterLastName() {
		return driver.findElement(lastname);
	}

	public WebElement enterUserEmail() {
		return driver.findElement(useremail);
	}

	public WebElement enterCompayName() {
		return driver.findElement(companyname);
	}

	public WebElement enterUserphone() {
		return driver.findElement(userphone);
	}

}

/*
 * //input[@name='UserFirstName'] //input[@name='UserLastName']
 * //input[@name='UserEmail'] //input[@name='CompanyName']
 * //input[@name='UserPhone']
 */
