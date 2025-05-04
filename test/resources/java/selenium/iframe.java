package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/iframes");
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));
		driver.switchTo().frame(iframe1);
		driver.findElement(By.id("actionButton")).click();
		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		// driver.get("https://v1.training-support.net/selenium/iframes");
		WebElement iframe2 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));
		driver.switchTo().frame(iframe2);
		driver.findElement(By.id("actionButton")).click();

	}

}
