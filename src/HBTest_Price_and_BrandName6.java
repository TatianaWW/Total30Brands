import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HBTest_Price_and_BrandName6 {
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

//*************************************************************HummingBoard***********************************************************************		
		// find HummingBoard Brand and click on it
		String expectedHummingBoardName1 = "HummingBoard Pulse";
		String expectedHummingBoardName2 = "HummingBoard-Edge";
		String expectedHummingBoardName3 = "HummingBoard-Gate";
		String expectedHummingBoardName4 = "HummingBoard-Pro";
		
		String expectedHummingBoardPrice1 = "$160.00";
		String expectedHummingBoardPrice2 = "$126.00";
		String expectedHummingBoardPrice3 = "$96.00";
		String expectedHummingBoardPrice4 = "$96.00";
	

		driver.findElement(By.xpath("//label/span[contains(text(),'HummingBoard')]")).click();
		Thread.sleep(3000);
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> HummingBoardBrandName = driver.findElements(By.className("_2BULo"));
		
		String ActualHummingBoardBrandName1 = HummingBoardBrandName.get(0).getText();
		String ActualHummingBoardBrandName2 = HummingBoardBrandName.get(1).getText();
		String ActualHummingBoardBrandName3 = HummingBoardBrandName.get(2).getText();
		String ActualHummingBoardBrandName4 = HummingBoardBrandName.get(3).getText();
		
		
		// Print number of List Elements
		List<WebElement> HummingBoardPrice = driver.findElements(By.className("_23ArP"));
		String ActualHummingBoardPrice1 = HummingBoardPrice.get(0).getText();
		String ActualHummingBoardPrice2 = HummingBoardPrice.get(1).getText();
		String ActualHummingBoardPrice3 = HummingBoardPrice.get(2).getText();
		String ActualHummingBoardPrice4 = HummingBoardPrice.get(3).getText();
		
		
		System.out.println("***********************************");
		System.out.println("check by brand HummingBoard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualHummingBoardBrandName1);
		if (expectedHummingBoardName1.equals(ActualHummingBoardBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedHummingBoardName1);
		System.out.println("Actual Result: " + ActualHummingBoardBrandName1);

		System.out.println("***********************************");
		System.out.println("check by price HummingBoard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualHummingBoardBrandName1);
		if (expectedHummingBoardPrice1.equals(ActualHummingBoardPrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedHummingBoardPrice1);
		System.out.println("Actual Result: " + ActualHummingBoardPrice1);
		
		
		
		System.out.println("***********************************");
		System.out.println("check by brand HummingBoard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualHummingBoardBrandName2);
		if (expectedHummingBoardName2.equals(ActualHummingBoardBrandName2)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedHummingBoardName2);
		System.out.println("Actual Result: " + ActualHummingBoardBrandName2);

		System.out.println("***********************************");
		System.out.println("check by price HummingBoard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualHummingBoardBrandName2);
		if (expectedHummingBoardPrice2.equals(ActualHummingBoardPrice2)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedHummingBoardPrice2);
		System.out.println("Actual Result: " + ActualHummingBoardPrice2);
		
		System.out.println("***********************************");
		System.out.println("check by brand HummingBoard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualHummingBoardBrandName3);
		if (expectedHummingBoardName3.equals(ActualHummingBoardBrandName3)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedHummingBoardName3);
		System.out.println("Actual Result: " + ActualHummingBoardBrandName3);

		System.out.println("***********************************");
		System.out.println("check by price HummingBoard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualHummingBoardBrandName3);
		if (expectedHummingBoardPrice3.equals(ActualHummingBoardPrice3)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedHummingBoardPrice3);
		System.out.println("Actual Result: " + ActualHummingBoardPrice3);
		
		
		
		System.out.println("***********************************");
		System.out.println("check by brand HummingBoard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualHummingBoardBrandName4);
		if (expectedHummingBoardName4.equals(ActualHummingBoardBrandName4)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedHummingBoardName4);
		System.out.println("Actual Result: " + ActualHummingBoardBrandName4);

		System.out.println("***********************************");
		System.out.println("check by price HummingBoard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualHummingBoardBrandName4);
		if (expectedHummingBoardPrice4.equals(ActualHummingBoardPrice4)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedHummingBoardPrice4);
		System.out.println("Actual Result: " + ActualHummingBoardPrice4);
		
		
		
//*************************************************************HummingBoard***********************************************************************

		driver.quit();

	}

}
