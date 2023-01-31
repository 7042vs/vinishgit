package org.day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownProg {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement skills = driver.findElement(By.id("Skills"));

		Select select = new  Select(skills);
		

		select.selectByIndex(1);

		select.selectByValue("C");
		
		select.selectByVisibleText("Python");

		List<WebElement> options = select.getOptions();

		int size = options.size();

		System.out.println(size);

		for (int i = 0; i <=60; i++) {
			String text = options.get(i).getText();

			System.out.println(text);
		}
		System.out.println("***********");

		for (WebElement w: options) {

			String text = w.getText();
			System.out.println(text);

		}

		System.out.println("**********");
		for (int i = 3; i <=4; i++) {
			String attribute = options.get(i).getAttribute("value");
			System.out.println(attribute);

		}
		System.out.println("**********");
		for (WebElement e : options) {
			String attribute = e.getAttribute("value");
			System.out.println(attribute);

		}


	}

}
