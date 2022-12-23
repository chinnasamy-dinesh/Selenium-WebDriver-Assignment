package Marathon_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class	Salesforce 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--incognito");
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions builder = new Actions(driver);
		Shadow dom = new Shadow (driver);
		
	//	1. Launch Salesforce application https://login.salesforce.com/
		driver.get("https://login.salesforce.com/");
		
	//	2. Login with Provided Credentials
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
	//	3. Click on Learn More link in Mobile Publisher and click Confirm 
		driver.findElement(By.xpath("//span[text()=': Mobile Publisher']/preceding-sibling::span")).click();
		
	//	4. Click Learning and Mouse hover on Learning On Trailhead
		// code to move between windows
		Set<String> ss = driver.getWindowHandles();
		List<String> ls = new ArrayList<String> (ss);
		
		driver.switchTo().window(ls.get(1));
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Reject All Cookies']")).click();
		dom.findElementByXPath("//span[text()='Learning']").click();
		
		Thread.sleep(2000);
		WebElement Trailhead = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		builder.moveToElement(Trailhead).perform();
		
		
	//	5. Select SalesForce Certification 
		dom.findElementByXPath("//a[text()='Salesforce Certification']").click();
		
	//	6. Choose Your Role as Salesforce Architect and verify the URL
		driver.findElement(By.xpath("//button[text()='Reject All Cookies']")).click();
		driver.findElement(By.xpath("//div[@class='roleMenu-item '][1]")).click();
		
	//	7. Get the Text(Summary) of Salesforce Architect 
		WebElement text = driver.findElement(By.xpath("//h1[text()='Salesforce Architect']/following-sibling::div[1]"));
		System.out.println("\nSalesforce Architect (Text Summary):\n\n"+text.getText());
				
				
	//	8. Get the List of Salesforce Architect Certifications Available
		List<WebElement> ls1 = driver.findElements(By.xpath("//div[@class='credentials-card_title']//a"));
		System.out.println("\nList of Salesforce Architect Certifications Available:\n");
		for(int i=0; i<ls1.size();i++) 
		{
			String sa = ls1.get(i).getText();
		    System.out.print(sa+", ");
		}
		
	//	9. Click on Application Architect 
		driver.findElement(By.xpath("//div[@class='credentials-card_title']//a[text()='Application Architect']")).click();
			
	//	10. Get the List of Certifications available
		List<WebElement> ls2 = driver.findElements(By.xpath("//div[@class='credentials-card_title']//a"));
		System.out.println("\n`nList of Application Architect Certifications Available:\n");
		for(int i=0; i<ls2.size();i++) 
		{
			String sa = ls2.get(i).getText();
		    System.out.print(sa+", ");
		}

	}

}
