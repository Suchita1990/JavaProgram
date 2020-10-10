package com.etsy.screenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class FullPageScreenshot {
    public static WebDriver driver; 
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.etsy.com/");
		AShot ashot=new AShot();
		Screenshot sc = ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		try {
			ImageIO.write(sc.getImage(), "PNG",new File("FullPageScreen.png"));
		} catch (IOException e) {
			System.out.println("Taking Full-Page-Screenshot");
			e.printStackTrace();
		}
		driver.close();

	}

}
