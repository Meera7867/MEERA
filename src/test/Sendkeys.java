package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		/*Run chromeDriver.exe  to get the chromeBrowser*/
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("REGISTER")).click();
		//driver.findElement(By.name("firstName")).sendKeys("abdul",Keys.TAB,"kalam",Keys.TAB,"7416595934",Keys.TAB,"meera14.mohammed@gmail.com");
		//driver.findElement(By.name("firstName")).sendKeys("abdul");
		/*WebElement e=driver.findElement(By.name("firstName"));
		e.sendKeys("abdul");*/
		WebElement e=driver.findElement(By.name("firstName"));
		String x=e.getAttribute("maxlength");
		System.out.println(x);
		

	}

}
