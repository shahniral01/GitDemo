import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.*;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// Opening URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Get Page text
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Practice Page')]")).getText());

		// Radio Button Example
		driver.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[2]/input")).click();

		// Suggession Class Example
		driver.findElement(By.id("autocomplete")).sendKeys("IND");
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("INDIA")) {
				option.click();
				break;
			}
		}
		
		//Dropdown Example
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByIndex(2);
		
		//Checkbox
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption2")).isSelected());
		driver.findElement(By.id("checkBoxOption2")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption2")).isSelected());
		

		// Close Browser
		// driver.close();

	}

}
