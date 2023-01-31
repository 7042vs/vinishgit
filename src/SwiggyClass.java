import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyClass {
	
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		
		driver.get("https://www.swiggy.com/");
		
		
		WebElement txt = driver.findElement(By.id("location"));
		txt.sendKeys("chenni");
		
		
	}
	
	
	
	
	
	

}
