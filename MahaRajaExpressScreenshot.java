package TakeScreeshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MahaRajaExpressScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.the-maharajas.com/");
		WebElement mahaRajaLogo = driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-4 col-4 logo-wrap']//img"));
		File tempFile = mahaRajaLogo.getScreenshotAs(OutputType.FILE);
		File permFile = new File("./errorshots/mahaRajaLogo.png");
		FileUtils.copyFile(tempFile, permFile);
		driver.manage().window().minimize();
		driver.quit();
	}

}