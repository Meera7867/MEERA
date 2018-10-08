package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateSliders {

	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//go to frame
		driver.switchTo().frame(0);
		//Automate Sliders
		WebElement e1=driver.findElement(By.xpath("//*[@id='slider']/span"));
		int x1=e1.getLocation().getX();
		int y1=e1.getLocation().getY();
		Actions a=new Actions(driver);
		//horizontial Slider from left to right
		a.dragAndDropBy(e1,x1+100,y1).build().perform();
		Thread.sleep(5000);
		//horizontial slider from right to left
		a.dragAndDropBy(e1, x1-100,y1).build().perform();
		Thread.sleep(5000);
		//Back to page
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//click link (Vertical Slider)
		driver.findElement(By.linkText("Vertical slider")).click();
		Thread.sleep(5000);
		//go to frame
		driver.switchTo().frame(0);
		//AUTOMATE VERTICAL SLIDERS
		WebElement e2=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
		int x2=e2.getLocation().getX();
		int y2=e2.getLocation().getY();
		//vertical sliders from top to bottom
		a.dragAndDropBy(e2, x2, y2+100);
		a.pause(5000);
		//vertical slider from bottom to top
		a.dragAndDropBy(e2, x2, y2-100);
		a.pause(5000);
		//back to page
		driver.switchTo().defaultContent();
		//close site
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
