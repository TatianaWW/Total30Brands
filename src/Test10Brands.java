import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10Brands {
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

//*************************************************************DragonBoard***********************************************************************		
		// find DragonBoard Brand and click on it
		String expectedDragonBoardName1 = "DragonBoard 820C";
		String expectedDragonBoardPrice1 = "$199.00";

		driver.findElement(By.xpath("//label/span[contains(text(),'DragonBoard')]")).click();
		Thread.sleep(3000);
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> DragonBoardBrandName = driver.findElements(By.className("_2BULo"));
		
		String ActualDragonBoardBrandName1 = DragonBoardBrandName.get(0).getText();

		// Print price of List Elements
		List<WebElement> DragonBoardPrice = driver.findElements(By.className("_23ArP"));
		String ActualDragonBoardPrice1 = DragonBoardPrice.get(0).getText();

		System.out.println("***********************************");
		System.out.println("check by brand DragonBoard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualDragonBoardBrandName1);
		if (expectedDragonBoardName1.equals(ActualDragonBoardBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedDragonBoardName1);
		System.out.println("Actual Result: " + ActualDragonBoardBrandName1);

		System.out.println("***********************************");
		System.out.println("check by price DragonBoard");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualDragonBoardBrandName1);
		if (expectedDragonBoardPrice1.equals(ActualDragonBoardPrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedDragonBoardPrice1);
		System.out.println("Actual Result: " + ActualDragonBoardPrice1);
		driver.findElement(By.xpath("//label/span[contains(text(),'DragonBoard')]")).click();
		Thread.sleep(1000);
//*************************************************************DragonBoard***********************************************************************
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
		driver.findElement(By.xpath("//label/span[contains(text(),'Chip Pro')]")).click();
		Thread.sleep(1000);
//*************************************************************Chip Pro***********************************************************************
//*************************************************************CloudBit***********************************************************************		
		// find CloudBit Brand and click on it
		String expectedCloudBitName1 = "CloudBit";
		String expectedCloudBitPrice1 = "$60.00";

		driver.findElement(By.xpath("//label/span[contains(text(),'CloudBit')]")).click();
		Thread.sleep(3000);
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> CloudBitBrandName = driver.findElements(By.className("_2BULo"));
		String ActualCloudBitBrandName1 = CloudBitBrandName.get(0).getText();

		// Print number of List Elements
		List<WebElement> CloudBitPrice = driver.findElements(By.className("_23ArP"));
		String ActualCloudBitPrice1 = CloudBitPrice.get(0).getText();

		System.out.println("***********************************");
		System.out.println("check by brand CloudBit");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCloudBitBrandName1);
		if (expectedCloudBitName1.equals(ActualCloudBitBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCloudBitName1);
		System.out.println("Actual Result: " + ActualCloudBitBrandName1);

		System.out.println("***********************************");
		System.out.println("check by price CloudBit");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualCloudBitBrandName1);
		if (expectedCloudBitPrice1.equals(ActualCloudBitPrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedCloudBitPrice1);
		System.out.println("Actual Result: " + ActualCloudBitPrice1);
		driver.findElement(By.xpath("//label/span[contains(text(),'CloudBit')]")).click();
		Thread.sleep(1000);
//*************************************************************CloudBit***********************************************************************
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
		driver.findElement(By.xpath("//label/span[contains(text(),'Creator')]")).click();
		Thread.sleep(1000);
//*************************************************************Creator***********************************************************************
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
		
		driver.findElement(By.xpath("//label/span[contains(text(),'Cubieboard')]")).click();
		Thread.sleep(1000);
		
		
//*************************************************************Cubieboard***********************************************************************
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
		
		driver.findElement(By.xpath("//label/span[contains(text(),'DE0-Nano-SoC')]")).click();
		Thread.sleep(1000);
		
//*************************************************************DE0-Nano-SoC***********************************************************************
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
		
		driver.findElement(By.xpath("//label/span[contains(text(),'Firefly')]")).click();
		Thread.sleep(1000);
		
		
		
//*************************************************************Firefly***********************************************************************
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
		
		driver.findElement(By.xpath("//label/span[contains(text(),'HummingBoard')]")).click();
		Thread.sleep(1000);
		
//*************************************************************HummingBoard***********************************************************************
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
		
	
		driver.findElement(By.xpath("//label/span[contains(text(),'Khadas')]")).click();
		Thread.sleep(1000);
				
//*************************************************************Khadas***********************************************************************
//*************************************************************LeMaker***********************************************************************		
		// find LeMaker Brand and click on it
		String expectedLeMakerName1 = "LeMaker 8Guitar";
		String expectedLeMakerPrice1 = "$69.00";

		driver.findElement(By.xpath("//label/span[contains(text(),'LeMaker')]")).click();
		Thread.sleep(3000);
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> LeMakerBrandName = driver.findElements(By.className("_2BULo"));
		
		String ActualLeMakerBrandName1 = LeMakerBrandName.get(0).getText();

		// Print price of List Elements
		List<WebElement> LeMakerPrice = driver.findElements(By.className("_23ArP"));
		String ActualLeMakerPrice1 = LeMakerPrice.get(0).getText();

		System.out.println("***********************************");
		System.out.println("check by brand LeMaker");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualLeMakerBrandName1);
		if (expectedLeMakerName1.equals(ActualLeMakerBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedLeMakerName1);
		System.out.println("Actual Result: " + ActualLeMakerBrandName1);

		System.out.println("***********************************");
		System.out.println("check by price LeMaker");
		System.out.println("***********************************");
		System.out.println("Item name: " + ActualLeMakerBrandName1);
		if (expectedLeMakerPrice1.equals(ActualLeMakerPrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedLeMakerPrice1);
		System.out.println("Actual Result: " + ActualLeMakerPrice1);
		
		driver.findElement(By.xpath("//label/span[contains(text(),'LeMaker')]")).click();
		Thread.sleep(1000);
		
//*************************************************************LeMaker***********************************************************************
		
		

		driver.quit();

	}

}
