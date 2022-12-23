package Week_1.Day_2.Class_Room;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Browsers 
{

	public static void chromeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	}
	public static void edgeBrowser()
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
	}
	public static void firefoxBrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
	}
	public static void operaBrowser()
	{
		WebDriverManager.operadriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
	}
	public static void safariBrowser()
	{
		WebDriverManager.safaridriver().setup();
		SafariDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	public static void browserSelection()
	
	{
		System.out.println("Option 1:- Chrome Browser");
		System.out.println("Option 2:- Edge Browser");
		System.out.println("Option 3:- Firefox Browser");
		System.out.println("Option 4:- Opera Browser");
		System.out.println("Option 5:- Safari Browser");
		System.out.printf("\nPlease Select Your Browser Option: ");
		num = sc.nextInt();
		
		if (num==1)
		{
			chromeBrowser();
		}
		else if (num==2)
		{
			edgeBrowser();
		}
		else if (num==3)
		{
			firefoxBrowser();	
		}
		else if (num==4)
		{
			operaBrowser();	
		}
		else if(num==5)
		{
			safariBrowser();
		}
	}
	static Scanner sc = new Scanner(System.in);
	static int num;
	
	public static void main(String[] args) 
	
	{
		browserSelection();
	}

}