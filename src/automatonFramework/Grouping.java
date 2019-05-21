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

public class Grouping {
	
@Test (groups = {"Car"})
public void Car1()
{
	System.out.println("Batch Car - Test car 1");
}

@Test (groups = {"Car"})
public void Car2()
{
	System.out.println("Batch Car - Test car 2");
}
	

@Test (groups = {"Scooter"})
public void Scooter1()
{
	System.out.println("Baych Scooter - test scooter 1");
}

@Test (groups = {"Scooter"})
public void Scooter2()
{
	System.out.println("Baych Scooter - test scooter 2");
}

@Test (groups = {"Car", "Scooter"})
public void Sedan1()
{
	System.out.println("Batch sedan Car - test sedan1");
}

}
