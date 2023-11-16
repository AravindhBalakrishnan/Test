package Task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
	      
	    driver.manage().window().maximize(); 
	      
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	    File scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    org.openqa.selenium.io.FileHandler.copy(scr,new File("C:\\Users\\ADMIN\\Desktop\\takes\\fb.jpg"));
	    //FileHandler.copy(scr,new File("C:\\Users\\ADMIN\\Desktop\\takes\\fb.jpg"));
	}

}
