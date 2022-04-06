package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swigg {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP PC\\eclipse-workspace\\LaunchUrl\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement userid = driver.findElement(By.id("email"));
		userid.sendKeys("ilango");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("45676");

	}
}
