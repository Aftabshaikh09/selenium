package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement T1 = driver.findElement(By.id("droppable"));
		WebElement T2 = driver.findElement(By.id("dropzone2"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, T1).build().perform();
		Thread.sleep(5000);
		act.dragAndDrop(source, T2).build().perform();

	}

}