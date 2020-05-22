import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFlyTest_Price_and_BrandName6 {
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

//*************************************************************Firefly***********************************************************************		
		// find Firefly Brand and click on it
		String expectedFireflyName1 = "Firefly-ROC-RK3328-CC (Renegade)\r\n";
		String expectedFireflyName2 = "Firefly-RK3399";
		String expectedFireflyName3 = "Firefly-RK3128";
		String expectedFireflyName4 = "Firefly-RK3288";
		String expectedFireflyName5 = "Firefly-RK3288 Reload";
		String expectedFireflyPrice1 = "$35.00";
		String expectedFireflyPrice2 = "$149.00";
		String expectedFireflyPrice3 = "$60.00";
		String expectedFireflyPrice4 = "$119.00";
		String expectedFireflyPrice5 = "$169.00";

		driver.findElement(By.xpath("//label/span[contains(text(),'Firefly')]")).click();
		Thread.sleep(3000);
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> FireflyBrandName = driver.findElements(By.className("_2BULo"));
		
		String ActualFireflyBrandName1 = FireflyBrandName.get(0).getText();
		String ActualFireflyBrandName2 = FireflyBrandName.get(1).getText();
		String ActualFireflyBrandName3 = FireflyBrandName.get(2).getText();
		String ActualFireflyBrandName4 = FireflyBrandName.get(3).getText();
		String ActualFireflyBrandName5 = FireflyBrandName.get(4).getText();
		
		
		
		// Print number of List Elements
		List<WebElement> FireflyPrice = driver.findElements(By.className("_23ArP"));
		String ActualFireflyPrice1 = FireflyPrice.get(0).getText();
		String ActualFireflyPrice2 = FireflyPrice.get(1).getText();
		String ActualFireflyPrice3 = FireflyPrice.get(2).getText();
		String ActualFireflyPrice4 = FireflyPrice.get(3).getText();
		String ActualFireflyPrice5 = FireflyPrice.get(4).getText();
		
		
		
		
		System.out.println("***********************************");
		System.out.println("check by brand Firefly");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualFireflyBrandName1);
		if (expectedFireflyName1.equals(ActualFireflyBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedFireflyName1);
		System.out.println("Actual Result: " + ActualFireflyBrandName1);

		System.out.println("***********************************");
		System.out.println("check by price Firefly");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualFireflyBrandName1);
		if (expectedFireflyPrice1.equals(ActualFireflyPrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedFireflyPrice1);
		System.out.println("Actual Result: " + ActualFireflyPrice1);
		
		
		
		System.out.println("***********************************");
		System.out.println("check by brand Firefly");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualFireflyBrandName2);
		if (expectedFireflyName2.equals(ActualFireflyBrandName2)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedFireflyName2);
		System.out.println("Actual Result: " + ActualFireflyBrandName2);

		System.out.println("***********************************");
		System.out.println("check by price Firefly");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualFireflyBrandName2);
		if (expectedFireflyPrice2.equals(ActualFireflyPrice2)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedFireflyPrice2);
		System.out.println("Actual Result: " + ActualFireflyPrice2);
		
		System.out.println("***********************************");
		System.out.println("check by brand Firefly");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualFireflyBrandName3);
		if (expectedFireflyName3.equals(ActualFireflyBrandName3)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedFireflyName3);
		System.out.println("Actual Result: " + ActualFireflyBrandName3);

		System.out.println("***********************************");
		System.out.println("check by price Firefly");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualFireflyBrandName3);
		if (expectedFireflyPrice3.equals(ActualFireflyPrice3)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedFireflyPrice3);
		System.out.println("Actual Result: " + ActualFireflyPrice3);
		
		
		
		System.out.println("***********************************");
		System.out.println("check by brand Firefly");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualFireflyBrandName4);
		if (expectedFireflyName4.equals(ActualFireflyBrandName4)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedFireflyName4);
		System.out.println("Actual Result: " + ActualFireflyBrandName4);

		System.out.println("***********************************");
		System.out.println("check by price Firefly");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualFireflyBrandName4);
		if (expectedFireflyPrice4.equals(ActualFireflyPrice4)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedFireflyPrice4);
		System.out.println("Actual Result: " + ActualFireflyPrice4);
		
		
		System.out.println("***********************************");
		System.out.println("check by brand Firefly");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualFireflyBrandName5);
		if (expectedFireflyName5.equals(ActualFireflyBrandName5)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedFireflyName5);
		System.out.println("Actual Result: " + ActualFireflyBrandName5);

		System.out.println("***********************************");
		System.out.println("check by price Firefly");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualFireflyBrandName5);
		if (expectedFireflyPrice5.equals(ActualFireflyPrice5)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedFireflyPrice5);
		System.out.println("Actual Result: " + ActualFireflyPrice5);
		
		
		
//*************************************************************Firefly***********************************************************************

		driver.quit();

	}

}
