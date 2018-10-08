package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_sliders {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		driver.switchTo().frame(0);
		//automate horizontal-slider elements
		//create dom
		WebElement e1=driver.findElement(By.xpath("//*[@id='slider']/span"));
		int x=e1.getLocation().getX();
		int y=e1.getLocation().getY();
				
		Actions a=new Actions(driver);
		a.dragAndDropBy(e1, x+300, y).build().perform();
		//r to left
		a.dragAndDropBy(e1, x-200, y).build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Vertical slider")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		e1=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
		 x=e1.getLocation().getX();
		 y=e1.getLocation().getY();
				
		 a.dragAndDropBy(e1, x, y+100).build().perform();
		 Thread.sleep(3000);
		 a.dragAndDropBy(e1, x, y-200).build().perform();
		driver.switchTo().defaultContent();


	}

}
