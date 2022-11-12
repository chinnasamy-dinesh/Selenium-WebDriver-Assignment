package week_1.Day_2;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Browsers 
{

	public static void chromeBrowser()
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
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
		System.setProperty("webdriver.opera.driver", "c:\\Users\\dinesh.chinnasamy\\Downloads\\operadriver_win64\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
	}

	public static void browserSelection()
	{
		System.out.println("Option 1:- Chrome Browser");
		System.out.println("Option 2:- Edge Browser");
		System.out.println("Option 3:- Firefox Browser");
		System.out.println("Option 4:- Opera Browser");
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
	}
	static Scanner sc = new Scanner(System.in);
	static int num;
	
	public static void main(String[] args) 
	
	{
		browserSelection();
	}

}
