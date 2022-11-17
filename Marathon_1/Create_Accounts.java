package Marathon_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_Accounts {

	public static void main(String[] args) 
	{
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://login.salesforce.com");
		
		//1. Login to https://login.salesforce.com
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//2. Click on toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		//3. Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//div[@data-name='Sales']")).click();
		
		//4. Click on Accounts tab
		driver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='Accounts']")));
		
		//5. Click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		//6. Enter 'your name' as account name
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Dinesh Chinnasamy");
		String oppName = driver.findElement(By.xpath("//input[@name='Name']")).getAttribute("value");
		System.out.println("\noopName Value: "+oppName);	
		//7. Select Ownership as Public
		driver.findElement(By.xpath("//button[@aria-label='Ownership, --None--']")).click();
		driver.findElement(By.xpath("//span[@title='Public']")).click();
		
		//8. Click save and verify Account name 
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String check = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']/a")).getAttribute("title");
		System.out.println("\nCheck Value: "+check);	
		if (check.contains(oppName))
		{
			System.out.println("\nVerified Account Name: "+oppName);
		}
		else
		{
			System.out.println("\nVerify Account Name condition failed");
		}
	}

}
