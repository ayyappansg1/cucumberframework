package com.ayya.stepDefinitions;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.ayya.LaunchBrowser.DriverManager;
import com.ayya.constants.Constants;
import com.ayya.page.objects.Homepage;
import com.ayya.page.objects.LoginPage;
import com.ayya.utilities.CommonUtils;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CommonStepDefintions {
	private static String scenarioName;
	public static String getScenario() {
		return scenarioName;
	}
	
	public static WebDriver driver;
	private static final Logger LOGGER=LogManager.getLogger(CommonStepDefintions.class);
	@Before
	public void beforeScenario(Scenario scenario) {
		LOGGER.info("Execution Started");
		try {
			LOGGER.info("Initiating common values");
			CommonUtils.getCommonInstance().loadProperities();
			CommonUtils.getCommonInstance().initElemetns();
			LOGGER.info("Loading values inside");
			scenarioName = scenario.getName();

			if(DriverManager.getDriver()==null) {
				DriverManager.launchBrowser();
				LOGGER.info("Driver Launching Process");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}}
	
}