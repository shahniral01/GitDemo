package childPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_DragableDroppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting system property
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigating to URL
		driver.get("https://jqueryui.com/droppable/");
		
		//Frame Concept
		
		//driver.switchTo().frame(1); //Switching to particular frame
		
		//Getting number of frame available in the screen
		System.out.println(driver.findElements(By.tagName("iframe")).size());  //Finding No of frame
		
		//Switching to particular frame by locator
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); 

		//Performing action through mouse
		Actions a = new Actions(driver);
		
		//Drag & Drop code
		WebElement source = driver.findElement(By.xpath("//div[contains(@id,'draggable')]"));
		WebElement target = driver.findElement(By.cssSelector("div[id*='droppable']"));
		a.dragAndDrop(source, target).build().perform();
		
		

	}

}
