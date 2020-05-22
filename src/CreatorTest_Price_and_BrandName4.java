import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatorTest_Price_and_BrandName4 {
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

//*************************************************************Creator***********************************************************************		
		// find Creator Brand and click on it
		String expectedCreatorName1 = "Creator Ci40";
		String expectedCreatorPrice1 = "$85.00";

		driver.findElement(By.xpath("//label/span[contains(text(),'Creator')]")).click();
		Thread.sleep(3000);
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> CreatorBrandName = driver.findElements(By.className("_2BULo"));
		String ActualCreatorBrandName1 = CreatorBrandName.get(0).getText();

		// Print number of List Elements
		List<WebElement> CreatorPrice = driver.findElements(By.className("_23ArP"));
		String ActualCreatorPrice1 = CreatorPrice.get(0).getText();

		System.out.println("***********************************");
		System.out.println("check by brand Creator");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCreatorBrandName1);
		if (expectedCreatorName1.equals(ActualCreatorBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCreatorName1);
		System.out.println("Actual Result: " + ActualCreatorBrandName1);

		System.out.println("***********************************");
		System.out.println("check by price Creator");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCreatorBrandName1);
		if (expectedCreatorPrice1.equals(ActualCreatorPrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCreatorPrice1);
		System.out.println("Actual Result: " + ActualCreatorPrice1);
//*************************************************************Creator***********************************************************************

		driver.quit();

	}

}
