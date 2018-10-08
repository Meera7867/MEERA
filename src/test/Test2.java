package test;





import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class Test2 
{
	public static void main(String[] args) throws InterruptedException
	{
	
    System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    Thread.sleep(5000);
    driver.get("http://newtours.demoaut.com/");
    Thread.sleep(5000);
    driver.findElement(By.linkText("REGISTER")).click();
     Thread.sleep(5000);
    driver.findElement(By.name("firstName")).sendKeys("meerambi");
    driver.findElement(By.name("lastName")).sendKeys("mohammed");
    driver.findElement(By.name("phone")).sendKeys("7416595934");
    driver.findElement(By.name("userName")).sendKeys("meera14.mohammed@gmail.com");
    driver.findElement(By.name("address1")).sendKeys("mehdhipatnam");
    driver.findElement(By.name("address2")).sendKeys("nearambagardens");
    driver.findElement(By.name("city")).sendKeys("hyderabad");
    driver.findElement(By.name("state")).sendKeys("telangana");
    driver.findElement(By.name("postalCode")).sendKeys("500036");
    Select s=new Select(driver.findElement(By.name("country")));
    s.selectByVisibleText("INDIA");
    driver.findElement(By.name("email")).sendKeys("meera14");
    driver.findElement(By.name("password")).sendKeys("batch237");
    driver.findElement(By.name("confirmPassword")).sendKeys("batch237");
    Thread.sleep(5000);
    driver.close();
    
    		
    
	
    
	}

}
