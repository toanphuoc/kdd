package com.s3corp.ddt.core;

public interface Browser{
	
	/**
	 * Open web browser and navigate URL
	 * @param browserType
	 * @param url
	 */
	void openBrowser(String browserType, String url);

	/**
	 * Close web browser
	 */
	void closeBrowser();
	
	/**
	 * Click action
	 * @param locator
	 */
	void click(String locator);
	
	/**
	 * Type text at an element
	 * @param locator
	 * @param text
	 */
	void sendText(String locator, String text);
	
	/**
	 * Get text value of an element
	 * @param locator
	 * @return
	 */
	String getText(String locator);
	
	/**
	 * Get attribute value of an element
	 * @param locator
	 * @param attrName
	 * @return
	 */
	String getAttributeValue(String locator, String attrName);
	
	/**
	 * Get CSS value of an element
	 * @param locator
	 * @param css
	 * @return
	 */
	String getCssValue(String locator, String css);
}
