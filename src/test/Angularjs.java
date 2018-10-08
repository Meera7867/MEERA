package test;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Angularjs {

	
	public static void main(String[] args) 
	{
		//get value from keyboard
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		String x=sc.nextLine();
		//open Browser
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://angularjs.org/");
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ng-model='yourName']")));
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e=driver.findElement(By.xpath("//*[@ng_model='yourName']"));
		js.executeScript("arguments[0].scrollIntoView();",e);
		driver.findElement(By.xpath("//*[@ng-model='yourName']")).sendKeys(x);
		String y=driver.findElement(By.xpath("//*[contains(text(),'build this app')])[1]/presceding::*[1]")).getText();
		
		if(y.contains(x))
				{
			System.out.println("test passed");
				}
		else
		{
			System.out.println("test failed");
		}
				
		
		
		
	
	}

}
