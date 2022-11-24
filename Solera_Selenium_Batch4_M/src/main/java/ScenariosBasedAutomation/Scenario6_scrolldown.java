package ScenariosBasedAutomation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario6_scrolldown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		
		WebDriver wd = new FirefoxDriver();
		wd.navigate().to("https://www.solera.com/solutions/");
		Thread.sleep(3000);
		
		
		((JavascriptExecutor) wd).executeScript("scroll(0,800)");
		//((JavascriptExecutor) wd).executeScript("scroll(0,200)");
	}

}
