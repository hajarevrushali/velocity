package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Configuration.Configure;

public class Test {
	
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", Configure.driverpath);
	WebDriver driver = new ChromeDriver();
	driver.get("https://vacations.spicejet.com/");
	driver.manage().window().maximize();
 driver.findElement(By.xpath("//input[@id='txtHotelCity']")).sendKeys("pune");
WebElement from = driver.findElement(By.xpath("//input[@id='from']"));
Actions act = new Actions(driver);
act.moveToElement(from).click().perform();
WebElement date = driver.findElement(By.xpath("//a[(text()='31')]"));
act.moveToElement(date).sendKeys(Keys.ENTER).perform();
	
}
}
