package ScenariosBasedAutomation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario2_ExternalDataAccess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe");
		//Step -2
		//Create the instance for FirefoxDriver
		
		WebDriver wd = new FirefoxDriver();
		
		FileReader fr = new FileReader(".//Testdata//data.properties");
		
		Properties p = new Properties();
		p.load(fr);
		
		// Invoke the login page
		wd.navigate().to(p.getProperty("baseurl"));
		wd.findElement(By.name("email")).sendKeys(p.getProperty("unm"));
		wd.findElement(By.name("password")).sendKeys(p.getProperty("pwd"));
		
		
		
		
		


	}

}
