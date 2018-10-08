package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_useallposibilitiesforway2sms {

	/*launch site
	 get attribute/currenturl/text
	 navigate()to/refresh/forward/back
	 Secured or not
	 Synchronization
	 highlight element
	 Count images
	 Count text-boxes
	 Count drop-drowns
	 Display links
	 Disable & enable element
	 scroll to top/bottom/specific element
	 tool-tips
	 close/quit*/
	 
	 public static void main(String[] args) throws InterruptedException 
	 {
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(5000);
	driver.get("http://www.google.co.in");
	Thread.sleep(3000);
	driver.navigate().to("http://site24.way2sms.com/content/index.html");
	driver.manage().window().maximize();
	/*Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward();
	Thread.sleep(4000);
	driver.navigate().refresh();
	Thread.sleep(5000);*/
	String x=driver.findElement(By.name("username")).getText();
	System.out.println(x);
	Thread.sleep(5000);
	/*driver.findElement(By.xpath("//*[@src='../images/android-button.png']")).click();
	String y=driver.getCurrentUrl();
	System.out.println(y);
	String z=driver.getPageSource();
	System.out.println(z);
	Thread.sleep(5000);*/
	
	
	//close site
	driver.close();
	}

}
