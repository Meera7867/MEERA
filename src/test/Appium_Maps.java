package test;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appium_Maps 
{

	
	public static void main(String[] args) throws Exception 
	
	{
	//Start appium server
	
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4573\"");
		//provide appiumserver as url
		URL u = new URL("http://0.0.0.0:4573/wd/hub");
		//provide device and app details
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","P8B4C18212000988");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","8.0.0");
		dc.setCapability("appPackage","com.google.android.apps.maps");
		dc.setCapability("appActivity","com.google.android.maps.MapsActivity");
		dc.setCapability("locationServicesEnabled",true);
		dc.setCapability("locationServicesAuthorized",true);
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
		
		//Shift location to vijayaWada
	Location l=new Location(12.971599,77.594563,2000);
	driver.setLocation(l);
	Thread.sleep(20000);
	
	//Shift location to banglore
	Location l1=new Location(16.506174,80648015,20000);
	driver.setLocation(l1);
	Thread.sleep(20000);
	driver.closeApp();
	
	//Stop appium server
	
Runtime.getRuntime().exec("taskkill /F /IM node.exe");
Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	
}
	


}
