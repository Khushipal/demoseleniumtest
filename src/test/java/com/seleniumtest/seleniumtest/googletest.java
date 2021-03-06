package com.seleniumtest.seleniumtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

	public class googletest {
		private WebDriver driver;

		@Test(priority=0) 
		public void testJbkTitle() throws InterruptedException {
		    driver.get("http://www.google.com"); 
		    String title = driver.getTitle(); 
		    Thread.sleep(5000);
		    System.out.println(title);
		    Assert.assertEquals(title,"Google");
		    Thread.sleep(5000);
		   
		}
 
			@BeforeTest
			public void beforeTest() {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
			 driver = new ChromeDriver();
			}

			@AfterTest
			public void afterTest() {
				driver.quit();
			}
		}

