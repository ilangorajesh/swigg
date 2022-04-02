package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swigg {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP PC\\eclipse-workspace\\LaunchUrl\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://gmail.com/");
		WebElement userid = driver.findElement(By.id("identifierId"));
		userid.sendKeys("ilango451646@gmail.com");
		WebElement userpass = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
		userpass.click();

	}
}
