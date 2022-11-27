package Week_4.Day_1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MergeContact 

{

	public static void main(String[] args) 
	
	{
		//Disable Notification using ChromeOptions
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--incognito");
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//	2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//	3. Click on Login Button using Class Locator	
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//	4. Click on CRM/SFA Link		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//	5. Click on contacts Button		 
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//  6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
				
		//  7. Click on Widget of From Contact
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		
		//  8. Click on First Resulting Contact
		Set<String> ss = driver.getWindowHandles();
		List<String> ls = new ArrayList<String> (ss);
		
		driver.switchTo().window(ls.get(1));
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//  9. Click on Widget of To Contact
		driver.switchTo().window(ls.get(0));
		
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		  
		//  10. Click on Second Resulting Contact
		ss = driver.getWindowHandles();
		ls = new ArrayList<String> (ss);
		driver.switchTo().window(ls.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		
		//  11. Click on Merge button using Xpath Locator
		driver.switchTo().window(ls.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();  
		
		//  12. Accept the Alert
		driver.switchTo().alert().accept();
		  
		//  13. Verify the title of the page
		System.out.println("\nTitle of the Page: "+driver.getTitle());
		 
		driver.close();
		
		
	}

}
