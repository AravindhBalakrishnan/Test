package Task1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMLoginTest {
    WebDriver driver;
    @BeforeTest
   public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe");
        driver= new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void VerifyTitle() {
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
    }

    @Test
    public void VerifyURL() {
        String pageUrl = driver.getCurrentUrl();
        System.out.println("Page URL: " + pageUrl);
    }

    @Test
    public void VerifyUsername() {
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        usernameField.sendKeys("Admin");
    }

    @Test
    public void VerifyPassword() {
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        passwordField.sendKeys("admin123");
    }

    @Test
    public void VerifyclickLogin() {
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        loginButton.click();
    }

    
}
