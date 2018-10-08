package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Validate_Title_As_Google 

{
/*launch google site in computer browser
 * validate/verify title as "google"
 * close site
 */

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		//get Title of site
		String t=driver.getTitle();
		//validation
try
{
		if(t.equals("Google"))
		 {
			System.out.println("test passed");
			
		 }
		else
		{

			 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 File dest=new File("meera.png");
			 FileUtils.copyFile(src,dest);
		}
	}
catch(Exception e)
{
 
}
	
		
	}

}
