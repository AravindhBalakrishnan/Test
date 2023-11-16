package Task;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions g= new ChromeOptions();
		g.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(g);
		driver.get("https://www.placementstore.com/");
	      
	    driver.manage().window().maximize(); 
	      
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	}

}
