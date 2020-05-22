import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ArduinoTest_Price_and_BrandName{
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

			// Data took from Specification
			// https://docs.google.com/document/d/1aoDLAt9XrUjrnRUq5UolZwKF_B01ne5Qu9Yvi9sYcUY
			String expectedArduinoName1 = "Arduino Tian";
			String expectedArduinoName2 = "Arduino Yun / Yun PoE";
			String expectedArduinoName3 = "Arduino Industrial 101";

			String expectedArduinoPrice1 = "$76.56";
			String expectedArduinoPrice2 = "$78.10";
			String expectedArduinoPrice3 = "$34.65";
			// open browser
			driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
			driver.manage().window().maximize();
			Thread.sleep(5000);

			// find Element [All products] by xpath and click on it
			driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/button")).click();
			//driver.findElement(By.xpath("//li/button/span[contains(@data-hook,'filter-title')")).click();
			Thread.sleep(5000);
			// find Arduino Brand and click on it
			driver.findElement(By.xpath("//label/span[contains(text(),'Arduino')]")).click();
			Thread.sleep(3000);
			// find all elements which has a className= "_2BULo" and put them in the data
			List<WebElement> ArduinoBrandName = driver.findElements(By.className("_2BULo"));
			// create new Variable
			int numberOFArduinoBrandName = ArduinoBrandName.size();
			String ActualArduinoBrandName1 = ArduinoBrandName.get(0).getText();
			String ActualArduinoBrandName2 = ArduinoBrandName.get(1).getText();
			String ActualArduinoBrandName3 = ArduinoBrandName.get(2).getText();

			// Print number of List Elements
			List<WebElement> ArduinoPrice = driver.findElements(By.className("_23ArP"));
			int numberOFArduinoPrice = ArduinoPrice.size();
			String ActualArduinoPrice1 = ArduinoPrice.get(0).getText();
			String ActualArduinoPrice2 = ArduinoPrice.get(1).getText();
			String ActualArduinoPrice3 = ArduinoPrice.get(2).getText();
			System.out.println("check by brand");
			System.out.println("***********************************");

		

			if (expectedArduinoName1.equals(ActualArduinoBrandName1)) {
					System.out.println("PASS");
				} else {
					System.out.println("FAIL");
				}
				System.out.println("Expected Result: " + expectedArduinoName1);
				System.out.println("Actual Result: " + ActualArduinoBrandName1);


			if (expectedArduinoName2.equals(ActualArduinoBrandName2)) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail");
			}
				System.out.println("Expected Result: " + expectedArduinoName2);
				System.out.println("Actual Result: " + ActualArduinoBrandName2);
			

			if (expectedArduinoName3.equals(ActualArduinoBrandName3)) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail");
			}
			System.out.println("Expected Result: " + expectedArduinoName3);
			System.out.println("Actual Result: " + ActualArduinoBrandName3);

			
			
			System.out.println("check by price");
			System.out.println("***********************************");

			if (expectedArduinoPrice1.equals(ActualArduinoPrice1)) {
					System.out.println("PASS");
				} else {
					System.out.println("FAIL");
				}
				System.out.println("Expected Result: " + expectedArduinoPrice1);
				System.out.println("Actual Result: " + ActualArduinoPrice1);


			if (expectedArduinoPrice2.equals(ActualArduinoPrice2)) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail");
			}
				System.out.println("Expected Result: " + expectedArduinoPrice2);
				System.out.println("Actual Result: " + ActualArduinoPrice2);
			

			if (expectedArduinoPrice3.equals(ActualArduinoPrice3)) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail");
			}
			System.out.println("Expected Result: " + expectedArduinoPrice3);
			System.out.println("Actual Result: " + ActualArduinoPrice3);
		
			
			driver.close();


	}

}
