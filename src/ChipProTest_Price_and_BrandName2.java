import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChipProTest_Price_and_BrandName2 {
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

//*************************************************************Chip Pro***********************************************************************		
		// find Chip_Pro Brand and click on it
		String expectedChip_ProName1 = "Chip Pro Dev Kit";
		String expectedChip_ProPrice1 = "$49.00";

		driver.findElement(By.xpath("//label/span[contains(text(),'Chip Pro')]")).click();
		Thread.sleep(3000);
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> Chip_ProBrandName = driver.findElements(By.className("_2BULo"));
		String ActualChip_ProBrandName1 = Chip_ProBrandName.get(0).getText();

		// Print number of List Elements
		List<WebElement> Chip_ProPrice = driver.findElements(By.className("_23ArP"));
		String ActualChip_ProPrice1 = Chip_ProPrice.get(0).getText();

		System.out.println("***********************************");
		System.out.println("check by brand Chip Pro");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualChip_ProBrandName1);
		if (expectedChip_ProName1.equals(ActualChip_ProBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedChip_ProName1);
		System.out.println("Actual Result: " + ActualChip_ProBrandName1);

		System.out.println("***********************************");
		System.out.println("check by price Chip Pro");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualChip_ProBrandName1);
		if (expectedChip_ProPrice1.equals(ActualChip_ProPrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedChip_ProPrice1);
		System.out.println("Actual Result: " + ActualChip_ProPrice1);
//*************************************************************Chip Pro***********************************************************************

		driver.quit();

	}

}
