package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_drag_drop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		//automate drag-drop elements
		//create dom
		WebElement e1=driver.findElement(By.id("draggable"));
		WebElement e2=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(e1, e2).build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
	//	driver.close();
	}

}
