package test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appium1 {

	
	public static void main(String[] args) throws IOException 
	{
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4545\"");
		URL u= new URL("http://0.0.0.0:4545/wd/hub");
		//provide device and app details
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","emulator-5554");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","4.2.2");
		dc.setCapability("appPackage","com.android.deskclock");
		dc.setCapability("appActivity","com.android.deskclock.DeskClock");
		//create driver object to launch app in device
		AndroidDriver driver;
		while(2>1) 
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
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@content-desc='Cities']")).click();
		driver.findElement(By.xpath("//*[@text='Addis Ababa']")).click();
		/*driver.context("NATIVE_APP");
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		TouchAction ta=new TouchAction(driver);
		int x=(int)(w/2);*/
		
		driver.findElement(By.xpath("//*[@text='Gaza']")).click();
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(4000);
		driver.pressKeyCode(AndroidKeyCode.HOME);
		}
		catch(Exception e)
		{
		}		
		//Stop appium server
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");	
	}
}