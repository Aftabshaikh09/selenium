package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingiframe30apr {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// Q-1
		/*
		 * driver.get("https://v1.training-support.net/selenium/iframes");
		 * driver.manage().window().maximize(); WebElement frame1 =
		 * driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));
		 * driver.switchTo().frame(frame1);
		 * driver.findElement(By.id("actionButton")).click();
		 * driver.switchTo().defaultContent(); WebElement frame2 =
		 * driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));
		 * driver.switchTo().frame(frame2);
		 * driver.findElement(By.id("actionButton")).click();
		 * driver.switchTo().defaultContent();
		 */

		// Q-2

		driver.get("https://the-internet.herokuapp.com/login");
		String backloginpage = driver.getWindowHandle();
		driver.findElement(By.linkText("Elemental Selenium")).click();
		Thread.sleep(2000);
		driver.switchTo().window(backloginpage);
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

}
