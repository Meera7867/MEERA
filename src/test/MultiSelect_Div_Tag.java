package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelect_Div_Tag 
{

	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		//Click on multi-Select drop-down(div-tag)
	 WebElement e=driver.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']"));
	 Actions a=new Actions(driver);
	 a.click(e).build().perform();
	 a.pause(5000);
	 //collect all items in that drop down
	 List <WebElement> il=driver.findElements(By.xpath("//*[@class='menu transition visible']/div"));
	 System.out.println("all items count is" +il.size());
	 //Display all items 
	 
	 for(int i=0;i<il.size();i++)
	 {
		 System.out.println(il.get(i).getText());
		 
	 }
	 //selected required items
	 a.sendKeys("c").build().perform();
	 Thread.sleep(5000);
	 a.sendKeys(Keys.ENTER).build().perform();
	 Thread.sleep(5000);
	 a.sendKeys("g").build().perform();
	 a.pause(5000);
	 a.sendKeys(Keys.ENTER).build().perform();
	 Thread.sleep(5000);
	 a.sendKeys(Keys.ESCAPE).build().perform();
	 List<WebElement>sil=driver.findElements(By.xpath("//*[contains(@class,'selection mutiple forward')]/child::div"));
	 
	 System.out.print("all items count is" +sil.size());
	 for(int i=0;i<sil.size();i++)
		 System.out.println(sil.get(i).getText());
	 Thread.sleep(5000);
	 
	 //Display 1st  item
	 driver.findElement(By.xpath("(//*[@class='ui label transition visible']/i)[1]")).click();
	 Thread.sleep(5000);
	 //close site
	 driver.close();
	 
	 
	 
	 
	}
	

}
