package com.etsy.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class TimeBaseScreenShot {
    public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.etsy.com/");
		AShot ashot=new AShot();
		Screenshot sc = ashot.takeScreenshot(driver);
		try {
			Date date = new Date();
			String s=date.toString();
			s=s.replaceAll("\\:", "");
	        ImageIO.write(sc.getImage(), "PNG", new File("TimeCapture"+s+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
