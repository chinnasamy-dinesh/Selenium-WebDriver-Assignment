package Week_4.Day_2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableChittorgarh 
{

	public static void main(String[] args) 
	
	{
		ChromeDriver driver = new ChromeDriver ();
		
		// 1. Launch the URL 
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//2. Click on stock market
		driver.findElement(By.xpath("//a[text()='STOCK MARKET ']")).click();
				
		//3. Click on NSE bulk Deals
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		
		//4. Get all the Security names
		List<WebElement> securityNames = driver.findElements(By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[3]"));
		
		List<String> nameList = new ArrayList<String>();

		for (WebElement name : securityNames) 
		{
			nameList.add(name.getText());
			System.out.println(name.getText());
		}
			
		//5. Ensure whether there are duplicate Security names
		
		Set<String> set = new LinkedHashSet<String>(nameList);
		
		if (set.size()==nameList.size())
		{
			System.out.println("No duplicates");
		}
		else 
		{
			System.out.println("Duplicates found");
		}
		
		Set<String> dupset = new LinkedHashSet<String>();
		
		for (WebElement name : securityNames) 
		{
			boolean dup =dupset.add(name.getText());
			if(!dup)
			{
				dupset.add(name.getText());
			}
		}
		
		for (String string : dupset) 
		{
		System.out.println(string);
		}
		
		
		
	}

}
