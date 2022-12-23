package Marathon_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_Opportunity

{
	
	public static void main(String[] args) throws InterruptedException 
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
		
		//4. Click on Opportunity tab 
		driver.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[text()='Opportunities']")));
		
		//5. Click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		//6. Enter Opportunity name as 'Salesforce Automation by *Your Name*,Get the text and Store it 
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Dinesh");
		String oppName = driver.findElement(By.xpath("//input[@name='Name']")).getAttribute("value");
		System.out.println("\noopName Value: "+oppName);		
		//7. Choose close date as Today
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("11/22/2022");
		
		//8. Select 'Stage' as Need Analysis
		driver.findElement(By.xpath("//button[@data-value='--None--']")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
		
		//9. click Save and VerifyOppurtunity Name"
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String check = driver.findElement(By.xpath("//span[text()='Opportunity']/a")).getAttribute("title");
		System.out.println("\nCheck Value: "+check);	
		
		if (check.contains(oppName))
		{
			System.out.println("\nVerified Oppurtunity Name: "+oppName);
		}
		else
		{
			System.out.println("\nVerified Oppurtunity Name condition failed");
		}
	}

}
