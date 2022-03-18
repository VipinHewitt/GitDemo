package Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		String driverpath = System.getProperty("user.dir");
		System.out.println(driverpath);
		System.setProperty("webdriver.chrome.driver", driverpath + "\\drivers\\chromedriver98102.exe");
		WebDriver driver = new ChromeDriver();

//		System.setProperty("webdriver.gecko.driver", driverpath + "\\drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
//		driver.get("https://rahulshettyacademy.com");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
//		driver.close();
//		driver.quit();
		
	}

}
