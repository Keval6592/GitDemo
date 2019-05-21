package automatonFramework;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Reporter;

import org.testng.annotations.Test;

import utility.Log;

public class ReporterLogs {

	private static WebDriver driver;

	private static Logger Log = Logger.getLogger(Log.class.getName());

    @Test

	public static void test() {

		DOMConfigurator.configure("log4j.xml");

        driver = new FirefoxDriver();

        Log.info("New driver instantiated");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Log.info("Implicit wait applied on the driver for 10 seconds");

        driver.get("http://ce-rc.westeurope.cloudapp.azure.com/CivicaAt/Core/Forms/Default/Login.aspx");

        Log.info("Civica application launched");

        // Our first step is complete, so we produce a main event log here for our reports.

        Reporter.log("Application Lauched successfully | ");

      //  driver.findElement(By.xpath(".//*[@id='account']/a")).click();

        Log.info("Click aon use name field");

        driver.findElement(By.id("txtLogin")).sendKeys("keval");

        Log.info("Username entered in the Username text box");

        driver.findElement(By.id("txtPassword")).sendKeys("civica");

        Log.info("Password entered in the Password text box");

        driver.findElement(By.id("imgbtnLogin")).click();

        Log.info("Click action performed on Login button");

        // Here we are done with our Second main event

        Reporter.log("Sign In Successful | " );

        driver.findElement(By.xpath("//*[@id=\'Cell_Logout\']/span[2]/a"));

        Log.info("Click action performed on Log out link");

        driver.quit();

        Log.info("Browser closed");

        // This is the third main event

        Reporter.log("User is Logged out and Application is closed | ");

	}

}