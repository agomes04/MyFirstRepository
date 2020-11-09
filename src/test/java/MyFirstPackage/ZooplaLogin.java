package MyFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZooplaLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://www.zoopla.co.uk/house-prices/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement acceptAllCookies = driver.findElement(By.xpath("//*[@id=\"cookie-consent-form\"]/div/div/div/button[2]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", acceptAllCookies);
		//Thread.sleep(3000);
		acceptAllCookies.click();

		
		
		WebElement signInButton = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")); // why is it showing 1 of 2???
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", signInButton);
		//Thread.sleep(3000);
		signInButton.click();
		 
		WebElement email = driver.findElement(By.xpath("//*[@id='signin_email']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", email);
		//Thread.sleep(3000);
		email.sendKeys("daachillescode@gmail.com");
			
		WebElement password = driver.findElement(By.xpath("//*[@id='signin_password']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", password);
		//Thread.sleep(3000);
		password.sendKeys("Rise2020"); 
		password.submit();

	}

}
