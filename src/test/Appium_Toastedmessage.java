package test;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.util.LoadLibs;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appium_Toastedmessage 
{
/*launch phone app in ard
 * click on recents
 * click on a contact
 * click on call
 * validate toasted message
 * close app
 */
	
	public static void main(String[] args) throws Exception 
	{
		//Start appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4573\"");
		
		// provide appium address as url
		URL u=new URL("http://0.0.0.0:4573/wd/hub");
		//provide app and device details
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","P8B4C18212000988");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","8.0.0");
		dc.setCapability("appPackage","com.android.contacts");
		dc.setCapability("appActivity","com.android.contacts.activities.DialtactsActivity");
		//Create driver object to launch app in device
		 
		AndroidDriver driver ;
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
		try
		  {
			//automate appScreen elements
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 driver.findElement(By.xpath("//*[@text='Malik1']")).click();
	         driver.findElement(By.xpath("//*[@content-desc='Dial button 1']")).click();
	         //driver.findElement(By.xpath("//*[@content-desc='End']")).click();
	         driver.findElement(By.xpath("//*[@content-desc='End']")).click();
		    //get screenshot because toasted message is in appscreen
	         File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         File dest=new File("E:\\selenium\\s1.png");
	         FileUtils.copyFile(src,dest);
	         //driver.findElement(By.xpath("//*[@content-desc='End']")).click();
	         }
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}

		//apply ocr technique to get text in screenshot image
		//File f=destination
		File f=new File("E:\\selenium\\s1.png");
		//File fo=sourcedata its is avaible in tess4j download at  that time only
		File fo=LoadLibs.extractTessResources("tessdata");
		Tesseract obj=new Tesseract();
		obj.setDatapath(fo.getAbsolutePath());
		//convert image context as text
		String result=obj.doOCR(f);
		Thread.sleep(20000);
		System.out.println("result");
		
		//close app
		driver.closeApp();
		//Stop appium server
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		
			
	
	}
}
		

		
	
