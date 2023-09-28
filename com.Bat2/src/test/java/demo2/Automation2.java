package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vuse.com/gb/en/customer/account/create/");
		driver.manage().window().maximize();
		//WebElement cartIcon=driver.findElement(By.xpath("//a[@class='action showcart']"));
		//cartIcon.click();
		
		WebElement firstFiled=driver.findElement(By.xpath("(//input[@id='firstname'])[1]"));
		firstFiled.sendKeys("Aamir");
		WebElement lastFiled=driver.findElement(By.xpath("(//input[@id='lastname'])[1]"));
		lastFiled.sendKeys("khan");
		WebElement mailFiled=driver.findElement(By.xpath("//input[@id='email_address']"));
		mailFiled.sendKeys("aamir2385@gmail.com");
		WebElement dobFiled=driver.findElement(By.xpath("//input[@id='dob']"));
		dobFiled.sendKeys("03/04/2000");
	
		
	}

}
