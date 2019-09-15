package com.test.launchchrome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest{
	
	@Test
	public void login() throws InterruptedException {
	System.out.println("Login into");
	System.out.println("Testing2");
	String baseurl = "https://www.facebook.com/";
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "H:/Selenium/Downloads/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(baseurl);
	Thread.sleep(1000);
	driver.quit();
	
}
}