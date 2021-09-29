package childPack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Table_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting system property
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigating to URL & get title
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Decending Order
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		// Acending Order
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		// Maximize Parent Window
		driver.manage().window().maximize();

		// Delete Cookies
		driver.manage().deleteAllCookies();

		// Items Coloumn
		List<WebElement> secondColValue = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		// Take it into Array List
		ArrayList<String> originalList = new ArrayList<String>();

		for (int i = 0; i < secondColValue.size(); i++) {
			originalList.add(secondColValue.get(i).getText());
		}

		// Copy original list
		ArrayList<String> copyiedList = new ArrayList<String>();

		for (int i = 0; i < originalList.size(); i++) {
			copyiedList.add(originalList.get(i));
		}

		// Collection Method
		Collections.sort(copyiedList);

		// Collections.reverse(copyiedList);

		System.out.println("***********Copyied List Value*************");
		// Enhanced For Loop to debug the code
		for (String s : copyiedList) // for (int i=0; i<copyiedList.size; i++)
		{
			System.out.println(s);
		}

		System.out.println("***********Original List Value*************");
		for (String s : originalList) // for (int i=0; i<copyiedList.size; i++)
		{
			System.out.println(s);
		}

		// Verifying sorting
		Assert.assertTrue(originalList.equals(copyiedList));

		// Closing child window
		driver.close();

		// quite Browser
		driver.quit();
	}

}
