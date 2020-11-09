package MyFirstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravelsLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.phptravels.net/login");
		driver.manage().window().maximize();

		//WebElement myAccountButton = driver.findElement(By.xpath("//*[@class='bx bx-user']")); // this xpath was created by regular formula
		//WebElement myAccountButton = driver.findElement(By.xpath("//*[@class='dropdown dropdown-login dropdown-tab']")); // this xpath was created by using the locator & locator value under the anchor link 
		//WebElement myAccountButton = driver.findElement(By.xpath("(//*[@class='btn btn-text-inherit btn-interactive'])[3]")); // this xpath was created by using xpath grouping 
		List<WebElement> myAccountButton = driver.findElements(By.xpath("//*[@class='btn btn-text-inherit btn-interactive']")); // this xpath is pointing at 3 elements
		// but by using index theory I can point at the right element 
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", myAccountButton.get(2));
		myAccountButton.get(2).click(); // expert professionals use index theory; most accurate!!!  
		Thread.sleep(1000);
		WebElement logInButton = driver.findElement(By.xpath("//*[@href='https://www.phptravels.net/login']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", logInButton);
		logInButton.click();

		WebElement email = driver.findElement(By.xpath("//*[@name='username']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", email);
		email.sendKeys("daachillescode@gmail.com");
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", password);
		password.sendKeys("Rise2020");
		Thread.sleep(1000);

		WebElement submitLogin = driver
				.findElement(By.xpath("//*[@class='btn btn-primary btn-lg btn-block loginbtn']"));
		submitLogin.click();
	}

}
