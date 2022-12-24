package Week_4.Day_1.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testleaf_WIndow 

{

	public static void main(String[] args) 
	
	{
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--incognito");
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("j_idt88:new")).click();
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		
		Set<String> ss = driver.getWindowHandles();
		List<String> ls = new ArrayList<String> (ss);
		
		driver.switchTo().window(ls.get(1));
		
		// Click and Confirm new Window Opens
		System.out.println("\nTitle of new Window: "+driver.getTitle());
		
		// Find the number of opened tabs	
		System.out.println("\nNo. of tabs: " + ls.size());
		
		// Close all windows except Primary driver.switchTo().window(ls.get(0));	
		
		driver.switchTo().window(ls.get(6)).close();
		  
		driver.switchTo().window(ls.get(5)).close();
		  
		driver.switchTo().window(ls.get(4)).close();
		  
		driver.switchTo().window(ls.get(3)).close();
		  
		driver.switchTo().window(ls.get(2)).close();
		  
		driver.switchTo().window(ls.get(1)).close();
		
		  
		//Wait for 2 new tabs to open
		driver.switchTo().window(ls.get(0));
		
		driver.findElement(By.id("j_idt88:j_idt95")).click();
				

	}

}
