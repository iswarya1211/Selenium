package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadTheDataFromPropertyFile {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./files/commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String browser = pobj.getProperty("browser");
		//System.out.println("browser = "+ browser);
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(pobj.getProperty("url"));
		Thread.sleep(2000);
		WebElement userNameTextFiled = driver.findElement(By.id("username"));
		userNameTextFiled.clear();
		Thread.sleep(2000);
		WebElement passwordTextFiled = driver.findElement(By.id("password"));
		passwordTextFiled.clear();
		Thread.sleep(2000);
		userNameTextFiled.sendKeys(pobj.getProperty("username"));
		Thread.sleep(2000);
		passwordTextFiled.sendKeys(pobj.getProperty("password"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
		
		
	}

}
