package org.base;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		Datepicker d = new Datepicker();
		d.launchBrowser();
		d.getUrl("https://www.makemytrip.com/flights/");
		
		
		WebElement departBtn = driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']"));
        d.jsClick(departBtn);
        
        
        
	}
}