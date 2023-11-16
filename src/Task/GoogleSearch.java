package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("java 8 ");
	
		List<WebElement> r = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li[2]"));
	    
		for(WebElement aa:r)
		{
			if(aa.getText().equals("java 8"))
			{
				Thread.sleep(2000);
				aa.click();
			}
		}
        
     }
}

