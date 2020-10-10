package com.javascript.demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSDemo {
	public void scrollWindow() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.etsy.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("alert('Welcome to etsy.com')");
		
		js.executeScript("window.scrollBy(0,800)");
	//	js.executeScript("document.getElementsByName('Anniversary gifts')");

	}

	public static void main(String[] args) {
		JSDemo js=new JSDemo();
		js.scrollWindow();

	}
}
