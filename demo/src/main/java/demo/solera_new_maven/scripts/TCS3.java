package demo.solera_new_maven.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCS3 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");

	// step 2
	// create the instance for chrome driver

	 WebDriver wd=new ChromeDriver();
	// invoke the application
	wd.manage().window().maximize();

	// invoke application under test
	wd.get("https://demo.opencart.com/");
	
	wd.findElement(By.xpath("//span[contains(text(),\"My Account\")]")).click();
	wd.findElement(By.xpath("//a[contains(text(),\"Login\")]")).click();
	
	//sendkeys is used to pass the test data at the time of execution
	
	wd.findElement(By.name("email")).sendKeys("testuser123");
	wd.findElement(By.xpath("//button[contains(text(),\"Login\")]")).click();
	
	
	
	
	}
}
