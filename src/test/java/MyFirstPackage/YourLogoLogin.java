package MyFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.MyFirstEncapsulation;

public class YourLogoLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//WebElement signIn = driver.findElement(By.xpath("//*[contains(@class,'login')]")); // contains formula for xpath
		//WebElement signIn = driver.findElement(By.xpath("//*[starts-with(@class,'login')]")); // starts-with formula for xpath
		//signIn.click();
		
		MyFirstEncapsulation object = new MyFirstEncapsulation(driver); 
 		//object.getSignIn(); 
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", object.getSignIn());
		object.getSignIn().click();
		
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", object.getEmail());
		object.getEmail().sendKeys("sarowerny@gmail.com");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", object.getPassword());
		object.getPassword().sendKeys("student"); 
		
		object.getFinalSignInButton().click(); 
	}

}








//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//
//WebDriver driver = new ChromeDriver(); // create an object for ChromeDriver
//
////driver.get("http://www.google.com"); // opens google
//driver.get("http://automationpractice.com/index.php"); // opens Your Logo WebPage
//
////driver.navigate().to(""); //driver.navigate().forward();
////driver.navigate().back(); //driver.navigate().refresh();
//
//driver.manage().window().maximize(); // maximizes the screen 
// //driver.manage().window().fullscreen(); // makes the screen full size 
//
//WebElement signInButton = driver.findElement(By.xpath("//*[@class='login']")); // formula for xpath ==> //*[id='login']
//((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", signInButton); // google search ==> copied the code from stackOverFlow for color
////Thread.sleep(3000);
//signInButton.click();
//
//	//WebElement myAccntBtn = driver.findElement(By.xpath("//*[contains(@class,'login')]")); 
//	//myAccntBtn.click();
//
////driver.findElement(By.xpath("//*[@class='login']")).click(); // this also works 
//
//WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
//((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", email);
//email.sendKeys("sarowerny@gmail.com"); 
//
////driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sarowerny@gmail.com"); // this also works 
//
//WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
//((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'", password);
//password.sendKeys("student");
////password.submit(); // didn't work. WHY???
//
////driver.findElement(By.xpath("//*[@id=\\\"passwd\\\"]")).sendKeys("student"); // this didn't work. WHY???
//
//WebElement finalSignInButton = driver.findElement(By.xpath("//*[@class='icon-lock left']"));
//((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid purple'", finalSignInButton); // google search ==> copied the code from stackOverFlow
////Thread.sleep(3000);
//finalSignInButton.click();
