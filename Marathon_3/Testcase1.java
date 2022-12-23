package Marathon_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase1 extends Login

{
	@BeforeClass
	public void setData()
	{
		filename = "testcase1";
	}
	
	
	@Test (dataProvider = "data")
	public void chrome(String Q1, String Q2) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("content");
		
		driver.findElement(By.xpath("//p[@class='slds-truncate']/mark")).click();
		
		WebElement chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
		driver.executeScript("arguments[0].click();", chatter);
		
		System.out.println("\nTitle: "+driver.getTitle());
		
		driver.findElement(By.xpath("//a[@title='Question']")).click();
		
		driver.findElement(By.xpath("//textarea[@placeholder='What would you like to know?']")).sendKeys(Q1);
		
		driver.findElement(By.xpath("//div[@data-placeholder='If you have more to say, add details here...']")).sendKeys(Q2);
		
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		
		Thread.sleep(3000);		
		
		String verify = driver.findElement(By.xpath("//span[contains(text(),'yes')]")).getText();
		
		System.out.println("Question 2: "+Q2);
		System.out.println("Verified Question 2: "+verify);
		
		if(verify.contains(Q2))
		{
			System.out.println("\n Given Questions successfully Matched with data submitted");
		}
		else
		{
			System.out.println("\n Given Questions does not Matched with data submitted");
		}
		
	}

}
