import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DE0Test_Price_and_BrandName6 {
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

//*************************************************************DE0-Nano-SoC***********************************************************************		
		// find DE0-Nano-SoC Brand and click on it
		String expectedDE0_Nano_SoCName1 = "DE0-Nano-SoC Development Kit";
		String expectedDE0_Nano_SoCPrice1 = "$99.00";

		driver.findElement(By.xpath("//label/span[contains(text(),'DE0-Nano-SoC')]")).click();
		Thread.sleep(3000);
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> DE0_Nano_SoCBrandName = driver.findElements(By.className("_2BULo"));
		
		String ActualDE0_Nano_SoCBrandName1 = DE0_Nano_SoCBrandName.get(0).getText();

		// Print price of List Elements
		List<WebElement> DE0_Nano_SoCPrice = driver.findElements(By.className("_23ArP"));
		String ActualDE0_Nano_SoCPrice1 = DE0_Nano_SoCPrice.get(0).getText();

		System.out.println("***********************************");
		System.out.println("check by brand DE0-Nano-SoC");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualDE0_Nano_SoCBrandName1);
		if (expectedDE0_Nano_SoCName1.equals(ActualDE0_Nano_SoCBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedDE0_Nano_SoCName1);
		System.out.println("Actual Result: " + ActualDE0_Nano_SoCBrandName1);

		System.out.println("***********************************");
		System.out.println("check by price DE0-Nano-SoC");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualDE0_Nano_SoCBrandName1);
		if (expectedDE0_Nano_SoCPrice1.equals(ActualDE0_Nano_SoCPrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedDE0_Nano_SoCPrice1);
		System.out.println("Actual Result: " + ActualDE0_Nano_SoCPrice1);
		
//*************************************************************DE0-Nano-SoC***********************************************************************

		driver.quit();

	}

}
