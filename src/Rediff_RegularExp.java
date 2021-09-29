import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

/*
Xpath Regular Expression:
//tagname[contain(@attribute = 'Value')]

CSS Regular Expression:
tagname[attribute* = 'value']
*/


public class Rediff_RegularExp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.rediff.com/");
		d.findElement(By.xpath("//a[contains(@class,'signin')]")).click();
		Thread.sleep(5000);
		d.findElement(By.cssSelector("input#login1")).sendKeys("Test User");
		d.findElement(By.cssSelector("#password")).sendKeys("TestPW");
		d.findElement(By.cssSelector("*[name*='proceed']")).click();
		System.out.println(d.findElement(By.xpath("//*[@id=\"div_login_error\"]/b")).getText());
		d.close();
	}

}
