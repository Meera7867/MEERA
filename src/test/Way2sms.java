package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Way2sms 
{

	
	public static void main(String[] args) throws InterruptedException, AWTException
	{  
		
		//Run geckodriver to get firefoxbrowser
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//launch site of way2sms
		driver.get("http://site21.way2sms.com/content/index.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElementByName("username").sendKeys("7416595934");
		//driver.findElement(By.name("username")).sendKeys("7416595934");
		Thread.sleep(5000);
		driver.findElementByName("password").sendKeys("N3494H");
		Thread.sleep(5000);
		driver.findElementById("loginBTN").click();
		FluentWait w=new FluentWait(driver).pollingEvery(2,TimeUnit.SECONDS).withTimeout(100,TimeUnit.SECONDS);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Send SMS']")));
		driver.findElementByXPath("//*[text()='Send SMS']").click();
		Thread.sleep(5000);
		driver.switchTo().frame("frame");
		driver.findElementByName("mobile").sendKeys("8121758239");
		Thread.sleep(25000);
		//driver.findElement(By.linkText("Language SMS")).click();
		driver.findElementByName("message").sendKeys("assalamalikum");
		Thread.sleep(5000);
		driver.findElementByName("Send").click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		if(driver.findElement(By.xpath("(//*[text()='Install Chrome Plugin'])[1]")).isDisplayed())
		{
			driver.findElement(By.xpath("(//*[text()='Install Chrome Plugin'])[1]")).click();
			Thread.sleep(5000);
			Robot r=new Robot();
			for(int i=1;i<=2;i++)
			{
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(5000);
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
		}
		driver.switchTo().frame("frame");
		String x=driver.findElement(By.xpath("//*[@class='mess']/descendant::span")).getText();
		System.out.println(x);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='out louti']")).click();
		
		//close site
		driver.close();
		
		
				
		
		
		
		

	}

}
