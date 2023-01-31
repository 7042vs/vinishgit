package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensClass {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("wecdriver.chrome.driver","C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\src\\org\\day3\\GreensClass.java");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstech.in/selenium-course-content.html");
	Thread.sleep(2000);
	
	WebElement txt = driver.findElement(By.id("overview-tab"));
     txt.click();
    
     
   
  WebElement text = driver.findElement(By.id("collapse661"));
      String text1 = text.getText();
    
     
     System.out.println("get text"+text1);
     
}
	
	
}
