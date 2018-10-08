package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exception1
{

	/* -> launch "mercury travels" site
	  -> collect all drop downs
	  -> count visible number of drop-downs and count of hidden drop-down
	  ->close site
	  
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		// Run geckoDriver to get firefox browser
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 //Launch site
		 driver.get("https://www.mercurytravels.co.in/");
		 Thread.sleep(5000);
		 //count all dropdowns
		 List<WebElement> add=driver.findElementsByTagName("select");
		 //intialization count start with numbers so give the intgers
		int vcount=0;int ivcount=0;
		for(int i=0;i<add.size();i++)
		{
			if(add.get(i).isDisplayed())
			{
				vcount=vcount+1;
			}
			else
			{
				ivcount=ivcount+1;
			}
		}
		
		System.out.println("count visible number of drop-downs is" +vcount);
		System.out.println("count invisble number of drop-down count is"+ivcount);
		//close site
		driver.close();
		
		 
		 

	}

}
