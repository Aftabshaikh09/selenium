package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File sourcefile =
		 * ts.getScreenshotAs(OutputType.FILE); File targetfile = new
		 * File("C:\\Users\\infinix\\Documents\\SeleniumScreenShotes\\screenshot1.png");
		 * FileUtils.copyFile(sourcefile, targetfile);
		 */

		WebElement logo = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		File sourcefile = logo.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("C:\\\\Users\\\\infinix\\\\Documents\\\\SeleniumScreenShotes\\\\logo.png");
		FileUtils.copyFile(sourcefile, targetfile);

	}

}
