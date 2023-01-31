package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActonClass {
	
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe" );
	
	
	WebDriver driver = new ChromeDriver ();
	
	driver.get(" http://www.greenstechnologys.com/");
	
      WebElement cours = driver.findElement(By.xpath("//a[text()='COURSES']"));	
	
      
      
	
	Actions actions = new Actions(driver);
	
	Thread.sleep(1000);
	
	actions.moveToElement(cours).perform();
	
	WebElement train = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
	
	Thread.sleep(1000);
	
	actions.moveToElement(train).perform();
	
	Thread.sleep(1000);
WebElement pl = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Training']"));	
	
  
pl.click();
	
	
	
	
	
	
}


}
