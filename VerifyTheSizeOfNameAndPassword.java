package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheSizeOfNameAndPassword {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement firstNameTextField = driver.findElement(By.name("firstname"));
		int firstNameHeight = firstNameTextField.getSize().getHeight();
		System.out.println("FirstNameHeight= " + firstNameHeight);
		int firstNameWidth = firstNameTextField.getSize().getWidth();
		System.out.println("FirstNameWidth= "+firstNameWidth);
		
		WebElement surNameTextField = driver.findElement(By.name("lastname"));
		int surNameHeight = surNameTextField.getSize().getHeight();
		System.out.println("SurNameHeight= "+surNameHeight);
		int surNameWidth = surNameTextField.getSize().getWidth();
		System.out.println("SurNameWidth= "+ surNameWidth);
		
		if (firstNameHeight==surNameHeight && firstNameWidth==surNameWidth){
			System.out.println("Pass: The size of the firstname and surname is verified and found correct");
	
		}
		else {
			System.out.println("Fail: The size of the firstname and surname is verified and found incorrect");
		}
		
		WebElement mobileNumberTextField = driver.findElement(By.name("reg_email__"));
		int mobileNumberHeight = mobileNumberTextField.getSize().getHeight();
		System.out.println("MobileNumberTFHeight= "+mobileNumberHeight);
		int mobileNumberWidth = mobileNumberTextField.getSize().getWidth();
		System.out.println("MobileNumberTFWidth= "+mobileNumberWidth);
		
		WebElement passwordTextField = driver.findElement(By.name("reg_passwd__"));
		int passwordHeight = passwordTextField.getSize().getHeight();
		System.out.println("PasswordTFHeight= "+ passwordHeight);
		int passwordWidth = passwordTextField.getSize().getWidth();
		System.out.println("PasswordTFWidth= "+ passwordWidth);
		
		if(mobileNumberHeight==passwordHeight && mobileNumberWidth==passwordWidth) {
			System.out.println("Pass: The size of the mobilenumber and passwordTF is verified and found correct");	
		}
		else {
			System.out.println("Fail: The size of the mobilenumber and passwordTF is verified and found incorrect");
		}
		
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
