package org.day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPro {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html" );
		driver.manage().window().maximize();
		
		  WebElement but = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		   but.click();
		   driver.switchTo().alert().accept();
		   
		  WebElement tx1 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		  tx1.click();
		  WebElement but1 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		   but1.click();
		   driver.switchTo().alert().dismiss();
		   
		   WebElement tx2 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		   tx2.click();
		   
		   WebElement but2 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		   but2.click();
		   Thread.sleep(1000);
		   
		   Alert alert = driver.switchTo().alert();
		   System.out.println(alert.getText());
		   driver.switchTo().alert().sendKeys("Vinish");
		   driver.switchTo().alert().accept();
		   
		   Thread.sleep(1000);
		   WebElement text = driver.findElement(By.xpath("//p[@id='demo1']"));
		   String text2 = text.getText();
		   System.out.println(text2);
		   
		   
		   
		   
	}
}
