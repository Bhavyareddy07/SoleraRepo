package come.project;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.navigate();
		wd.get("https://www.facebook.com/");

		wd.findElement(By.name("email")).sendKeys("testuser123");
		wd.findElement(By.id("password")).sendKeys("122767");
		wd.findElement(By.name("login")).click();

	}
}
