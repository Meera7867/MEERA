package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_dropable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(0);
		//automate drag-drop elements
		//create dom
		WebElement e1=driver.findElement(By.id("draggable"));
		int x=e1.getLocation().getX();
		int y=e1.getLocation().getY();
		
		
		
		Actions a=new Actions(driver);
		a.dragAndDropBy(e1, x+100, y+100).build().perform();
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();

	}

}
