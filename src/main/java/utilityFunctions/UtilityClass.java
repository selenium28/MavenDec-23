package utilityFunctions;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.StepBaseClass;

public class UtilityClass extends StepBaseClass{
	
	public void clickOnWebElement(WebElement element, long waitTimeInSec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSec));
		WebElement elements = null;
		elements = wait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
	}
	
	public void sendKeysOnWebElement(WebElement element, String text) {
		clickOnWebElement(element, 5);
		element.click();
		element.clear();
		element.sendKeys(text);
		
	}

}
