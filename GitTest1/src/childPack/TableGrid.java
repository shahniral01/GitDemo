package childPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		// Setting system property
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigating to URL & get title
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22775/nz-vs-ind-3rd-t20i-india-tour-of-new-zealand-2020");
		
		// Maximize Parent Window
		driver.manage().window().maximize();
				
		//Restricting To Required Table Only
		WebElement table =  driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		//Getting Number of Row in the table
		int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		
		//Getting Number of Coloumn in the table
		int columnCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		//Getting text of column
		for (int i = 0; i < columnCount-2; i++) 
		{
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueInt = Integer.parseInt(value);  //Convert string to int
			sum = sum+valueInt;	
		}
		
		//System.out.println(sum);
		
		//Getting Extra
		String extra = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText();
		int extraInt = Integer.parseInt(extra);  //Convert string to int
		//System.out.println(extraInt);
		
		//Getting Total
		String total = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText();
		int totalInt = Integer.parseInt(total);  //Convert string to int
		//System.out.println(totalInt);
		
		//Getting Actual Score
		int teamScore = sum+extraInt;
		System.out.println("Actual Score: " +teamScore);
		
		//Is Score Matched?
		if (teamScore == totalInt) 
		{
			System.out.println("Score Matched");
		}
		else 
		{
			System.out.println("Score did not Matched");
		}
		
		//Closing child window
		driver.close();
				
		//quite Browser
		driver.quit();
	}

}
