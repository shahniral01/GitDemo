import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FindingLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		
	   WebDriver driver = new ChromeDriver();
		
	   driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	  /*
	   System.out.println(driver.findElement(By.xpath("//*[text() = 'Practice']")).getText());
	   System.out.println(driver.findElement(By.xpath("//div//button[2]")).getText());
	   System.out.println(driver.findElement(By.xpath("//input[@id = 'hide-textbox']//following-sibling::input")).getText());
       System.out.println(driver.findElement(By.xpath("//input[@id = 'alertbtn']/parent::fieldset")).getText());
	   System.out.println(driver.findElement(By.cssSelector("[id = 'hide-textbox']")).getText());
	   driver.close();
	   */
	   
	   //Auto Sugestive drop down
	   WebElement Auto = driver.findElement(By.id("autocomplete"));
	   Auto.sendKeys("ind");
	   int i = 1;
	   while (i<=3) 
	   {
		   Auto.sendKeys(Keys.ARROW_DOWN); 
		   
		   i++;
	   }
	   
	   Thread.sleep(2000);	  
	   Auto.sendKeys(Keys.ENTER);
	   Auto.sendKeys(Keys.TAB);
	   
	   // Handling Check box
	   WebElement check = driver.findElement(By.id("checkBoxOption2"));
	   System.out.println(check.isSelected());
	   check.click();
	   Thread.sleep(2000);
	   Assert.assertTrue(check.isSelected());
	   
	   // Get Number of checkbox in screen
	 System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());
	}

}
