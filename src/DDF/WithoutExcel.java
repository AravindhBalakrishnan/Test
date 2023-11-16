package DDF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class WithoutExcel {
	WebDriver driver = new ChromeDriver();
    
	   @BeforeTest
	   public void Setup()
	   {
    		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	   }
    
    @Test(dataProvider ="b")
    public void Verifytest(String username,String password) throws InterruptedException
    {
    	driver.findElement(By.xpath("//input[@id='email']")).clear();
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@id='pass']")).clear();
    	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
    	Thread.sleep(2000);
    }
    
    
    
	   @AfterTest
	   public void Tear()
	   {
		   
		   driver.close();
	   }
	   
	   @DataProvider(name="a")
	   public Object[][] getdata()
	   {
		   Object[][] ob = new Object[4][2];
		   
		   ob[0][0]="cts@gmail.com";
		   ob[0][1]="w123";
		   
		   ob[1][0]="amazon@gmail.com";
		   ob[1][1]="java";
		   
		   ob[2][0]="infosys@gmail.com";
		   ob[2][1]="456";
		   
		   ob[3][0]="tcs@gmail.com";
		   ob[3][1]="automation";
		   
		   return ob;
	   }
	   
	   @DataProvider(name="b")
	   public Object[][] getdata1()
	   {
		   Object[][] ob = new Object[6][2];
		   
		   ob[0][0]="cts@gmail.com";
		   ob[0][1]="w123";
		   
		   ob[1][0]="amazon@gmail.com";
		   ob[1][1]="java";
		   
		   ob[2][0]="infosys@gmail.com";
		   ob[2][1]="456";
		   
		   ob[3][0]="tcs@gmail.com";
		   ob[3][1]="automation";
		   
		   ob[4][0]="info@gmail.com";
		   ob[4][1]="script";
		   
		   ob[5][0]="zoho@gmail.com";
		   ob[5][1]="pass12";
		   
		   return ob;
	   }
	   
}
