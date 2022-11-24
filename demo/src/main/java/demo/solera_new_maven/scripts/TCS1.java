package demo.solera_new_maven.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TCS1 {
    
public static void main(String[] args) {
       //to do auto generated method stub
     
     //step 1
     //set the driver path
     
     System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
     
     //step 2
     // create the instance for chrome driver
     WebDriver wd=new ChromeDriver();
    
     
     //invoke the application
     
     wd.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_fcd1cc8826aa0f45dff42238150fe65a854e12b7d12394614efd4c2a&mfadid=adm");
}



}
