package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Test7 
{

	
	public static void main(String[] args) 
	
	{
		/*System.setProperty("webdriver.ie.driver","E:\\selenium\\iedriverserver.exe");
	InternetExplorerDriver driver=new InternetExplorerDriver();*/
		
		/*System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://site24.way2sms.com/content/index.html");
		driver.findElement(By.name("username")).sendKeys("7416595934");
		driver.findElement(By.name("password")).sendKeys("N3494H");
		driver.findElement(By.id("loginBTN")).click();
		driver.findElement(By.xpath("//*[text()='Send SMS']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.name("mobile")).sendKeys("7416595934");
		driver.switchTo().defaultContent();
		//driver.findElement(")



}
}
