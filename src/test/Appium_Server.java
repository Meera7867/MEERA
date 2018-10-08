package test;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appium_Server 
{

	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// To Start appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 192.168.1.132 -p 2855\"");
		
		Thread.sleep(5000);
		URL u=new URL("http://192.168.1.132:2855/wd/hub");
		//device details
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","emulator-5554");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","2.6.0.3.8");
		//app details
		dc.setCapability("appPackage","com.android.calculator2");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
	}

}
