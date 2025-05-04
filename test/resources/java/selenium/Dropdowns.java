package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("country"));
		Select drp = new Select(dropdown);
		// drp.selectByIndex(5);
		drp.selectByVisibleText("Canada");
		// drp.deselectByValue("Canada");
	}
}
