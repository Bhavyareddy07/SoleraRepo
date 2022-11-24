package com.bmwmodels.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CountCars {
	WebDriver wd;
	
	By CountCars = By.xpath("\"/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/div[1]/div[2]/div[16]/div/div[1]/a/picture/img");
	public CountCars() {
		this.wd = wd;
	}

	public CountCars(WebDriver wd2) {
		// TODO Auto-generated constructor stub
	}

	public void findNoOfDisplayeImages() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Integer counter = 0;
		driver.get(
				"/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/div[1]/div[2]/div[16]/div/div[1]/a/picture/img");
		Thread.sleep(2000);
		driver.get("/html/body/div[1]/main/div[1]/div[6]/div[1]/div[2]/nav/div/ul/li[8]/button");
		List<WebElement> listImages = driver.findElements(By.tagName("img"));
		System.out.println("No. of Images: " + listImages.size());

	}
}
