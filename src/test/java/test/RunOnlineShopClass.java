package test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import core.StepBaseClass;
import pages.DashboardPage;
import pages.MyAccountInformation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class RunOnlineShopClass extends StepBaseClass{
	DashboardPage objDashboardPage;
	MyAccountInformation objMyAccountInformation;
//	ExtentReports reports;
//	ExtentTest test;
	

	@Test
	public void dashBoardPage() {
		objDashboardPage = new DashboardPage();
		objDashboardPage.isTitleDisplayed();
		objDashboardPage.clickOnCreateAccount();
	}

	@Test
	public void myAccountPage() {
		objMyAccountInformation = new MyAccountInformation();
		objMyAccountInformation.clickOnGenderButton();
		
	}

	@BeforeTest
	public void beforeMethod() {
		setup();
	}

	@AfterTest
	public void afterMethod() {
		tearDown();
	}

}
