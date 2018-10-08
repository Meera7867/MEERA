package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;




public class Ex_Millionclouds_Sikuli 
{

	public static void main(String[] args) throws InterruptedException, FindFailed
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//automate non html elements(sikuli)
		//s.click("E:\\selenium\\fp.png");
		//Thread.sleep(5000);
		//s.click("E:\\selenium\\allow.png");
		//Thread.sleep(3000);
		//s.click("runthistime.png");
		//Thread.sleep(6000);
		//driver.findElement(By.name("search_query")).sendKeys("abdul kalam speech");
		Screen s=new Screen();
		s.type("search.png","abdul kalam speech");
		Thread.sleep(3000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		s.click("abdul.png");
		Thread.sleep(3000);
		s.mouseMove("pause.png");
		s.click("pause.png");
		Thread.sleep(3000);
		s.mouseMove("volume.png");
		Thread.sleep(3000);
		s.mouseMove("volume1.png");
		s.click("volume1.png");
		/*Screen s=new Screen();
		s.click("gmail.png");
		Thread.sleep(5000);
        s.click("sign1.png");
        Thread.sleep(5000);
        s.mouseMove("sign.png");*/

	}

}
