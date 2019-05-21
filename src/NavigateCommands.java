import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kys\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver =  new ChromeDriver();
		
		//Open ToolsQA website
		
		String appUrl = "https://www.google.co.in/";
		driver.get(appUrl);
		
		//Click on gmail link
		
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		
		// Go back to Home page 
		
		driver.navigate().back();
		
		//Go forward to gmail link page
		
		driver.navigate().forward();
		
		//Go back to home page 
		
		driver.navigate().to(appUrl);
		
		//Referesh the browser
		driver.navigate().refresh();
		
		//Close the browser
		driver.close();
		
		
		
		
		
		
	}

}
