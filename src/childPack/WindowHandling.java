package childPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Setting system property
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigating to URL & get title
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		//Getting title of Parent window
		System.out.println(driver.getTitle());
		
		// Maximize Parent Window
		driver.manage().window().maximize();
		
		// Click on Child URL
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		//Getting Parent and child window id using set concept
		Set<String>ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		//Printing the windows id
		System.out.println(parentWindow);
		System.out.println(childWindow);

		//Switching to child window
		driver.switchTo().window(childWindow);
			
		// Maximize Parent Window
		driver.manage().window().maximize();
		
		//Getting title of child window
		System.out.println(driver.getTitle());
		
		//Closing child window
		driver.close();
		
		//quite Browser
		driver.quit();
		
		
		
	}

}
