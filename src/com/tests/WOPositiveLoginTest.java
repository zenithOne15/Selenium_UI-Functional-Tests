package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.BrowserUtils;



public class WOPositiveLoginTest {
	
	WebDriver driver;
	String chromePath ="C:\\Users\\Janara\\Documents\\Selenium\\selenium dependencies\\drivers\\chromedriver.exe";
			
	@BeforeClass
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void positiveLoginTest() throws InterruptedException {
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
		
		BrowserUtils brow = new BrowserUtils();
		String title1 = driver.getTitle();
		String title2 = "Web Orders Login";
		brow.verifyTitleMatches(driver, title1, title2);
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(2000);
		String webTitle = driver.getTitle();
		brow.verifyTitleMatches(driver, webTitle , "Web Orders");
		
		String url = driver.getCurrentUrl();
		String url2 = "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/";
		brow.verifyURLMatches(driver, url, url2);
		}
	
		
	
	
}
