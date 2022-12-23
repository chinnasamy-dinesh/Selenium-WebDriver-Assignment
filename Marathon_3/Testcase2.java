package Marathon_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase2 extends Login

{
	@BeforeClass
	public void setData()
	{
		filename = "testcase2";
	}
	
	@Test (dataProvider = "data")
	
	public void Edge(String name, String amt) throws InterruptedException
	{
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		driver.findElement(By.xpath("(//span[@class='viewAllLabel'])[4]")).click();
		
		driver.findElement(By.xpath("//button[@title='Select a List View']")).click();
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='All Opportunities']")).click();
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amt);
		
		WebElement stage = driver.findElement(By.xpath("(//button[@aria-haspopup='listbox'])[1]"));
		driver.executeScript("arguments[0].click();",stage);
		driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
		
		WebElement type = driver.findElement(By.xpath("(//button[@aria-haspopup='listbox'])[2]"));
		driver.executeScript("arguments[0].click();",type);
		driver.findElement(By.xpath("(//span[text()='New Customer'])")).click();
		
		WebElement lead = driver.findElement(By.xpath("(//button[@aria-haspopup='listbox'])[3]"));
		driver.executeScript("arguments[0].click();",lead);
		driver.findElement(By.xpath("(//span[text()='Partner Referral'])")).click();
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[@title='Next Month']")).click();
		driver.findElement(By.xpath("//span[text()='20']")).click();
		
	
		driver.findElement(By.xpath("(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right']/input)[2]")).click();
		driver.findElement(By.xpath("(//span[@class='slds-listbox__option-text slds-listbox__option-text_entity'])[1]")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		Thread.sleep(3000);		
		
		String check = driver.findElement(By.xpath("//span[text()='Opportunity']/a")).getAttribute("title");
		
		if(check.contains(name))
		{
			System.out.println("\n Opportunity has been created successfully");
		}
		else
		{
			System.out.println("\n Opportunity is not created");
		}
		
	}

}