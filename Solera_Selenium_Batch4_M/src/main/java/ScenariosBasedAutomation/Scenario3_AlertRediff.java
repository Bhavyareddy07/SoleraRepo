package ScenariosBasedAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario3_AlertRediff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe");
		//Step -2
		//Create the instance for FirefoxDriver
		
		WebDriver wd = new FirefoxDriver();
		
		wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
		wd.findElement(By.name("login")).sendKeys("testdata1");
		wd.findElement(By.name("proceed")).click();
		Thread.sleep(6000);
		Alert alt =wd.switchTo().alert();
		//alt.accept();
		String exptaltmessage="Please enter password";
		String val = alt.getText();
		System.out.println("Alert message is :" + val);
		
	/*	Thread.sleep(2000);
		wd.findElement(By.name("passwd")).sendKeys("YT*&T*(");
		Thread.sleep(3000);
		wd.close();*/
		
		if(exptaltmessage.equals(val)) {
			System.out.println("The alert message is correct");
		}
		else {
			System.out.println("Incorrcet alert message");
		}
		}
		
		
		
	

	}

