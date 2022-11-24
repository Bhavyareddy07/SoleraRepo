package com.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Libraryone {

	WebDriver wd;

	public void launchOpencart() {
		wd.navigate().to("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		String expTitle ="Account-Login";
		String actTitle = wd.getTitle();
		if(expTitle.equals(actTitle)) {
			System.out.println("Application is invoked successfully");
			
		}else {
			System.out.println("Application failed");
		}
		
		public void OpenOnMyAccount() {
	        WebDriver wd = new ChromeDriver();
	        wd.navigate().to("https://demo.opencart.com/");



	       if (wd.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[2]/div/a/span")).isDisplayed()) {
	            wd.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[2]/div/a/span")).click();
	        } else {
	            System.out.println("mismatch");
	        }
	    } // TODO Auto-generated method stub		
	}

	private void OpenOnMyAccount() {
		// TODO Auto-generated method stub

	}

}
