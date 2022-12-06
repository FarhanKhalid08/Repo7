package test7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class7 {
public static WebDriver driver;
public static SoftAssert softassert = new SoftAssert();
public static WebDriverWait wait;

@Test
public void Waittime() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://rediff.com");
	
	WebElement signinlink= driver.findElement(By.cssSelector("a.signin"));
	softassert.assertTrue(signinlink.isDisplayed());
	wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(signinlink));
	signinlink.click();
	
	WebElement username= driver.findElement(By.id("login1"));
	wait = new WebDriverWait (driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(username));
	softassert.assertTrue(username.isDisplayed());
	username.sendKeys("Farhankhalid920@hotmail.com");
	
	WebElement password= driver.findElement(By.id("password"));
	wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(password));
	softassert.assertTrue(password.isDisplayed());
	password.sendKeys("subhan");
	
	softassert.assertAll();
	driver.quit();
     
}
}
