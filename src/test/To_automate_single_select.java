package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class To_automate_single_select {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Automate <div> tag  single select drop-down
		WebElement e1=driver.findElement(By.xpath("//*[@class='ui drop down'])[1]"));
		Actions a=new Actions(driver);
		a.click(e1).build().perform();
		Thread.sleep(5000);
		for(int i=1;i<=4;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(5000);
		}
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);

	}

}
