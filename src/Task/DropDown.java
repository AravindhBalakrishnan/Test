package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s= new Select(day);
		s.selectByIndex(15);
		
		List<WebElement> d =s.getOptions();
		int a=d.size();
		System.out.println(a);   //total size in day = 31
		
		for(int i=0;i<=a-1;i++)
		{
			String f=d.get(i).getText();
			System.out.println(f);     //1 to 31
		}
		
		System.out.println("-----------month---------");
		
       WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
		
		Select r= new Select(month);
		r.selectByVisibleText("Dec");
		
		List<WebElement> m =r.getOptions();
		int b=m.size();
		System.out.println(b);   //total size in month = 12
		
		for(int i=0;i<=b-1;i++)
		{
			String k=m.get(i).getText();
			System.out.println(k);     //Jan ------Dec
		}
		
		System.out.println("-----------year---------");
		
	       WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
			
			Select j= new Select(year);
			j.selectByValue("2005");
			
			List<WebElement> y =j.getOptions();
			int c=y.size();
			System.out.println(c);   //total size in year = 120
			
			for(int i=0;i<=c-1;i++)
			{
				String v=y.get(i).getText();
				System.out.println(v);     //2023-------1905
			}
	}

}
