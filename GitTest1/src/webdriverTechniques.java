import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webdriverTechniques {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Static drop down
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		Thread.sleep(2000);
		s.selectByValue("USD");
		
		// Handling drop down - Which having Add/Substract ICON
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
	
		int i = 1;
		while (i<5) 
		{
			driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();   
			
			i++;
		}
		
		/*
		for (int j = 1; j < 5; j++)
		{
			driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();  
		}
		*/

		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
	//  Parent Child Xpath
		driver.findElement(By.xpath("(//td[@class='mapbg'])[2] //a[@value='MAA']")).click();
		
		
		
	}

}
