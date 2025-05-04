package evaluations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class evaluation28april {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Task - 1

		driver.get("https://example.com/");
		String title = driver.getTitle();
		System.out.println(title);

		// Task - 2

		driver.get("https://automationexercise.com/login");
		driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]")).sendKeys("Aftab");
		driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("Aftab13@gamil.com");
		driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		WebElement day = driver.findElement(By.id("days"));
		day.sendKeys("23");
		WebElement month = driver.findElement(By.id("months"));
		month.sendKeys("April");
		WebElement year = driver.findElement(By.id("years"));
		year.sendKeys("April");
		WebElement check = driver.findElement(By.id("newsletter"));
		check.click();
		driver.findElement(By.id("first_name")).sendKeys("Aftab");
		driver.findElement(By.id("last_name")).sendKeys("shaikh");
		driver.findElement(By.id("company")).sendKeys("Masai");
		driver.findElement(By.id("address1")).sendKeys("abcd");
		driver.findElement(By.id("address2")).sendKeys("abcd");
		WebElement dr = driver.findElement(By.id("country"));
		dr.sendKeys("india");
		driver.findElement(By.id("state")).sendKeys("maharashtra");
		driver.findElement(By.id("city")).sendKeys("latur");
		driver.findElement(By.id("zipcode")).sendKeys("413516");
		driver.findElement(By.id("mobile_number")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();

		// Task - 3

		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		// Task - 4

		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Aftab");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@name=\"comments\"]")).sendKeys("abcdeef");
		WebElement cb = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		cb.click();
		WebElement rd = driver.findElement(By.xpath("//input[@value=\"rd3\"]"));
		rd.click();
		WebElement mv = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		mv.click();
		WebElement dd = driver.findElement(By.xpath("/select[@name=\"dropdown\"]"));
		dd.sendKeys(" Drop Down Item 6");
		driver.findElement(By.xpath("//input[@value='submit']")).click();

	}

}
