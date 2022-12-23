package Marathon_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_Task 

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
		
		//4) Click on Global Actions SVG icon
		driver.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[text()='Global Actions']")));
		
		//5) Click New Task driver.findElement(By.
		driver.findElement(By.xpath("(//li[@class='uiMenuItem oneGlobalCreateItem']/a)[2]")).click();
		  
		//6) Enter subject as ""Bootcamp"" driver.findElement(By.
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp");
		String taskSub = driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input slds-combobox__input-value']")).getAttribute("data-value");
		System.out.println("\ntaskSub Value: "+taskSub);
		  
		//7) Select status as 'Waiting on someone else'
		  driver.findElement(By.xpath("//a[text()='Not Started']")).click();
		  driver.findElement(By.xpath("//a[text()='Waiting on someone else']")).click();
		  
		//8) Save and verify the 'Task created' message" //driver.findElement(By.
		  driver.findElement(By.xpath("//button[@class='slds-button slds-button--brand cuf-publisherShareButton uiButton']")).click();
		  String check = driver.findElement(By.xpath("//span[text()='Task']/a")).getAttribute("title");
		  System.out.println("\nCheck Value: "+check);
		  
		  if (taskSub.contains(check))
			{
		System.out.println("\nVerified Task Name: "+taskSub);
			}
		  else
		  {
		System.out.println("\nVerified Task Name condition failed");
		  }
		 
	}

}
