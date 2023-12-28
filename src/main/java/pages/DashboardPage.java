package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBaseClass;

public class DashboardPage extends StepBaseClass{
	
	@FindBy(xpath = "//*[text()='create an account']")
	WebElement createAnAccount;
	
	@FindBy(xpath = "//*[@alt='GCR Shop']")
	WebElement titleShop;
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnCreateAccount() {
		
		createAnAccount.click();
		System.out.println("Create an Account link clicked");
	}
	
	public void isTitleDisplayed() {
		titleShop.isDisplayed();
		System.out.println("Title Displayed");
	}

}
