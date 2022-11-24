package com.bmwmodels.pages;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import com.google.common.io.Files;

public class BmwHomePage {
	static WebDriver wd;
	By text = By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[3]/div/div[2]/div[1]/a/span[2]");
	By model = By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[3]/div/div[2]/div[1]/a/span[2]");
	By Mseries = By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/nav/div/ul/li[8]/button");
	

	public BmwHomePage(WebDriver wd) {
		this.wd = wd;
		
	}

//	public BmwHomePage() {
//		// TODO Auto-generated constructor stub
//	}

	public void invoke_url() throws IOException {
		wd.get("https://www.bmw.in/en/index.html");
		String expt = "Models";
		String act = wd
				.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[3]/div/div[2]/div[1]/a/span[2]"))
				.getText();
		Assert.assertEquals(expt, act);
		if (wd.findElement(text).isDisplayed()) {

			System.out.println("The application is launched");
			File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File("./srcfolder/image1.png"));

		} else {
			System.out.println("Wrong url");
			File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File("./srcfolder/image2.png"));
		}
	}

	public void click_on_models1() {
		if (wd.findElement(model).isDisplayed()) {
			wd.findElement(By.xpath("//span[contains(text(),'Model')]")).click();
			System.out.println("The element model is present in the appliaction");
		} else {
			System.out.println("The element model is not present");
		}
	}

	public void click_on_models() {
		// TODO Auto-generated method stub

	}

	public void Mseries() {
		if (wd.findElement(Mseries).isDisplayed()) {
			wd.findElement(Mseries).click();
			System.out.println("Cars are visible in the application");
		} else {
			System.out.println("Cars are visible in the application");
		}
	}
}
