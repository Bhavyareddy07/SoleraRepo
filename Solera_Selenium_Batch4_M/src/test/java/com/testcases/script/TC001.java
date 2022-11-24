package com.testcases.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.day1.lib.Libraryone;

public class TC001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe");
		//Step -2
		//Create the instance for FirefoxDriver
		
		WebDriver wd = new FirefoxDriver();
		
		// Create the object for the library
		
		Libraryone obj1 = new Libraryone();
		obj1.initdriver(wd);
		obj1.launchOpencart();
		obj1.Click_On_MyAccount();
	    
		

	}

}
