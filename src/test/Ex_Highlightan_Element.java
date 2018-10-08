package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_Highlightan_Element {


	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//scroll to bottom
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		//scroll to up
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.xpath("//*[@class='search'])[2]"));
		js.executeScript("arguments[0].scrollIntoview();",e1);
		Thread.sleep(5000);
		
		

	}

}
