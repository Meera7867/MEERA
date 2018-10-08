package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
	     options.addArguments("--disable-notifications");
	     
	 
     System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
     WebDriver driver=new ChromeDriver(options);
     driver.get("https://www.facebook.com");
     driver.findElement(By.name("firstname")).sendKeys("shakil");
     driver.findElement(By.name("lastname")).sendKeys("mohammed");
     driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("shaki987@gmail.com");
     driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shaki987@gmail.com");
    driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("shaki123");
     new Select(driver.findElement(By.xpath("//*[@aria-label='Day']"))).selectByValue("4");
     new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Sept");
     new Select(driver.findElement(By.name("birthday_year"))).selectByValue("1990");
     driver.findElement(By.name("sex")).click();
     driver.findElement(By.xpath("//*[@name='websubmit']")).click();
     driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).click();
    // driver.findElement(By.xpath("//*[text()='Log Out']")).click();
     //driver.findElement(By.xpath("//*[@id='\\js_0\\']/div/div/div[2]/div/div/a")).click();
     driver.findElement(By.xpath("//*[@role='presentation']")).click();
     driver.switchTo().frame("iframe");
     driver.findElement(By.name("submit[Continue]")).click();
    // driver.findElement(By.name("submit[Continue]")).click();
    // driver.findElement(By.name("submit[Secure Account]")).click();
	}

}