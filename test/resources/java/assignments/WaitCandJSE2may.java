package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitCandJSE2may {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		/*
		 * // Q-1
		 * 
		 * driver.get("http://www.ebay.com/"); WebElement searchB =
		 * driver.findElement(By.id("gh-ac")); searchB.sendKeys("shoes");
		 * driver.findElement(By.id("gh-search-btn")).click(); JavascriptExecutor sc =
		 * (JavascriptExecutor) driver;
		 * sc.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 * Thread.sleep(2000); sc.executeScript("window.scrollTo(0,0)"); WebElement
		 * clearB = driver.findElement(By.id("gh-ac")); clearB.clear();
		 */

		// Q-2

		driver.get("http://www.snapdeal.com/");
		WebElement searchbox = driver.findElement(By.id("inputValEnter"));
		WebElement searchbtn = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		JavascriptExecutor box = (JavascriptExecutor) driver;
		box.executeScript("arguments[0].value = 'shoes';", searchbox);
		Thread.sleep(2000);
		JavascriptExecutor btn = (JavascriptExecutor) driver;
		btn.executeScript("arguments[0].click();", searchbtn);

	}

}
