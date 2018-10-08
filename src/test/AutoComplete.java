package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoComplete {

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//go to frame
		driver.switchTo().frame(0);
		//perform drag and drop
		WebElement e1=driver.findElement(By.id("draggable"));
		WebElement e2=driver.findElement(By.id("droppable"));
		Actions a= new Actions(driver);
		a.dragAndDrop(e1,e2).build().perform();
		//back to page
		driver.switchTo().defaultContent();
		//close site
		driver.close();

		
	}

}
