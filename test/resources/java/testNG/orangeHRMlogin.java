package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class orangeHRMlogin {
    WebDriver driver;
    @Test
    void launchbrowser() throws InterruptedException {
    	driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	driver.manage().window().maximize();
    	Thread.sleep(4000);
    	
    }
    
    @Test
    void logoverify() throws InterruptedException {
    	WebElement logo = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
    	System.out.println("logo is present :"+logo.isDisplayed());
    	Thread.sleep(4000);
    }
    @Test
    void login() throws InterruptedException {
    	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
    	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
    	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    	Thread.sleep(4000);
    }
    @Test
    void logout() throws InterruptedException {
    	WebElement logout = driver.findElement(By.xpath("//p[text()=\"manda user\"]"));
    	logout.click();
    	WebElement logoutclick = driver.findElement(By.xpath("//a[text()=\"Logout\"]"));
    	logoutclick.click();
    }

}
