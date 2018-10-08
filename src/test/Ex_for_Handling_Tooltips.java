package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_for_Handling_Tooltips {

	
	public static void main(String[] args) throws InterruptedException 
	{
		//Run browser driver to get browser
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Launch Site
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		//maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//get too_tip via title attribute
		WebElement e1=driver.findElement(By.linkText("JAVASCRIPT"));
		String x=e1.getAttribute("title");
		System.out.println(x);
		Thread.sleep(5000);
		//scroll page to  specific element
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement e2=driver.findElement(By.xpath("//*[text()='Demo: Tooltip Examples']"));
		js.executeScript("arguments[0].scrollIntoView();",e2);
		Thread.sleep(5000);
		//move mouse pointer to an element for tool-tip
		WebElement e3=driver.findElement(By.xpath("(//*[@class='tooltip'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(e3).clickAndHold().build().perform();
		Thread.sleep(5000);
		WebElement e4=driver.findElement(By.xpath("(//*[@class='tooltip'])[1]/span"));
		String y=e4.getText();
		System.out.println(y);
		a.release().build().perform();
		//close site
		driver.close();
		
		

	}
	

}
