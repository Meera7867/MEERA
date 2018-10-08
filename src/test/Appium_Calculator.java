package test;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appium_Calculator {

	
	public static void main(String[] args) throws Exception
	{
		//To Start appium Server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		
	    URL u=new URL("http://0.0.0.0:4723/wd/hub");
	    //Provide device details
	    DesiredCapabilities dc=new DesiredCapabilities();
	    dc.setCapability(CapabilityType.BROWSER_NAME,"");
	    dc.setCapability("deviceName","emulator-5554");
	    dc.setCapability("platformName","android");
	    dc.setCapability("PlatformVersion","4.2.2");
	    //Provide app details
	    dc.setCapability("appPackage","com.android.calculator2");
	    dc.setCapability("appActivity","com.android.calculator2.Calculator");
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
	    try
	    {
	    //Automate 9+5=
	    driver.findElement(By.xpath("//*[@text='9']")).click();
	    driver.findElement(By.xpath("//*[@content-desc='plus']")).click();
	    driver.findElement(By.xpath("//*[@text='5']")).click();
	    driver.findElement(By.xpath("//*[@content-desc='equals']")).click();
	    
	    //Display output
	    String x=driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).getAttribute("text");
	    System.out.println(x);
	   driver.closeApp();
	    }
	    catch(Exception e)
	    {
	   System.out.println(e.getMessage());
	    }
	    
	    
	    //stop server
	    Runtime.getRuntime().exec("taskkill  /F /IM node.exe");
	    Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");


	    
	    

	}

}
