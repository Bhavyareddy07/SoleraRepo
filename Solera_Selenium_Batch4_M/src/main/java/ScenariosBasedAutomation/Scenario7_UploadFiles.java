package ScenariosBasedAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario7_UploadFiles {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
//
//		WebDriver d = new FirefoxDriver();
//		d.manage().window().maximize(); // always write wait code after this
////		   d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); //for page load
////		   d.get("https://www.monsterindia.com/seeker/registration"); //Testing webpage
////		   d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //for Implicit wait
////		 
//
//		d.navigate().to("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
////		   JavascriptExecutor js = (JavascriptExecutor)d; //Scrolling using JavascriptExecutor
////		   js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
////		   Thread.sleep(3000);
////		 
////		   // FILE UPLOADING USING SENDKEYS ....
////		 
////		   WebElement browse = d.findElement(By.xpath("//input[@id='file-upload']"));
////		   //click on ‘Choose file’ to upload the desired file
////		   browse.sendKeys("C:\\Users\\Chait\\Desktop\\Files\\Job Specification.txt"); //Uploading the file using sendKeys
////		   System.out.println("File is Uploaded Successfully");
//
//		d.findElement(By.xpath("//*[@id=\"myFile\"]")).sendKeys("C:\\Users\\Bhavya.R\\selenium softwares\\uploadfileTest");
//		System.out.println("file uploaded succesfully");

		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		

		WebDriver wd = new FirefoxDriver();

		wd.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		wd.findElement(By.xpath("//input[@id=\"myFile\"]"))
				.sendKeys("C:\\Users\\Bhavya.R\\selenium softwares\\Cat03.jpg");
	}

}
