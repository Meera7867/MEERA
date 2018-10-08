package test;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Phone_App_To_Dial
{

	
	public static void main(String[] args) throws Exception
	{
	//start appium server programmatically
	
	Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4545\"");
	
	//get address of appium server
	URL u=new URL("http://0.0.0.0:4545/wd/hub");
	
	//Provide device and app details
	
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(CapabilityType.BROWSER_NAME,"");
	dc.setCapability("deviceName","P8B4C18212000988");
	dc.setCapability("platformVersion","8.0.0");
	dc.setCapability("platformName","android");
	dc.setCapability("appPackage","com.android.contacts");
	dc.setCapability("appActivity","com.android.contacts.activities.DialtactsActivity");
	//create driver object to launch app in device
	AndroidDriver driver;
	while(2>1)
	{
		try
		{
			driver= new AndroidDriver(u,dc);
			break;
		}
		catch(Exception e)
		{
		}
	}
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		String x="9160229292";
		for(int i=0;i<x.length();i++)
		{
			
			char y=x.charAt(i);
		System.out.println(y);
			try
			{
		
				driver.findElement(By.xpath("//*[@content-desc='"+y+"']")).click();
				Thread.sleep(50);
				
			}
		
		
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		driver.findElement(By.xpath("//*[@resource-id='com.android.contacts:id/nameDialButton3']")).click();
		//stop appium server programmatically
		
		Runtime.getRuntime().exec("taskKill /F /IM node.exe");
		Runtime.getRuntime().exec("taskKill /F /IM cmd.exe");
		
			}
	
	}

	
	
