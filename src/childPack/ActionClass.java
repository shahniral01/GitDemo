package childPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setting system property
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Navigating to URL
		driver.get("https://www.amazon.in/");
		
		//Creating object of Actions class
		Actions a = new Actions(driver);
		
		//Click on search box and enter in capital letter - Use of composite statement
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("AWS").build().perform();
		
		//Creating variable of Webelement 
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		
		//Right click on element
		a.moveToElement(move).contextClick().build().perform();
		
		
		
		
		
		
		

	}

}
