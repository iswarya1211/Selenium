package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CorrectUsageOfSubmitMethod {
	//<form>
	//<button/input type ="submit"/button>
	//</form>
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.submit();
	}

}
