package com.day1.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TCS2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// WebDriver Methods
		
		// set the driver path
		
				System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe");
				//Step -2
				//Create the instance for FirefoxDriver
				
				WebDriver wd = new FirefoxDriver();
				
				// Maximize the browser window
				wd.manage().window().maximize();
				
				// Invoke application under test
				wd.get("https://demo.opencart.com/");
				
				String expTitle = "Your Store";
				String actTitle = wd.getTitle();
				System.out.println("The page title is :" + actTitle);
				
				if(expTitle.equals(actTitle)) {
					System.out.println("The application is invoked successfully");
				}
				else {
					System.out.println("wrong url");
				}
				
				Thread.sleep(3000);
				// Use of getText()
				String expval = "My Account";
				String val = wd.findElement(By.xpath("//span[contains(text( ),\"My Account\")]")).getText();
				
				System.out.println(val);
				
				if(expval.equalsIgnoreCase(val)) {
					System.out.println("The element My Account is present");
				}
				else {
					System.out.println("My Account is not present");
				}
				Thread.sleep(4000);
				
				// By  is a class in selenium webdriver
				// WebDriver is the interface
				// FirefoxDriver is a class
				
				
				
				wd.close();
				
				
			
	}

}
