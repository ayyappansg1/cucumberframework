package com.ayya.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.ayya.LaunchBrowser.DriverManager;
import com.ayya.constants.Constants;
import com.ayya.page.objects.Homepage;
import com.ayya.page.objects.LoginPage;
import com.ayya.utilities.CommonUtils;

import io.cucumber.java.en.Given;

public class AddingTestCases {
	
	@Given("the user should click on Add TestCase")
	public void the_user_should_click_on_add_test_case() {
		try {
			
	}catch (Exception e) {
		CommonUtils.getCommonInstance().takeScreenshot();
	}
	}

	@Given("should enter on title box {string} and {string} details")
	public void should_enter_on_title_box_and_details(String title, String description) {
		try {
			
	
	}catch(Exception e) {
		e.printStackTrace();
	}}
	@Given("User should click SaveTestCase")
	public void user_should_click_save_test_case() {
		try {
			

		
	}catch(Exception e) {
		e.printStackTrace();
	}}

}
