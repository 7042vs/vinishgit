import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleClass {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	WebElement txt = driver.findElement(By.name("q"));
	
	txt.sendKeys("GreensTechnology");

String title = driver.getTitle();

System.out.println(title);

String currentUrl = driver.getCurrentUrl();

System.out.println(currentUrl);

	
}
	
	
}
