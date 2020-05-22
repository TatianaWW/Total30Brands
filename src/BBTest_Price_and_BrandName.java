import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBTest_Price_and_BrandName {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		// Data took from Specification
		// https://docs.google.com/document/d/1aoDLAt9XrUjrnRUq5UolZwKF_B01ne5Qu9Yvi9sYcUY

		String expectedBeagleBoneName1 = "PocketBeagle";
		String expectedBeagleBoneName2 = "BeagleBone Green";
		String expectedBeagleBoneName3 = "BeagleBone Green Wireless";
		String expectedBeagleBoneName4 = "BeagleBone Blue";
		String expectedBeagleBoneName5 = "BeagleBone Black Wireless";
		String expectedBeagleBoneName6 = "BeagleBone Black, Rev C";

		String expectedBeagleBonePrice1 = "$25.00";
		String expectedBeagleBonePrice2 = "$44.00";
		String expectedBeagleBonePrice3 = "$52.90";
		String expectedBeagleBonePrice4 = "$80.00";
		String expectedBeagleBonePrice5 = "$68.75";
		String expectedBeagleBonePrice6 = "$55.00";

		// open browser
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// find Element [All products] by xpath and click on it
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();

		// find Element [BRAND] by xpath and click on it
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/button"))
				.click();
		// driver.findElement(By.xpath("//li/button/span[contains(@data-hook,'filter-title')")).click();
		// Thread.sleep(5000);
		// find Arduino Brand and click on it
		driver.findElement(By.xpath("//label/span[contains(text(),'BeagleBone')]")).click();
		// Thread.sleep(3000);
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> BeagleBoneBrandName = driver.findElements(By.className("_2BULo"));
		// create new Variable
		Thread.sleep(3000);
		int numberOFBeagleBoneBrandName = BeagleBoneBrandName.size();
		String ActualBeagleBoneBrandName1 = BeagleBoneBrandName.get(0).getText();
		String ActualBeagleBoneBrandName2 = BeagleBoneBrandName.get(1).getText();
		String ActualBeagleBoneBrandName3 = BeagleBoneBrandName.get(2).getText();
		String ActualBeagleBoneBrandName4 = BeagleBoneBrandName.get(3).getText();
		String ActualBeagleBoneBrandName5 = BeagleBoneBrandName.get(4).getText();
		String ActualBeagleBoneBrandName6 = BeagleBoneBrandName.get(5).getText();

		// Print number of List Elements
		List<WebElement> BeagleBonePrice = driver.findElements(By.className("_23ArP"));
		int numberOFBeagleBonePrice = BeagleBonePrice.size();
		String ActualBeagleBonePrice1 = BeagleBonePrice.get(0).getText();
		String ActualBeagleBonePrice2 = BeagleBonePrice.get(1).getText();
		String ActualBeagleBonePrice3 = BeagleBonePrice.get(2).getText();
		String ActualBeagleBonePrice4 = BeagleBonePrice.get(3).getText();
		String ActualBeagleBonePrice5 = BeagleBonePrice.get(4).getText();
		String ActualBeagleBonePrice6 = BeagleBonePrice.get(5).getText();

		System.out.println("check by brand");
		System.out.println("***********************************");

		if (expectedBeagleBoneName1.equals(ActualBeagleBoneBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedBeagleBoneName1);
		System.out.println("Actual Result: " + ActualBeagleBoneBrandName1);

		if (expectedBeagleBoneName2.equals(ActualBeagleBoneBrandName2)) {
			System.out.println("PASS");
		} else {
			System.out.println("Fail");
		}
		System.out.println("Expected Result: " + expectedBeagleBoneName2);
		System.out.println("Actual Result: " + ActualBeagleBoneBrandName2);

		if (expectedBeagleBoneName3.equals(ActualBeagleBoneBrandName3)) {
			System.out.println("PASS");
		} else {
			System.out.println("Fail");
		}
		System.out.println("Expected Result: " + expectedBeagleBoneName3);
		System.out.println("Actual Result: " + ActualBeagleBoneBrandName3);

		if (expectedBeagleBoneName4.equals(ActualBeagleBoneBrandName4)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedBeagleBoneName4);
		System.out.println("Actual Result: " + ActualBeagleBoneBrandName4);

		if (expectedBeagleBoneName5.equals(ActualBeagleBoneBrandName5)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedBeagleBoneName5);
		System.out.println("Actual Result: " + ActualBeagleBoneBrandName5);

		if (expectedBeagleBoneName6.equals(ActualBeagleBoneBrandName6)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedBeagleBoneName6);
		System.out.println("Actual Result: " + ActualBeagleBoneBrandName6);

		System.out.println("check by price");
		System.out.println("***********************************");

		if (expectedBeagleBonePrice1.equals(ActualBeagleBonePrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedBeagleBonePrice1);
		System.out.println("Actual Result: " + ActualBeagleBonePrice1);

		if (expectedBeagleBonePrice2.equals(ActualBeagleBonePrice2)) {
			System.out.println("PASS");
		} else {
			System.out.println("Fail");
		}
		System.out.println("Expected Result: " + expectedBeagleBonePrice2);
		System.out.println("Actual Result: " + ActualBeagleBonePrice2);

		if (expectedBeagleBonePrice3.equals(ActualBeagleBonePrice3)) {
			System.out.println("PASS");
		} else {
			System.out.println("Fail");
		}
		System.out.println("Expected Result: " + expectedBeagleBonePrice3);
		System.out.println("Actual Result: " + ActualBeagleBonePrice3);

		if (expectedBeagleBonePrice4.equals(ActualBeagleBonePrice4)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedBeagleBonePrice4);
		System.out.println("Actual Result: " + ActualBeagleBonePrice4);

		if (expectedBeagleBonePrice5.equals(ActualBeagleBonePrice5)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedBeagleBonePrice5);
		System.out.println("Actual Result: " + ActualBeagleBonePrice5);

		
		if (expectedBeagleBonePrice6.equals(ActualBeagleBonePrice6)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedBeagleBonePrice6);
		System.out.println("Actual Result: " + ActualBeagleBonePrice6);

		driver.close();

	}

}
