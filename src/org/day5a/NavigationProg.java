package org.day5a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationProg {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
       driver.get("https://www.flipkart.com/");			
       Thread.sleep(1000);
       driver.get("https://www.amazon.in/");
       Thread.sleep(1000);
       driver.navigate().back();
       Thread.sleep(1000);
       driver.navigate().to(" https://netbanking.hdfcbank.com/ \r\n");
       Thread.sleep(1000);
       driver.navigate().back();
       Thread.sleep(1000);
       driver.navigate().forward();
       Thread.sleep(1000);
       driver.navigate().refresh();
       
       
	}

}
