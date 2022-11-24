package ScenariosBasedAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario4_guru99 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");

		WebDriver wd = new FirefoxDriver();
		wd.get("https://demo.guru99.com/test/newtours/register.php");
		((JavascriptExecutor) wd).executeScript("scroll(0,500)");
		Select sel = new Select(wd.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")));
		Thread.sleep(3000);
		sel.selectByVisibleText("INDIA");
		
    List <WebElement> l = sel.getOptions();
    
    int count = l.size();
    for(int i =0; i<count; i++) {
    	System.out.println();
    	String countryval = l.get(i).getText();
    	System.out.println(countryval);
    }
    	
    	
	}

}
