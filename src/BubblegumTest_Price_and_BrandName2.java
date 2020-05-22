import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BubblegumTest_Price_and_BrandName2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		String expectedBubblegumName1 = "Bubblegum-96";
		String expectedBubblegumPrice1 = "$71.20";
//		Thread.sleep(5000);
//find Element [All products] by xpath and click on it
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
//find Element [BRAND] by xpath and click on it
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/button"))
				.click();
      //find Element [Bubblegum] by xpath and click on it
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[5]/label/span")).click();
		Thread.sleep(7000);
		//*[@id="TPASection_jcfu7llo"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[5]/label/span
//driver.findElement(By.xpath("//label/span[contains(text(),'Bubblegum')]")).click();
//find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> BubblegumBrandName = driver.findElements(By.className("_2BULo"));
//create new Variable
		int numberOFBubblegumBrandName = BubblegumBrandName.size();
		System.out.println(numberOFBubblegumBrandName);
		String ActualBubblegumBrandName1 = BubblegumBrandName.get(0).getText();
		System.out.println(ActualBubblegumBrandName1);

//Print number of List Elements
		List<WebElement> BubblegumPrice = driver.findElements(By.className("_23ArP"));
		int numberOFBubblegumPrice = BubblegumPrice.size();
		String ActualBubblegumPrice1 = BubblegumPrice.get(0).getText();

		System.out.println("check by brand");
		System.out.println("***********************************");

		if (expectedBubblegumName1.equals(ActualBubblegumBrandName1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedBubblegumName1);
		System.out.println("Actual Result: " + ActualBubblegumBrandName1);

		System.out.println("check by price");
		System.out.println("***********************************");

		if (expectedBubblegumPrice1.equals(ActualBubblegumPrice1)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedBubblegumPrice1);
		System.out.println("Actual Result: " + ActualBubblegumPrice1);

		driver.close();

	}
}
