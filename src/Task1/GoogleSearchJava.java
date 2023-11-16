package Task1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchJava {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("java 8");
	
		List<WebElement> r = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li[2]"));
	    
     
       // List<WebElement> r = driver.findElements(By.cssSelector("ul.erkvQe li span"));

       
        for (WebElement ss : r) {
            if (ss.getText().contains("Java 8 download")) {
                ss.click();
                break; 
            }
        }

		}
	}

