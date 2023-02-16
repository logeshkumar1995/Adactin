package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement txtname=driver.findElement(By.id("username"));
		WebElement txtpass=driver.findElement(By.id("password"));
		WebElement btnlogin=driver.findElement(By.id("login"));
		txtname.sendKeys("logesh");
		txtpass.sendKeys("lo@12345");
		btnlogin.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
