package automatonFramework;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
public class TestNG1 {
	
	
	public WebDriver driver;
	
  @Test
  public void testCase1() {
	  
	  System.out.println("This is Test Case1");  
  }
  
  @Test
 public void testCase2() {
	  
	  System.out.println("This is Test Case2");
    }
  
  
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
  

  System.out.println("This will execute before every method ");
	 
	 
  }
	
	
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will execute after every method ");

	 
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("This will execute before the class");
  }
  @AfterClass
  public void afterClass()
  {
	  System.out.println("This will execute after the class");
  }
  
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("This will execute before the test");
  }
  @AfterTest
  public void afterTest()
  {
	  System.out.println("This will execute after the test");
  }
  
  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("This will execute before the suite");
  }
  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("This will execute after the suite");
  }
   
  
  
  
  
  
  
  
  
  

}
