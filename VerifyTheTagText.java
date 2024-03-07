package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTagText {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement facebookText=driver.findElement(By.xpath("//h2[contains (@class,\"_8eso\")]"));
	String normaltext = facebookText.getText();
	if (normaltext.equals("Facebook helps you connect and share with the people in your life.") ) {
		System.out.println("pass: no spelling mistake is occured ");
	}
	else {
		System.out.println("fail: there is an spelling mistake");
	}
}

}
