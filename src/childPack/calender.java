package childPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
	

	static String dt = "21";
	static String month = "July";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Setting system property
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigating to URL & get title
		driver.get("https://www.redbus.in/");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Calender Program
		//Click on calender
		driver.findElement(By.id("onward_cal")).click();  
		
		//Select Month
		while (!driver.findElement(By.className("monthTitle")).getText().contains(month))
		{
			driver.findElement(By.className("next")).click();
			break;
			
		}
		
		//Select Date
		List<WebElement> days = driver.findElements(By.xpath("//td[contains(@class,'day')]"));
		int count = days.size();
		for (int i = 0; i < count; i++)
		{
			String text =days.get(i).getText();
			if (text.equalsIgnoreCase(dt))
			{
				days.get(i).click();
			}
			
		}

	}

}
