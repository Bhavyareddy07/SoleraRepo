package demo.solera_new_maven.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCS4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");

		// step 2
		// create the instance for chrome driver

		WebDriver wd = new ChromeDriver();
		// invoke the application
		wd.manage().window().maximize();

		// invoke application under test
		wd.get("https://demo.opencart.com/");
		wd.findElement(By.linkText("Register")).click();

		if (wd.findElement(By.id("input-email")).isDisplayed()) {
			wd.findElement(By.id("input-email")).clear();
			wd.findElement(By.id("input-email")).sendKeys("bhavya");
		} else {
			System.out.println("The user name is not present");

		}

		wd.findElement(By.name("password")).sendKeys("bhavya");
		// write xpath for this (relative path) and execute
	}
}