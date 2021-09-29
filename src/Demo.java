import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Demo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Class name = Chromedriver
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String Title = driver.getTitle();
		System.out.println(Title);
	    String sourceCode = driver.getPageSource();
	    System.out.println(sourceCode);
	    
	    
	 /* Navigate to Selenium Hq */
	    
	    driver.get("https://www.selenium.dev/");
	    driver.navigate().back();
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	//  driver.quit();
	 	driver.close();
		
	}

}
