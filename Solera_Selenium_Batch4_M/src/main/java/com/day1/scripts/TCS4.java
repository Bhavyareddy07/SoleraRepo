package com.day1.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TCS4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe");
		//Step -2
		//Create the instance for FirefoxDriver
		
		WebDriver wd = new FirefoxDriver();
		
		// Maximize the browser window
		wd.manage().window().maximize();
		
		// Invoke application under test
		wd.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
        //wd.findElement(By.linkText("Register")).click();
		wd.findElement(By.partialLinkText("Forgotten")).click();
		
		// Absolute
		// Relative Xpath

	}

}
