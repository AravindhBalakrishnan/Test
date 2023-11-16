package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");	
		
		driver.manage().window().maximize(); 
		
		Thread.sleep(3000);

		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.close();
	    
	}

}
