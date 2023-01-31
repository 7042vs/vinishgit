package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDay4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement bu = driver.findElement(By.className("(//a[@class='button button-orange'])[5]"));
		Thread.sleep(1000);
		
		WebElement pl = driver.findElement(By.className("(//li[@class='placeholder'])[1]"));
		Actions actions =  new Actions(driver);
		
		actions.dragAndDrop(bu, pl).perform();
		
		
	}
	
}
