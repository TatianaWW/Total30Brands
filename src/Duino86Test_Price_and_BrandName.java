import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duino86Test_Price_and_BrandName {
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
	


 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
 driver= new ChromeDriver();
 driver.get ("https://kamenkaksk.wixsite.com/wwes-13-1");
 driver.manage().window().maximize();
// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 
 String expectedDuino86Name1 = "86Duino Zero";
 String expectedDuino86Price1 = "$39.00";
 Thread.sleep(5000);
//find Element [All products] by xpath and click on it
driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
//find Element [BRAND] by xpath and click on it
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/button")).click();
//find Element [86Duino] by xpath and click on it
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[1]/label/span")).click();
Thread.sleep(5000);
//driver.findElement(By.xpath("//label/span[contains(text(),'86Duino')]")).click();
//find all elements which has a className= "_2BULo" and put them in the data
List<WebElement> Duino86BrandName = driver.findElements(By.className("_2BULo"));
//create new Variable
int numberOFDuino86BrandName = Duino86BrandName.size();
String ActualDuino86BrandName1 = Duino86BrandName.get(0).getText();


//Print number of List Elements
List<WebElement> Duino86Price = driver.findElements(By.className("_23ArP"));
int numberOFDuino86Price = Duino86Price.size();
String ActualDuino86Price1 = Duino86Price.get(0).getText();

System.out.println("check by brand");
System.out.println("***********************************");



if (expectedDuino86Name1.equals(ActualDuino86BrandName1)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedDuino86Name1);
System.out.println("Actual Result: " + ActualDuino86BrandName1);


System.out.println("check by price");
System.out.println("***********************************");

if (expectedDuino86Price1.equals(ActualDuino86Price1)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedDuino86Price1);
System.out.println("Actual Result: " + ActualDuino86Price1);




 
 
 
 
 
 

 driver.close();
	
	
	
	
	
	}
	}


