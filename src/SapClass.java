import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SapClass {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webderiver.chrome.driver","C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.snapdeal.com/login");
		WebElement na = driver.findElement(By.className("col-xs-24"));
		na.sendKeys("9489407042");
		
		
		
		
	}
	
	
	
	

}
