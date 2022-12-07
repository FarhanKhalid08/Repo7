package test7;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class7 {
public static WebDriver driver;
public static WebDriverWait wait;

public static void main (String[] args) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://rediff.com");
	
	WebElement signinlink= driver.findElement(By.cssSelector("a.signin"));
	Assert.assertTrue(signinlink.isDisplayed());
	wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(signinlink));
	signinlink.click();
	
	WebElement username= driver.findElement(By.id("login1"));
	wait = new WebDriverWait (driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(username));
	Assert.assertTrue(username.isDisplayed());
	username.sendKeys("Farhankhalid920@hotmail.com");
	
	WebElement password= driver.findElement(By.id("password"));
	wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(password));
	Assert.assertTrue(password.isDisplayed());
	password.sendKeys("subhan");
	
	driver.quit();
     
}
}
