package ScenariosBasedAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario5_webelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");

		WebDriver wd = new FirefoxDriver();
		wd.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");

		WebElement f1,f2,f3;
		f1=wd.findElement(By.name("firstname"));
		f2=wd.findElement(By.name("lastname"));
		f3=wd.findElement(By.name("email"));
		
		f1.sendKeys("bhavya");
		f2.sendKeys("pavitra");
		f3.sendKeys("bhavyareddy0730@gmail.com");
		
	}

}
