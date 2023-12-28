package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepBaseClass {
	
	public static WebDriver driver;

	public void setup() {
		driver = new ChromeDriver();
		driver.get("http://gcreddy.com/project/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

	public void tearDown() {
		driver.quit();
		
	}

}
