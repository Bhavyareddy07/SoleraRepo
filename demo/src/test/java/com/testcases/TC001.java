package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.day1.Libraryone;

public class TC001 {
	public static void main(String[] args) {
		
	
    System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
    WebDriver wd=new ChromeDriver();
    
    Libraryone obj = new Libraryone();
    obj.launchOpencart();
    
    
    
    
}
}