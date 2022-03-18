package Academy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsProg {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		String driverpath = System.getProperty("user.dir");
		System.out.println(driverpath);
		System.setProperty("webdriver.chrome.driver", driverpath + "\\drivers\\chromedriver98102.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("contact@rahulshettyacademy.com");
		driver.findElement(By.name("inputPassword")).sendKeys("Hell123");
		driver.findElement(By.className("signInBtn")).click();
		//Thread.sleep(1000);
		String errormsg = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(errormsg);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("John@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456789");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		errormsg = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(errormsg);
		
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
