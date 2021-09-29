import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Learn Xpath and CSS Selector
Xpath:
//tagname[@attribute = 'value']
//*[@attribute = 'value']

CSS Selector:
tagname[attribute = 'value']
tagname#attribute
tagname.classname

To check on console use belwo syntax
$x("xPath")

*/

public class Facebook {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//input[@name = 'email']")).sendKeys("Test User");
		d.findElement(By.cssSelector("input[type = 'password']")).sendKeys("Test Password");
		d.findElement(By.cssSelector("[value = 'Log In']")).click();

	}

}
