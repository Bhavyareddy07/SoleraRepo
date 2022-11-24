package com.day1.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Libraryone {
	WebDriver wd;
	
	public void initdriver(WebDriver wd) {
		this.wd=wd;
	}
	
	public void launchOpencart() {
		//wd.navigate().to("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		wd.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		String expTitle = "Account Login";
		String actTitle = wd.getTitle();
		if(expTitle.equals(actTitle)) {
			System.out.println("Application is invoked successfully");
		}
		else {
			System.out.println("The application url is wrong");
		}
	}
		
		
	

	public void Click_On_MyAccount() {
		// TODO Auto-generated method stub
		
		if(wd.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[2]/div/a/span")).isDisplayed()) {
			wd.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[2]/div/a/span")).click();
		}
		else {
			System.out.println("The element is not present");
		}
		
	}

}
