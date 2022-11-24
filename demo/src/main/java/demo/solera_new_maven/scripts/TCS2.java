package demo.solera_new_maven.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TCS2 {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");

		// step 2
		// create the instance for chrome driver

		 WebDriver wd=new ChromeDriver();
		// invoke the application
		wd.manage().window().maximize();

		// invoke application under test
		wd.get("https://demo.opencart.com/");
		String expTitle = "Your Store";
		String actTitle = wd.getTitle();
		System.out.println("the page title is : " + actTitle);

		if (expTitle.equals(actTitle)) {
			System.out.println("the application is invoked succesfully");
		} else {
			System.out.println("404 error ");
		}
		Thread.sleep(3000);
// wd.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_fcd1cc8826aa0f45dff42238150fe65a854e12b7d12394614efd4c2a&mfadid=adm");

		// use of gettext
		String val = wd.findElement(By.xpath("//span[contains(text(),\"My Account\")]")).getText();
		System.out.println(val);
		
		if(val.equalsIgnoreCase(val)) {
			System.out.println("the element my account is present");
			
		}else {
			System.out.println("my account is not present");
		}
		Thread.sleep(4000);
		
		
		//by is a class in selenium web driver

	}

}
