package test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appium_Go_Home 
{

	
	public static void main(String[] args) throws Exception 
	{
		//start appium server
		
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k  \"appium -a 0.0.0.0 -p 4753\"");
		
	    // get appiumserver address
		URL u=new URL("http://0.0.0.0 :4723/wd/hub");
		
		//provide device and app details
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","P8B4C18212000988");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","8.0.0");
		dc.setCapability("appPackage","com.android.contacts");
		dc.setCapability("appActivity","com.android.contacts.activities.DialtactsActivity");
		
		//create driver object to launch app in device
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
				System.out.println(e.getMessage());
			}
		}
		
		//go to home
		driver.pressKeyCode(AndroidKeyCode.HOME);
		Thread.sleep(5000);
		//get appium server address
		
		
		

	}

}
