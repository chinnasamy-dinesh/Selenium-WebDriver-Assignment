package Week_2.Day_2.Class_Room;

import java.util.Scanner;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Advanced_Xpath 

{
	
	
		public static void chromeBrowser() throws InterruptedException
		{
			
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			/*
			 * System.out.
			 * println("\nUsing Advanced Xpath \nOption 1:- TestLeaf - FirstID using\nOption 2:- Myntra - Flying Machine & Checkbox\nOption 3: Salesforce +icon and select one from list and type in subject\n"
			 * ); System.out.printf("Please Input your option: "); int num1 = sc.nextInt();
			 * 
			 * if (num1 == 1) { driver.get("http://leaftaps.com/opentaps/");
			 * driver.findElement(By.xpath("//input[@id='username']")).sendKeys(
			 * "demosalesmanager");
			 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			 * driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			 * driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			 * driver.findElement(By.xpath("//a[text()='Leads']")).click();
			 * driver.findElement(By.xpath("//li/a[text()='Find Leads']")).click();
			 * driver.findElement(By.
			 * xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			 * Thread.sleep(5000); driver.close(); } else if (num1 == 2) {
			 */
			driver.get("https://www.myntra.com/");
			driver.findElement(By.id("//div[@class='desktop-query']/input[@placeholder='Search for products, brands and more']")).click();
			
			
		}
		public static void edgeBrowser() throws InterruptedException
		{
		
			EdgeDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
		}
		public static void firefoxBrowser() throws InterruptedException
		{
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
		}

		public static void browserSelection() throws InterruptedException
		
		{
			System.out.println("Option 1:- Chrome Browser");
			System.out.println("Option 2:- Edge Browser");
			System.out.println("Option 3:- Firefox Browser");
			System.out.printf("\nPlease Select Your Browser Option: ");
			num = 1; //sc.nextInt();
		
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
	
	static Scanner sc = new Scanner(System.in);
	static int num;
	
	public static void main(String[] args) throws InterruptedException
	
	{
		browserSelection();
	}

}