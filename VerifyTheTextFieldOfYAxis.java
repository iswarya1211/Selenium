package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTextFieldOfYAxis {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/identify/");
	WebElement emailTextField = driver.findElement(By.name("email"));
	int emailstartY = emailTextField.getLocation().getY();
	System.out.println("emailTextFieldYAxis= "+emailstartY);
	WebElement passwordTextField = driver.findElement(By.name("pass"));
	int passwordstartY = passwordTextField.getLocation().getY();
	System.out.println("passwordTextFieldYAxus= "+passwordstartY);
	if(emailstartY==passwordstartY) {
		System.out.println("Pass: the email and password TF is verified and found correct ");
	}
	else {
		System.out.println("Fail: the email and password TF is verified and found incorrect ");
		
	}
	
}
}
