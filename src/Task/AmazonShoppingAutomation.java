package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShoppingAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
   
        driver.get("https://www.amazon.in/");

    
        WebElement signInButton = driver.findElement(By.id("nav-link-accountList"));
        signInButton.click();

        WebElement emailField = driver.findElement(By.id("ap_email"));
        emailField.sendKeys("your_email@example.com");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("your_password");

        WebElement signInSubmitButton = driver.findElement(By.id("signInSubmit"));
        signInSubmitButton.click();

        // Search for "Iphone14"
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Iphone14");
        searchBox.submit();

        // Click the iPhone 14 product
        WebElement productLink = driver.findElement(By.partialLinkText("iPhone 14"));
        productLink.click();

        // Select quantity 3 and add to cart
        WebElement quantityDropdown = driver.findElement(By.id("quantity"));
        quantityDropdown.sendKeys("3");

        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();

        // Go to the cart
        WebElement cartLink = driver.findElement(By.id("nav-cart"));
        cartLink.click();

        // Log out
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        accountList.click();

        WebElement signOutButton = driver.findElement(By.id("nav-item-signout"));
        signOutButton.click();

        driver.quit();
    }
}
