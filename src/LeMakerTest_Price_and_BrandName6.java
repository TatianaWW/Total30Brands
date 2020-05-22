import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeMakerTest_Price_and_BrandName6 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Data took from Specification
		// https://docs.google.com/document/d/1aoDLAt9XrUjrnRUq5UolZwKF_B01ne5Qu9Yvi9sYcUY

		// open browser
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// find Element [All products] by xpath and click on it
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
		Thread.sleep(5000);
		// find [Brand] and click on it
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/button"))
				.click();
		// driver.findElement(By.xpath("//li/button/span[contains(@data-hook,'filter-title')")).click();
		Thread.sleep(5000);

//*************************************************************LeMaker***********************************************************************		
		// find LeMaker Brand and click on it
		String expectedLeMakerName1 = "LeMaker 8Guitar";
		String expectedLeMakerPrice1 = "$69.00";

		driver.findElement(By.xpath("//label/span[contains(text(),'LeMaker')]")).click();
		Thread.sleep(3000);
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> LeMakerBrandName = driver.findElements(By.className("_2BULo"));
		
		String ActualLeMakerBrandName1 = LeMakerBrandName.get(0).getText();

		// Print price of List Elements
		List<WebElement> LeMakerPrice = driver.findElements(By.className("_23ArP"));
		String ActualLeMakerPrice1 = LeMakerPrice.get(0).getText();

		System.out.println("***********************************");
		System.out.println("check by brand LeMaker");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualLeMakerBrandName1);
		if (expectedLeMakerName1.equals(ActualLeMakerBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedLeMakerName1);
		System.out.println("Actual Result: " + ActualLeMakerBrandName1);

		System.out.println("***********************************");
		System.out.println("check by price LeMaker");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualLeMakerBrandName1);
		if (expectedLeMakerPrice1.equals(ActualLeMakerPrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedLeMakerPrice1);
		System.out.println("Actual Result: " + ActualLeMakerPrice1);
		
//*************************************************************LeMaker***********************************************************************

		driver.quit();

	}

}
