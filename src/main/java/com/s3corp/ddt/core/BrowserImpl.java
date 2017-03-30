package com.s3corp.ddt.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserImpl implements Browser{
	
	private static final String DRIVER_PATH = "drivers";
	private static Browser browser = new BrowserImpl();
	
	public static Browser getIntancse(){
		return browser;
	}
	
	public enum BrowserType{
		CHROME, FIREFOX, IE, ANDROID, IOS
	}
	
	private WebDriver webDriver;
	
	public void initBrowserDriver(BrowserType browserType){
		switch (browserType) {
			case CHROME:
				String chromeDriverPath = DRIVER_PATH + "\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", chromeDriverPath);
				break;
			case IE:
				break;
			case FIREFOX:
				break;
			case ANDROID:
				break;
			case IOS:
				break;
			default:
				break;
		}
	}
	
	/**
	 * Open web browser and navigate URL
	 * @param browserType
	 * @param url
	 */
	public void openBrowser(String browserType, String url) {
		BrowserType type = BrowserType.valueOf(browserType.toUpperCase());
		
		this.initBrowserDriver(type);
		
		switch (type) {
			case CHROME:
				webDriver = new ChromeDriver();
				break;
			case FIREFOX:
				System.out.println("Init FF web driver.");
				break;
			case IE:
				System.out.println("Init IE web driver.");
				break;
			case ANDROID:
				break;
			case IOS:
				break;
			default:
				break;
		}
		
		webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
		webDriver.get(url);
	}

	/**
	 * Close web browser
	 */
	public void closeBrowser() {
		this.webDriver.close();
		this.webDriver.quit();
	}

	/**
	 * Click action
	 * @param locator
	 */
	public void click(String locator) {
		//ElementHelper.findElement(webDriver, locator).click();
	}

	/**
	 * Type text at an element
	 * @param locator
	 * @param text
	 */
	public void sendText(String locator, String text) {
		ElementHelper.findElement(webDriver, locator).sendKeys(text);
	}

	/**
	 * Get text value of an element
	 * @param locator
	 * @return
	 */
	public String getText(String locator) {
		WebElement ele = ElementHelper.findElement(webDriver, locator);
		if(ele.getTagName().equals("input") || ele.getTagName().equals("textarea")){
			return ele.getAttribute("value");
		}
		
		return ele.getText();
	}

	/**
	 * Get attribute value of an element
	 * @param locator
	 * @param attrName
	 * @return
	 */
	public String getAttributeValue(String locator, String attrName) {
		WebElement ele = ElementHelper.findElement(webDriver, locator);
		return ele.getAttribute(attrName);
	}

	/**
	 * Get CSS value of an element
	 * @param locator
	 * @param css
	 * @return
	 */
	public String getCssValue(String locator, String css) {
		WebElement ele = ElementHelper.findElement(webDriver, locator);
		return ele.getCssValue(css);
	}
}