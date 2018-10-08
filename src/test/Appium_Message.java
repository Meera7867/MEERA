package test;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appium_Message 

{
/* launch message appin ard
 * click on options
 * click on search
 * hide keyboard if exists
 * close app
 */
	
	public static void main(String[] args) throws Exception
	
	
	{
		//To Start appium Server
				Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
				
			    URL u=new URL("http://0.0.0.0:4723/wd/hub");
			    //Provide device details
			    DesiredCapabilities dc=new DesiredCapabilities();
			    dc.setCapability(CapabilityType.BROWSER_NAME,"");
			    dc.setCapability("deviceName","P8B4C18212000988");
			    dc.setCapability("platformName","android");
			    dc.setCapability("PlatformVersion","8.0.0");
			    //Provide app details
			    dc.setCapability("appPackage","com.android.mms");
			    dc.setCapability("appActivity","com.android.mms.ui.ConversationList");
			    //launch app
		        AndroidDriver driver;
		        while(2>1) //infinite loop
		         {
		        	try
		        	   {
		        		driver=new AndroidDriver(u,dc);
		        		break;
		        		}
		        	catch(Exception e)
		        	{
		        		
		        	}
		        	
		        }
			   
		    //Automate app Screen elements
		        try
		           {
		        	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		        	driver.findElement(By.xpath("//*[@content-desc='Messaging']")).click();
		        	driver.findElement(By.xpath("//*[@content-desc='More options']")).click();
		        	driver.findElement(By.xpath("//*[@text='Text message']")).click();
		        	 if(driver.isKeyboardShown())
		        	 {
		        		 driver.hideKeyboard();
		        	 }
		        	 
		        	 else
		        	 {
		        		 System.out.println("no keyboard,try to get");
		        		 driver.getKeyboard();
		        	 }
		        	 
		          }
		        catch(Exception e)
		        {
		        	System.out.println(e.getMessage());
		        }
		      //stop appium server programmatically
				
				Runtime.getRuntime().exec("taskKill /F /IM node.exe");
				Runtime.getRuntime().exec("taskKill /F /IM cmd.exe");

	}

}
