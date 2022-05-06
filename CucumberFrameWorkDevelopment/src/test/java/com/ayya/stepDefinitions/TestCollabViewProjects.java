package com.ayya.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.ayya.LaunchBrowser.DriverManager;
import com.ayya.constants.Constants;
import com.ayya.page.objects.Homepage;
import com.ayya.page.objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TestCollabViewProjects {
	private static final Logger LOGGER=LogManager.getLogger(TestCollabViewProjects.class);

@Given("the user should enter on Homepage and click on sign in")
public void the_user_should_enter_on_homepage_and_click_on_sign_in() {
	LOGGER.info("User seeing homepage");
	try {
		DriverManager.getDriver().get(Constants.App_url);
		LoginPage.getInstance().clickSignin();
}catch(Exception e) {
	e.printStackTrace();
}}

@Given("should enter on login page with {string} and {string} credentials")
public void should_enter_on_login_page_with_and_credentials(String uname, String pass) {
	LOGGER.info("Eliminated all Findelements by page objects");
	try{
		LoginPage.getInstance().enterUsername(Constants.username);
		LoginPage.getInstance().enterPassword(Constants.password);
		LoginPage.getInstance().clickLoginButton();
}catch(Exception e) {
	e.printStackTrace();
}}

@When("correct credentials passed user should see account page and click on Projects")
public void correct_credentials_passed_user_should_see_account_page_and_click_on_projects() {
	try {
		LoginPage.getInstance().clickProject();
		LoginPage.getInstance().clickProjects();
	
	
}catch(Exception e){
	e.printStackTrace();
}
}
@When("User should click {string}")
public void user_should_click(String string) {
try {
	LoginPage.getInstance().clickAmazon();
	LoginPage.getInstance().before();
	LoginPage.getInstance().after();
	LoginPage.getInstance().enterTitle(Constants.Title);
	LoginPage.getInstance().enterDescription(Constants.Description);
	LoginPage.getInstance().clickSaveTestCase();
}catch(Exception e) {
	e.printStackTrace();
}
}}
