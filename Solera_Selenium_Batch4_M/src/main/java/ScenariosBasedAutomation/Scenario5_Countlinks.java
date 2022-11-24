package ScenariosBasedAutomation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario5_Countlinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");

		WebDriver wd = new FirefoxDriver();
		// WebDriver wd = new FirefoxDriver();

		wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// wd.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");

		ArrayList<WebElement> l = (ArrayList<WebElement>) wd.findElements(By.tagName("a"));
		System.out.println(l.size());
		
		
		int count = l.size();
		for (int i = 0; i < count; i++) {
			System.out.println();
			System.out.println(l.get(i).getText());
		}

	}

}
//WebDriver wd = new FirefoxDriver();
//wd.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
//
//ArrayList<WebElement> l = (ArrayList<WebElement>) wd.findElements(By.tagName("a"));
//System.out.println(l.size());
//
//int count = l.size();
//for(int i=0;i<count;i++) {
//    System.out.println();
//    System.out.println(l.get(i).getText());
//}
