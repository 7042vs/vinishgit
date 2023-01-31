import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ClassFB {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://traininginchennai.in/selenium-training-in-chennai.html");
		
	String title = driver.getTitle();
	System.out.println(title);
		
		
		String currentUrl = driver.getCurrentUrl();
	
		  System.out.println(currentUrl);
	       WebElement tt = driver.findElement(By.id("overview-tab"));
		tt.click();
	  WebElement txt = driver.findElement(By.xpath("//p[contains(text(),'Greens')]"));
		  String text = txt.getText();
		  System.out.println(text);
////		  
//          txt.sendKeys("iphone");		
//        
//         WebElement tt = driver.findElement(By.id("nav-search-submit-button")[]);
//		tt.click();
//		
		  
		
		
          
	}

}
