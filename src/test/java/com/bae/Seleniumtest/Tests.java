package com.bae.Seleniumtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tests {
	
	public static WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Ignore
	public void methodTest() throws InterruptedException {
		driver.get("https://www.google.co.uk/");
		WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		checkElement.sendKeys("doughnut pictures");
		Thread.sleep(100);
		checkElement.sendKeys(Keys.ESCAPE);
		
		Thread.sleep(100);
		WebElement checkElement2 = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
		checkElement2.click();
		
		WebElement checkElement3 = driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a"));
		checkElement3.click();
		
		
		WebElement checkElement4 = driver.findElement(By.xpath("//*[@id=\"isr_chc\"]/div/div/a[1]/div/span"));
		Thread.sleep(1000);
	
		assertEquals("donuts",checkElement4.getText());
		
	}
	
	@Test
	public void paintTest() throws InterruptedException {
		driver.get("https://www.youidraw.com/apps/painter/");
		Actions action = new Actions(driver);
		action.moveByOffset(600, 400).clickAndHold().moveByOffset(200, 0).release().
		moveByOffset(-100, 0).clickAndHold().moveByOffset(0, 200).release().
		moveByOffset(150, -200).clickAndHold().moveByOffset(0, 200).release().
		moveByOffset(0, -100).clickAndHold().moveByOffset(100,0).release().
		moveByOffset(0,-100).clickAndHold().moveByOffset(0, 200).release().
		moveByOffset(100,-200).clickAndHold().moveByOffset(0, 200).perform();
		
		
		Thread.sleep(1000);
		
	}

	

}
	
