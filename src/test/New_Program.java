package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Program {

	public static void main(String[] args) throws InterruptedException {
		//Run browser driver to get chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		

	}

	
}

