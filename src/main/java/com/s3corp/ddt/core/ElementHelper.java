package com.s3corp.ddt.core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementHelper {

	public enum Locator{
		ID, NAME, TAG_NAME, LINK, XPATH, CSS
	}
	
	public static By getBy(String locator){
		Locator type = Locator.valueOf(locator);
		By by = null;
		switch (type) {
			case ID:
				by = By.id(locator);
				break;
			case NAME:
				by = By.name(locator);
				break;
			case TAG_NAME:
				by = By.tagName(locator);
				break;
			case LINK:
				by = By.linkText(locator);
				break;
			case XPATH:
				by = By.xpath(locator);
				break;
			case CSS:
				by = By.cssSelector(locator);
				break;
			default:
				by = By.xpath("//*[contains(text(), '" + locator + "') or contains(@value, '" + locator + "')]");
				break;
		}
		return by;
	}
	
	public static WebElement findElement(WebDriver driver, String locator){
		return driver.findElement(getBy(locator));
	}
	
	public static List<WebElement> findElements(WebDriver driver, String locator){
		return driver.findElements(getBy(locator));
	}
}
