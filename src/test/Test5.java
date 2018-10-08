package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 

{


	public static void main(String[] args) throws InterruptedException
	{
		//run chromedriver.exe to open chromebrowser
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://site21.way2sms.com");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[text()='SendSMS']")).click();
		driver.findElement(By.name("username")).sendKeys("7416595934");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("N3494H");
		driver.findElement(By.id("loginBTN")).click();
		//driver.close();
		driver.findElement(By.xpath("//*[text()='Send SMS']")).click();

} 
	
}