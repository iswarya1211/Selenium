package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		WebElement loginTextField = driver.findElement(By.linkText("identifierId"));
		loginTextField.sendKeys("ishu@gmail.com");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
