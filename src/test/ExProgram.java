package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExProgram 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(1000);
		//collect all images
		List <WebElement> l=driver.findElements(By.xpath("(//img)|(//input[@type='image'])"));
	System.out.println("size of list "+l.size());
	int vcount=0, ivcount=0;
	for(int i=0; i<l.size(); i++)
	{
		if(l.get(i).isDisplayed())
			//vcount++;
			vcount=vcount+1;
		else
			//ivcount++;
			ivcount=ivcount+1;
	}
	System.out.println("visible images  "+vcount);
	System.out.println("invisible images  "+ivcount);
	
	//close site
	//driver.close();
	




	}

}
