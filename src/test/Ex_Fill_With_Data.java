package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex_Fill_With_Data {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		//WebElement e=driver.findElement(By.name("Email"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value='meera14.mohammed@gmail.com';",e);
		//js.executeScript("arguments[0].style.border='2px dashed pink';",e);
		//Thread.sleep(5000);
		js.executeScript("document.getElementById('meera14.mohammed@gmail.com).click();");
		


	}

}
