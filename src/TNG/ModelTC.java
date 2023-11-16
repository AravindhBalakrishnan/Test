package TNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ModelTC {
	   WebDriver driver=new ChromeDriver();
	   @BeforeTest
	   public void Setup()
	   {
		   	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	   }
	   @Test
	   public void Verifyemail()
	   {
		   driver.findElement(By.xpath("//input[@ name='email']")).sendKeys("ABC");
	   }
	   
	   @Test
	   public void VerifyPass()
	   {
		   driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("CAT");
	   }
	   @Test
	   public void VerifyCLick()
	   {
		   driver.findElement(By.xpath("//button[@name='login']")).click();
	   }
	   	   
	   @Test
	   public void VerifyTitle()
	   {
		   String t=driver.getTitle();
		   System.out.println(t);
	   }
	   
	   @Test
	   public void VerifyUrl()
	   {
		   String u=driver.getCurrentUrl();
		   System.out.println(u);
	   }
	   	   
	   
	}


