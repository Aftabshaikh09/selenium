package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG {
	WebDriver driver;

	@Test(priority = 1)
	void launchbrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	void RBcheckbox() throws InterruptedException {
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='radio3']"));
		checkbox.click();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	void mulcheckbox() {
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for (WebElement checkbox : checkboxs) {
			if (!checkbox.isSelected()) {
				checkbox.click();
			}
		}

	}

}
