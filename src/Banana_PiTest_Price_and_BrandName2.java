import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Banana_PiTest_Price_and_BrandName2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

			// Data took from Specification
			// https://docs.google.com/document/d/1aoDLAt9XrUjrnRUq5UolZwKF_B01ne5Qu9Yvi9sYcUY
			
			String expectedBanana_PiName1 = "Banana Pi BPI-M2 Magic";
			String expectedBanana_PiName2 = "Banana Pi BPI-M2 Zero";
			String expectedBanana_PiName3 = "Banana Pi BPI-M2 Berry";
			String expectedBanana_PiName4 = "Banana Pi BPI-W2";
			String expectedBanana_PiName5 = "Banana Pro";
			String expectedBanana_PiName6 = "Banana Pi BPI-M64";
			String expectedBanana_PiName7 = "Banana Pi BPI-M3";
			String expectedBanana_PiName8 = "Banana Pi BPI-M2 Ultra";
			String expectedBanana_PiName9 = "Banana Pi BPI-M2";
			
			
			
			
 
			String expectedBanana_PiPrice1 = "$21.00";
			String expectedBanana_PiPrice2 = "$21.00";
			String expectedBanana_PiPrice3 = "$36.00";
			String expectedBanana_PiPrice4 = "$93.00";
			String expectedBanana_PiPrice5 = "$48.00";
			String expectedBanana_PiPrice6 = "$88.00";
			String expectedBanana_PiPrice7 = "$79.00";
			String expectedBanana_PiPrice8 = "$58.00";
			String expectedBanana_PiPrice9 = "$40.00";
			
			// open browser
			driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			// find Element [All products] by xpath and click on it
			driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
			Thread.sleep(5000);
			// find Element [BRAND] by xpath and click on it
			driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/button")).click();
			//driver.findElement(By.xpath("//li/button/span[contains(@data-hook,'filter-title')")).click();
			Thread.sleep(5000);
			// find Arduino Brand and click on it
			driver.findElement(By.xpath("//label/span[contains(text(),'Banana Pi')]")).click();
			Thread.sleep(3000);
			// find all elements which has a className= "_2BULo" and put them in the data
			List<WebElement> Banana_PiBrandName = driver.findElements(By.className("_2BULo"));
			// create new Variable
			
			int numberOFBanana_PiBrandName = Banana_PiBrandName.size();
			String ActualBanana_PiBrandName1 = Banana_PiBrandName.get(0).getText();
			String ActualBanana_PiBrandName2 = Banana_PiBrandName.get(1).getText();
			String ActualBanana_PiBrandName3 = Banana_PiBrandName.get(2).getText();
			String ActualBanana_PiBrandName4 = Banana_PiBrandName.get(3).getText();
			String ActualBanana_PiBrandName5 = Banana_PiBrandName.get(4).getText();
			String ActualBanana_PiBrandName6 = Banana_PiBrandName.get(5).getText();
			String ActualBanana_PiBrandName7 = Banana_PiBrandName.get(6).getText();
			String ActualBanana_PiBrandName8 = Banana_PiBrandName.get(7).getText();
			String ActualBanana_PiBrandName9 = Banana_PiBrandName.get(8).getText();
			
			
			// Print number of List Elements
			List<WebElement> Banana_PiPrice = driver.findElements(By.className("_23ArP"));
			int numberOFBanana_PiPrice = Banana_PiPrice.size();
			String ActualBanana_PiPrice1 = Banana_PiPrice.get(0).getText();
			String ActualBanana_PiPrice2 = Banana_PiPrice.get(1).getText();
			String ActualBanana_PiPrice3 = Banana_PiPrice.get(2).getText();
			String ActualBanana_PiPrice4 = Banana_PiPrice.get(3).getText();
			String ActualBanana_PiPrice5 = Banana_PiPrice.get(4).getText();
			String ActualBanana_PiPrice6 = Banana_PiPrice.get(5).getText();
			String ActualBanana_PiPrice7 = Banana_PiPrice.get(6).getText();
			String ActualBanana_PiPrice8 = Banana_PiPrice.get(7).getText();
			String ActualBanana_PiPrice9 = Banana_PiPrice.get(8).getText();
			
			System.out.println("check by brand");
			System.out.println("***********************************");

		

			if (expectedBanana_PiName1.equals(ActualBanana_PiBrandName1)) {
					System.out.println("PASS");
				} else {
					System.out.println("FAIL");
				}
				System.out.println("Expected Result: " + expectedBanana_PiName1);
				System.out.println("Actual Result: " + ActualBanana_PiBrandName1);


			if (expectedBanana_PiName2.equals(ActualBanana_PiBrandName2)) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail");
			}
				System.out.println("Expected Result: " + expectedBanana_PiName2);
				System.out.println("Actual Result: " + ActualBanana_PiBrandName2);
			
				

			if (expectedBanana_PiName3.equals(ActualBanana_PiBrandName3)) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail");
			}
			System.out.println("Expected Result: " + expectedBanana_PiName3);
			System.out.println("Actual Result: " + ActualBanana_PiBrandName3);

			
			
			if (expectedBanana_PiName4.equals(ActualBanana_PiBrandName4)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
			System.out.println("Expected Result: " + expectedBanana_PiName4);
			System.out.println("Actual Result: " + ActualBanana_PiBrandName4);

			
			
			if (expectedBanana_PiName5.equals(ActualBanana_PiBrandName5)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
			System.out.println("Expected Result: " + expectedBanana_PiName5);
			System.out.println("Actual Result: " + ActualBanana_PiBrandName5);

			
			
			if (expectedBanana_PiName6.equals(ActualBanana_PiBrandName6)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
			System.out.println("Expected Result: " + expectedBanana_PiName6);
			System.out.println("Actual Result: " + ActualBanana_PiBrandName6);

			
			
			if (expectedBanana_PiName7.equals(ActualBanana_PiBrandName7)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
			System.out.println("Expected Result: " + expectedBanana_PiName7);
			System.out.println("Actual Result: " + ActualBanana_PiBrandName7);

			
			if (expectedBanana_PiName8.equals(ActualBanana_PiBrandName8)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
			System.out.println("Expected Result: " + expectedBanana_PiName8);
			System.out.println("Actual Result: " + ActualBanana_PiBrandName8);

			
			if (expectedBanana_PiName9.equals(ActualBanana_PiBrandName9)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
			System.out.println("Expected Result: " + expectedBanana_PiName9);
			System.out.println("Actual Result: " + ActualBanana_PiBrandName9);

			
			System.out.println("check by price");
			System.out.println("***********************************");

			if (expectedBanana_PiPrice1.equals(ActualBanana_PiPrice1)) {
					System.out.println("PASS");
				} else {
					System.out.println("FAIL");
				}
				System.out.println("Expected Result: " + expectedBanana_PiPrice1);
				System.out.println("Actual Result: " + ActualBanana_PiPrice1);


			if (expectedBanana_PiPrice2.equals(ActualBanana_PiPrice2)) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail");
			}
				System.out.println("Expected Result: " + expectedBanana_PiPrice2);
				System.out.println("Actual Result: " + ActualBanana_PiPrice2);
			

			if (expectedBanana_PiPrice3.equals(ActualBanana_PiPrice3)) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail");
			}
			System.out.println("Expected Result: " + expectedBanana_PiPrice3);
			System.out.println("Actual Result: " + ActualBanana_PiPrice3);
		
			if (expectedBanana_PiPrice4.equals(ActualBanana_PiPrice4)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
			System.out.println("Expected Result: " + expectedBanana_PiPrice4);
			System.out.println("Actual Result: " + ActualBanana_PiPrice4);
			
			
			if (expectedBanana_PiPrice5.equals(ActualBanana_PiPrice5)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
			System.out.println("Expected Result: " + expectedBanana_PiPrice5);
			System.out.println("Actual Result: " + ActualBanana_PiPrice5);
			
			
			if (expectedBanana_PiPrice6.equals(ActualBanana_PiPrice6)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
			System.out.println("Expected Result: " + expectedBanana_PiPrice6);
			System.out.println("Actual Result: " + ActualBanana_PiPrice6);
			
			if (expectedBanana_PiPrice7.equals(ActualBanana_PiPrice7)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
			System.out.println("Expected Result: " + expectedBanana_PiPrice7);
			System.out.println("Actual Result: " + ActualBanana_PiPrice7);
			
			
			if (expectedBanana_PiPrice8.equals(ActualBanana_PiPrice8)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
			System.out.println("Expected Result: " + expectedBanana_PiPrice8);
			System.out.println("Actual Result: " + ActualBanana_PiPrice8);
			
			if (expectedBanana_PiPrice9.equals(ActualBanana_PiPrice9)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
			System.out.println("Expected Result: " + expectedBanana_PiPrice9);
			System.out.println("Actual Result: " + ActualBanana_PiPrice9);
			
			
			driver.close();


	}

}
