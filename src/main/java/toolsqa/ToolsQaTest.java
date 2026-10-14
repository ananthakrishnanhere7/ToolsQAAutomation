package toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToolsQaTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUP() {
		
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
	}
	
	@Test
	public void playground() {
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div/div[3]/div/div[1]/ul/li[3]/a")).click();
		String newWindow = driver.getWindowHandle();
		driver.switchTo().window(newWindow);
	
	}
	
	
	

}
