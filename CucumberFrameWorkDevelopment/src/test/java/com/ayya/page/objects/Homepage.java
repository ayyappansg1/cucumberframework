package com.ayya.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ayya.utilities.CommonUtils;

public class Homepage {
	private static Homepage homepageinstance;
	private Homepage() {
	}
	public static Homepage getinstanceHomePage() {
		homepageinstance=new Homepage();
		return homepageinstance;
	}
	
	/*public WebElement getADD_TESTCASESBE() {
		return ADD_TESTCASESBE;
	}*/
	
	}
	/*public WebElement getADD_TESTCASES() {
		return ADD_TESTCASES;
	}

	public WebElement getTITLE() {
		return TITLE;
	}

	public WebElement getDESCRIPTION() {
		return DESCRIPTION;
	}

	public WebElement getSAVE_TEST_CASE() {
		return SAVE_TEST_CASE;
	}*/
