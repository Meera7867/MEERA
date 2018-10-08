package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex_cssSelector {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws InterruptedException, AWTException {
		//Run browser driver to get browser
				System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://accounts.google.com/");
				FluentWait w=new FluentWait(driver).pollingEvery(2,TimeUnit.SECONDS).withTimeout(100,TimeUnit.SECONDS);
				driver.findElement(By.cssSelector("input#identifierId")).sendKeys("sandhyacherukuri246");
				driver.findElement(By.xpath("//*[text()='Next']")).click();
				Thread.sleep(5000);
				driver.findElement(By.cssSelector("input[name=password]")).sendKeys("hannahmontanasks246");
				driver.findElement(By.xpath("//*[text()='Next']")).click();
				Thread.sleep(5000);
				/*driver.findElement(By.name("idvPin")).click();
				Thread.sleep(250000);
				driver.findElement(By.id("idvPreregisteredPhoneNext")).click();
				Thread.sleep(6000);*/
				driver.findElement(By.xpath("//*[@aria-label='Mail']")).click();
				Thread.sleep(10000);
				/*WebElement t=driver.findElement(By.xpath("(//*[@draggable='true'])[1]"));
				FluentWait a=new FluentWait(driver).pollingEvery(2,TimeUnit.SECONDS).withTimeout(100,TimeUnit.SECONDS);
				List<WebElement> l=driver.findElements(By.xpath("(//*[@draggable='true'])[1]"));
				System.out.println(l.size());
				Thread.sleep(5000);*/
				driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
				Thread.sleep(3000);
				driver.findElement(By.name("to")).sendKeys("sandhyacherukuri246@gmail.com");
				driver.findElement(By.name("subjectbox")).sendKeys("hi");
				driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("how are you?");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@aria-label='Attach files']/descendant::*[3]")).click();
				Thread.sleep(3000);
				Robot r=new Robot();
				StringSelection fp=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fp,null);
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(4000);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				WebDriverWait w1=new WebDriverWait(driver,100);
				w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@role='progressbar']")));
				w1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@role='progressbar']")));
				driver.findElement(By.xpath("//*[text()='Send']")).click();
				Thread.sleep(4000);
				String msg=driver.findElement(By.xpath("(//*[@aria-live='assertive'])[3]/descendant::div[3]")).getText();
				System.out.println(msg);
				//driver.findElement(By.xpath("//*[@aria-label='Account Information']/preceding::*[3]")).click();
				driver.findElement(By.xpath("(//*[@aria-live='assertive'])[2]/following::*[4]")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Sign out")).click();
				Thread.sleep(4000);
				driver.close();
				
				
				
				/*driver.findElement(By.xpath("(//*[contains(@href,'https://accounts.google.com')])[1]")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("Sign out"));
				Thread.sleep(5000);
				driver.quit();*/
				/*driver.findElement(By.linkText("Sign out")).click();
				Thread.sleep(5000);
				driver.close();*/
	}

}
