package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		while (!driver.findElement(By.className("ui-datepicker-title")).getText().equals("May 2022")) {
			driver.findElement(By.className("ui-datepicker-prev")).click();
		}
		driver.findElement(By.xpath("//a[text()=10]")).click();
		Thread.sleep(4000);
	}

}
