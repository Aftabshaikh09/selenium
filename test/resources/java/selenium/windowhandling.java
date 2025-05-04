package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("openwindow")).click();
		String parwin = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String winhandle : allwindows) {
			driver.switchTo().window(winhandle);
			driver.findElement(By.linkText("Access all our Courses")).click();
			Thread.sleep(2000);
			driver.switchTo().window(parwin);
			driver.findElement(By.xpath("//button[text()='Home']")).click();
			Thread.sleep(2000);

		}

	}

}
