package test;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class EX_GMAIL
{

	
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		//open browser(SWD)
	
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//launch site(SWD)
		driver.get("http://www.gmail.com");
		
	 //MAXIMIZE PAGE
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.name("identifier")).sendKeys("meera14.mohammed@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("password")).sendKeys("meerambi123");
		//WebDriverWait w=new WebDriverWait(driver,100);

		Thread.sleep(5000);
		//w.until(ExpectedConditions.invisibilityOfElementLocated(By.name("passwordNext"));
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("idvPin")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		driver.findElement(By.xpath("//*[@role='combobox']")).sendKeys("apj@abdulkalam.com");
		driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("Promise");
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("hi sir ,\nhow r u in heaven\n iam a best tester");
		driver.findElement(By.xpath("//*[@aria-label='Attach files']/descendant::*[3]")).click();
		//handle file upload window(javaRobot)
		Thread.sleep(5000);
		StringSelection x=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
		Robot r=new Robot();
		if(System.getProperty("os.name").contains("windows"))
		{
	     r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_V);
	     r.keyRelease(KeyEvent.VK_V);
	     r.keyRelease(KeyEvent.VK_CONTROL);
		
		}
		
		else if(System.getProperty("os.name").contains("mac"))
		{
			r.keyPress(KeyEvent.VK_META);
		     r.keyPress(KeyEvent.VK_V);
		     r.keyRelease(KeyEvent.VK_V);
		     r.keyRelease(KeyEvent.VK_META);
		
			
		}
		else if(System.getProperty("os.name").contains("linux"))
		{
			r.keyPress(KeyEvent.VK_CONTROL);
		     r.keyPress(KeyEvent.VK_V);
		     r.keyRelease(KeyEvent.VK_V);
		     r.keyRelease(KeyEvent.VK_CONTROL);
			}
		else
		{
			System.out.println("unknown os");
			System.exit(0);
		}
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//send mail(swd)
		driver.findElement(By.xpath("//*[@text()='Send']")).click();
		//wait and get message
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Your message has been sent.']")));
		
		String m=driver.findElement(By.xpath("//*[text()='Your message has been sent.']")).getText();
		
		
		
		
		
	}


		
	}
	



