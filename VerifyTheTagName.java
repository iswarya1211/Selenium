package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTagName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		String dayTagName = dayDropDown.getTagName();
		if(dayTagName.equals("select")) {
			dayDropDown.click();
			
		}
		else {
			System.out.println("the dropdown is not created with select tag");
		}
		
	}

}
