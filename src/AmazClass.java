import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazClass {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/\r\n" );
//	
//	WebElement txx = driver.findElement(By.id("twotabsearchtextbox"));
//	txx.sendKeys("iphone");
//	
//
//	
//	WebElement txt = driver.findElement(By.id("nav-search-submit-button"));
//	
//	txt.click();
	
	WebElement txt = driver.findElement(By.xpath("//a[@class ='nav_a' ]"));

	
	String text = txt.getText();
	System.out.println(text);
	
}
	
	
	
}
