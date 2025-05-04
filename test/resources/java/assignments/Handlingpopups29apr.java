package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingpopups29apr {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		driver.manage().window().maximize();

		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);

		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(2000);
		Alert alertP = driver.switchTo().alert();
		alertP.sendKeys("Aftab");
		alertP.accept();
		Thread.sleep(2000);
		driver.quit();

	}

}
