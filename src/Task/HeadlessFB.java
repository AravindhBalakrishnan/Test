package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessFB {
	public static void main(String[] args) 
	
	{
	
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");

        // Find the "Create Account" button and get its text
        WebElement createAccountButton = driver.findElement(By.id("u_0_0"));
        String buttonText = createAccountButton.getText();

        System.out.println("Text of the 'Create Account' button: " + buttonText);
		
		
		
}
}
