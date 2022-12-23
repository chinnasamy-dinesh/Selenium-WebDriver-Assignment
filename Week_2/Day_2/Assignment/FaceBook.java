package Week_2.Day_2.Assignment;

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

public class FaceBook 

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
			//Calling Options to Block Notifications
			ChromeOptions ch=new ChromeOptions();
			ch.addArguments("--disable-notifications");
			
			// Step 1: Download and set the path 
			ChromeDriver driver = new ChromeDriver(ch);
			
			// Step 2: Launch the chromebrowser			
			// Step 3: Load the URL https://en-gb.facebook.com/
			driver.get("https://en-gb.facebook.com/");
			
			// Step 4: Maximise the window
			driver.manage().window().maximize();
			
			// Step 5: Add implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			// Cookies Selection
			driver.findElement(By.xpath("//button[@title='Only allow essential cookies']")).click();
			
			// Step 6: Click on Create New Account button
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			
			// Step 7: Enter the first name
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nerthee");
			
			// Step 8: Enter the last name
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dinesh");
			
			// Step 9: Enter the mobile number
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("0123456789");;
			
			// Step 10: Enter the password
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("xpathfinder@1234");
			
			// Step 11: Handle all the three drop downs
			Select day = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
			day.selectByIndex(13);
			
			Select month = new Select (driver.findElement(By.xpath("//select[@name='birthday_month']")));
			month.selectByValue("8");
			
			Select year = new Select (driver.findElement(By.xpath("//select[@name='birthday_year']")));
			year.selectByVisibleText("1979");
			
			// Step 12: Select the radio button "Female" 
			//option: 1 using multiple attribute - input[@type='radio'][@value='1']
			//Option: 2 Using Elder Sibling to Younger Sibling - //label[text()='Female']/following-sibling::input
			
			driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
			
			// Print Title of the Page
			System.out.println("\nTitle of Resulting Page: "+driver.getTitle());			
			
	}
	
	public static void edgeBrowser() throws InterruptedException
	
	{
			//Calling Options to Block Notifications
			EdgeOptions ch=new EdgeOptions();
			ch.addArguments("--disable-notifications");
			
			// Step 1: Download and set the path
			EdgeDriver driver = new EdgeDriver(ch);
			
			// Step 2: Launch the chromebrowser			
			// Step 3: Load the URL https://en-gb.facebook.com/
			driver.get("https://en-gb.facebook.com/");
			
			// Step 4: Maximise the window
			driver.manage().window().maximize();
			
			// Step 5: Add implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			// Cookies Selection
			driver.findElement(By.xpath("//button[@title='Only allow essential cookies']")).click();
			
			// Step 6: Click on Create New Account button
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			
			// Step 7: Enter the first name
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nerthee");
			
			// Step 8: Enter the last name
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dinesh");
			
			// Step 9: Enter the mobile number
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("0123456789");;
			
			// Step 10: Enter the password
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("xpathfinder@1234");
			
			// Step 11: Handle all the three drop downs
			Select day = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
			day.selectByIndex(13);
			
			Select month = new Select (driver.findElement(By.xpath("//select[@name='birthday_month']")));
			month.selectByValue("8");
			
			Select year = new Select (driver.findElement(By.xpath("//select[@name='birthday_year']")));
			year.selectByVisibleText("1979");
			
			// Step 12: Select the radio button "Female" 
			//option: 1 using multiple attribute - input[@type='radio'][@value='1']
			//Option: 2 Using Elder Sibling to Younger Sibling - //label[text()='Female']/following-sibling::input
			
			driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
			
			// Print Title of the Page
			System.out.println("\nTitle of Resulting Page: "+driver.getTitle());	}
	
	public static void firefoxBrowser() throws InterruptedException
	
	{
		
		//Calling Options to Block Notifications and Cookies
		FirefoxOptions ch=new FirefoxOptions();
		ch.addArguments("--disable-notifications");
		ch.addPreference("profile.default_content_setting_values.cookies", 2);
		
		// Step 1: Download and set the path
		FirefoxDriver driver = new FirefoxDriver(ch);
		
		// Step 2: Launch the chromebrowser			
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Cookies Selection
		driver.findElement(By.xpath("//button[@title='Only allow essential cookies']")).click();
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nerthee");
		
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dinesh");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("0123456789");;
		
		// Step 10: Enter the password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("xpathfinder@1234");
		
		// Step 11: Handle all the three drop downs
		Select day = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		day.selectByIndex(13);
		
		Select month = new Select (driver.findElement(By.xpath("//select[@name='birthday_month']")));
		month.selectByValue("8");
		
		Select year = new Select (driver.findElement(By.xpath("//select[@name='birthday_year']")));
		year.selectByVisibleText("1979");
		
		// Step 12: Select the radio button "Female" 
		//option: 1 using multiple attribute - input[@type='radio'][@value='1']
		//Option: 2 Using Elder Sibling to Younger Sibling - //label[text()='Female']/following-sibling::input
		
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		
		// Print Title of the Page
		System.out.println("\nTitle of Resulting Page: "+driver.getTitle());
		
	}
		
	
}
