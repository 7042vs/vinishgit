import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaClass {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en)");
		
		Thread.sleep(2000);
		
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("vinish");
		
		WebElement pass = driver.findElement(By.name("password"));
		 pass.sendKeys("vinish1234");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
