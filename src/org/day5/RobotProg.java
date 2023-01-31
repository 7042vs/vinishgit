package org.day5;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotProg {
	
	
	public static <Robort> void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("  http://adactinhotelapp.com/\r\n" );
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Robot robot = new Robot();
		
		
		for (int i = 1; i <=3; i++) {
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
								
		}
		
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_SHIFT);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);	
//		robot.keyPress(KeyEvent.VK_I);
//		robot.keyRelease(KeyEvent.VK_I);
//		robot.keyPress(KeyEvent.VK_N);
//		robot.keyRelease(KeyEvent.VK_N);
//		robot.keyPress(KeyEvent.VK_I);
//		robot.keyRelease(KeyEvent.VK_I);
//		robot.keyPress(KeyEvent.VK_S);
//		robot.keyRelease(KeyEvent.VK_S);
//		robot.keyPress(KeyEvent.VK_H);
//		robot.keyRelease(KeyEvent.VK_H);
//		robot.keyRelease(KeyEvent.VK_SHIFT);
//		
//		for (int i = 1; i <=1; i++) {
//			
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//		}
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyPress(KeyEvent.VK_I);
//		robot.keyRelease(KeyEvent.VK_I);
//		robot.keyPress(KeyEvent.VK_N);
//		robot.keyRelease(KeyEvent.VK_N);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_I);
//		robot.keyPress(KeyEvent.VK_SHIFT);		
//		robot.keyPress(KeyEvent.VK_PERIOD);
//    robot.keyRelease(KeyEvent.VK_PERIOD);
//    
//    robot.keyRelease(KeyEvent.VK_SHIFT);
//    robot.keyPress(KeyEvent.VK_SHIFT);	
//    robot.keyPress(KeyEvent.VK_MINUS);
//    robot.keyRelease(KeyEvent.VK_MINUS);
//    robot.keyRelease(KeyEvent.VK_SHIFT);	
//    
//    robot.keyPress(KeyEvent.VK_S);
//    robot.keyRelease(KeyEvent.VK_S);
//    robot.keyPress(KeyEvent.VK_SHIFT);
//    robot.keyPress(KeyEvent.VK_2);
//    robot.keyRelease(KeyEvent.VK_2);
//    robot.keyRelease(KeyEvent.VK_SHIFT);
//    
//    
}
//	
//	
//	
//	
}
