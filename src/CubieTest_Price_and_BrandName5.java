import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CubieTest_Price_and_BrandName5 {
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

//*************************************************************Cubieboard***********************************************************************		
		// find Cubieboard Brand and click on it
		String expectedCubieboardName1 = "CubieAIO-S700";
		String expectedCubieboardName2 = "CubieBoard6 / CubieBoard7";
		String expectedCubieboardName3 = "CubieAIO-A20";
		String expectedCubieboardName4 = "CubieBoard4";
		String expectedCubieboardName5 = "Cubieboard5 (CubieTruck-Plus)";
		String expectedCubieboardPrice1 = "$139.00";
		String expectedCubieboardPrice2 = "$79.00";
		String expectedCubieboardPrice3 = "$83.00";
		String expectedCubieboardPrice4 = "$119.00";
		String expectedCubieboardPrice5 = "$99.00";

		driver.findElement(By.xpath("//label/span[contains(text(),'Cubieboard')]")).click();
		Thread.sleep(3000);
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> CubieboardBrandName = driver.findElements(By.className("_2BULo"));
		
		String ActualCubieboardBrandName1 = CubieboardBrandName.get(0).getText();
		String ActualCubieboardBrandName2 = CubieboardBrandName.get(1).getText();
		String ActualCubieboardBrandName3 = CubieboardBrandName.get(2).getText();
		String ActualCubieboardBrandName4 = CubieboardBrandName.get(3).getText();
		String ActualCubieboardBrandName5 = CubieboardBrandName.get(4).getText();
		
		
		
		// Print number of List Elements
		List<WebElement> CubieboardPrice = driver.findElements(By.className("_23ArP"));
		String ActualCubieboardPrice1 = CubieboardPrice.get(0).getText();
		String ActualCubieboardPrice2 = CubieboardPrice.get(1).getText();
		String ActualCubieboardPrice3 = CubieboardPrice.get(2).getText();
		String ActualCubieboardPrice4 = CubieboardPrice.get(3).getText();
		String ActualCubieboardPrice5 = CubieboardPrice.get(4).getText();
		
		
		
		
		System.out.println("***********************************");
		System.out.println("check by brand Cubieboard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCubieboardBrandName1);
		if (expectedCubieboardName1.equals(ActualCubieboardBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCubieboardName1);
		System.out.println("Actual Result: " + ActualCubieboardBrandName1);

		System.out.println("***********************************");
		System.out.println("check by price Cubieboard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCubieboardBrandName1);
		if (expectedCubieboardPrice1.equals(ActualCubieboardPrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCubieboardPrice1);
		System.out.println("Actual Result: " + ActualCubieboardPrice1);
		
		
		
		System.out.println("***********************************");
		System.out.println("check by brand Cubieboard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCubieboardBrandName2);
		if (expectedCubieboardName2.equals(ActualCubieboardBrandName2)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCubieboardName2);
		System.out.println("Actual Result: " + ActualCubieboardBrandName2);

		System.out.println("***********************************");
		System.out.println("check by price Cubieboard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCubieboardBrandName2);
		if (expectedCubieboardPrice2.equals(ActualCubieboardPrice2)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCubieboardPrice2);
		System.out.println("Actual Result: " + ActualCubieboardPrice2);
		
		System.out.println("***********************************");
		System.out.println("check by brand Cubieboard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCubieboardBrandName3);
		if (expectedCubieboardName3.equals(ActualCubieboardBrandName3)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCubieboardName3);
		System.out.println("Actual Result: " + ActualCubieboardBrandName3);

		System.out.println("***********************************");
		System.out.println("check by price Cubieboard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCubieboardBrandName3);
		if (expectedCubieboardPrice3.equals(ActualCubieboardPrice3)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCubieboardPrice3);
		System.out.println("Actual Result: " + ActualCubieboardPrice3);
		
		
		
		System.out.println("***********************************");
		System.out.println("check by brand Cubieboard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCubieboardBrandName4);
		if (expectedCubieboardName4.equals(ActualCubieboardBrandName4)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCubieboardName4);
		System.out.println("Actual Result: " + ActualCubieboardBrandName4);

		System.out.println("***********************************");
		System.out.println("check by price Cubieboard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCubieboardBrandName4);
		if (expectedCubieboardPrice4.equals(ActualCubieboardPrice4)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCubieboardPrice4);
		System.out.println("Actual Result: " + ActualCubieboardPrice4);
		
		
		System.out.println("***********************************");
		System.out.println("check by brand Cubieboard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCubieboardBrandName5);
		if (expectedCubieboardName5.equals(ActualCubieboardBrandName5)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCubieboardName5);
		System.out.println("Actual Result: " + ActualCubieboardBrandName5);

		System.out.println("***********************************");
		System.out.println("check by price Cubieboard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCubieboardBrandName5);
		if (expectedCubieboardPrice5.equals(ActualCubieboardPrice5)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCubieboardPrice5);
		System.out.println("Actual Result: " + ActualCubieboardPrice5);
		
		
		
//*************************************************************Cubieboard***********************************************************************

		driver.quit();

	}

}
