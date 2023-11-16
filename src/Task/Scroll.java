package Task;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.gsmarena.com");
	      
	    driver.manage().window().maximize(); 
	      
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	      
	    js.executeScript("window.scrollBy(0,1000)");  
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,-1000)");  
	    Thread.sleep(2000);

	}

}
