package Week_2.Day_1.Assignment;


import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Duplicate_Lead 

{
	static Scanner sc = new Scanner(System.in);
	static int num;
	
	public static void main(String[] args) throws InterruptedException
	
	{
		
		browserSelection();
		
	}
	
	public static void browserSelection() throws InterruptedException
	
	{
		
			System.out.println("Option 1:- Chrome Browser");
			System.out.println("Option 2:- Edge Browser");
			System.out.println("Option 3:- Firefox Browser");
			System.out.printf("\nPlease Select Your Browser Option: ");
			num = sc.nextInt();
			System.out.println("\n");
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
		
	}
	
	public static void chromeBrowser() throws InterruptedException
	
	{
		//Disable Notification using ChromeOptions
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		//	2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//	3. Click on Login Button using Class Locator	
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//	4. Click on CRM/SFA Link		
		driver.findElement(By.linkText("CRM/SFA")).click();
			
		//	6.	Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//	7.	Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//	8. Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//	9. Enter Email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("cdineshroshan@gmail.com");
		
		//	10. Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		//	11.	Capture name of First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();

		//	12.	Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String leadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("\nName of the Lead: "+leadName);
		
		//	13.	Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		//	14.	Verify the title as 'Duplicate Lead'
		System.out.println("\nTitle of 'Duplicate Lead'is: "+driver.getTitle());
		
		//	15.	Click Create Lead
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		//	16.	Confirm the duplicated lead name is same as captured name
		String dupName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("\nName of the Dupliacted Lead is: "+dupName);
		
		if (leadName == dupName)
		{
			System.out.println("Duplicate Name is the same as the Orginal Lead Name");
		}
		else
		{
			System.out.println("Duplicate Name is not same as the Orginal Lead Name");
		}
		
		//	17.	Close the browser (Do not log out)
		
		driver.close();
			
			
	}
	
	public static void edgeBrowser() throws InterruptedException
	
	{
			//Disable Notification using ChromeOptions
			EdgeOptions ch=new EdgeOptions();
			ch.addArguments("--disable-notifications");
			
			EdgeDriver driver = new EdgeDriver(ch);
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public static void firefoxBrowser() throws InterruptedException
	
	{
		
			//Disable Notification using ChromeOptions
			FirefoxOptions ch=new FirefoxOptions();
			ch.addArguments("--disable-notifications");
			ch.addPreference("profile.default_content_setting_values.cookies", 2);
			
			FirefoxDriver driver = new FirefoxDriver(ch);
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
	}
		
	
}