package automatonFramework;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
public class TestNG {
	
	
	public WebDriver driver;
	
  @Test
  public void main() throws InterruptedException {
  
  driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
  
  Thread.sleep(5000);
  
  driver.navigate().back();
  
  Thread.sleep(5000);
  
  driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Simla");
  
  Thread.sleep(5000);
    
  
  
  }
  
  
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
  

    // System.setProperty("webdriver.chrome.driver", "C:\\Users\\kys\\Downloads\\chromedriver_win32\\chromedriver.exe");
  
	 //driver = new ChromeDriver();
	 
	  driver = new FirefoxDriver();
	  
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.get("https://www.google.com/");
	
	 
	 
  }
	
	
	
	
	 
  
  
  @AfterMethod
  public void afterMethod() {
	  
	  //CLose th driver
	  
	  driver.close();
  }

}
