package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBaseClass;
import utilityFunctions.UtilityClass;

public class MyAccountInformation extends StepBaseClass{
	
	@FindBy(xpath = "//*[text()='My Account Information']")
	WebElement myAccountInfoTitle;
	
	@FindBy(xpath = "//input[@name='gender' and @value='f']")
	WebElement genderRadioButton;
	
	UtilityClass objUtility = new UtilityClass();
	
	public MyAccountInformation() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnGenderButton() {
		myAccountInfoTitle.isDisplayed();
		genderRadioButton.click();
		
//		objUtility.sendKeysOnWebElement(genderRadioButton, "1234");
	}
	

}
