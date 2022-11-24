package ScenariosBasedAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
/*******************************************************

Script Name : TCS01.java

Script Description:
Step-1: Launch the google app in firefox browser
Step-2: Enter "Test Automation" in search box.
Step-3: Click on enter.
Date of creation :
Method Library:
Test data path:
Driver Path:
Author Name: 

********************************************************/

import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario1_PressEnter {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe");
		//Step -2
		//Create the instance for FirefoxDriver
		
		WebDriver wd = new FirefoxDriver();
		wd.navigate().to("https://www.google.com/");
		
		wd.findElement(By.name("q")).sendKeys("Test Automation");
		
		// Code to click enter in key board
		
		wd.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
	
		

	}

}
