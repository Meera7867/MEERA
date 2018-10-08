package test;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browser name");
		String x=sc.nextLine();
		WebDriver driver=null;

		
		if(x.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		}
		else if(x.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.firefox.driver","E:\\selenium\\firedriver.exe");

			
		}

		else if(x.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","E:\\selenium\\iedriver.exe");

		}
		else
		{
			System.out.println("unknown Browser");
			System.exit(0);
		}

		
driver.close();


	}

}
