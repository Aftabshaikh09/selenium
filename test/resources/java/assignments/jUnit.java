package assignments;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(OrderAnnotation.class)
public class jUnit {

	static WebDriver driver;

	@Test
	@Order(1)
	void launchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test
	@Order(2)
	void RBcheckbox() throws InterruptedException {
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='radio3']"));
		checkbox.click();
		Thread.sleep(2000);
	}

	@Test
	@Order(3)
	void mulcheckbox() {
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for (WebElement checkbox : checkboxs) {
			if (!checkbox.isSelected()) {
				checkbox.click();
			}
		}
	}
}
