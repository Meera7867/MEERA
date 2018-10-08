package test;

import java.util.Scanner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class Test3 {

	public static void main(String[] args) throws InterruptedException 
	{
		//get Browser name
		System.out.println("ENTER BROWSER NAME");
		Scanner sc=new Scanner(System.in);//Represents Keyboard
		String x=sc.nextLine();
		WebDriver driver=null;
		if(x.equals("chrome"))
				
				{
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
				driver=new ChromeDriver();
				}
		else if(x.equals("firefox"))
		    {
			System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
		    }
		else if(x.equals("ie"))
		   {
			System.setProperty("webdriver.ie.driver","E:\\selenium\\iedriverServer.exe");
			driver=new InternetExplorerDriver();
		   }
		else 
		   {
            System.out.println("unknownbrowser");
	        System.exit(0);
	       }
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

