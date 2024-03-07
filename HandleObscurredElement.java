package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleObscurredElement {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	Thread.sleep(2000); 
	WebElement dismissOpt = driver.findElement(By.xpath("//span[contains(text(),DISMISS)]/.//input[@type=\"submit\"]"));
	dismissOpt.click();
	Thread.sleep(2000);
	WebElement customerServiceLink = driver.findElement(By.xpath("//div/a[text()=\"Customer Service\"]"));
	customerServiceLink.click();
}

}
//NoSuchElementException