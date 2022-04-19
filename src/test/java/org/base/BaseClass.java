package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SunriseAirways\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void getUrl(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void sendkeys(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}

	public static void moveToElement(WebElement e) {

		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public static void doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();

	}

	public static void dragAndDrop(WebElement e, WebElement f) {
		Actions a = new Actions(driver);
		a.dragAndDrop(e, f);

	}

	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");

	}

	public static void screenshot(String snapName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Automation\\SunriseAirways\\target\\" + snapName + ".png");
		FileUtils.copyFile(src, dest);

	}

	public static void selectByValue(WebElement e, String value) {
		Select a = new Select(e);
		a.selectByValue(value);
	}

	public static List<WebElement> getOptions(WebElement e) {
		Select a = new Select(e);
		return a.getOptions();

	}

	public static List<WebElement> getAllSelectedOptions(WebElement e) {
		Select a = new Select(e);
		return a.getAllSelectedOptions();

	}

	public static void deSelectAll(WebElement e) {
		Select a = new Select(e);
		a.deselectAll();
	}

	public static void enterKey() throws AWTException {
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_ENTER);
	}

	public static void escapeKey() throws AWTException {
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_ESCAPE);

	}

	public static void scrollUp(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", e);
	}

	public static void scrollDown(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}

	public static void jsClick(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click(),e");

	}

	public static void accept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void dismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public static void alertKeys(String value) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);

	}

	public static void waitAll() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

//	public static void clickableWait(WebElement e) {
//		WebDriverWait w = new WebDriverWait(driver, 50);
//		w.until(ExpectedConditions.elementToBeClickable(e));
//
//	}
//
//	public static void selectedElementwait(WebElement e) {
//		WebDriverWait w = new WebDriverWait(driver, 50);
//		w.until(ExpectedConditions.elementToBeSelected(e));
//	}

	public static void windowhandle(int i) {
		Set<String> allID = driver.getWindowHandles();

		List<String> id = new LinkedList();
		id.addAll(allID);

		driver.switchTo().window(id.get(i));
	}

	public static void close() {
		driver.close();
	}

	public static void visibileWait(WebElement e) {
		WebDriverWait w = new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.visibilityOf(e));
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void backward() {
		driver.navigate().back();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	
}
