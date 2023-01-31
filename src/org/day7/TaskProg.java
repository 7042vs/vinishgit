package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskProg {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement clas = driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'])[1]"));
		clas.sendKeys("vinish");
		Thread.sleep(1000);
		
		WebElement laste = driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'])[1]"));
		
		laste.sendKeys("kv");
		Thread.sleep(1000);
		WebElement add = driver.findElement(By.xpath("//textarea[@rows='3']"));
		add.sendKeys("parambuvilai,kappiyari(po),kanniyakummari");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		
		email.sendKeys("vinishvini@75gamil.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9489407042");
		
		WebElement gen = driver.findElement(By.xpath("//input[@value='Male']"));
		gen.click();
		
		WebElement hobbi= driver.findElement(By.id("checkbox1"));
		hobbi.click();
		
		WebElement lang = driver.findElement(By.id("msdd"));
		lang.click();
		WebElement lang2 = driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[8]"));
		lang2.click();
		WebElement skills = driver.findElement(By.id("Skills"));
		
		Select select= new Select(skills);
		select.selectByIndex(10);
		
        WebElement d = driver.findElement(By.id("countries"));	
        d.click();
	     
        WebElement con = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
	     con.click();
	     WebElement c = driver.findElement(By.xpath("(//li[@role='treeitem'])[6]"));
	     c.click();
	     WebElement year = driver.findElement(By.xpath("(//select[@type='text'])[3]"));
	     year.sendKeys("2000");
	     
	     WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
	     month.sendKeys("July");
	     WebElement day = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
	     Select select2 = new Select(day);
	     select2.selectByVisibleText("7");
	     WebElement pass = driver.findElement(By.id("firstpassword"));
	     pass.sendKeys("vinish123v");
	     
	     WebElement pass1 = driver.findElement(By.id("secondpassword"));
	     pass1.sendKeys("vinish123v");
	     
	     WebElement sumit = driver.findElement(By.id("submitbtn"));
	     sumit.click();
	     
	     
	     
	}	

}
