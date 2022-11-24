
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


package com.day1.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TCS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step-1 
		// set the driver path
		
		System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe");
		//Step -2
		//Create the instance for FirefoxDriver
		
		WebDriver wd = new FirefoxDriver();
		// Invoke the application
		
		wd.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.4.0");	

	}

}
