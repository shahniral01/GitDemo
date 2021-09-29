import java.awt.List;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCART {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// Array of Cart Element which you want to search
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(5000);
		addItems(driver,itemsNeeded);	
		
		// If user want to use any child method then they to create parent object, if method is statis then no need to create oject of parent
		//AddToCART a=new AddToCART();
		//a.addItems(driver, itemsNeeded);
	
		// Click on Add to CART and proceeds to checkout
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".promoBtn")).click();
		Thread.sleep(4000);
		driver.close();
		
		//Explict Wait
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
			}
	
	
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		
		java.util.List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));

		for (int i = 0; i < products.size(); i++) {
			//Array of String
			// Brocolli - 1 Kg
			// name[0] - Brocolli
			// name[1] - - 1kg
			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();
			
			
			// Convert array into array list for easy search
			// Check Weather name extracted is present in arraylist or not

			java.util.List<String> itemNeededList = Arrays.asList(itemsNeeded);

			if (itemNeededList.contains(formattedname))
			{
				int j=0;
				j++;
				// Click on Add To Cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		
				//As three items are there it will execute 3 time only so why so we go for check 30 iterations
				if (j==itemsNeeded.length)
				{
					break;
				}
				
			}
			
				//driver.close();
		}


		
	}

}
