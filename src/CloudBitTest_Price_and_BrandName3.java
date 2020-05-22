import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloudBitTest_Price_and_BrandName3 {
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

//*************************************************************CloudBit***********************************************************************		
		// find CloudBit Brand and click on it
		String expectedCloudBitName1 = "CloudBit";
		String expectedCloudBitPrice1 = "$60.00";

		driver.findElement(By.xpath("//label/span[contains(text(),'CloudBit')]")).click();
		Thread.sleep(3000);
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> CloudBitBrandName = driver.findElements(By.className("_2BULo"));
		String ActualCloudBitBrandName1 = CloudBitBrandName.get(0).getText();

		// Print number of List Elements
		List<WebElement> CloudBitPrice = driver.findElements(By.className("_23ArP"));
		String ActualCloudBitPrice1 = CloudBitPrice.get(0).getText();

		System.out.println("***********************************");
		System.out.println("check by brand CloudBit");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCloudBitBrandName1);
		if (expectedCloudBitName1.equals(ActualCloudBitBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCloudBitName1);
		System.out.println("Actual Result: " + ActualCloudBitBrandName1);

		System.out.println("***********************************");
		System.out.println("check by price CloudBit");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCloudBitBrandName1);
		if (expectedCloudBitPrice1.equals(ActualCloudBitPrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCloudBitPrice1);
		System.out.println("Actual Result: " + ActualCloudBitPrice1);
//*************************************************************CloudBit***********************************************************************

		driver.quit();

	}

}
