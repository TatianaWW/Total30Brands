import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KhadasTest_Price_and_BrandName7 {
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

//*************************************************************Khadas***********************************************************************		
		// find Khadas Brand and click on it
		String expectedKhadasName1 = "Khadas Vim Pro";
		String expectedKhadasName2 = "Khadas Vim2";
		
		
		String expectedKhadasPrice1 = "$60.00";
		String expectedKhadasPrice2 = "$90.00";
		
	

		driver.findElement(By.xpath("//label/span[contains(text(),'Khadas')]")).click();
		Thread.sleep(3000);
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> KhadasBrandName = driver.findElements(By.className("_2BULo"));
		
		String ActualKhadasBrandName1 = KhadasBrandName.get(0).getText();
		String ActualKhadasBrandName2 = KhadasBrandName.get(1).getText();
		
		
		
		// Print number of List Elements
		List<WebElement> KhadasPrice = driver.findElements(By.className("_23ArP"));
		String ActualKhadasPrice1 = KhadasPrice.get(0).getText();
		String ActualKhadasPrice2 = KhadasPrice.get(1).getText();
		
		
		System.out.println("***********************************");
		System.out.println("check by brand Khadas");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualKhadasBrandName1);
		if (expectedKhadasName1.equals(ActualKhadasBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedKhadasName1);
		System.out.println("Actual Result: " + ActualKhadasBrandName1);

		System.out.println("***********************************");
		System.out.println("check by price Khadas");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualKhadasBrandName1);
		if (expectedKhadasPrice1.equals(ActualKhadasPrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedKhadasPrice1);
		System.out.println("Actual Result: " + ActualKhadasPrice1);
		
		
		
		System.out.println("***********************************");
		System.out.println("check by brand Khadas");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualKhadasBrandName2);
		if (expectedKhadasName2.equals(ActualKhadasBrandName2)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedKhadasName2);
		System.out.println("Actual Result: " + ActualKhadasBrandName2);

		System.out.println("***********************************");
		System.out.println("check by price Khadas");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualKhadasBrandName2);
		if (expectedKhadasPrice2.equals(ActualKhadasPrice2)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedKhadasPrice2);
		System.out.println("Actual Result: " + ActualKhadasPrice2);
		
	
		
		
		
//*************************************************************Khadas***********************************************************************

		driver.quit();

	}

}
