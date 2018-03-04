package com.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtils {

	public void verifyTitleMatches(WebDriver driver, String title1, String title2) {
		Assert.assertEquals(title1, title2);
	}
	
	public void titleContains(WebDriver driver, String title, String name) {
		title.contains(name);
	}
	
	public void verifyURLMatches(WebDriver driver, String url1, String url2) {
		Assert.assertEquals(url1, url2);
	}
	
	public void verifyUrlContains(WebDriver driver, String url1, String url2) {
		url1.contains(url2);
	}
	
	
	
	
	
	
}
