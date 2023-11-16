package Task1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffDateOfBirthDropdown {
	public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        WebElement day =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		
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
		
		WebElement month =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		
		Select r= new Select(month);
		r.selectByVisibleText("JAN");
		
		List<WebElement> m =r.getOptions();
		int b=m.size();
		System.out.println(b);   //total size in month = 12
		
		for(int i=0;i<=b-1;i++)
		{
			String k=m.get(i).getText();
			System.out.println(k);     //Jan ------Dec
		}
		
		System.out.println("-----------year---------");
		
	       WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
			
			Select j= new Select(year);
			j.selectByValue("2005");
			
			List<WebElement> y =j.getOptions();
			int c=y.size();
			System.out.println(c);   //total size in year = 120
			
			for(int i=0;i<=c-1;i++)
			{
				String v=y.get(i).getText();
				System.out.println(v); 
			}
			
			System.out.println("-----------Country---------");
			
		       WebElement con=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		       
				Select jj= new Select(con);
		       jj.selectByVisibleText("India");
								
				List<WebElement> yy =jj.getOptions();
				int dd=y.size();
				System.out.println(dd);   
				
				for(int i=0;i<=dd-1;i++)
				{
					String v=yy.get(i).getText();
					System.out.println(v); 		
	}	
				System.out.println("-----------City---------");
				
			       WebElement city=driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
					
					Select ji= new Select(city);
					 ji.selectByValue("Vellore");
									
					List<WebElement> yz =ji.getOptions();
					int dc=y.size();
					System.out.println(dc);  
					
					for(int i=0;i<=dc-1;i++)
					{
						String v=yz.get(i).getText();
						System.out.println(v); 		
		}		
	}}

