package test;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appium_phoneapp 
{
/* launch phoneapp in device
 * dial anumber and click video call
 * wait fewseconds
 * click endcall
 * 
 */

	public static void main(String[] args) throws IOException
	
	{
		
		
		
		
		
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4573\"");
		
		//take appiumserver as url
		URL u=new URL("http://0.0.0.0:4573/wd/hub");
		//Provide app and device details
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","P8B4C18212000988");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","8.0.0");
		dc.setCapability("appPackage","com.android.contacts");
		dc.setCapability("appActivity","com.android.contacts.activities.DialtactsActivity");
		
		//Create Driver object to launch app in device
		AndroidDriver driver;
		while(2>1)//infinite loop
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
		//app automation
		
		try
		{
			//automate app Screen elements
			driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			//dial a number and click video call
			String x="7416595934";
			
			for(int i=0;i<10;i++)
			{
			 char y=x.charAt(i);
				driver.findElement(By.xpath("//*[@content-desc='"+y+"']")).click();
			}
			
			driver.findElement(By.xpath("//*[@resource-id='com.android.contacts:id/nameDialButton2']")).click();
			
			driver.findElement(By.xpath("//*[@content-desc='End']")).click();
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

