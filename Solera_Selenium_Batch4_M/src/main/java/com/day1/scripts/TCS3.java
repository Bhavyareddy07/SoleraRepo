package com.day1.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*******************************************************

Script Name : TCS01.java

Script Description:
Step-1: Launch the opencart application in firefox browser
Step-2: Click on My Account
Step-3: Click on Login
Step-4: Enter username
Step-5: Enter password
Step-6: Click on Login button
Date of creation :
Method Library:
Test data path:
Driver Path:
Author Name: 

********************************************************/
public class TCS3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe");
		//Step -2
		//Create the instance for FirefoxDriver
		
		WebDriver wd = new FirefoxDriver();
		
		// Maximize the browser window
		wd.manage().window().maximize();
		
		// Invoke application under test
		wd.get("https://demo.opencart.com/");
		
		wd.findElement(By.xpath("//span[contains(text( ),\"My Account\")]")).click();
		wd.findElement(By.xpath("//a[contains(text( ),\"Login\")]")).click();
		// sendKeys is used to pass the test data at the time of execution
		
		if(wd.findElement(By.id("input-email")).isDisplayed()) {
			wd.findElement(By.id("input-email")).clear();
		    wd.findElement(By.id("input-email")).sendKeys("Testdatauser1");
		}
		else {
			System.out.println("User name is not present");
		}
		
		wd.findElement(By.name("password")).sendKeys("Testuser345");
		wd.findElement(By.xpath("//button[contains(text( ),\"Login\")]")).click();
        wd.close();
	}
	


}
