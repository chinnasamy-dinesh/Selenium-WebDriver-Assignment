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

public class Edit_Lead 

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
		
		//	1. Launch URL "http://leaftaps.com/opentaps/control/login"	
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
		
		//	8.	Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Dinesh");	
		
		
		//	9.	Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		//	10. Click on first resulting lead
		String name = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-companyName']/a")).getText();
		System.out.println("\nCompany Name: "+name);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//	11. Verify title of the page
		String title = driver.getTitle();
		System.out.println("Title of the Page Edited is: "+title);
		
		//	12. Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//	13. Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf");
				
		//	14. Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();	
		
		//	15. Confirm the changed name appears
		String name1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("\nUpdate Company Name: "+name1);
		
		if (name!=name1)
			
		{
			System.out.println("\nCompany Name has been Changed from "+name+" to "+name1);
			
		}
		
		else 
			
		{
			System.out.println("\nNo Change in Compnay Name.");
			
		}
		
		//	16. Close the browser (Do not log out)
	
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