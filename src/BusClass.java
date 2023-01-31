import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusClass {
	
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("wecdriver.chrome.driver","C:\\Users\\91948\\eclipse-workspace\\ChromeProg\\driver\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/ ");
		
		
		WebElement id = driver.findElement(By.id("src"));
	     id.sendKeys("chenni");	
	     
	     
	     
          WebElement cl = driver.findElement(By.id("dest"));	
	
	      cl.sendKeys("kannyakumari");
	     
	      
	}
	
	
	
	
	
	
	
	
	

}
