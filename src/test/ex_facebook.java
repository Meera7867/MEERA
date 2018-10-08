package test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex_facebook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// 
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.name("email")).sendKeys("meera14.mohammed@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("meera@123");
	    driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
	    Thread.sleep(5000);
	   //driver.findElement(By.className("_g5z")).click();
	    driver.findElement(By.xpath("//*[@aria-labelledby=notification-permission-title")).click();
       driver.findElement(By.xpath(""));
       
	    

	}

}
