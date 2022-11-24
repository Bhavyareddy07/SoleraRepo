package com.bmwmodels.scripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bmwmodels.pages.BmwHomePage;
import com.bmwmodels.pages.CountCars;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC001 {
	
	BmwHomePage bhp;
	CountCars count = new CountCars(wd);
	
	
	
	static WebDriver wd;

	static ExtentTest Test1;
	static ExtentReports rep2;
	
//	@BeforeTest
	  public void f() {
		  System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		  wd = new FirefoxDriver();
		  wd.get("https://www.bmw.in/en/index.html");
		  wd.navigate();
		  
		rep2   = new ExtentReports(System.getProperty("user.dir") + "./ReportExtent/models.html");
		Test1 = rep2.startTest("BMW_Models");
		
}
//	 @Test(priority=1)
	  public void click_on_models() throws InterruptedException, IOException {
		bhp= new BmwHomePage(wd);
		   bhp.click_on_models();
           Test1.log(LogStatus.PASS, "Launch is successfull ");
           Thread.sleep(2000);
	 }
//	 @Test(priority=2)
	 public void Mseries() throws InterruptedException {
		 bhp.Mseries();
		 Test1.log(LogStatus.PASS, "The user is able the Model series");
		 Thread.sleep(3000);
	}
//	 @Test
	 public void findNoOfDisplayeImages() throws InterruptedException {
		 count.findNoOfDisplayeImages();
		 Test1.log(LogStatus.PASS, "count succesfull");
		 
	 }
	 @Test(priority=1)
	 public void hello() throws InterruptedException {
		 
		 System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe");
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavya.R\\Desktop\\selenium\\BMW_Models\\Drivers\\chromedriver.exe");
			
			
			WebDriver wd = new ChromeDriver();
			wd.navigate().to("https://www.bmw.in");
			wd.findElement(By.xpath("//*[contains(text(),'Models')]")).click();
			wd.findElement(By.xpath("//button[@data-anchor='#m']")).click(); // for firefox
			//wd.findElement(By.xpath("//li[@data-series='M']")).click(); //for chrome
			
			
			List<WebElement> models = wd.findElements(By.xpath("//div[@data-group-name='M']//div[@class='cmp-modelcard__entry-wrap']"));
			System.out.println("Total number of cars :"+models.size());
        	models.forEach(b->System.out.println(b.getText()));

			Thread.sleep(30000);
			wd.close();
			
	 }
	 
}
