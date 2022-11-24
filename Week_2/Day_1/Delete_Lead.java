package Week_2.Day_1;


import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Delete_Lead 

{
	static Scanner sc = new Scanner(System.in);
	static int num;
	
	public static void main(String[] args) throws InterruptedException
	
	{
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//	1. Launch URL "http://leaftaps.com/opentaps/control/login"	
		driver.get("http://leaftaps.com/opentaps/control/main");
		
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
		
		//	8. Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//	9. Enter phone number - Clear, 91, 00, 1234567890
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("00");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8939198732");
		
		//	10. Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//	11. Capture lead ID of First Resulting lead
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		
		Thread.sleep(3000);
		//	12. Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//	13. Click Delete
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		//	14. Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//	15. Enter captured lead ID
		System.out.println("ID of the First Resulting Lead is: "+leadID);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		
		//	16. Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//	17. Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String name = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(name);
		
		String name1 = "No records to display";
		
		if (name == name1)
		{
		System.out.println("\nNo records to display in the Lead List, message confirms the successful deletion");	
		}
		else
		{
			System.out.println("\nMessage confirms deletion not successful ");	
		}

		
		//	18. Close the browser (Do not log out)
		driver.close();
		
	}
		
	
}