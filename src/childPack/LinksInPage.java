package childPack;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Setting system property
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigating to URL
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// Get link present in the web page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Get link present in footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// Get link present in coloumn
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// Click on Each link present in the cloumn
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			String clickElement = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickElement);
			Thread.sleep(5000L);
		}

		// Go to all window and get the title
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
