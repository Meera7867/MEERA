package test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appium_Touch_Action
{

	public static void main(String[] args) throws Exception
	{
		
			//Start appium server
			Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4573\"");
			
			// provide appium address as url
			URL u=new URL("http://0.0.0.0:4573/wd/hub");
			//provide app and device details
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(CapabilityType.BROWSER_NAME,"");
			dc.setCapability("deviceName","emulator-5554");
			dc.setCapability("platformName","android");
			dc.setCapability("platformVersion","4.2.2");
			dc.setCapability("automatorName","uiautomator2");
			dc.setCapability("appPackage","com.android.deskclock");
			dc.setCapability("appActivity","com.android.deskclock.DeskClock");
			
			//Create driver object to launch app in device
			 
			AndroidDriver driver=null ;
			while(2>1)//infinite loop
			{
				try
				 {
					driver=new AndroidDriver(u,dc);
					break;
				  }
					
			 catch(Exception e)
			     {
				 System.out.println(e.getMessage());
				 
			     }
				
			}
		
			//Automate app Screen
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@content-desc='Cities'")).click();
			driver.context("NATIVE_APP");
			int w=driver.manage().window().getSize().getWidth();
			int h=driver.manage().window().getSize().getHeight();
			
			TouchAction ta=new TouchAction(driver);
			int x1=(int)(w/2);
			int y1=(int)(h*0.9);
			int x2=(int)(w/2);
			int y2=(int)(h*0.7);
			while(2>1)
			{
			   try
			   {
				driver.findElement(By.xpath("//*[@text='Bangalore']")).click();
				break;
			   }
			   catch(Exception e)
			   {
				ta.press(x1, y1).moveTo(x2-x1,y2-y1).release().perform();
			   }
			
	       }
			
			// swipe from top to bottom for required city
			 y1=(int)(h*0.1);
			 y2=(int)(h*0.3);
			 
			 while(2>1)
				{
				   try
				   {
					driver.findElement(By.xpath("//*[@text='Bangalore']")).click();
					break;
				   }
				   catch(Exception e)
				   {
					ta.press(x1, y1).moveTo(x2-x1,y2-y1).release().perform();
				   }
				
		       }
			//stop appium server programmatically
				
				Runtime.getRuntime().exec("taskKill /F /IM node.exe");
				Runtime.getRuntime().exec("taskKill /F /IM cmd.exe");




	}

}
