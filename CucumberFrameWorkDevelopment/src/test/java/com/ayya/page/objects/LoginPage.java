package com.ayya.page.objects;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ayya.LaunchBrowser.DriverManager;
import com.ayya.utilities.CommonUtils;

public class LoginPage {
	private static Logger LOGGER=LogManager.getLogger(LoginPage.class);
	private static LoginPage logininstance;
	
	private LoginPage() {
		
	}
	public static LoginPage getInstance() {
		LOGGER.info("sangar dude");
		if(logininstance==null) {
		logininstance=new LoginPage();
		}
		return logininstance;
	}
	@FindBy(xpath="//a[text()='Login']")
	private WebElement SIGN_IN;
	@FindBy(id="normal_login_userName")
	private WebElement USERNAME;
	@FindBy(id="normal_login_password")
	private WebElement PASSWORD;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement LOGIN_BUTTON;
	
	@FindBy(xpath="//*[@id=\"tcNewPages\"]/div/main/div/section/section/aside/div/div/span/ul/li[1]/div[1]")
	private WebElement CLICK_PROJECT;

	@FindBy(xpath="//a[text()='Projects']")
	private WebElement CLICK_PROJECTS;
	
	@FindBy(xpath="//a[text()='Amazon']")
	private WebElement CLICK_AMAZON;

	@FindBy(xpath="//span[text()='Test Cases']")
	private WebElement BEFORE_TESTCASE;
	@FindBy(xpath="//a[text()='Add Test Case']")
	private WebElement AFTER_TESTCASE;
	@FindBy(id="test_case_add_title")
	private WebElement TITLE;
	@FindBy(xpath="//*[@id=\"tc-add\"]/div[3]/div[2]/div/span/div/div/div/div[2]/div[1]/p")
	private WebElement DESCRIPTION;
	@FindBy(xpath="//span[text()='Save Test Case']")
	private WebElement SAVE_TEST_CASE;
	
	public void clickSignin() {
		CommonUtils.getCommonInstance().highlightElement(SIGN_IN);
		SIGN_IN.click();
	}
	public void enterUsername(String username) {
		CommonUtils.getCommonInstance().highlightElement(USERNAME);
		USERNAME.sendKeys(username);
	}
	public void enterPassword(String password) {
		CommonUtils.getCommonInstance().highlightElement(PASSWORD);
		PASSWORD.sendKeys(password);
	}
	public void clickLoginButton() {
		CommonUtils.getCommonInstance().highlightElement(LOGIN_BUTTON);
		LOGIN_BUTTON.click();
	}
	
	public void clickProject() {
		CommonUtils.getCommonInstance().highlightElement(CLICK_PROJECT);
		CLICK_PROJECT.click();
	}
	public void clickProjects() {
		CommonUtils.getCommonInstance().highlightElement(CLICK_PROJECTS);
		CLICK_PROJECTS.click();
	}
	public void clickAmazon() {
		CommonUtils.getCommonInstance().highlightElement(CLICK_AMAZON);
		CLICK_AMAZON.click();
	}
	public void before() {
		CommonUtils.getCommonInstance().highlightElement(BEFORE_TESTCASE);
		BEFORE_TESTCASE.click();
	}
	public void after() {
		CommonUtils.getCommonInstance().highlightElement(AFTER_TESTCASE);
		AFTER_TESTCASE.click();
	}
	
	
	public void enterTitle(String title) {
		CommonUtils.getCommonInstance().highlightElement(TITLE);
		TITLE.sendKeys(title);
	}
	public void enterDescription(String description) {
		CommonUtils.getCommonInstance().highlightElement(DESCRIPTION);
		DESCRIPTION.sendKeys(description);
	}
	public void clickSaveTestCase() {
		try {
		CommonUtils.getCommonInstance().highlightElement(SAVE_TEST_CASE);
		SAVE_TEST_CASE.click();
	}catch(Exception e){
		System.out.println("Element is not clickable");
		CommonUtils.getCommonInstance().takeScreenshot();
		try {
			WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(SAVE_TEST_CASE));
		}catch(Exception e2) {
			e2.printStackTrace();
	}
	}}}
