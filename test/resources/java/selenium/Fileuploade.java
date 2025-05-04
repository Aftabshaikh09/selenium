package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploade {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("filesToUpload"))
				.sendKeys("C:\\Users\\infinix\\Documents\\SeleniumScreenShotes\\screenshot1.png");
		if (driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("screenshot1.png")) {
			System.out.println("file upload succesfully");
		} else {
			System.out.println("file not upload");
		}

	}

}
