package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		Thread.sleep(5000);
		obj.get("http://www.google.co.in");
		Thread.sleep(5000);
		obj.findElement(By.name("q")).sendKeys("kalam",Keys.ENTER);
		Thread.sleep(5000);
		obj.close();

	}

}
