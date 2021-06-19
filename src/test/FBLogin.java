package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));
		UserName.sendKeys("ausr@my.com");
	
		WebElement Password = driver.findElement(By.xpath("//input[@name='pass']"));
		Password.sendKeys("pass123");
		
		WebElement ClickLogin = driver.findElement(By.xpath("//button[@name='login']"));
		
		ClickLogin.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement LoginIdentity = driver.findElement(By.xpath("//a[@href='/login/identify/']"));
		System.out.println(LoginIdentity.getText());
		
		//driver.close();
	}

}
