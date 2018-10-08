package test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("meera14.mohammed@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("meera2266");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(50000);
		driver.findElement(By.name("idvPin")).click();

		Thread.sleep(50000);
		WebElement p=driver.findElement(By.xpath("(//*[@role='link'])[3]::descendant::table/child::tbody"));
		List<WebElement> rl=p.findElements(By.id("3r"));
		System.out.println(rl.size());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@title,'Google Account')]/child::*")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		driver.close();
		

	}

}
