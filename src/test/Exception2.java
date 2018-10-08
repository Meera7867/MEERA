package test;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception2 {

	
	public static void main(String[] args) throws Exception
	{
		//Run chrome Driver to get  chrome Browser
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://twitter.com/login");
		Thread.sleep(5000);
	//select all drop downs
		List<WebElement> add=driver.findElementsByName("select");
   //intialization count start with numbers so give the intgers
		int vcount=0; int ivcount=0;
		for(int i=0; i<add.size();i++)
		{
		if           (add.get(i).isDisplayed())
				{
				vcount++;
				}
		  
	    else
		       {
			        ivcount++;
		         }
		
	    }
	System.out.println("count no of visible Dropdowns is " +vcount);
	System.out.println("count no of invisible drop down is " +ivcount);
}
}
