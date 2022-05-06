package com.ayya.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ayya.LaunchBrowser.DriverManager;
import com.ayya.constants.Constants;
import com.ayya.page.objects.Homepage;
import com.ayya.page.objects.LoginPage;
import com.ayya.stepDefinitions.CommonStepDefintions;

public class CommonUtils {
	
	private static CommonUtils commonutilsInstance;
	
	private CommonUtils() {
		
	}
	public static CommonUtils getCommonInstance() {
		if(commonutilsInstance==null) {
			commonutilsInstance=new CommonUtils();
		}
		return commonutilsInstance;
	}
	
	public void loadProperities() {
		Properties properties=new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Constants.App_url=properties.getProperty("App_url");
		Constants.Browser=properties.getProperty("Browser");
		Constants.username=properties.getProperty("username");
		Constants.password=properties.getProperty("password");
		Constants.Project=properties.getProperty("Project");
		Constants.Title=properties.getProperty("Title");
		Constants.Description=properties.getProperty("Description");
		Constants.Chrome_Location=properties.getProperty("Chrome_Location");
		Constants.Firefox_Location=properties.getProperty("Firefox_Location");
		Constants.Edge_Location=properties.getProperty("Edge_Location");
		Constants.Opera_Location=properties.getProperty("Opera_Location");
		System.out.println(Constants.App_url);
	}
	public void initElemetns() {
		PageFactory.initElements(DriverManager.getDriver(),LoginPage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),Homepage.getinstanceHomePage());
	}
	public void takeScreenshot() {
		TakesScreenshot ts=(TakesScreenshot)DriverManager.getDriver();
		try {
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File(CommonStepDefintions.getScenario()+".png"));
		}catch(IOException e) {
			CommonUtils.getCommonInstance().takeScreenshot();
		}
	}
	public void highlightElement(WebElement webelement) {
		JavascriptExecutor js=(JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].setAttribute('style','border:3px solid red');", webelement);
	}
	









}




	


