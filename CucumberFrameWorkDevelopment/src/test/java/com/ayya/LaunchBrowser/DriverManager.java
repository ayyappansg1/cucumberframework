package com.ayya.LaunchBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.ayya.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	private static WebDriver driver=null;
	public static void launchBrowser() {
		try {
			switch (Constants.Browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));				
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
				break;
			case "opera":
				WebDriverManager.operadriver().setup();
				driver=new OperaDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}}
	public static WebDriver getDriver() {
		return driver;
	}
	
}
