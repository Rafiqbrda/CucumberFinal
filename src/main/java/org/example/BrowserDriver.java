package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {
	
	public static WebDriver driver() {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\rafiq\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
	return driver;
	
	}

}
