import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kys\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		String url = "http://www.store.demoqa.com"; // Storing the application url in String variable 
		
		driver.get(url); // Launch Google website 
		
        String title = driver.getTitle(); // Storing title name in the String variable
        
        // Storing title length in the INT variable 
        int titleLength = driver.getTitle().length();
        
        //Print title name & title length in console window 
        System.out.println("Title of the page is :" + title);
        System.out.println("Length of the title is: " + titleLength);
        
        //Storing current URL in String variable 
        String actualUrl = driver.getCurrentUrl();
        
        if (actualUrl.equals(url))
        {
        	System.out.println("Verification Successful - The current Url is opened.");
        }
        else
        {
        	System.out.println("Verification Failed - An incorrect Url is opended");
        
        
        // In case of fail, you like to print the actual and expected URL for the record purpose
        
	System.out.println("Actual URL is:" + actualUrl);
	System.out.println("Expected URL is:" + url);
	
	}
        
        // Storing page source in String variable 
        String pagesource = driver.getPageSource();
        
        //Storing page source length in INT variable
        int pagesourceLength = driver.getPageSource().length();
        
        //Printing length of the page Source on console
        
        System.out.println("Total length of the page Source:" + pagesourceLength);
        
        //Closing browser
        driver.close();
        
	
	
	  
	
	}

}
