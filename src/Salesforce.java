import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://login.salesforce.com/?locale=in");
		d.findElement(By.id("username")).sendKeys("TestUser");
		d.findElement(By.name("pw")).sendKeys("TestPW");
	//	d.findElement(By.className("button r4 wide primary")).click();
		d.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println(d.findElement(By.cssSelector("#error")).getText());
		d.quit();
		
	}

}
