package MyFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.LoginObjectModel;
import com.util.Highlighter;

public class AutomationPractice {

	public static void main(String[] args) {

		// Ctrl + Shift + O ==> shortcut for importing all libraries
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// up casting

		driver.get("http://automationpractice.com/index.php");// mostly
		driver.manage().window().maximize();
		
		LoginObjectModel obj = new LoginObjectModel(driver); 
		Highlighter.getColor(driver, obj.getLogin());
		obj.getLogin().click(); 
		
		Highlighter.getColor(driver, obj.getEmail(), "green");
		obj.getEmail().sendKeys("sarowerny@gmail.com");; 
		
		Highlighter.getColor(driver, obj.getPassword(), "oragne");
		obj.getPassword().sendKeys("student");; 
		
		Highlighter.getColor(driver, obj.getFinalsignBtn(), "pink");
		obj.getFinalsignBtn().click(); 
		
		driver.quit();
	}

}






//// click login
//WebElement login = driver.findElement(By.xpath("//*[@class='login']"));
//((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", login);
//login.click();
//
//// email
//WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
//((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid green'", email);
//email.sendKeys("sarowerny@gmail.com");
//
//// password
//WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
//((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid blue'", password);
//password.sendKeys("student");
//
//// password.submit();
//WebElement finalsignBtn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
//((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", finalsignBtn);
//finalsignBtn.click();

