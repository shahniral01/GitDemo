package childPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Setting system property
				System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				
				
				// Navigating to URL & get title
				driver.get("https://the-internet.herokuapp.com/");
				
				// Maximize Parent Window
				driver.manage().window().maximize();
				
				//Click on Element
				driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
				//driver.findElement(By.linkText("Multiple Windows")).click();
				
				//Click on Element and open New Window
				driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
				//driver.findElement(By.cssSelector("a[href*='windows']")).click();
				
				//Getting Parent and child window id using set concept
				Set<String> ids = driver.getWindowHandles();
				Iterator<String> it = ids.iterator();
				String parentWindow = it.next();
				String childWindow = it.next();
				
				//Switching to child window
				driver.switchTo().window(childWindow);
				String childText = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();
				//System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
				System.out.println(childText);
				
				//Switching to Parent window
				driver.switchTo().window(parentWindow);
				String parentText = driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText();
				//System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
				System.out.println(parentText);
				
				//Closing child window
				driver.close();
				
				//quite Browser
				driver.quit();
	}

}
