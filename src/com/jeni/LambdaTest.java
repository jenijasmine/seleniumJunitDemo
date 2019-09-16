package com.jeni;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	@TestMethodOrder(Alphanumeric.class)
	public class LambdaTest {
	static WebDriver driver;

	@BeforeClass
	public static void BrowserOpen() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\verizon\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void myATest() {
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.lambdatest.com");
	driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[7]/a")).click();
	driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div/form/div[2]/input[1]")).sendKeys("LambdaTest");
	driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div/form/div[2]/input[2]")).sendKeys("First Last");
	driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div/form/div[2]/input[3]")).sendKeys("jenifajesus33@gmail.com");
	driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div/form/div[2]/input[4]")).sendKeys("TestUser123");
	driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div/form/div[2]/input[5]")).sendKeys("9988776655");
	driver.findElement(By.xpath("//*[@id=\"terms_of_service\"]")).click();
	driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div/form/div[2]/button")).click();
	String url = driver.getCurrentUrl();
	assertEquals(url, "https://accounts.lambdatest.com/email/verify");
	}

	@Test
	public void myBTest() {
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.get("https://accounts.lambdatest.com/email/verify");
		driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div/ul[2]/li/div/a[5]")).click();
		String url = driver.getCurrentUrl();
		assertEquals(url, "https://accounts.lambdatest.com/login");
	}

	@Test
	public void myCTest() {
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.get("https://accounts.lambdatest.com/login");
		//driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/section/form/div/div/input[1]")).sendKeys("jenifajesus33@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/section/form/div/div/input[2]")).sendKeys("TestUser123");
		driver.findElement(By.xpath("/html/body/div[1]/section/form/div/div/button")).click();
		String url = driver.getCurrentUrl();
		assertEquals(url, "https://accounts.lambdatest.com/email/verify");
	}
	@Test
	public void myDTest() {
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.get("https://accounts.lambdatest.com/email/verify");
		driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div/ul[2]/li/div/a[5]")).click();
		String url = driver.getCurrentUrl();
		assertEquals(url, "https://accounts.lambdatest.com/login");
	}

	@AfterClass
	public static void BrowserClose() {
	driver.quit();
	}
	}