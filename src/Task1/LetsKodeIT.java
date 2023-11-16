package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LetsKodeIT {
	WebDriver driver;
	@BeforeTest
	 public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.letskodeit.com/practice");
	        driver.manage().window().maximize();
	    }

	    @Test(priority=1)
	    public void VerifyRadioButton() {
	        WebElement radioButton = driver.findElement(By.id("bmwradio"));
	        radioButton.click();
	        Assert.assertTrue(radioButton.isSelected(), "Radio button should be selected.");
	    }

	    @Test
	    public void VerifyCheckBox() {
	        WebElement checkBox = driver.findElement(By.id("benzcheck"));
	        checkBox.click();
	        Assert.assertTrue(checkBox.isSelected(), "Check box should be selected.");
	    }

	    @Test
	    public void VerifyCarDropdown() {
	        WebElement dropdown = driver.findElement(By.id("carselect"));
	        Select select = new Select(dropdown);
	        select.selectByValue("honda");
	        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Honda");
	    }
	    
	    
	    
	    @Test
	    public void VerifyFruitDropdown() {
	        WebElement multiSelect = driver.findElement(By.id("//select[@id=\"multiple-select-example\"]"));
	        Select select = new Select(multiSelect);
	        select.selectByValue("orange");
	        Assert.assertEquals(select.getFirstSelectedOption().getText(), "orange");
	      
	    }
	    @Test
	    public void VerifyTextbox() {
	    	JavascriptExecutor js=(JavascriptExecutor)driver;
		      
		    js.executeScript("window.scrollBy(0,1000)");  
	    	WebElement textBox = driver.findElement(By.id("//input[@id=\"autosuggest\"]"));
	    	 textBox.clear();
	         textBox.sendKeys("Hello, Selenium!");
	    }
	  
}
