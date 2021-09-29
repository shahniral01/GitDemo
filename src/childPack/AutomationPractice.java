package childPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.transform.Source;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Setting system property
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
		// Navigating to URL & get title
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#top");
		driver.manage().window().maximize();  
  
		// Radio Button Example
		System.out.println("Radio Button is Selected: "
				+ driver.findElement(By.xpath("//div[@class='left-align']/fieldset/label[2]")).isSelected());
		driver.findElement(By.xpath("//div[@class='left-align']/fieldset/label[2]/input")).click();
		System.out.println("Radio Button Count: "
				+ driver.findElements(By.xpath("//div[@class='left-align']/fieldset/label/input")).size());

		// Dropdown Example
		Select s = new Select(driver.findElement(By.xpath("//select[contains(@name,'dropdown-class-ex')]")));
		s.selectByValue("option2");

		// Auto Sugestive Class Example
		WebElement source = driver.findElement(By.cssSelector("input[id*='autocom']"));
		source.clear();
		source.sendKeys("IND");
		Thread.sleep(2000L);
		for (int i = 0; i < 2; i++) {
			source.sendKeys(Keys.ARROW_DOWN);
		}
		source.sendKeys(Keys.ENTER);

		// Checkbox Example
		driver.findElement(By.cssSelector("[id='checkBoxOption2']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='checkBoxOption2']")).isSelected());

		
		//Switch To Alert Example
		// First type of Alert
		driver.findElement(By.xpath("//*[contains(@id,'alertbtn')]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(5000);

		// Second Type of Alert
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		//Switch Window Example
		driver.findElement(By.cssSelector("button#openwindow")).click();
		Set<String>swe = driver.getWindowHandles();  
		Iterator<String> it = swe.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		System.out.println(parentWindow);
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);  //Switch to child window
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		driver.switchTo().window(parentWindow);  //Switch to parent window
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		
		//Switch Tab Example
		driver.findElement(By.xpath("//*[@class='switch-tab']/following-sibling::a")).click();
		Set<String> ste = driver.getWindowHandles();
		Iterator<String> i = ste.iterator();
		while (i.hasNext()) 
		{
			driver.switchTo().window(i.next());
			System.out.println(driver.getTitle());
			
		}

		//iFrame Example
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.switchTo().defaultContent();
		
		
		//Mouse Hover Example
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("mousehover")));
		
		
		//Closing child window
		driver.close();
		
		//quite Browser
		driver.quit();
		
	}

}
