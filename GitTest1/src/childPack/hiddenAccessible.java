package childPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Objective: Enter the letters BENG, Verify if Airport option is displayed in the suggestive box */

public class hiddenAccessible {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Variable
		String city = "BENGALURU INTERNATION AIRPORT";

		// Setting system property
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigating to URL & get title
		driver.get("https://ksrtc.in/oprs-web/");

		// Maximize Parent Window
		driver.manage().window().maximize();

		// General form of getting text
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		Thread.sleep(5000L);
		// driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		// System.out.println(driver.findElement(By.id("fromPlaceName")).getText());

		// Javascript DOM can extract hidden elements
		// because selenium cannot identify hidden elements - (Ajax implementation)
		// investigate the properties of object if it have any hidden text

		// JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// URL = "https://www.w3schools.com/js/js_htmldom.asp"
		// return = System.out.println();
		// Document = driver
		// getElementById = findElement(By.id());
		// value = getText();
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);

		// BENGALURU INTERNATION AIPORT

		int i = 0;

		while (!text.equalsIgnoreCase(city)) {
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);

			text = (String) js.executeScript(script);
			System.out.println(text);

			if (i > 10) {
				break;
			}
		}

		if (i > 10) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element Found");
		}

		// Closing child window
		driver.close();

		// quite Browser
		driver.quit();

	}

}
