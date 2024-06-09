package com.SauceLab.Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.SauceLab.Testbase.TestBase;





public class WebDriverEvents extends TestBase implements WebDriverEventListener {

	@Override
	public void beforeAlertAccept(WebDriver driver) {

	}

	@Override
	public void afterAlertAccept(WebDriver driver) {

	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {

	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {

	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		logger.info("Navigating to URL : " + url);

	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		logger.info("Navigated to URL : " + url);

	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {

	}

	@Override
	public void afterNavigateBack(WebDriver driver) {

	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {

	}

	@Override
	public void afterNavigateForward(WebDriver driver) {

	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {

	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {

	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		logger.info("Finding element by : " + by);

	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		logger.info("Found element by : " + by);

	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		logger.info("Clicking on element by : " + element);

	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {

	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

	}

	@Override
	public void beforeScript(String script, WebDriver driver) {

	}

	@Override
	public void afterScript(String script, WebDriver driver) {

	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		logger.info("Switching to Window  : " + windowName);

	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		logger.info("Switched to Window  : " + windowName);

	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {

	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		logger.info("Taking screen shot");

	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		logger.info("Getting text from element  : " + element.getText());

	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		logger.info("Geot text from element  : " + element.getText());

	}

}