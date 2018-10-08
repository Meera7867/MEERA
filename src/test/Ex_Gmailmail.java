package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex_Gmailmail 
{

	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
		driver.findElement(By.name("identifier")).sendKeys("meera14.mohammed@gmail.com");
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("meerambi123");
        Thread.sleep(5000);
        driver.findElement(By.id("idvPin")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
        driver.findElement(By.name("to")).sendKeys("apjabdul@gmail.com");
        driver.findElement(By.name("subjectbox")).click();
        
        
	}

}
