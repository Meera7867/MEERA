package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleSelect_Div_Tag {

	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		//automate single select drop down
		WebElement e= driver.findElement(By.xpath("(//*[@class='ui selection dropdown'])[1]"));
		Actions a=new Actions(driver);
		a.click(e).build().perform();
		Thread.sleep(5000);
		a.sendKeys("f").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		

	}

}
