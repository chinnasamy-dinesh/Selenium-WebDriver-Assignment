package Week_2.Day_1;


import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class Create_Contact 

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
			System.out.printf("\n");
			
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
			
			//	5. Click on contacts Button		 
			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			
			//	6. Click on Create Contact
			driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
			
			//	7. Enter FirstName Field Using id Locator	
			driver.findElement(By.id("firstNameField")).sendKeys("Dinesh");
			
			//	8. Enter LastName Field Using id Locator	
			driver.findElement(By.id("lastNameField")).sendKeys("Chrome");
			
			//	9. Enter FirstName(Local) Field Using id Locator
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Dinesh");
			
			//	10. Enter LastName(Local) Field Using id Locator	
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Chinnasamy");
			
			//	11. Enter Department Field Using any Locator of Your Choice		
			driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Nov 2022");
			
			//	12. Enter Description Field Using any Locator of your choice 
			driver.findElement(By.id("createContactForm_description")).sendKeys("Create Contact Test Case");
			
			//	13. Enter your email in the E-mail address Field using the locator of your choice	
			driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("cdineshroshan@gmail.com");
			
			//	14. Select State/Province as NewYork Using Visible Text	
			Select dd = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
			dd.selectByValue("NY");
			
			//	15. Click on Create Contact	
			driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
			
			//	16. Click on edit button 	
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			
			//	17. Clear the Description Field using .clear
			driver.findElement(By.id("updateContactForm_description")).clear();
			
			//	18. Fill ImportantNote Field with Any text	
			driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Create Contact Test Case");
			
			//	19. Click on update button using Xpath locator	
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			
			//	20. Get the Title of Resulting Page.
	        System.out.println("\nThe Title of the Resulting Page after test execution is: "+driver.getTitle());
			
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

			//	2. Enter UserName and Password Using Id Locator
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			//	3. Click on Login Button using Class Locator	
			driver.findElement(By.className("decorativeSubmit")).click();
			
			//	4. Click on CRM/SFA Link		
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			//	5. Click on contacts Button		 
			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			
			//	6. Click on Create Contact
			driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
			
			//	7. Enter FirstName Field Using id Locator	
			driver.findElement(By.id("firstNameField")).sendKeys("Dinesh");
			
			//	8. Enter LastName Field Using id Locator	
			driver.findElement(By.id("lastNameField")).sendKeys("Edge");
			
			//	9. Enter FirstName(Local) Field Using id Locator
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Dinesh");
			
			//	10. Enter LastName(Local) Field Using id Locator	
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Chinnasamy");
			
			//	11. Enter Department Field Using any Locator of Your Choice		
			driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Nov 2022");
			
			//	12. Enter Description Field Using any Locator of your choice 
			driver.findElement(By.id("createContactForm_description")).sendKeys("Create Contact Test Case");
			
			//	13. Enter your email in the E-mail address Field using the locator of your choice	
			driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("cdineshroshan@gmail.com");
			
			//	14. Select State/Province as NewYork Using Visible Text	
			Select dd = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
			dd.selectByValue("NY");
			
			//	15. Click on Create Contact	
			driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
			
			//	16. Click on edit button 	
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			
			//	17. Clear the Description Field using .clear
			driver.findElement(By.id("updateContactForm_description")).clear();
			
			//	18. Fill ImportantNote Field with Any text	
			driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Create Contact Test Case");
			
			//	19. Click on update button using Xpath locator	
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			
			//	20. Get the Title of Resulting Page.
	        System.out.println("\nThe Title of the Resulting Page after test execution is: "+driver.getTitle());
	        
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

			//	2. Enter UserName and Password Using Id Locator
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			//	3. Click on Login Button using Class Locator	
			driver.findElement(By.className("decorativeSubmit")).click();
			
			//	4. Click on CRM/SFA Link		
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			//	5. Click on contacts Button		 
			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			
			//	6. Click on Create Contact
			driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
			
			//	7. Enter FirstName Field Using id Locator	
			driver.findElement(By.id("firstNameField")).sendKeys("Dinesh");
			
			//	8. Enter LastName Field Using id Locator	
			driver.findElement(By.id("lastNameField")).sendKeys("Firefox");
			
			//	9. Enter FirstName(Local) Field Using id Locator
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Dinesh");
			
			//	10. Enter LastName(Local) Field Using id Locator	
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Chinnasamy");
			
			//	11. Enter Department Field Using any Locator of Your Choice		
			driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Nov 2022");
			
			//	12. Enter Description Field Using any Locator of your choice 
			driver.findElement(By.id("createContactForm_description")).sendKeys("Create Contact Test Case");
			
			//	13. Enter your email in the E-mail address Field using the locator of your choice	
			driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("cdineshroshan@gmail.com");
			
			//	14. Select State/Province as NewYork Using Visible Text	
			Select dd = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
			dd.selectByValue("NY");
			
			//	15. Click on Create Contact	
			driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
			
			//	16. Click on edit button 	
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			
			//	17. Clear the Description Field using .clear
			driver.findElement(By.id("updateContactForm_description")).clear();
			
			//	18. Fill ImportantNote Field with Any text	
			driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Create Contact Test Case");
			
			//	19. Click on update button using Xpath locator	
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			
			//	20. Get the Title of Resulting Page.
	        System.out.println("\nThe Title of the Resulting Page after test execution is: "+driver.getTitle());
	        
			
	}
		
	
}