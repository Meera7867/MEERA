package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		//Run chromedriver.exe to get chromebrowser
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		//open chrome browser
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.google.co.in");
		//wait 5000sec
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("abdulkalam",Keys.ENTER);
		//close site
		driver.close();
		

	}

}
