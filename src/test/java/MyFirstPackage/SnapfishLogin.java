package MyFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SnapfishLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.snapfish.com/home");
		driver.manage().window().maximize(); 
		
		WebElement signinButtn = driver.findElement(By.xpath("//*[@class='transform-text text_font_01e  omnituretrackthis']")); 
		signinButtn.click();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//*[@id='EmailAddress']")); 
		email.sendKeys("daachillescode@gmail.com"); 
		
		WebElement pwd = driver.findElement(By.xpath("//*[@class='login-password fieldvalidation floatlabel-input']")); 
		pwd.sendKeys("Rise2020"); 
		pwd.submit();
		Thread.sleep(10000);
		
		WebElement accountIcon = driver.findElement(By.xpath("//*[@id='globalHeaderUserMenu']")); 
		accountIcon.click();
		Thread.sleep(1000);
		
		WebElement signoutButtn = driver.findElement(By.xpath("//*[@omniture-data-id='header_topnav_user_dropdown_sign out']")); 
		signoutButtn.click();
	}

}
