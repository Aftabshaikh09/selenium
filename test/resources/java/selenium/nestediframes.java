package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestediframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/nested-iframes");
		driver.manage().window().maximize();
		WebElement firstframe = driver.findElement(By.xpath("//iframe[@src=\"/selenium/nested-iframe1\"]"));
		driver.switchTo().frame(firstframe);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src=\"/selenium/frame1\"]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("actionButton")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src=\"/selenium/frame2\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.id("actionButton")).click();
		driver.switchTo().parentFrame();

	}

}