package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public WebDriver driver;
	public Properties prop;

	public WebDriver intializeDriver() throws IOException {
		// to read properties file
		FileInputStream fis = new FileInputStream(
System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		 prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome"))

		{
		//	WebDriverManager.chromedriver().browserVersion("79.0.8").setup(); // use to set the particular chrome driver
			WebDriverManager.chromedriver().setup();//automatically use the updated chrome driver
			driver = new ChromeDriver();

		} else if (browserName.equals("Firefox")) {
			// firefox code
		} else if (browserName.equals("IE")) {
			// IE code
		} else {
			System.out.println("u should choose any of browser");
		}
		return driver;
	}

	@BeforeMethod
	public void launchBrowser() throws IOException {
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
	}

}
